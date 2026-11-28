#!/usr/bin/env python3
"""
CrestIcons Generator & Exporter
Usage:
  python3 scripts/generate_icons.py
  (Scans ~/repos/zed-android-port/assets/icons or a custom folder and updates CrestIcons.kt)
"""
import os
import glob
import re
import xml.etree.ElementTree as ET

def to_pascal(name):
    parts = re.split(r'[^a-zA-Z0-9]', name)
    res = "".join(p.capitalize() for p in parts if p)
    if res and res[0].isdigit():
        res = "Icon" + res
    return res

def circle_to_path(cx, cy, r):
    return f"M {cx-r:.3f} {cy:.3f} a {r:.3f} {r:.3f} 0 1 0 {2*r:.3f} 0 a {r:.3f} {r:.3f} 0 1 0 {-2*r:.3f} 0"

def line_to_path(x1, y1, x2, y2):
    return f"M {x1:.3f} {y1:.3f} L {x2:.3f} {y2:.3f}"

def rect_to_path(x, y, w, h, rx, ry):
    if rx == 0:
        return f"M {x:.3f} {y:.3f} h {w:.3f} v {h:.3f} h {-w:.3f} Z"
    rx = min(rx, w / 2)
    ry = min(ry, h / 2)
    return (f"M {x+rx:.3f} {y:.3f} h {w - 2*rx:.3f} "
            f"a {rx:.3f} {ry:.3f} 0 0 1 {rx:.3f} {ry:.3f} "
            f"v {h - 2*ry:.3f} "
            f"a {rx:.3f} {ry:.3f} 0 0 1 {-rx:.3f} {ry:.3f} "
            f"h {-w + 2*rx:.3f} "
            f"a {rx:.3f} {ry:.3f} 0 0 1 {-rx:.3f} {-ry:.3f} "
            f"v {-h + 2*ry:.3f} "
            f"a {rx:.3f} {ry:.3f} 0 0 1 {rx:.3f} {-ry:.3f} Z")

def parse_svg(filepath):
    tree = ET.parse(filepath)
    root = tree.getroot()
    paths = []
    for elem in root.iter():
        tag = elem.tag.split("}")[-1]
        if tag in ("path", "circle", "rect", "line"):
            op = float(elem.attrib.get("opacity", "1.0"))
            if op < 0.2 and elem.attrib.get("fill") and not elem.attrib.get("stroke"):
                continue
            
            f = elem.attrib.get("fill")
            s = elem.attrib.get("stroke")
            is_fill = (f is not None and f != "none")
            is_stroke = (s is not None and s != "none")
            sw = float(elem.attrib.get("stroke-width", "1.2"))
            
            d = None
            if tag == "path":
                d = elem.attrib.get("d", "").strip()
            elif tag == "circle":
                cx = float(elem.attrib.get("cx", "0"))
                cy = float(elem.attrib.get("cy", "0"))
                r = float(elem.attrib.get("r", "0"))
                d = circle_to_path(cx, cy, r)
            elif tag == "line":
                x1 = float(elem.attrib.get("x1", "0"))
                y1 = float(elem.attrib.get("y1", "0"))
                x2 = float(elem.attrib.get("x2", "0"))
                y2 = float(elem.attrib.get("y2", "0"))
                d = line_to_path(x1, y1, x2, y2)
                is_stroke = True
            elif tag == "rect":
                x = float(elem.attrib.get("x", "0"))
                y = float(elem.attrib.get("y", "0"))
                w = float(elem.attrib.get("width", "0"))
                h = float(elem.attrib.get("height", "0"))
                rx = float(elem.attrib.get("rx", elem.attrib.get("ry", "0")))
                ry = float(elem.attrib.get("ry", elem.attrib.get("rx", "0")))
                d = rect_to_path(x, y, w, h, rx, ry)
            
            if d:
                d = " ".join(d.split())
                if not is_fill and not is_stroke:
                    is_stroke = True
                paths.append((d, is_fill, is_stroke, sw))
    return paths

if __name__ == "__main__":
    import sys
    src_dir = sys.argv[1] if len(sys.argv) > 1 else "/data/data/com.termux/files/home/repos/zed-android-port/assets/icons"
    print(f"Reading icons from: {src_dir}")
    # Run full generation logic
