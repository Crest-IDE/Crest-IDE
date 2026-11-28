#!/bin/sh

set -e

echo "[1/3] Setting DNS resolver..."
printf 'nameserver 1.1.1.1\nnameserver 8.8.8.8\n' > /etc/resolv.conf

echo "[2/3] Configuring Crest-Packages repository..."
mkdir -p /var/db/xbps/keys /etc/xbps.d
if [ -f "$PREFIX/e9:2f:1c:ca:83:ea:7b:81:5e:e6:b0:57:f3:62:be:af.plist" ]; then
    cp -f "$PREFIX/e9:2f:1c:ca:83:ea:7b:81:5e:e6:b0:57:f3:62:be:af.plist" /var/db/xbps/keys/
elif [ -f "/e9:2f:1c:ca:83:ea:7b:81:5e:e6:b0:57:f3:62:be:af.plist" ]; then
    cp -f "/e9:2f:1c:ca:83:ea:7b:81:5e:e6:b0:57:f3:62:be:af.plist" /var/db/xbps/keys/
fi

if ! grep -q 'crest-ide.github.io/Crest-Packages' /etc/xbps.d/crest.conf 2>/dev/null; then
    echo "repository=https://crest-ide.github.io/Crest-Packages/aarch64" > /etc/xbps.d/crest.conf
fi

echo "[3/3] Configuring Void Linux environment..."
if command -v xbps-install >/dev/null 2>&1; then
    if [ ! -e /usr/share/terminfo/x/xterm-256color ]; then
        echo "Configuring terminal support (ncurses)..."
        xbps-install -Sy ncurses-base ncurses-term || true
    fi
fi

echo
echo "=========================================="
echo "      Crest Terminal Setup Completed      "
echo "=========================================="
echo
if command -v bash >/dev/null 2>&1; then
    echo "Shell: $(bash --version | head -n 1)"
else
    echo "Fallback: Using /bin/sh"
fi

if command -v xbps-install >/dev/null 2>&1; then
    echo "Package Manager: XBPS (Void Linux)"
fi
