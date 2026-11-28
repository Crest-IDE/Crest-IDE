package com.crestide.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.dp

/**
 * Modern, minimalist stroke-based icon system for Crest-IDE.
 * High-performance lazy caching with zero startup cost.
 */
object CrestIcons {

    private class PathDef(
        val data: String,
        val isFill: Boolean = false,
        val isStroke: Boolean = true,
        val strokeWidth: Float = 1.2f
    )

    private fun create(name: String, vararg paths: PathDef): ImageVector {
        val builder = ImageVector.Builder(
            name = "CrestIcon.$name",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        )
        for (p in paths) {
            val nodes = if (p.data.isNotEmpty()) {
                PathParser().parsePathString(p.data).toNodes()
            } else {
                emptyList()
            }
            builder.addPath(
                pathData = nodes,
                fill = if (p.isFill) SolidColor(Color.White) else null,
                stroke = if (p.isStroke) SolidColor(Color.White) else null,
                strokeLineWidth = if (p.isStroke) p.strokeWidth else 0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            )
        }
        return builder.build()
    }

    private var _acpRegistry: ImageVector? = null
    val AcpRegistry: ImageVector
        get() {
            if (_acpRegistry != null) return _acpRegistry!!
            _acpRegistry = create("AcpRegistry", PathDef("M5.76074 11.3828C5.3316 11.3828 5.06226 11.1317 5.06226 10.7346C5.06226 10.6204 5.09422 10.4652 5.15356 10.2963L6.95226 5.39784C7.14399 4.86371 7.46812 4.61719 7.98855 4.61719C8.52724 4.61719 8.84682 4.85457 9.04311 5.39327L10.8509 10.2963C10.9148 10.4743 10.9377 10.5976 10.9377 10.7346C10.9377 11.1135 10.6501 11.3828 10.2483 11.3828C9.86028 11.3828 9.65486 11.2048 9.53159 10.7756L9.18463 9.73477H6.80616L6.45922 10.7619C6.33139 11.2002 6.12595 11.3828 5.76074 11.3828ZM7.10747 8.66652H8.86507L7.99312 5.96848H7.96116L7.10747 8.66652Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M12 2H4C2.89543 2 2 2.89543 2 4V12C2 13.1046 2.89543 14 4 14H12C13.1046 14 14 13.1046 14 12V4C14 2.89543 13.1046 2 12 2Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _acpRegistry!!
        }

    private var _archive: ImageVector? = null
    val Archive: ImageVector
        get() {
            if (_archive != null) return _archive!!
            _archive = create("Archive", PathDef("M12.9564 3.04359H3.04357C2.73942 3.04359 2.49286 3.29016 2.49286 3.59431V5.24644C2.49286 5.55059 2.73942 5.79716 3.04357 5.79716H12.9564C13.2606 5.79716 13.5071 5.55059 13.5071 5.24644V3.59431C13.5071 3.29016 13.2606 3.04359 12.9564 3.04359Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.5943 5.79718V11.855C3.5943 12.1471 3.71034 12.4273 3.9169 12.6339C4.12345 12.8404 4.40361 12.9564 4.69572 12.9564H11.3043C11.5964 12.9564 11.8766 12.8404 12.0831 12.6339C12.2897 12.4273 12.4057 12.1471 12.4057 11.855V5.79718", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.89856 8H9.10141", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _archive!!
        }

    private var _arrowCircle: ImageVector? = null
    val ArrowCircle: ImageVector
        get() {
            if (_arrowCircle != null) return _arrowCircle!!
            _arrowCircle = create("ArrowCircle", PathDef("M12.8989 5.77778L11.6434 4.52222C10.6384 3.55068 9.29673 3.00526 7.89893 3C6.57285 3 5.30103 3.52678 4.36343 4.46447C3.78887 5.03901 3.36856 5.73897 3.12921 6.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.8989 3V5.77778H10.1211", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.1012 10.2222L4.3568 11.4778C5.3618 12.4493 6.70342 12.9947 8.10122 13C9.42731 13 10.6991 12.4732 11.6368 11.5355C12.2163 10.956 12.6389 10.2487 12.8772 9.47994", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.87891 10.2222H3.10111V13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowCircle!!
        }

    private var _arrowDown: ImageVector? = null
    val ArrowDown: ImageVector
        get() {
            if (_arrowDown != null) return _arrowDown!!
            _arrowDown = create("ArrowDown", PathDef("M8 13L12.5 8.5M8 13L3.5 8.5M8 13V3", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowDown!!
        }

    private var _arrowDown10: ImageVector? = null
    val ArrowDown10: ImageVector
        get() {
            if (_arrowDown10 != null) return _arrowDown10!!
            _arrowDown10 = create("ArrowDown10", PathDef("m2.5 10.667 2.667 2.666 2.666-2.666M5.167 13.333V2.667M11.833 6.667v-4H10.5M10.5 6.667h2.667M13.167 10.667a1.333 1.333 0 0 0-2.667 0V12a1.333 1.333 0 0 0 2.667 0v-1.333Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowDown10!!
        }

    private var _arrowDownRight: ImageVector? = null
    val ArrowDownRight: ImageVector
        get() {
            if (_arrowDownRight != null) return _arrowDownRight!!
            _arrowDownRight = create("ArrowDownRight", PathDef("M4.25 4.25L11.125 11.125", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.75 4.25006V11.7501H4.25", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowDownRight!!
        }

    private var _arrowLeft: ImageVector? = null
    val ArrowLeft: ImageVector
        get() {
            if (_arrowLeft != null) return _arrowLeft!!
            _arrowLeft = create("ArrowLeft", PathDef("M3.5 7.50001L8 3M3.5 7.50001L8 12M3.5 7.50001H12.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowLeft!!
        }

    private var _arrowRight: ImageVector? = null
    val ArrowRight: ImageVector
        get() {
            if (_arrowRight != null) return _arrowRight!!
            _arrowRight = create("ArrowRight", PathDef("M12.5 8L8 12.5M12.5 8L8 3.5M12.5 8H3.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowRight!!
        }

    private var _arrowRightLeft: ImageVector? = null
    val ArrowRightLeft: ImageVector
        get() {
            if (_arrowRightLeft != null) return _arrowRightLeft!!
            _arrowRightLeft = create("ArrowRightLeft", PathDef("M11 2L13 4.5L11 7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.5 4.5H2.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5 14L3 11.5L5 9", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 11.5H13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowRightLeft!!
        }

    private var _arrowUp: ImageVector? = null
    val ArrowUp: ImageVector
        get() {
            if (_arrowUp != null) return _arrowUp!!
            _arrowUp = create("ArrowUp", PathDef("M8 3L12.5 7.5M8 3L3.5 7.5M8 3V13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowUp!!
        }

    private var _arrowUpRight: ImageVector? = null
    val ArrowUpRight: ImageVector
        get() {
            if (_arrowUpRight != null) return _arrowUpRight!!
            _arrowUpRight = create("ArrowUpRight", PathDef("M4.5 11.5L11.5 4.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.5 4.5L11.5 4.5L11.5 11.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _arrowUpRight!!
        }

    private var _atSign: ImageVector? = null
    val AtSign: ImageVector
        get() {
            if (_atSign != null) return _atSign!!
            _atSign = create("AtSign", PathDef("M8.00156 10.3996C9.32705 10.3996 10.4016 9.32509 10.4016 7.99961C10.4016 6.67413 9.32705 5.59961 8.00156 5.59961C6.67608 5.59961 5.60156 6.67413 5.60156 7.99961C5.60156 9.32509 6.67608 10.3996 8.00156 10.3996Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.4 5.6V8.6C10.4 9.07739 10.5896 9.53523 10.9272 9.8728C11.2648 10.2104 11.7226 10.4 12.2 10.4C12.6774 10.4 13.1352 10.2104 13.4728 9.8728C13.8104 9.53523 14 9.07739 14 8.6V8C14 6.64839 13.5436 5.33636 12.7048 4.27651C11.8661 3.21665 10.694 2.47105 9.37852 2.16051C8.06306 1.84997 6.68129 1.99269 5.45707 2.56554C4.23285 3.13838 3.23791 4.1078 2.63344 5.31672C2.02898 6.52565 1.85041 7.90325 2.12667 9.22633C2.40292 10.5494 3.11782 11.7405 4.15552 12.6065C5.19323 13.4726 6.49295 13.9629 7.84411 13.998C9.19527 14.0331 10.5187 13.611 11.6 12.8", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _atSign!!
        }

    private var _attach: ImageVector? = null
    val Attach: ImageVector
        get() {
            if (_attach != null) return _attach!!
            _attach = create("Attach", PathDef("M7.37288 4.48506L7.43539 10.6638C7.43539 10.9365 7.54373 11.1981 7.73655 11.3909C7.92938 11.5837 8.19092 11.6921 8.46362 11.6921C8.73632 11.6921 8.99785 11.5837 9.19068 11.3909C9.38351 11.1981 9.49184 10.9366 9.49184 10.6638L9.42933 4.48506C9.42933 3.93975 9.2127 3.41678 8.82711 3.03119C8.44152 2.6456 7.91855 2.42898 7.37324 2.42898C6.82794 2.42898 6.30496 2.6456 5.91937 3.03119C5.53378 3.41678 5.31716 3.93975 5.31716 4.48506L5.37968 10.6384C5.37636 11.0455 5.45368 11.4492 5.60718 11.8263C5.76067 12.2034 5.98731 12.5463 6.27401 12.8354C6.56071 13.1244 6.9018 13.3538 7.27761 13.5104C7.65341 13.667 8.0565 13.7476 8.46362 13.7476C8.87073 13.7476 9.27382 13.667 9.64963 13.5104C10.0254 13.3538 10.3665 13.1244 10.6532 12.8354C10.9399 12.5463 11.1666 12.2034 11.3201 11.8263C11.4736 11.4492 11.5509 11.0455 11.5476 10.6384L11.485 4.48506", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _attach!!
        }

    private var _audioOff: ImageVector? = null
    val AudioOff: ImageVector
        get() {
            if (_audioOff != null) return _audioOff!!
            _audioOff = create("AudioOff", PathDef("M10.6667 6C11.003 6.44823 11.2208 6.97398 11.3001 7.52867", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.9094 3.75732C13.7621 4.6095 14.3383 5.69876 14.5629 6.88315C14.7875 8.06754 14.6502 9.29213 14.1688 10.3973", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.66675 2L13.6667 13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.33333 4.66669L4.942 5.05802C4.85494 5.1456 4.75136 5.21504 4.63726 5.2623C4.52317 5.30957 4.40083 5.33372 4.27733 5.33335H2.66667C2.48986 5.33335 2.32029 5.40359 2.19526 5.52862C2.07024 5.65364 2 5.82321 2 6.00002V10C2 10.1768 2.07024 10.3464 2.19526 10.4714C2.32029 10.5964 2.48986 10.6667 2.66667 10.6667H4.27733C4.40083 10.6663 4.52317 10.6905 4.63726 10.7377C4.75136 10.785 4.85494 10.8544 4.942 10.942L7.19733 13.198C7.26307 13.2639 7.34687 13.3088 7.43813 13.3269C7.52939 13.3451 7.62399 13.3358 7.70995 13.3002C7.79591 13.2646 7.86936 13.2042 7.921 13.1268C7.97263 13.0494 8.00013 12.9584 8 12.8654V7.33335", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.21875 2.78136C7.28267 2.71719 7.36421 2.67345 7.45303 2.65568C7.54184 2.63791 7.63393 2.64691 7.71762 2.68154C7.80132 2.71618 7.87284 2.77488 7.92312 2.85022C7.97341 2.92555 8.0002 3.01412 8.00008 3.10469V3.56202", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _audioOff!!
        }

    private var _audioOn: ImageVector? = null
    val AudioOn: ImageVector
        get() {
            if (_audioOn != null) return _audioOn!!
            _audioOn = create("AudioOn", PathDef("M8 3.13467C7.99987 3.04181 7.97223 2.95107 7.92057 2.8739C7.86892 2.79674 7.79557 2.7366 7.70977 2.70108C7.62397 2.66557 7.52958 2.65626 7.43849 2.67434C7.34741 2.69242 7.26373 2.73707 7.198 2.80266L4.942 5.058C4.85494 5.14558 4.75136 5.21502 4.63726 5.26228C4.52317 5.30954 4.40083 5.33369 4.27733 5.33333H2.66667C2.48986 5.33333 2.32029 5.40357 2.19526 5.52859C2.07024 5.65362 2 5.82319 2 6V10C2 10.1768 2.07024 10.3464 2.19526 10.4714C2.32029 10.5964 2.48986 10.6667 2.66667 10.6667H4.27733C4.40083 10.6663 4.52317 10.6905 4.63726 10.7377C4.75136 10.785 4.85494 10.8544 4.942 10.942L7.19733 13.198C7.26307 13.2639 7.34687 13.3087 7.43813 13.3269C7.52939 13.3451 7.62399 13.3358 7.70995 13.3002C7.79591 13.2645 7.86936 13.2042 7.921 13.1268C7.97263 13.0494 8.00013 12.9584 8 12.8653V3.13467Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.6667 6C11.0995 6.57699 11.3334 7.27877 11.3334 8C11.3334 8.72123 11.0995 9.42301 10.6667 10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.9094 12.2427C13.4666 11.6855 13.9085 11.0241 14.2101 10.2961C14.5116 9.56815 14.6668 8.78793 14.6668 7.99999C14.6668 7.21205 14.5116 6.43183 14.2101 5.70387C13.9085 4.97591 13.4666 4.31448 12.9094 3.75732", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _audioOn!!
        }

    private var _backspace: ImageVector? = null
    val Backspace: ImageVector
        get() {
            if (_backspace != null) return _backspace!!
            _backspace = create("Backspace", PathDef("M6.79998 4C6.50183 4.00002 6.21436 4.10574 5.99358 4.29657L2.19677 7.57657C2.1348 7.63013 2.08528 7.69545 2.05139 7.76832C2.01751 7.8412 2 7.92001 2 7.99971C2 8.07941 2.01751 8.15823 2.05139 8.23111C2.08528 8.30398 2.1348 8.36929 2.19677 8.42286L5.99358 11.7034C6.21436 11.8943 6.50183 12 6.79998 12H12.8C13.1183 12 13.4235 11.8796 13.6485 11.6653C13.8736 11.4509 14 11.1602 14 10.8571V5.14286C14 4.83975 13.8736 4.54906 13.6485 4.33474C13.4235 4.12041 13.1183 4 12.8 4H6.79998Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.5 6.5L11.5 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.5 6.5L8.5 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _backspace!!
        }

    private var _bell: ImageVector? = null
    val Bell: ImageVector
        get() {
            if (_bell != null) return _bell!!
            _bell = create("Bell", PathDef("M5.33333 5.8C5.33333 5.05739 5.61429 4.3452 6.11438 3.8201C6.61448 3.295 7.29276 3 8 3C8.70724 3 9.38552 3.295 9.88562 3.8201C10.3857 4.3452 10.6667 5.05739 10.6667 5.8C10.6667 9.06667 12 10 12 10H4C4 10 5.33333 9.06667 5.33333 5.8Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 12.5C6.19692 12.8028 6.48641 13.0554 6.83822 13.2313C7.19004 13.4072 7.59127 13.5 8 13.5C8.40873 13.5 8.80996 13.4072 9.16178 13.2313C9.51359 13.0554 9.80308 12.8028 10 12.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _bell!!
        }

    private var _bellDot: ImageVector? = null
    val BellDot: ImageVector
        get() {
            if (_bellDot != null) return _bellDot!!
            _bellDot = create("BellDot", PathDef("M4.86142 8.6961C4.47786 9.66547 4 9.99997 4 9.99997H12C12 9.99997 10.6667 9.06664 10.6667 5.79997C10.6667 5.05737 10.3857 4.34518 9.88562 3.82007C9.52389 3.44026 9.06893 3.18083 8.57722 3.06635", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 12.5C6.19692 12.8028 6.48641 13.0554 6.83822 13.2313C7.19004 13.4072 7.59127 13.5 8 13.5C8.40873 13.5 8.80996 13.4072 9.16178 13.2313C9.51359 13.0554 9.80308 12.8028 10 12.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 2.000 4.500 a 2.500 2.500 0 1 0 5.000 0 a 2.500 2.500 0 1 0 -5.000 0", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _bellDot!!
        }

    private var _bellOff: ImageVector? = null
    val BellOff: ImageVector
        get() {
            if (_bellOff != null) return _bellOff!!
            _bellOff = create("BellOff", PathDef("M10.6667 5.8C10.6667 5.05739 10.3857 4.3452 9.88562 3.8201C9.38552 3.295 8.70724 3 8 3C7.29276 3 6.61448 3.295 6.11438 3.8201C5.61428 4.3452 5.33333 5.05739 5.33333 5.8C5.33333 9.06667 4 10 4 10H7.375", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 12.5C6.19692 12.8028 6.48641 13.0554 6.83822 13.2313C7.19004 13.4072 7.59127 13.5 8 13.5C8.40873 13.5 8.80996 13.4072 9.16178 13.2313C9.51359 13.0554 9.80308 12.8028 10 12.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4 3L12.5 11.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _bellOff!!
        }

    private var _bellRing: ImageVector? = null
    val BellRing: ImageVector
        get() {
            if (_bellRing != null) return _bellRing!!
            _bellRing = create("BellRing", PathDef("M5.33333 5.8C5.33333 5.05739 5.61429 4.3452 6.11438 3.8201C6.61448 3.295 7.29276 3 8 3C8.70724 3 9.38552 3.295 9.88562 3.8201C10.3857 4.3452 10.6667 5.05739 10.6667 5.8C10.6667 9.06667 12 10 12 10H4C4 10 5.33333 9.06667 5.33333 5.8Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 12.5C6.19692 12.8028 6.48641 13.0554 6.83822 13.2313C7.19004 13.4072 7.59127 13.5 8 13.5C8.40873 13.5 8.80996 13.4072 9.16178 13.2313C9.51359 13.0554 9.80308 12.8028 10 12.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12 2.02081C12.617 2.89491 13.0754 3.88797 13.2528 5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4 2.02081C3.38299 2.89491 2.92461 3.88797 2.74719 5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _bellRing!!
        }

    private var _binary: ImageVector? = null
    val Binary: ImageVector
        get() {
            if (_binary != null) return _binary!!
            _binary = create("Binary", PathDef("M12 10.667a1.333 1.333 0 1 0-2.667 0V12A1.333 1.333 0 1 0 12 12v-1.333ZM6.667 4A1.333 1.333 0 0 0 4 4v1.333a1.333 1.333 0 1 0 2.667 0V4ZM4 13.333h2.667M9.333 6.667H12M4 9.333h1.333v4M9.333 2.667h1.334v4", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _binary!!
        }

    private var _bitbucket: ImageVector? = null
    val Bitbucket: ImageVector
        get() {
            if (_bitbucket != null) return _bitbucket!!
            _bitbucket = create("Bitbucket", PathDef("M2.38893 2.60654C2.33283 2.6058 2.27725 2.61737 2.2261 2.64042C2.17496 2.66347 2.12948 2.69745 2.09288 2.73996C2.05627 2.78247 2.02943 2.83249 2.01423 2.8865C1.99904 2.9405 1.99586 2.99718 2.00492 3.05254L3.63644 12.9576C3.67844 13.2076 3.89394 13.3916 4.14744 13.3941H11.975C12.0672 13.3951 12.1567 13.3631 12.2273 13.3039C12.2979 13.2446 12.345 13.1621 12.36 13.0711L13.995 3.05604C14.004 3.00072 14.0008 2.94409 13.9856 2.89015C13.9703 2.83621 13.9435 2.78626 13.9069 2.7438C13.8703 2.70134 13.8248 2.66741 13.7737 2.64439C13.7226 2.62137 13.6671 2.60982 13.611 2.61054L2.38893 2.60654ZM9.26 9.76511H6.76097L6.08496 6.23308H9.8655L9.26 9.76511Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _bitbucket!!
        }

    private var _blocks: ImageVector? = null
    val Blocks: ImageVector
        get() {
            if (_blocks != null) return _blocks!!
            _blocks = create("Blocks", PathDef("M7 13.5V5.143C7 4.97247 6.93226 4.80892 6.81167 4.68833C6.69108 4.56774 6.52753 4.5 6.357 4.5H3.143C2.97247 4.5 2.80892 4.56774 2.68833 4.68833C2.56774 4.80892 2.5 4.97247 2.5 5.143V12.857C2.5 12.9414 2.51663 13.0251 2.54895 13.1031C2.58126 13.1811 2.62862 13.252 2.68833 13.3117C2.74804 13.3714 2.81892 13.4187 2.89693 13.4511C2.97495 13.4834 3.05856 13.5 3.143 13.5H10.857C10.9414 13.5 11.0251 13.4834 11.1031 13.4511C11.1811 13.4187 11.252 13.3714 11.3117 13.3117C11.3714 13.252 11.4187 13.1811 11.4511 13.1031C11.4834 13.0251 11.5 12.9414 11.5 12.857V9.643C11.5 9.47247 11.4323 9.30892 11.3117 9.18833C11.1911 9.06774 11.0275 9 10.857 9H2.5M12.929 2.5H10.07C9.91873 2.50026 9.77376 2.56054 9.66689 2.6676C9.56002 2.77465 9.5 2.91973 9.5 3.071V5.93C9.5 6.245 9.756 6.501 10.071 6.501H12.929C13.0041 6.501 13.0784 6.4862 13.1477 6.45744C13.2171 6.42868 13.2801 6.38653 13.3331 6.3334C13.3861 6.28028 13.4282 6.21721 13.4568 6.14782C13.4855 6.07843 13.5001 6.00407 13.5 5.929V3.07C13.4997 2.91873 13.4395 2.77376 13.3324 2.66689C13.2254 2.56002 13.0803 2.5 12.929 2.5Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _blocks!!
        }

    private var _boltFilled: ImageVector? = null
    val BoltFilled: ImageVector
        get() {
            if (_boltFilled != null) return _boltFilled!!
            _boltFilled = create("BoltFilled", PathDef("M9.48836 2.06572C9.62447 2.1282 9.73467 2.23101 9.80181 2.35814C9.86896 2.48527 9.88927 2.62958 9.8596 2.76863L9.10795 6.28572H12.8525C12.9843 6.28571 13.1133 6.32112 13.2242 6.38774C13.335 6.45435 13.4231 6.54936 13.4779 6.66146C13.5326 6.77354 13.5518 6.89799 13.5331 7.01997C13.5143 7.14197 13.4585 7.25635 13.3722 7.34951L7.41396 13.7785C7.31457 13.8856 7.18007 13.959 7.03146 13.9872C6.88284 14.0153 6.72841 13.9968 6.59222 13.9344C6.45604 13.872 6.34575 13.7693 6.27851 13.6421C6.21127 13.515 6.19086 13.3707 6.22048 13.2316L6.97213 9.71452H3.22758C3.0958 9.71453 2.96679 9.67912 2.85591 9.61251C2.74505 9.54589 2.65697 9.45088 2.60221 9.33879C2.54744 9.22671 2.52829 9.10225 2.54702 8.98027C2.56575 8.85827 2.62157 8.7439 2.70784 8.65074L8.66611 2.22173C8.76554 2.1145 8.90011 2.04105 9.04884 2.01284C9.19758 1.98462 9.3521 2.00321 9.48836 2.06572Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _boltFilled!!
        }

    private var _boltOutlined: ImageVector? = null
    val BoltOutlined: ImageVector
        get() {
            if (_boltOutlined != null) return _boltOutlined!!
            _boltOutlined = create("BoltOutlined", PathDef("M9.29787 2.8462C9.41607 2.90046 9.51178 2.98975 9.5701 3.10016C9.62841 3.21057 9.64605 3.3359 9.62028 3.45666L8.96749 6.51117H12.2195C12.334 6.51115 12.446 6.54191 12.5423 6.59976C12.6386 6.65762 12.7151 6.74013 12.7627 6.83748C12.8102 6.93482 12.8269 7.04291 12.8106 7.14885C12.7943 7.2548 12.7458 7.35413 12.6709 7.43504L7.49631 13.0184C7.40998 13.1115 7.29318 13.1752 7.16411 13.1997C7.03504 13.2241 6.90092 13.2081 6.78264 13.1539C6.66437 13.0997 6.56859 13.0104 6.5102 12.9C6.4518 12.7896 6.43408 12.6643 6.45979 12.5435L7.11259 9.48899H3.86054C3.74609 9.489 3.63405 9.45825 3.53776 9.40039C3.44147 9.34254 3.36498 9.26003 3.31742 9.16268C3.26986 9.06534 3.25322 8.95725 3.26949 8.85131C3.28576 8.74536 3.33423 8.64603 3.40916 8.56513L8.58377 2.98169C8.67012 2.88856 8.78699 2.82478 8.91616 2.80028C9.04533 2.77576 9.17953 2.79192 9.29787 2.8462Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M9.29787 2.8462C9.41607 2.90046 9.51178 2.98975 9.5701 3.10016C9.62841 3.21057 9.64605 3.3359 9.62028 3.45666L8.96749 6.51117H12.2195C12.334 6.51115 12.446 6.54191 12.5423 6.59976C12.6386 6.65762 12.7151 6.74013 12.7627 6.83748C12.8102 6.93482 12.8269 7.04291 12.8106 7.14885C12.7943 7.2548 12.7458 7.35413 12.6709 7.43504L7.49631 13.0184C7.40998 13.1115 7.29318 13.1752 7.16411 13.1997C7.03504 13.2241 6.90092 13.2081 6.78264 13.1539C6.66437 13.0997 6.56859 13.0104 6.5102 12.9C6.4518 12.7896 6.43408 12.6643 6.45979 12.5435L7.11259 9.48899H3.86054C3.74609 9.489 3.63405 9.45825 3.53776 9.40039C3.44147 9.34254 3.36498 9.26003 3.31742 9.16268C3.26986 9.06534 3.25322 8.95725 3.26949 8.85131C3.28576 8.74536 3.33423 8.64603 3.40916 8.56513L8.58377 2.98169C8.67012 2.88856 8.78699 2.82478 8.91616 2.80028C9.04533 2.77576 9.17953 2.79192 9.29787 2.8462Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _boltOutlined!!
        }

    private var _book: ImageVector? = null
    val Book: ImageVector
        get() {
            if (_book != null) return _book!!
            _book = create("Book", PathDef("M4 12.125v-8.25c0-.365.132-.714.366-.972.235-.258.552-.403.884-.403H12v11H5.25c-.332 0-.65-.145-.884-.403A1.448 1.448 0 0 1 4 12.125Zm0 0c0-.365.132-.714.366-.972.235-.258.552-.403.884-.403H12", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _book!!
        }

    private var _bookCopy: ImageVector? = null
    val BookCopy: ImageVector
        get() {
            if (_bookCopy != null) return _bookCopy!!
            _bookCopy = create("BookCopy", PathDef("M2.5 10.5V3.643c0-.303.113-.594.315-.808.202-.215.476-.335.762-.335H9.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.5 9.5h-.667c-.353 0-.692.105-.942.293-.25.187-.391.442-.391.707 0 .265.14.52.39.707.25.188.59.293.943.293H4.5M13.5 11.25H7.577c-.286 0-.56.118-.762.33a1.151 1.151 0 0 0-.315.795m0 0c0 .298.113.585.315.796.202.21.476.329.762.329H13.5v-9H7.577c-.286 0-.56.119-.762.33a1.151 1.151 0 0 0-.315.795v6.75Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _bookCopy!!
        }

    private var _bookmark: ImageVector? = null
    val Bookmark: ImageVector
        get() {
            if (_bookmark != null) return _bookmark!!
            _bookmark = create("Bookmark", PathDef("M11.8644 1.04416C12.2744 1.04416 12.6675 1.20702 12.9574 1.4969C13.2473 1.78679 13.4101 2.17996 13.4101 2.5899V14.183C13.4101 14.3184 13.3744 14.4513 13.3069 14.5685C13.2393 14.6859 13.1422 14.7833 13.0251 14.8513C12.9081 14.9192 12.7752 14.9551 12.6399 14.9556C12.5045 14.956 12.3715 14.921 12.2539 14.8538L8.76673 12.8614C8.53321 12.728 8.26896 12.6578 8.00004 12.6578C7.73111 12.6578 7.46686 12.728 7.23334 12.8614L3.74615 14.8538C3.62863 14.921 3.49553 14.956 3.36019 14.9556C3.22485 14.9551 3.092 14.9192 2.97493 14.8513C2.85787 14.7833 2.76069 14.6859 2.69312 14.5685C2.62556 14.4513 2.58997 14.3184 2.58994 14.183V2.5899C2.58994 2.17996 2.75278 1.78679 3.04267 1.4969C3.33255 1.20702 3.72572 1.04416 4.13568 1.04416H11.8644Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _bookmark!!
        }

    private var _box: ImageVector? = null
    val Box: ImageVector
        get() {
            if (_box != null) return _box!!
            _box = create("Box", PathDef("M13.3996 5.59852C13.3994 5.3881 13.3439 5.18144 13.2386 4.99926C13.1333 4.81709 12.9819 4.66581 12.7997 4.56059L8.59996 2.16076C8.41755 2.05544 8.21063 2 8 2C7.78937 2 7.58246 2.05544 7.40004 2.16076L3.20033 4.56059C3.0181 4.66581 2.86674 4.81709 2.76144 4.99926C2.65613 5.18144 2.60059 5.3881 2.60037 5.59852V10.3982C2.60059 10.6086 2.65613 10.8153 2.76144 10.9975C2.86674 11.1796 3.0181 11.3309 3.20033 11.4361L7.40004 13.836C7.58246 13.9413 7.78937 13.9967 8 13.9967C8.21063 13.9967 8.41755 13.9413 8.59996 13.836L12.7997 11.4361C12.9819 11.3309 13.1333 11.1796 13.2386 10.9975C13.3439 10.8153 13.3994 10.6086 13.3996 10.3982V5.59852Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.78033 4.99857L7.99998 7.99836L13.2196 4.99857", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 13.9979V7.99829", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _box!!
        }

    private var _boxOpen: ImageVector? = null
    val BoxOpen: ImageVector
        get() {
            if (_boxOpen != null) return _boxOpen!!
            _boxOpen = create("BoxOpen", PathDef("M8 14.0043V8.59991", isFill = false, isStroke = true, strokeWidth = 1.20097f), PathDef("M9.9035 2.12072C10.0531 2.0371 10.2216 1.99319 10.3929 1.99319C10.5642 1.99319 10.7327 2.0371 10.8823 2.12072L13.4043 3.53786C13.5829 3.63887 13.7315 3.78548 13.8349 3.96272C13.9383 4.13997 13.9928 4.34148 13.9928 4.54668C13.9928 4.75187 13.9383 4.95339 13.8349 5.13063C13.7315 5.30787 13.5829 5.45449 13.4043 5.55549L6.09043 9.67481C5.94043 9.76037 5.77072 9.80537 5.59804 9.80537C5.42535 9.80537 5.25564 9.76037 5.10564 9.67481L2.59562 8.25767C2.417 8.15666 2.2684 8.01005 2.16501 7.83281C2.06162 7.65556 2.00714 7.45405 2.00714 7.24885C2.00714 7.04366 2.06162 6.84214 2.16501 6.6649C2.2684 6.48766 2.417 6.34104 2.59562 6.24004L9.9035 2.12072Z", isFill = false, isStroke = true, strokeWidth = 1.20097f), PathDef("M12.8038 8.59991V10.9238C12.8041 11.1504 12.742 11.3728 12.6245 11.5666C12.507 11.7604 12.3384 11.9181 12.1373 12.0227L8.53441 13.8722C8.36933 13.958 8.18602 14.0027 7.99998 14.0027C7.81394 14.0027 7.63063 13.958 7.46555 13.8722L3.86264 12.0227C3.66153 11.9181 3.493 11.7604 3.37546 11.5666C3.25791 11.3728 3.19587 11.1504 3.19611 10.9238V8.59991", isFill = false, isStroke = true, strokeWidth = 1.20097f), PathDef("M13.4043 8.25766C13.5829 8.15666 13.7315 8.01004 13.8349 7.8328C13.9383 7.65556 13.9928 7.45404 13.9928 7.24885C13.9928 7.04365 13.9383 6.84213 13.8349 6.66489C13.7315 6.48765 13.5829 6.34103 13.4043 6.24003L6.09644 2.11471C5.94745 2.02938 5.77874 1.9845 5.60704 1.9845C5.43535 1.9845 5.26664 2.02938 5.11765 2.11471L2.59562 3.53785C2.417 3.63886 2.2684 3.78547 2.16501 3.96271C2.06162 4.13996 2.00714 4.34147 2.00714 4.54667C2.00714 4.75186 2.06162 4.95338 2.16501 5.13062C2.2684 5.30786 2.417 5.45448 2.59562 5.55548L9.90951 9.6748C10.0584 9.76036 10.2272 9.80538 10.3989 9.80538C10.5706 9.80538 10.7394 9.76036 10.8883 9.6748L13.4043 8.25766Z", isFill = false, isStroke = true, strokeWidth = 1.20097f))
            return _boxOpen!!
        }

    private var _caseSensitive: ImageVector? = null
    val CaseSensitive: ImageVector
        get() {
            if (_caseSensitive != null) return _caseSensitive!!
            _caseSensitive = create("CaseSensitive", PathDef("M4.407 4h1.78l2.408 8.39H7.256l-.596-2.04H3.92l-.582 2.04H2L4.407 4Zm.89 1.44-1.05 3.7h2.1l-1.05-3.7ZM9.852 12.332h-.005a1.228 1.228 0 0 1-.669-.64v-.005C9.053 11.4 9 11 9 10.503c0-.582.082-1.059.27-1.4.187-.362.5-.607.924-.747.423-.14 1.001-.211 1.733-.211h.962v-.14c0-.323-.038-.554-.115-.708v-.005a.575.575 0 0 0-.342-.308c-.173-.067-.438-.11-.804-.11-.236 0-.428.019-.582.048-.154.029-.255.067-.313.115h-.005c-.115.077-.202.25-.216.583l-.01.149H9.188V7.61c0-.472.072-.857.221-1.136.159-.298.429-.5.785-.611.351-.12.832-.178 1.434-.178.63 0 1.127.067 1.488.202.38.14.654.39.808.741.154.342.226.804.226 1.377v4.39h-1.222v-.573a1.676 1.676 0 0 1-.573.481c-.294.145-.722.207-1.266.207-.515 0-.934-.053-1.237-.178Zm.953-2.883a.638.638 0 0 0-.375.294c-.068.134-.111.346-.111.654 0 .4.082.621.197.727.12.101.38.178.828.178.429 0 .742-.067.944-.183.197-.12.351-.317.442-.616.087-.274.14-.669.15-1.189l-1.19.01c-.39.01-.683.053-.88.12l-.005.005Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _caseSensitive!!
        }

    private var _chat: ImageVector? = null
    val Chat: ImageVector
        get() {
            if (_chat != null) return _chat!!
            _chat = create("Chat", PathDef("M4.17279 8.26346C4.87566 8.62402 5.68419 8.72168 6.4527 8.53885C7.2212 8.35601 7.89913 7.90471 8.36433 7.26626C8.82953 6.62781 9.0514 5.8442 8.98996 5.05664C8.92852 4.26908 8.58781 3.52936 8.02922 2.97078C7.47064 2.41219 6.73092 2.07148 5.94336 2.01004C5.1558 1.9486 4.37219 2.17047 3.73374 2.63567C3.09529 3.10087 2.64399 3.7788 2.46115 4.5473C2.27832 5.31581 2.37598 6.12435 2.73654 6.82721L2 9L4.17279 8.26346Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.07168 11C7.16761 11.4537 7.35843 11.8857 7.63567 12.2662C8.10087 12.9047 8.7788 13.356 9.5473 13.5388C10.3158 13.7217 11.1243 13.624 11.8272 13.2634L14 14L13.2635 11.8272C13.624 11.1243 13.7217 10.3158 13.5388 9.54728C13.356 8.77877 12.9047 8.10084 12.2663 7.63564C11.8858 7.3584 11.4537 7.16759 11 7.07166", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _chat!!
        }

    private var _check: ImageVector? = null
    val Check: ImageVector
        get() {
            if (_check != null) return _check!!
            _check = create("Check", PathDef("M4.625 8.98121L7.03402 10.7714L11.3437 4.75989", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _check!!
        }

    private var _checkDouble: ImageVector? = null
    val CheckDouble: ImageVector
        get() {
            if (_checkDouble != null) return _checkDouble!!
            _checkDouble = create("CheckDouble", PathDef("M11.5999 4.38336L4.99996 10.9833L2 7.98332", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14 6.78339L9.50009 11.2833L8.6001 10.3833", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _checkDouble!!
        }

    private var _chevronDown: ImageVector? = null
    val ChevronDown: ImageVector
        get() {
            if (_chevronDown != null) return _chevronDown!!
            _chevronDown = create("ChevronDown", PathDef("M4.15186 6.47321L7.99258 10.1696L11.8483 6.47321", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _chevronDown!!
        }

    private var _chevronDownUp: ImageVector? = null
    val ChevronDownUp: ImageVector
        get() {
            if (_chevronDownUp != null) return _chevronDownUp!!
            _chevronDownUp = create("ChevronDownUp", PathDef("M11.3335 13.3333L8.00017 10L4.66685 13.3333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.3335 2.66669L8.00017 6.00002L4.66685 2.66669", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _chevronDownUp!!
        }

    private var _chevronLeft: ImageVector? = null
    val ChevronLeft: ImageVector
        get() {
            if (_chevronLeft != null) return _chevronLeft!!
            _chevronLeft = create("ChevronLeft", PathDef("M9.55361 4.15179L5.85718 7.99251L9.55361 11.8482", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _chevronLeft!!
        }

    private var _chevronRight: ImageVector? = null
    val ChevronRight: ImageVector
        get() {
            if (_chevronRight != null) return _chevronRight!!
            _chevronRight = create("ChevronRight", PathDef("M6.44653 4.16071L10.1608 8.00143L6.44653 11.8571", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _chevronRight!!
        }

    private var _chevronUp: ImageVector? = null
    val ChevronUp: ImageVector
        get() {
            if (_chevronUp != null) return _chevronUp!!
            _chevronUp = create("ChevronUp", PathDef("M4.15186 9.56252L7.99258 5.86609L11.8483 9.56252", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _chevronUp!!
        }

    private var _chevronUpDown: ImageVector? = null
    val ChevronUpDown: ImageVector
        get() {
            if (_chevronUpDown != null) return _chevronUpDown!!
            _chevronUpDown = create("ChevronUpDown", PathDef("M4.66675 10L8.00008 13.3333L11.3334 10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.66675 6.00002L8.00008 2.66669L11.3334 6.00002", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _chevronUpDown!!
        }

    private var _circle: ImageVector? = null
    val Circle: ImageVector
        get() {
            if (_circle != null) return _circle!!
            _circle = create("Circle", PathDef("M8 12C10.2091 12 12 10.2091 12 8C12 5.79087 10.2091 4 8 4C5.79087 4 4 5.79087 4 8C4 10.2091 5.79087 12 8 12Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _circle!!
        }

    private var _circleHelp: ImageVector? = null
    val CircleHelp: ImageVector
        get() {
            if (_circleHelp != null) return _circleHelp!!
            _circleHelp = create("CircleHelp", PathDef("M8 14C11.3137 14 14 11.3137 14 8C14 4.68629 11.3137 2 8 2C4.68629 2 2 4.68629 2 8C2 11.3137 4.68629 14 8 14Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.54492 6.5C6.66248 6.16582 6.8945 5.88404 7.19991 5.70455C7.50532 5.52506 7.86439 5.45945 8.21354 5.51934C8.56268 5.57922 8.87937 5.76075 9.1075 6.03175C9.33564 6.30276 9.4605 6.64576 9.45997 7C9.45997 8.00002 7.95994 8.50003 7.95994 8.50003", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 10.5H8.005", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _circleHelp!!
        }

    private var _clock: ImageVector? = null
    val Clock: ImageVector
        get() {
            if (_clock != null) return _clock!!
            _clock = create("Clock", PathDef("M8 4.87936V8L10.229 9.33742", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 14C11.3137 14 14 11.3137 14 8C14 4.6863 11.3137 2 8 2C4.6863 2 2 4.6863 2 8C2 11.3137 4.6863 14 8 14Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _clock!!
        }

    private var _close: ImageVector? = null
    val Close: ImageVector
        get() {
            if (_close != null) return _close!!
            _close = create("Close", PathDef("M4.70581 4.5L11.294 11.5M11.294 4.5L4.70581 11.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _close!!
        }

    private var _cloudDownload: ImageVector? = null
    val CloudDownload: ImageVector
        get() {
            if (_cloudDownload != null) return _cloudDownload!!
            _cloudDownload = create("CloudDownload", PathDef("M8.001 9v4l-2-2M8.001 13l2-2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.436 10.389a4.215 4.215 0 0 1-1.424-3.484 4.227 4.227 0 0 1 1.92-3.236 4.19 4.19 0 0 1 5.335.665 4.22 4.22 0 0 1 .96 1.677H11.3c.584 0 1.151.19 1.618.54a2.71 2.71 0 0 1 .913 3.116A2.709 2.709 0 0 1 12.762 11", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _cloudDownload!!
        }

    private var _code: ImageVector? = null
    val Code: ImageVector
        get() {
            if (_code != null) return _code!!
            _code = create("Code", PathDef("m11.75 10.5 2.5-2.5-2.5-2.5M4.25 5.5 1.75 8l2.5 2.5M9.563 3 6.437 13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _code!!
        }

    private var _codeberg: ImageVector? = null
    val Codeberg: ImageVector
        get() {
            if (_codeberg != null) return _codeberg!!
            _codeberg = create("Codeberg", PathDef("M7.99947 2.00001C7.15863 1.99826 6.32573 2.16261 5.54858 2.48364C4.77144 2.80466 4.06536 3.27604 3.4709 3.87071C2.87644 4.46537 2.40529 5.1716 2.08452 5.94885C1.76376 6.7261 1.59968 7.55906 1.60172 8.39989C1.60172 9.6017 1.94029 10.7806 2.57906 11.7995L7.91309 4.90217C7.95148 4.85311 8.04692 4.85311 8.08531 4.90217L10.313 7.78246H8.71767L8.75233 7.90989H10.4122L10.8824 8.51666H8.92348L8.9784 8.71608H11.0365L11.4508 9.25087H9.12716L9.19914 9.5084H11.6481L12.0187 9.98507H9.33244L9.42042 10.2991H12.2602L12.5849 10.7177H9.53665L9.63369 11.0642H12.8531L13.1527 11.4519H9.74193L9.83951 11.7984H13.4209C14.0594 10.7799 14.3982 9.60205 14.3983 8.39989C14.4001 7.55903 14.2359 6.72608 13.9149 5.94885C13.594 5.17163 13.1228 4.46543 12.5283 3.8708C11.9337 3.27616 11.2276 2.8048 10.4504 2.48376C9.67326 2.16272 8.84033 1.99833 7.99947 2.00001ZM9.94774 12.1861L10.0448 12.5327H12.8846C12.9768 12.4239 13.0728 12.3018 13.1581 12.1861H9.94774ZM10.153 12.9203L10.249 13.2669H12.1488C12.273 13.1613 12.4073 13.0386 12.5284 12.9203H10.153ZM10.3572 13.6545L10.4543 14H11.0957C11.2855 13.8912 11.4609 13.7803 11.6513 13.6545H10.3572Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _codeberg!!
        }

    private var _command: ImageVector? = null
    val Command: ImageVector
        get() {
            if (_command != null) return _command!!
            _command = create("Command", PathDef("M9.66667 4.66667V11.3333C9.66667 11.663 9.76441 11.9852 9.94755 12.2593C10.1307 12.5334 10.391 12.747 10.6955 12.8731C11.0001 12.9993 11.3352 13.0323 11.6585 12.968C11.9818 12.9037 12.2788 12.7449 12.5118 12.5118C12.7449 12.2788 12.9037 11.9818 12.968 11.6585C13.0323 11.3352 12.9993 11.0001 12.8731 10.6955C12.747 10.391 12.5334 10.1307 12.2593 9.94755C11.9852 9.76441 11.663 9.66667 11.3333 9.66667H4.66667C4.33703 9.66667 4.0148 9.76441 3.74072 9.94755C3.46663 10.1307 3.25301 10.391 3.12687 10.6955C3.00072 11.0001 2.96772 11.3352 3.03203 11.6585C3.09633 11.9818 3.25507 12.2788 3.48816 12.5118C3.72124 12.7449 4.01822 12.9037 4.34152 12.968C4.66482 13.0323 4.99993 12.9993 5.30447 12.8731C5.60902 12.747 5.86931 12.5334 6.05245 12.2593C6.23559 11.9852 6.33333 11.663 6.33333 11.3333V4.66667C6.33333 4.33703 6.23559 4.0148 6.05245 3.74072C5.86931 3.46663 5.60902 3.25301 5.30447 3.12687C4.99993 3.00072 4.66482 2.96772 4.34152 3.03203C4.01822 3.09633 3.72124 3.25507 3.48816 3.48816C3.25507 3.72124 3.09633 4.01822 3.03203 4.34152C2.96772 4.66482 3.00072 4.99993 3.12687 5.30447C3.25301 5.60902 3.46663 5.86931 3.74072 6.05245C4.0148 6.23559 4.33703 6.33333 4.66667 6.33333H11.3333C11.663 6.33333 11.9852 6.23559 12.2593 6.05245C12.5334 5.86931 12.747 5.60902 12.8731 5.30447C12.9993 4.99993 13.0323 4.66482 12.968 4.34152C12.9037 4.01822 12.7449 3.72124 12.5118 3.48816C12.2788 3.25507 11.9818 3.09633 11.6585 3.03203C11.3352 2.96772 11.0001 3.00072 10.6955 3.12687C10.391 3.25301 10.1307 3.46663 9.94755 3.74072C9.76441 4.0148 9.66667 4.33703 9.66667 4.66667Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _command!!
        }

    private var _compact: ImageVector? = null
    val Compact: ImageVector
        get() {
            if (_compact != null) return _compact!!
            _compact = create("Compact", PathDef("M10 10L14 14M13.2 10H10V13.2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.8 10H6V13.2M6 10L2 14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.2 6H10V2.8M10 6L14 2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.8 6H6V2.8M6 6L2 2", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _compact!!
        }

    private var _control: ImageVector? = null
    val Control: ImageVector
        get() {
            if (_control != null) return _control!!
            _control = create("Control", PathDef("M3.5 6.12487L7.64656 1.97852C7.84183 1.78327 8.1584 1.78328 8.35366 1.97853L12.5 6.12487", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _control!!
        }

    private var _copilot: ImageVector? = null
    val Copilot: ImageVector
        get() {
            if (_copilot != null) return _copilot!!
            _copilot = create("Copilot", PathDef("M6.44643 8.76593C6.83106 8.76593 7.14286 9.0793 7.14286 9.46588V10.9825C7.14286 11.369 6.83106 11.6824 6.44643 11.6824C6.06181 11.6824 5.75 11.369 5.75 10.9825V9.46588C5.75 9.0793 6.06181 8.76593 6.44643 8.76593Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M9.57168 8.76593C9.95631 8.76593 10.2681 9.0793 10.2681 9.46588V10.9825C10.2681 11.369 9.95631 11.6824 9.57168 11.6824C9.18705 11.6824 8.87524 11.369 8.87524 10.9825V9.46588C8.87524 9.0793 9.18705 8.76593 9.57168 8.76593Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M7.99977 4.17853C7.99977 6.67853 5.83695 7.28202 4.30332 7.28202C2.76971 7.28202 2.44604 6.1547 2.44604 4.76409C2.44604 3.37347 3.68929 2.24615 5.2229 2.24615C6.75651 2.24615 7.99977 2.78791 7.99977 4.17853Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 4.17853C8 6.67853 10.1628 7.28202 11.6965 7.28202C13.2301 7.28202 13.5537 6.1547 13.5537 4.76409C13.5537 3.37347 12.3105 2.24615 10.7769 2.24615C9.24325 2.24615 8 2.78791 8 4.17853Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.5894 6.875C12.5894 6.875 13.3413 7.35585 13.7144 8.08398C14.0876 8.81212 14.0894 10.4985 13.7144 11.1064C13.3395 11.7143 12.8931 12.1429 11.7637 12.7543C10.6344 13.3657 9.143 13.7321 9.143 13.7321H6.85728C6.85728 13.7321 5.37513 13.4107 4.23656 12.7543C3.09798 12.0978 2.55371 11.6786 2.28585 11.1064C2.01799 10.5342 1.92871 8.85715 2.28585 8.08398C2.64299 7.31081 3.42871 6.875 3.42871 6.875", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.9375 12.6016V7.33636L13.9052 7.99224V10.9255L11.9375 12.6016Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M4.01793 12.6016V7.33636L2.05029 7.99224V10.9255L4.01793 12.6016Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _copilot!!
        }

    private var _copilotDisabled: ImageVector? = null
    val CopilotDisabled: ImageVector
        get() {
            if (_copilotDisabled != null) return _copilotDisabled!!
            _copilotDisabled = create("CopilotDisabled", PathDef("M2.38084 5.44739C2.42754 5.92439 2.54311 6.33781 2.72903 6.68419C2.70043 6.7268 2.67414 6.77045 2.64995 6.81465C2.39071 6.99942 2.09192 7.27316 1.83439 7.54967C1.53258 7.8737 1.18745 8.30675 1.05511 8.70208L1.04265 8.73929L1.03513 8.77782C0.975842 9.08191 0.999402 9.48334 1.04817 9.81846C1.09192 10.1191 1.17095 10.4701 1.29544 10.735C1.44476 11.2894 1.88328 11.6844 2.27302 11.9619C2.6204 12.2092 3.03378 12.4329 3.39179 12.6267C3.4686 12.6683 3.54294 12.7085 3.61345 12.7473L3.62786 12.7552L3.64268 12.7623C4.05361 12.9594 4.69547 13.2491 5.30115 13.4909C5.60351 13.6116 5.90465 13.7235 6.16744 13.8062C6.39236 13.877 6.6532 13.948 6.87108 13.9562C7.19351 13.9948 7.54309 14 7.99999 14C8.45688 14 8.80648 13.9948 9.12892 13.9562C9.34679 13.948 9.60764 13.877 9.83256 13.8062C10.0953 13.7235 10.3965 13.6116 10.6989 13.4909C11.0041 13.369 11.3186 13.235 11.6081 13.1067L10.5467 12.2257C9.92791 12.5006 9.61228 12.6334 9.31639 12.7078C9.00201 12.7869 8.69433 12.8031 7.99999 12.8031C7.30564 12.8031 6.99799 12.7869 6.68361 12.7078C6.35125 12.6243 5.99398 12.467 5.21016 12.1174C4.24428 11.6866 3.83266 11.4004 3.6523 11.2153C3.57295 11.1339 3.5474 11.0807 3.53501 11.0478C3.52011 11.0083 3.5122 10.9688 3.4984 10.8761V8.7332C3.49839 8.31083 3.52629 7.91975 3.6034 7.63032C3.60757 7.61465 3.6118 7.59963 3.61607 7.58525C4.02831 7.80896 4.49555 7.89251 4.95638 7.89251C5.07488 7.89251 5.19417 7.8891 5.31358 7.8818L2.38084 5.44739Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6.63694 8.98022C6.3356 9.00981 6.1001 9.26519 6.1001 9.57584V10.8725C6.1001 11.203 6.3667 11.471 6.69556 11.471C7.02442 11.471 7.29101 11.203 7.29101 10.8725V9.57584C7.29101 9.55739 7.29018 9.53913 7.28856 9.52111L6.63694 8.98022Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M8.70898 10.7003V10.8725C8.70898 11.203 8.97557 11.471 9.30443 11.471C9.39784 11.471 9.48622 11.4493 9.5649 11.4108L8.70898 10.7003Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6.09444 2.02107C5.38906 1.93962 4.51467 2.09228 3.78857 2.51486L4.71546 3.28426C5.14098 3.1227 5.60048 3.06844 5.96984 3.11109C6.8169 3.2089 7.09729 3.4728 7.21756 3.68905C7.36871 3.96084 7.38394 4.34213 7.35706 4.91278C7.34824 5.1 7.32376 5.26765 7.286 5.41801L10.1886 7.82737C10.472 7.87295 10.7601 7.89249 11.0437 7.89249C11.5045 7.89249 11.9718 7.80894 12.384 7.58523C12.3883 7.59961 12.3925 7.61463 12.3967 7.6303C12.4738 7.91973 12.5017 8.31081 12.5017 8.73318V9.74745L14.4066 11.3287C14.538 11.1547 14.6447 10.9577 14.7047 10.735C14.8291 10.4701 14.9082 10.1191 14.9519 9.81844C15.0007 9.48332 15.0243 9.08189 14.965 8.7778L14.9575 8.73927L14.945 8.70206C14.8127 8.30673 14.4675 7.87368 14.1657 7.54965C13.9082 7.27314 13.6094 6.9994 13.3501 6.81463C13.326 6.77043 13.2997 6.72678 13.2711 6.68417C13.5202 6.21998 13.6431 5.63537 13.6431 4.93872C13.6431 3.80567 13.0327 3.01576 12.2747 2.5525C11.5366 2.10138 10.6317 1.93724 9.90572 2.02107C9.01323 2.12413 8.38524 2.41316 8.00008 2.89841C7.61492 2.41316 6.98693 2.12413 6.09444 2.02107ZM11.7075 3.48996C12.2085 3.79616 12.5514 4.26316 12.5514 4.93872C12.5514 5.75753 12.3471 6.19648 12.1135 6.43349C11.8806 6.66983 11.5299 6.79529 11.0437 6.79529C10.3585 6.79529 9.76832 6.65786 9.3546 6.37099C8.96792 6.10286 8.67859 5.66636 8.6431 4.91278C8.61622 4.34213 8.63145 3.96084 8.7826 3.68905C8.90287 3.4728 9.18326 3.2089 10.0303 3.11109C10.527 3.05374 11.1866 3.17162 11.7075 3.48996Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M14.1225 13.809C14.0341 13.9146 13.877 13.9289 13.7711 13.8409L1.19311 3.40023C1.08659 3.3118 1.07221 3.15364 1.16104 3.04745L1.87752 2.19103C1.96588 2.08542 2.123 2.07114 2.22895 2.15908L14.8069 12.5998C14.9134 12.6882 14.9278 12.8464 14.839 12.9526L14.1225 13.809Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _copilotDisabled!!
        }

    private var _copilotError: ImageVector? = null
    val CopilotError: ImageVector
        get() {
            if (_copilotError != null) return _copilotError!!
            _copilotError = create("CopilotError", PathDef("M6.09436 2.02107C5.36842 1.93724 4.46348 2.10138 3.72539 2.5525C2.96744 3.01576 2.35705 3.80567 2.35705 4.93872C2.35705 5.63537 2.47988 6.21998 2.72903 6.68417C2.70043 6.72678 2.67414 6.77043 2.64995 6.81463C2.39071 6.9994 2.09192 7.27314 1.83439 7.54965C1.53258 7.87368 1.18745 8.30673 1.05511 8.70206L1.04265 8.73927L1.03513 8.7778C0.975842 9.08189 0.999402 9.48332 1.04817 9.81844C1.09192 10.1191 1.17095 10.4701 1.29544 10.735C1.44476 11.2894 1.88328 11.6844 2.27302 11.9619C2.6204 12.2092 3.03378 12.4329 3.39179 12.6267C3.4686 12.6683 3.54294 12.7085 3.61345 12.7473L3.62786 12.7552L3.64268 12.7623C4.05361 12.9594 4.69547 13.2491 5.30115 13.4909C5.60351 13.6116 5.90465 13.7235 6.16744 13.8062C6.39236 13.877 6.6532 13.948 6.87108 13.9562C7.19351 13.9948 7.54309 14 7.99999 14C8.01293 14 8.02579 14 8.03857 14C7.97904 13.903 7.99191 13.7743 8.07655 13.6911L9.0197 12.7639C8.77857 12.7952 8.48273 12.8031 7.99999 12.8031C7.30564 12.8031 6.99799 12.7869 6.68361 12.7078C6.35125 12.6243 5.99398 12.467 5.21016 12.1174C4.24428 11.6866 3.83266 11.4004 3.6523 11.2153C3.57295 11.1339 3.5474 11.0807 3.53501 11.0478C3.52011 11.0083 3.5122 10.9688 3.4984 10.8761V8.73318C3.49839 8.31081 3.52629 7.91973 3.6034 7.6303C3.60757 7.61463 3.6118 7.59961 3.61607 7.58523C4.02831 7.80894 4.49555 7.89249 4.95638 7.89249C5.75982 7.89249 6.59976 7.73566 7.26541 7.27411C7.55937 7.07027 7.8077 6.81497 8 6.50734C8.1923 6.81497 8.44063 7.07027 8.73459 7.27411C9.40024 7.73566 10.2402 7.89249 11.0436 7.89249C11.5044 7.89249 11.9717 7.80894 12.3839 7.58523C12.3882 7.59961 12.3924 7.61463 12.3966 7.6303C12.4737 7.91973 12.5016 8.31081 12.5016 8.73318V9.34082L14.1266 7.7433C14.169 7.70159 14.2225 7.67811 14.2775 7.67276C14.2398 7.63028 14.2024 7.58915 14.1656 7.54965C13.9081 7.27314 13.6093 6.9994 13.35 6.81463C13.3259 6.77043 13.2996 6.72678 13.271 6.68417C13.5201 6.21998 13.643 5.63537 13.643 4.93872C13.643 3.80567 13.0326 3.01576 12.2746 2.5525C11.5365 2.10138 10.6316 1.93724 9.90564 2.02107C9.01315 2.12413 8.38516 2.41316 8 2.89841C7.61484 2.41316 6.98685 2.12413 6.09436 2.02107ZM3.44871 4.93872C3.44871 4.26316 3.79162 3.79616 4.2926 3.48996C4.81346 3.17162 5.4731 3.05374 5.96976 3.11109C6.81682 3.2089 7.09721 3.4728 7.21748 3.68905C7.36863 3.96084 7.38386 4.34213 7.35698 4.91278C7.32149 5.66636 7.03216 6.10286 6.64548 6.37099C6.23176 6.65786 5.64158 6.79529 4.95638 6.79529C4.47018 6.79529 4.11948 6.66983 3.88658 6.43349C3.65302 6.19648 3.44871 5.75753 3.44871 4.93872ZM12.5513 4.93872C12.5513 4.26316 12.2084 3.79616 11.7074 3.48996C11.1865 3.17162 10.5269 3.05374 10.0302 3.11109C9.18318 3.2089 8.90279 3.4728 8.78252 3.68905C8.63137 3.96084 8.61614 4.34213 8.64302 4.91278C8.67851 5.66636 8.96784 6.10286 9.35452 6.37099C9.76824 6.65786 10.3584 6.79529 11.0436 6.79529C11.5298 6.79529 11.8805 6.66983 12.1134 6.43349C12.347 6.19648 12.5513 5.75753 12.5513 4.93872Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M7.29101 9.57583C7.29101 9.2453 7.02442 8.97736 6.69556 8.97736C6.3667 8.97736 6.1001 9.2453 6.1001 9.57583V10.8725C6.1001 11.203 6.3667 11.471 6.69556 11.471C7.02442 11.471 7.29101 11.203 7.29101 10.8725V9.57583Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M13.6668 14.9102C13.7644 15.0078 13.9227 15.0078 14.0203 14.9102L14.908 14.0224C15.0056 13.9248 15.0056 13.7665 14.908 13.6688L13.2229 11.9836L14.908 10.2983C15.0057 10.2007 15.0057 10.0424 14.908 9.94474L14.0203 9.05695C13.9227 8.95931 13.7644 8.95931 13.6668 9.05695L11.9817 10.7422L10.2966 9.05693C10.199 8.95929 10.0407 8.95929 9.9431 9.05693L9.05539 9.94473C8.95777 10.0424 8.95777 10.2007 9.05539 10.2983L10.7405 11.9836L9.05541 13.6688C8.95779 13.7665 8.95779 13.9248 9.05541 14.0224L9.94312 14.9102C10.0407 15.0079 10.199 15.0079 10.2966 14.9102L11.9817 13.225L13.6668 14.9102Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _copilotError!!
        }

    private var _copilotInit: ImageVector? = null
    val CopilotInit: ImageVector
        get() {
            if (_copilotInit != null) return _copilotInit!!
            _copilotInit = create("CopilotInit", PathDef("M3.44871 4.93872C3.44871 4.26316 3.79162 3.79616 4.2926 3.48996C4.81345 3.17162 5.4731 3.05374 5.96975 3.11109C6.81682 3.2089 7.09721 3.4728 7.21748 3.68905C7.36863 3.96084 7.38386 4.34213 7.35698 4.91278C7.32149 5.66636 7.03216 6.10286 6.64548 6.37099C6.23176 6.65786 5.64158 6.79529 4.95638 6.79529C4.47018 6.79529 4.11948 6.66983 3.88657 6.43349C3.65302 6.19648 3.44871 5.75753 3.44871 4.93872ZM6.09436 2.02107C5.36842 1.93724 4.46348 2.10138 3.72539 2.5525C2.96744 3.01576 2.35705 3.80567 2.35705 4.93872C2.35705 5.63537 2.47987 6.21998 2.72903 6.68417C2.70043 6.72678 2.67414 6.77043 2.64995 6.81463C2.39071 6.9994 2.09192 7.27314 1.83438 7.54965C1.53258 7.87368 1.18744 8.30673 1.0551 8.70206L1.04265 8.73927L1.03513 8.7778C0.975842 9.08189 0.999402 9.48332 1.04817 9.81844C1.09192 10.1191 1.17095 10.4701 1.29544 10.735C1.44475 11.2894 1.88328 11.6844 2.27302 11.9619C2.62039 12.2092 3.03378 12.4329 3.39179 12.6267C3.4686 12.6682 3.54294 12.7085 3.61345 12.7473L3.62786 12.7552L3.64268 12.7623C4.05361 12.9594 4.69547 13.2491 5.30114 13.4909C5.60351 13.6116 5.90465 13.7235 6.16744 13.8062C6.39236 13.877 6.6532 13.948 6.87107 13.9562C7.1935 13.9948 7.54309 14 7.99999 14C8.45051 14 8.79671 13.9949 9.11542 13.9578C9.04 13.6509 9 13.3301 9 13C9 12.9213 9.00228 12.8431 9.00676 12.7656C8.76797 12.7955 8.47413 12.8031 7.99999 12.8031C7.30564 12.8031 6.99799 12.7869 6.68361 12.7078C6.35124 12.6243 5.99398 12.467 5.21016 12.1174C4.24428 11.6866 3.83266 11.4004 3.65229 11.2153C3.57295 11.1339 3.5474 11.0807 3.53501 11.0478C3.5201 11.0083 3.5122 10.9688 3.49839 10.8761V8.73318C3.49838 8.31081 3.52629 7.91973 3.60339 7.6303C3.60757 7.61463 3.6118 7.59961 3.61607 7.58523C4.02831 7.80894 4.49555 7.89249 4.95638 7.89249C5.75981 7.89249 6.59976 7.73566 7.2654 7.27411C7.55937 7.07027 7.80769 6.81497 8 6.50734C8.1923 6.81497 8.44063 7.07027 8.73459 7.27411C9.40024 7.73566 10.2402 7.89249 11.0436 7.89249C11.5045 7.89249 11.9717 7.80894 12.3839 7.58523C12.3882 7.59961 12.3924 7.61463 12.3966 7.6303C12.4737 7.91973 12.5016 8.31081 12.5016 8.73318V9.03072C12.6649 9.01043 12.8312 8.99997 13 8.99997C13.7226 8.99997 14.4004 9.19157 14.9855 9.52673C15.0073 9.26739 15.0077 8.99725 14.9649 8.7778L14.9574 8.73927L14.9449 8.70206C14.8126 8.30673 14.4674 7.87368 14.1656 7.54965C13.9081 7.27314 13.6093 6.9994 13.3501 6.81463C13.3259 6.77043 13.2996 6.72678 13.271 6.68417C13.5201 6.21998 13.643 5.63537 13.643 4.93872C13.643 3.80567 13.0326 3.01576 12.2746 2.5525C11.5365 2.10138 10.6316 1.93724 9.90564 2.02107C9.01314 2.12413 8.38516 2.41316 8 2.89841C7.61484 2.41316 6.98685 2.12413 6.09436 2.02107ZM9.89999 10.4719V9.57581C9.89999 9.24528 9.6334 8.97734 9.30454 8.97734C8.97568 8.97734 8.70909 9.24528 8.70909 9.57581V10.8725C8.70909 11.2024 8.97465 11.4699 9.30264 11.471C9.45293 11.1079 9.65514 10.7718 9.89999 10.4719ZM7.29091 9.57581C7.29091 9.24528 7.02432 8.97734 6.69546 8.97734C6.3666 8.97734 6.1 9.24528 6.1 9.57581V10.8725C6.1 11.203 6.3666 11.471 6.69546 11.471C7.02432 11.471 7.29091 11.203 7.29091 10.8725V9.57581ZM12.5513 4.93872C12.5513 4.26316 12.2084 3.79616 11.7074 3.48996C11.1866 3.17162 10.5269 3.05374 10.0303 3.11109C9.18317 3.2089 8.90278 3.4728 8.78252 3.68905C8.63137 3.96084 8.61614 4.34213 8.64302 4.91278C8.67851 5.66636 8.96784 6.10286 9.35452 6.37099C9.76824 6.65786 10.3584 6.79529 11.0436 6.79529C11.5298 6.79529 11.8805 6.66983 12.1134 6.43349C12.347 6.19648 12.5513 5.75753 12.5513 4.93872Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M13 16C14.6569 16 16 14.6569 16 13C16 11.3431 14.6569 10 13 10C11.3431 10 10 11.3431 10 13C10 14.6569 11.3431 16 13 16Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _copilotInit!!
        }

    private var _copy: ImageVector? = null
    val Copy: ImageVector
        get() {
            if (_copy != null) return _copy!!
            _copy = create("Copy", PathDef("M12.486 6.2H7.24795C6.66895 6.2 6.19995 6.669 6.19995 7.248V12.486C6.19995 13.064 6.66895 13.533 7.24795 13.533H12.486C13.064 13.533 13.533 13.064 13.533 12.486V7.248C13.533 6.669 13.064 6.2 12.486 6.2Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.91712 10.203C3.63951 10.2022 3.37351 10.0915 3.1773 9.89511C2.98109 9.69872 2.87064 9.43261 2.87012 9.155V3.917C2.87091 3.63956 2.98147 3.37371 3.17765 3.17753C3.37383 2.98135 3.63968 2.87079 3.91712 2.87H9.15512C9.43273 2.87053 9.69883 2.98097 9.89523 3.17718C10.0916 3.37339 10.2023 3.63939 10.2031 3.917", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _copy!!
        }

    private var _countdownTimer: ImageVector? = null
    val CountdownTimer: ImageVector
        get() {
            if (_countdownTimer != null) return _countdownTimer!!
            _countdownTimer = create("CountdownTimer", PathDef("M6.8 2h2.4M8 9.2l1.8-1.8M8 14a4.8 4.8 0 1 0 0-9.6A4.8 4.8 0 0 0 8 14Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _countdownTimer!!
        }

    private var _crosshair: ImageVector? = null
    val Crosshair: ImageVector
        get() {
            if (_crosshair != null) return _crosshair!!
            _crosshair = create("Crosshair", PathDef("M8 14C11.3137 14 14 11.3137 14 8C14 4.6863 11.3137 2 8 2C4.6863 2 2 4.6863 2 8C2 11.3137 4.6863 14 8 14Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14 8L11 8", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5 8H2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 5V2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 14V11", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _crosshair!!
        }

    private var _cursorIBeam: ImageVector? = null
    val CursorIBeam: ImageVector
        get() {
            if (_cursorIBeam != null) return _cursorIBeam!!
            _cursorIBeam = create("CursorIBeam", PathDef("M11 13H10.4C9.76346 13 9.15302 12.7893 8.70296 12.4142C8.25284 12.0391 8 11.5304 8 11V5C8 4.46957 8.25284 3.96086 8.70296 3.58579C9.15302 3.21071 9.76346 3 10.4 3H11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5 13H5.6C6.23654 13 6.84698 12.7893 7.29704 12.4142C7.74716 12.0391 8 11.5304 8 11V5C8 4.46957 7.74716 3.96086 7.29704 3.58579C6.84698 3.21071 6.23654 3 5.6 3H5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _cursorIBeam!!
        }

    private var _dash: ImageVector? = null
    val Dash: ImageVector
        get() {
            if (_dash != null) return _dash!!
            _dash = create("Dash", PathDef("M3.333 8h9.334", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _dash!!
        }

    private var _databaseZap: ImageVector? = null
    val DatabaseZap: ImageVector
        get() {
            if (_databaseZap != null) return _databaseZap!!
            _databaseZap = create("DatabaseZap", PathDef("M8.017 5.625c2.974 0 5.385-.804 5.385-1.795 0-.991-2.41-1.795-5.385-1.795-2.973 0-5.384.804-5.384 1.795 0 .991 2.41 1.795 5.384 1.795Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.633 3.83v8.376c-.003.288.201.571.596.827.394.256.967.477 1.671.643a13.12 13.12 0 0 0 2.373.314c.854.04 1.725.01 2.54-.085M13.402 3.83v1.795M13.402 8.018l-1.795 2.991H14l-1.795 2.992", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.633 8.018c0 .28.198.556.575.805.378.25.925.467 1.599.634.673.167 1.454.279 2.28.327.827.048 1.676.032 2.48-.049", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _databaseZap!!
        }

    private var _debug: ImageVector? = null
    val Debug: ImageVector
        get() {
            if (_debug != null) return _debug!!
            _debug = create("Debug", PathDef("M5.44727 2.19177L6.38617 3.11055", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.64722 3.11055L10.553 2.19177", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.66298 6.07369V5.10997C5.64886 4.80689 5.69884 4.50419 5.80993 4.22016C5.92101 3.93613 6.09088 3.67665 6.3093 3.45738C6.52771 3.23811 6.79013 3.0636 7.08074 2.94437C7.37134 2.82514 7.68409 2.76367 8.00011 2.76367C8.31614 2.76367 8.62889 2.82514 8.91949 2.94437C9.21008 3.0636 9.4725 3.23811 9.69092 3.45738C9.90933 3.67665 10.0792 3.93613 10.1903 4.22016C10.3014 4.50419 10.3514 4.80689 10.3373 5.10997V6.07369", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.00016 13.1366C6.09923 13.1366 4.54395 11.6686 4.54395 9.87441V8.24333C4.54395 7.66653 4.7867 7.11337 5.21882 6.70552C5.65092 6.29767 6.237 6.06854 6.8481 6.06854H9.15225C9.76335 6.06854 10.3494 6.29767 10.7815 6.70552C11.2136 7.11337 11.4564 7.66653 11.4564 8.24333V9.87441C11.4564 11.6686 9.9011 13.1366 8.00016 13.1366Z", isFill = true, isStroke = true, strokeWidth = 1.2f), PathDef("M8.00016 13.1366C6.09923 13.1366 4.54395 11.6686 4.54395 9.87441V8.24333C4.54395 7.66653 4.7867 7.11337 5.21882 6.70552C5.65092 6.29767 6.237 6.06854 6.8481 6.06854H9.15225C9.76335 6.06854 10.3494 6.29767 10.7815 6.70552C11.2136 7.11337 11.4564 7.66653 11.4564 8.24333V9.87441C11.4564 11.6686 9.9011 13.1366 8.00016 13.1366Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.54343 6.22415C3.43167 6.10894 2.51001 5.12967 2.51001 3.91998", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.54367 8.83472H2.2395", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.35449 13.4175C2.35449 12.2078 3.33376 11.1709 4.54345 11.1134", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.1673 3.91998C13.1673 5.12967 12.2455 6.10894 11.1511 6.22415", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.7605 8.83472H11.4563", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.4563 11.1134C12.666 11.1709 13.6453 12.2078 13.6453 13.4175", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debug!!
        }

    private var _debugBreakpoint: ImageVector? = null
    val DebugBreakpoint: ImageVector
        get() {
            if (_debugBreakpoint != null) return _debugBreakpoint!!
            _debugBreakpoint = create("DebugBreakpoint", PathDef("M8 14C11.3137 14 14 11.3137 14 8C14 4.68629 11.3137 2 8 2C4.68629 2 2 4.68629 2 8C2 11.3137 4.68629 14 8 14Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _debugBreakpoint!!
        }

    private var _debugContinue: ImageVector? = null
    val DebugContinue: ImageVector
        get() {
            if (_debugContinue != null) return _debugContinue!!
            _debugContinue = create("DebugContinue", PathDef("M4.167 3v10M7.167 3l6 5-6 5V3Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debugContinue!!
        }

    private var _debugContinueThread: ImageVector? = null
    val DebugContinueThread: ImageVector
        get() {
            if (_debugContinueThread != null) return _debugContinueThread!!
            _debugContinueThread = create("DebugContinueThread", PathDef("M5 3l6 5-6 5V3Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debugContinueThread!!
        }

    private var _debugDetach: ImageVector? = null
    val DebugDetach: ImageVector
        get() {
            if (_debugDetach != null) return _debugDetach!!
            _debugDetach = create("DebugDetach", PathDef("m13 3 2-2M1 15l2-2M4.202 13.53a1.598 1.598 0 0 0 2.266 0L8 11.997 4.003 8 2.47 9.532a1.6 1.6 0 0 0 0 2.265l1.732 1.733ZM5 9l1.5-1.5M7 11l1.5-1.5M8 4.003 11.997 8l1.533-1.532a1.599 1.599 0 0 0 0-2.266L11.798 2.47a1.598 1.598 0 0 0-2.266 0L8 4.003Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M0 0h16v16H0z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _debugDetach!!
        }

    private var _debugDisabledBreakpoint: ImageVector? = null
    val DebugDisabledBreakpoint: ImageVector
        get() {
            if (_debugDisabledBreakpoint != null) return _debugDisabledBreakpoint!!
            _debugDisabledBreakpoint = create("DebugDisabledBreakpoint", PathDef("M8 14C11.3137 14 14 11.3137 14 8C14 4.68629 11.3137 2 8 2C4.68629 2 2 4.68629 2 8C2 11.3137 4.68629 14 8 14Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debugDisabledBreakpoint!!
        }

    private var _debugDisabledLogBreakpoint: ImageVector? = null
    val DebugDisabledLogBreakpoint: ImageVector
        get() {
            if (_debugDisabledLogBreakpoint != null) return _debugDisabledLogBreakpoint!!
            _debugDisabledLogBreakpoint = create("DebugDisabledLogBreakpoint", PathDef("M11.8889 2H4.11111C3.49746 2 3 2.59695 3 3.33333V12.6667C3 13.403 3.49746 14 4.11111 14H11.8889C12.5025 14 13 13.403 13 12.6667V3.33333C13 2.59695 12.5025 2 11.8889 2Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 6H6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 10H6", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debugDisabledLogBreakpoint!!
        }

    private var _debugIgnoreBreakpoints: ImageVector? = null
    val DebugIgnoreBreakpoints: ImageVector
        get() {
            if (_debugIgnoreBreakpoints != null) return _debugIgnoreBreakpoints!!
            _debugIgnoreBreakpoints = create("DebugIgnoreBreakpoints", PathDef("M2 2L14 14M5.81044 2.41392C6.89676 1.98976 8.08314 1.89138 9.22449 2.13079C10.3658 2.37021 11.4127 2.93705 12.237 3.76199C13.0613 4.58693 13.6273 5.6342 13.8658 6.77573C14.1044 7.91727 14.0051 9.10357 13.5801 10.1896M12.2484 12.2484C11.1176 13.3558 9.59562 13.9724 8.01292 13.9642C6.43021 13.956 4.91467 13.3236 3.79552 12.2045C2.67636 11.0853 2.044 9.56979 2.03578 7.98708C2.02757 6.40438 2.64417 4.88236 3.75165 3.75165", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debugIgnoreBreakpoints!!
        }

    private var _debugLogBreakpoint: ImageVector? = null
    val DebugLogBreakpoint: ImageVector
        get() {
            if (_debugLogBreakpoint != null) return _debugLogBreakpoint!!
            _debugLogBreakpoint = create("DebugLogBreakpoint", PathDef("M11.8887 1.25C13.0386 1.25 13.7498 2.31634 13.75 3.33301V12.667C13.7499 13.6836 13.0386 14.75 11.8887 14.75H4.11133C2.96134 14.75 2.25014 13.6836 2.25 12.667V3.33301C2.25015 2.31635 2.96136 1.25 4.11133 1.25H11.8887ZM6 9.25C5.58579 9.25 5.25 9.58579 5.25 10C5.25 10.4142 5.58579 10.75 6 10.75H10C10.4142 10.75 10.75 10.4142 10.75 10C10.75 9.58579 10.4142 9.25 10 9.25H6ZM6 5.25C5.58579 5.25 5.25 5.58579 5.25 6C5.25 6.41421 5.58579 6.75 6 6.75H9C9.41421 6.75 9.75 6.41421 9.75 6C9.75 5.58579 9.41421 5.25 9 5.25H6Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _debugLogBreakpoint!!
        }

    private var _debugPause: ImageVector? = null
    val DebugPause: ImageVector
        get() {
            if (_debugPause != null) return _debugPause!!
            _debugPause = create("DebugPause", PathDef("M10.5 4H9.5C9.22386 4 9 4.22386 9 4.5V11.5001C9 11.7762 9.22386 12.0001 9.5 12.0001H10.5C10.7762 12.0001 11 11.7762 11 11.5001V4.5C11 4.22386 10.7762 4 10.5 4Z", isFill = true, isStroke = true, strokeWidth = 1.2f), PathDef("M6.50001 4H5.5C5.22386 4 5 4.22386 5 4.5V11.5001C5 11.7762 5.22386 12.0001 5.5 12.0001H6.50001C6.77616 12.0001 7.00002 11.7762 7.00002 11.5001V4.5C7.00002 4.22386 6.77616 4 6.50001 4Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _debugPause!!
        }

    private var _debugStepInto: ImageVector? = null
    val DebugStepInto: ImageVector
        get() {
            if (_debugStepInto != null) return _debugStepInto!!
            _debugStepInto = create("DebugStepInto", PathDef("M2 13H5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11 13H14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.5 8.5L8 12M8 12L4.5 8.5M8 12L8 3", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debugStepInto!!
        }

    private var _debugStepOut: ImageVector? = null
    val DebugStepOut: ImageVector
        get() {
            if (_debugStepOut != null) return _debugStepOut!!
            _debugStepOut = create("DebugStepOut", PathDef("M4.5 6.5L8 3M8 3L11.5 6.5M8 3V12", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2 13H5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11 13H14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debugStepOut!!
        }

    private var _debugStepOver: ImageVector? = null
    val DebugStepOver: ImageVector
        get() {
            if (_debugStepOver != null) return _debugStepOver!!
            _debugStepOver = create("DebugStepOver", PathDef("M2 11.333C2.00118 10.1752 2.33729 9.04258 2.96777 8.07159C3.59826 7.10059 4.49621 6.33274 5.55331 5.86064C6.61041 5.38853 7.78152 5.23235 8.9254 5.41091C10.0693 5.58947 11.1371 6.09516 12 6.86698L13 7.76698", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14 4.66699V8.66699H10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7 13H10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _debugStepOver!!
        }

    private var _delete: ImageVector? = null
    val Delete: ImageVector
        get() {
            if (_delete != null) return _delete!!
            _delete = create("Delete", PathDef("M6.79998 4C6.50183 4.00002 6.21436 4.10574 5.99358 4.29657L2.19677 7.57657C2.1348 7.63013 2.08528 7.69545 2.05139 7.76832C2.01751 7.8412 2 7.92001 2 7.99971C2 8.07941 2.01751 8.15823 2.05139 8.23111C2.08528 8.30398 2.1348 8.36929 2.19677 8.42286L5.99358 11.7034C6.21436 11.8943 6.50183 12 6.79998 12H12.8C13.1183 12 13.4235 11.8796 13.6485 11.6653C13.8736 11.4509 14 11.1602 14 10.8571V5.14286C14 4.83975 13.8736 4.54906 13.6485 4.33474C13.4235 4.12041 13.1183 4 12.8 4H6.79998Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.5 6.5L11.5 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.5 6.5L8.5 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _delete!!
        }

    private var _diff: ImageVector? = null
    val Diff: ImageVector
        get() {
            if (_diff != null) return _diff!!
            _diff = create("Diff", PathDef("M8 3v8M4 7h8M4 13h8", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _diff!!
        }

    private var _diffSplit: ImageVector? = null
    val DiffSplit: ImageVector
        get() {
            if (_diffSplit != null) return _diffSplit!!
            _diffSplit = create("DiffSplit", PathDef("M6.48233 12.2684V3.73157C6.48233 3.26009 6.10012 2.87788 5.62864 2.87788H3.73156C3.26008 2.87788 2.87787 3.26009 2.87787 3.73157V12.2684C2.87787 12.7399 3.26008 13.1221 3.73156 13.1221H5.62864C6.10012 13.1221 6.48233 12.7399 6.48233 12.2684Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6.48233 12.2684V3.73157C6.48233 3.26009 6.10012 2.87788 5.62864 2.87788H3.73156C3.26008 2.87788 2.87787 3.26009 2.87787 3.73157V12.2684C2.87787 12.7399 3.26008 13.1221 3.73156 13.1221H5.62864C6.10012 13.1221 6.48233 12.7399 6.48233 12.2684Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.1221 12.2684V3.73157C13.1221 3.26009 12.7399 2.87788 12.2684 2.87788H10.3713C9.89988 2.87788 9.51767 3.26009 9.51767 3.73157V12.2684C9.51767 12.7399 9.89988 13.1221 10.3713 13.1221H12.2684C12.7399 13.1221 13.1221 12.7399 13.1221 12.2684Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _diffSplit!!
        }

    private var _diffSplitAuto: ImageVector? = null
    val DiffSplitAuto: ImageVector
        get() {
            if (_diffSplitAuto != null) return _diffSplitAuto!!
            _diffSplitAuto = create("DiffSplitAuto", PathDef("M13.5896 12.1922V3.80783C13.5896 3.03608 12.9639 2.41045 12.1922 2.41045H10.329C9.55721 2.41045 8.93158 3.03608 8.93158 3.80783V12.1922C8.93158 12.9639 9.55721 13.5896 10.329 13.5896H12.1922C12.9639 13.5896 13.5896 12.9639 13.5896 12.1922Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M7.0684 12.1922V3.80783C7.0684 3.03608 6.44276 2.41045 5.67101 2.41045H3.80782C3.03607 2.41045 2.41043 3.03608 2.41043 3.80783V12.1922C2.41043 12.9639 3.03607 13.5896 3.80782 13.5896H5.67101C6.44276 13.5896 7.0684 12.9639 7.0684 12.1922Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M10.0497 12.1922C10.0497 12.3465 10.1746 12.4715 10.329 12.4715H12.0175L13.1192 13.1074C13.1474 13.1237 13.1769 13.137 13.2056 13.1511C12.9509 13.4202 12.5919 13.5896 12.1922 13.5896H10.329L10.1862 13.5823C9.48148 13.5107 8.93158 12.9157 8.93158 12.1922V10.6892L10.0497 11.3343V12.1922ZM10.0497 7.03111L8.93158 6.38609V3.80783C8.93158 3.0843 9.48148 2.48927 10.1862 2.41772L10.329 2.41045H12.1922C12.9639 2.41045 13.5896 3.03608 13.5896 3.80783V9.07534L12.4715 8.42941V3.80783C12.4715 3.65348 12.3465 3.52854 12.1922 3.52854H10.329C10.1746 3.52854 10.0497 3.65348 10.0497 3.80783V7.03111Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M7.06842 9.61391V12.1922C7.06842 12.9639 6.44279 13.5896 5.67103 13.5896H3.80784L3.66501 13.5823C2.96036 13.5107 2.41046 12.9157 2.41046 12.1922V6.92376L3.52855 7.56969V12.1922C3.52855 12.3465 3.65349 12.4715 3.80784 12.4715H5.67103C5.82538 12.4715 5.95032 12.3465 5.95032 12.1922V8.96798L7.06842 9.61391ZM5.67103 2.41045C6.44279 2.41045 7.06842 3.03608 7.06842 3.80783V5.30984L5.95032 4.66482V3.80783C5.95032 3.65348 5.82538 3.52854 5.67103 3.52854H3.98252L2.8808 2.89262C2.85202 2.87601 2.82197 2.86239 2.79256 2.84804C3.01658 2.61118 3.32242 2.45251 3.66501 2.41772L3.80784 2.41045H5.67103Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M1.64436 3.79271L1.17857 4.59949C1.04994 4.82228 1.12627 5.10716 1.34906 5.23578L13.7194 12.3778C13.9422 12.5064 14.227 12.4301 14.3557 12.2073L14.8215 11.4005C14.9501 11.1777 14.8738 10.8928 14.651 10.7642L2.28065 3.62222C2.05787 3.49359 1.77299 3.56992 1.64436 3.79271Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _diffSplitAuto!!
        }

    private var _diffUnified: ImageVector? = null
    val DiffUnified: ImageVector
        get() {
            if (_diffUnified != null) return _diffUnified!!
            _diffUnified = create("DiffUnified", PathDef("M12.1035 9.43259H3.89653C3.44327 9.43259 3.07584 9.80002 3.07584 10.2533V12.077C3.07584 12.5303 3.44327 12.8977 3.89653 12.8977H12.1035C12.5567 12.8977 12.9242 12.5303 12.9242 12.077V10.2533C12.9242 9.80002 12.5567 9.43259 12.1035 9.43259Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M12.1035 9.43259H3.89653C3.44327 9.43259 3.07584 9.80002 3.07584 10.2533V12.077C3.07584 12.5303 3.44327 12.8977 3.89653 12.8977H12.1035C12.5567 12.8977 12.9242 12.5303 12.9242 12.077V10.2533C12.9242 9.80002 12.5567 9.43259 12.1035 9.43259Z", isFill = false, isStroke = true, strokeWidth = 1.1f), PathDef("M12.1035 2.50227H3.89653C3.1411 2.50227 2.5287 3.11467 2.5287 3.8701V5.69386C2.5287 6.44929 3.1411 7.06169 3.89653 7.06169H12.1035C12.8589 7.06169 13.4713 6.44929 13.4713 5.69386V3.8701C13.4713 3.11467 12.8589 2.50227 12.1035 2.50227Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _diffUnified!!
        }

    private var _disconnected: ImageVector? = null
    val Disconnected: ImageVector
        get() {
            if (_disconnected != null) return _disconnected!!
            _disconnected = create("Disconnected", PathDef("m2 2 12 12M4.269 4.27a4.2 4.2 0 0 0 1.93 7.93h5.1c.267 0 .53-.039.785-.116M13.72 10.7a2.699 2.699 0 0 0-2.42-3.9h-1.074A4.204 4.204 0 0 0 6.8 3.842", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _disconnected!!
        }

    private var _download: ImageVector? = null
    val Download: ImageVector
        get() {
            if (_download != null) return _download!!
            _download = create("Download", PathDef("M13 9.667v2.222A1.111 1.111 0 0 1 11.889 13H4.11A1.111 1.111 0 0 1 3 11.889V9.667M5.222 6.889 8 9.667l2.778-2.778M8 9.667V3", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _download!!
        }

    private var _editorAtom: ImageVector? = null
    val EditorAtom: ImageVector
        get() {
            if (_editorAtom != null) return _editorAtom!!
            _editorAtom = create("EditorAtom", PathDef("M5.68522 2.1437C5.88552 2.13508 6.08368 2.16739 6.27106 2.23631C6.68137 2.37739 7.06475 2.58524 7.40722 2.85016L7.47506 2.90401L7.47937 2.90724L7.48368 2.91155C7.55448 2.97424 7.60599 3.05578 7.6322 3.14664C7.65841 3.23751 7.65823 3.33395 7.6317 3.42472C7.60517 3.51549 7.55337 3.59685 7.48235 3.65929C7.41133 3.72173 7.32402 3.7627 7.2306 3.77739C7.10591 3.79735 6.97828 3.76967 6.87306 3.69985L6.86229 3.69339L6.8526 3.68585C6.58587 3.46715 6.28351 3.29594 5.95875 3.1797H5.95445L5.95014 3.17647C5.82002 3.12443 5.67507 3.12328 5.54414 3.17324C5.42137 3.23893 5.30722 3.39293 5.23937 3.68585C5.17475 3.9637 5.16183 4.33308 5.20491 4.77785L5.21352 4.86831C5.23075 5.02662 5.2566 5.19355 5.28891 5.36693C5.71106 5.30985 6.13645 5.27216 6.56183 5.25385C7.16065 4.49455 7.84832 3.80977 8.61014 3.21416H8.61229L8.61337 3.21201C9.12814 2.82431 9.6364 2.54647 10.1081 2.41508C10.5798 2.28585 11.0364 2.29878 11.4155 2.52924L11.422 2.53247L11.4295 2.53785C11.6089 2.66378 11.7606 2.82503 11.8754 3.01169C11.9903 3.19836 12.0657 3.40652 12.0972 3.62339C12.1769 4.12524 12.1586 4.6357 12.0434 5.13108C12.0154 5.25866 11.9385 5.37014 11.8291 5.44146C11.7197 5.51279 11.5866 5.53823 11.4586 5.51232C11.3305 5.48673 11.2175 5.41198 11.1438 5.30408C11.0701 5.19619 11.0416 5.06373 11.0644 4.93508L11.0655 4.92862L11.0677 4.92216C11.156 4.55385 11.1732 4.17262 11.1204 3.79678V3.79139C11.1107 3.70973 11.0849 3.6308 11.0447 3.5591C11.0044 3.4874 10.9504 3.42435 10.8857 3.37355C10.7715 3.30893 10.5798 3.29278 10.2826 3.39185C9.9854 3.49308 9.6235 3.6977 9.22291 3.99924C8.73829 4.37724 8.29029 4.79616 7.87999 5.2517L7.9726 5.25601H8.14706C9.8292 5.34108 11.3649 5.68031 12.4828 6.15416C13.0794 6.40724 13.5748 6.71201 13.9204 7.05878C14.2651 7.40555 14.474 7.81155 14.4611 8.25632V8.28862L14.4589 8.30585C14.4018 8.70216 14.2004 9.06293 13.8935 9.32139C13.5533 9.61541 13.163 9.84594 12.7412 10.002L12.7391 10.0031L12.7358 10.0042C12.6136 10.0508 12.478 10.0478 12.3579 9.99594C12.2378 9.94404 12.1427 9.84729 12.0929 9.72632C12.0681 9.66555 12.0557 9.60047 12.0562 9.53485C12.0568 9.46923 12.0704 9.40438 12.0963 9.34406C12.1221 9.28375 12.1597 9.22917 12.2068 9.18349C12.2539 9.13782 12.3097 9.10196 12.3708 9.07801L12.3729 9.07693L12.3761 9.07585C12.6872 8.96224 12.9754 8.79373 13.2269 8.57832L13.2323 8.57401C13.3483 8.48055 13.4289 8.3502 13.4606 8.20462C13.4584 8.06785 13.3744 7.89232 13.1451 7.6877C12.9103 7.47878 12.5528 7.2677 12.0897 7.07062C11.0881 6.64416 9.672 6.33508 8.08245 6.25216L7.92306 6.24462C7.63229 6.23278 7.34583 6.22847 7.06583 6.23278C6.86875 6.49447 6.67491 6.76908 6.48645 7.05447C6.32922 7.29355 6.18275 7.53262 6.04706 7.77278C6.15045 8.01508 6.26783 8.26278 6.39168 8.51262L6.45414 8.63539L6.51875 8.76462L6.58768 8.89601C7.29845 10.2432 8.13845 11.3535 8.9106 12.0632L8.97952 12.1257C9.32414 12.4315 9.6408 12.6459 9.9111 12.7643C10.204 12.8925 10.4011 12.8892 10.526 12.8268C10.6541 12.7622 10.7672 12.6146 10.834 12.3292C10.8986 12.0439 10.9094 11.6594 10.8598 11.1877C10.7554 10.1635 10.358 8.85293 9.686 7.4917C9.6447 7.41731 9.6231 7.33357 9.6234 7.24847C9.6237 7.16338 9.6458 7.07979 9.6876 7.00567C9.7294 6.93156 9.7895 6.86941 9.8622 6.82516C9.9349 6.78091 10.0177 6.75604 10.1028 6.75293C10.2039 6.74858 10.3041 6.77481 10.3902 6.82822C10.4762 6.88162 10.5442 6.95971 10.5852 7.05232C11.3003 8.50939 11.7375 9.9417 11.856 11.0843L11.8668 11.1974C11.9152 11.7649 11.8829 12.2775 11.7558 12.6997C11.6191 13.1531 11.3681 13.5192 10.9761 13.7163C10.582 13.9155 10.1221 13.8919 9.6601 13.7228C9.19706 13.5526 8.71245 13.2295 8.23429 12.7891C7.34045 11.9717 6.40352 10.7139 5.62599 9.20724L5.55599 9.0737C5.52266 9.01105 5.49035 8.94786 5.45906 8.88416C5.18051 9.47718 4.9598 10.0957 4.79999 10.7311C4.68691 11.2179 4.64922 11.6292 4.6826 11.9405C4.71491 12.2474 4.8086 12.4154 4.91629 12.494C5.07557 12.5715 5.25898 12.5831 5.42675 12.5263L5.43106 12.5242L5.43537 12.5231C5.82952 12.4046 6.19998 12.2162 6.52629 11.9674L6.52952 11.9652L6.53275 11.9631C6.6134 11.9068 6.7088 11.8755 6.80709 11.873C6.90538 11.8705 7.00224 11.897 7.08564 11.9491C7.16904 12.0011 7.2353 12.0766 7.27619 12.166C7.31709 12.2554 7.33082 12.3549 7.31568 12.452C7.29378 12.5801 7.22266 12.6945 7.11752 12.7708C6.69348 13.0899 6.21514 13.3296 5.70568 13.4783C5.4887 13.5469 5.25987 13.5699 5.03358 13.5458C4.80728 13.5217 4.58842 13.4511 4.39075 13.3383L4.38322 13.3351L4.37675 13.3308C4.00306 13.0831 3.79737 12.6739 3.71875 12.1892C3.64014 11.7079 3.68429 11.1317 3.82968 10.5049V10.5028L3.83075 10.4995C4.07952 9.5217 4.45429 8.57939 4.94429 7.69632C4.78937 7.30626 4.65281 6.90916 4.53506 6.50632C4.34122 6.55047 4.14952 6.60324 3.95998 6.66139C3.4926 6.80893 3.1286 6.98016 2.88306 7.16108C2.63645 7.34416 2.54598 7.50785 2.53845 7.63924V7.64462C2.53662 7.78511 2.58688 7.9213 2.67952 8.02693L2.69891 8.04847L2.70106 8.04955C2.92829 8.2897 3.1986 8.48678 3.49798 8.62893L3.50229 8.63108L3.50552 8.63216C3.62267 8.69325 3.71092 8.79816 3.75106 8.92403C3.7912 9.0499 3.77998 9.18653 3.71983 9.30416C3.65935 9.42078 3.5553 9.50882 3.43027 9.54915C3.30525 9.58948 3.16936 9.57884 3.05214 9.51955C2.63969 9.32129 2.26817 9.04731 1.95691 8.71185C1.81823 8.5645 1.70994 8.39127 1.63825 8.20205C1.56655 8.01283 1.53285 7.81134 1.53906 7.60908V7.60478C1.5606 7.16108 1.80398 6.78093 2.17445 6.47185C2.54383 6.16493 3.05429 5.91508 3.65845 5.72447H3.65952C3.87168 5.6577 4.08706 5.60062 4.30352 5.55108C4.26766 5.3627 4.23892 5.17302 4.21737 4.98247C4.14845 4.35678 4.17214 3.79031 4.30783 3.32939C4.44352 2.86631 4.69768 2.49047 5.09614 2.28908L5.10045 2.28693L5.1026 2.28585C5.28568 2.1997 5.48383 2.15231 5.68522 2.1437ZM8.15137 7.02108C8.32492 7.03989 8.49029 7.10471 8.6304 7.20884C8.7705 7.31297 8.88025 7.45263 8.94829 7.61339C9.02212 7.79086 9.04127 7.98633 9.00328 8.17474C8.96529 8.36316 8.87189 8.53594 8.73506 8.67093C8.59837 8.80552 8.4251 8.89694 8.23684 8.93378C8.04857 8.97063 7.85363 8.95129 7.67628 8.87817C7.49892 8.80505 7.347 8.68138 7.23941 8.52255C7.13182 8.36372 7.07333 8.17676 7.07122 7.98493C7.0703 7.79262 7.12693 7.60444 7.23382 7.44457C7.34072 7.28471 7.49299 7.16048 7.67106 7.08785C7.78956 7.03888 7.91653 7.01363 8.04475 7.01355H8.14383L8.15137 7.02108ZM5.79722 6.30493C5.70951 6.31433 5.62191 6.32474 5.53445 6.33616C5.55814 6.41908 5.58399 6.50201 5.61091 6.58708L5.66045 6.50955L5.79722 6.30493Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _editorAtom!!
        }

    private var _editorCursor: ImageVector? = null
    val EditorCursor: ImageVector
        get() {
            if (_editorCursor != null) return _editorCursor!!
            _editorCursor = create("EditorCursor", PathDef("M13.2806 4.69807L8.26042 1.79971C8.09921 1.70662 7.9003 1.70662 7.73909 1.79971L2.71918 4.69807C2.58367 4.77631 2.5 4.92101 2.5 5.07774V10.9223C2.5 11.0788 2.58367 11.2237 2.71918 11.302L7.73934 14.2003C7.90054 14.2934 8.09946 14.2934 8.26066 14.2003L13.2808 11.302C13.4163 11.2237 13.5 11.079 13.5 10.9223V5.07774C13.5 4.92125 13.4161 4.77631 13.2806 4.69807ZM12.9653 5.31201L8.11901 13.7059C8.08626 13.7625 7.99977 13.7394 7.99977 13.6738V8.1776C7.99977 8.06777 7.94107 7.96619 7.84586 7.91104L3.08613 5.16306C3.02957 5.1303 3.05266 5.04379 3.11818 5.04379H12.8106C12.9483 5.04379 13.0341 5.19275 12.9653 5.31201Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _editorCursor!!
        }

    private var _editorEmacs: ImageVector? = null
    val EditorEmacs: ImageVector
        get() {
            if (_editorEmacs != null) return _editorEmacs!!
            _editorEmacs = create("EditorEmacs", PathDef("M14 2H2V14H14V2Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M7.97552 2.45453C11.0167 2.45457 13.4814 4.94501 13.4814 8.01623C13.4814 11.0875 11.0167 13.578 7.97552 13.5781C4.93427 13.5781 2.46948 11.0875 2.46948 8.01623C2.4695 4.94498 4.93429 2.45453 7.97552 2.45453ZM10.3795 4.70348C10.2605 4.16887 9.6328 3.85468 9.03627 3.96342C8.47622 4.06552 7.12871 4.45681 7.12057 4.45916C8.79414 4.44469 9.07429 4.4726 9.19939 4.64751C9.27324 4.7508 9.16576 4.89248 8.71944 4.96538C8.23515 5.04447 7.23014 5.13958 7.22343 5.14022C6.25441 5.19776 5.57177 5.20168 5.36705 5.63512C5.23334 5.91827 5.50968 6.16857 5.63082 6.32527C6.14271 6.89455 6.88215 7.20158 7.35809 7.42767C7.53716 7.51274 8.06257 7.67345 8.06257 7.67345C6.51855 7.58853 5.40474 8.06267 4.7514 8.60855C4.01246 9.29204 4.33937 10.1067 5.85327 10.6084C6.74742 10.9047 7.19094 11.0439 8.52473 10.9238C9.31031 10.8815 9.4342 10.9068 9.44203 10.9712C9.45275 11.062 8.56932 11.2874 8.32812 11.357C7.71455 11.534 6.10645 11.8913 6.09758 11.8932C6.10115 11.8935 6.56249 11.9257 7.15531 11.8735C7.39632 11.8522 8.31142 11.7624 8.99557 11.6123C8.99557 11.6123 9.8297 11.4338 10.2759 11.2693C10.7429 11.0973 10.997 10.9512 11.1113 10.7443C11.1063 10.7019 11.1465 10.5516 10.9313 10.4613C10.3807 10.2304 9.7423 10.2721 8.4789 10.2453C7.07789 10.1972 6.61184 9.9626 6.36356 9.77373C6.12548 9.58212 6.24518 9.05204 7.26528 8.5851C7.77917 8.33646 9.7935 7.87759 9.7935 7.87759C9.11511 7.54227 7.85014 6.95284 7.59005 6.82552C7.36199 6.71388 6.99701 6.54572 6.9179 6.34233C6.82824 6.14709 7.1297 5.97888 7.29813 5.9307C7.84057 5.77424 8.60635 5.67701 9.3033 5.66609C9.6536 5.66061 9.7105 5.63806 9.7105 5.63806C10.1939 5.55787 10.5121 5.22722 10.3795 4.70348Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _editorEmacs!!
        }

    private var _editorJetBrains: ImageVector? = null
    val EditorJetBrains: ImageVector
        get() {
            if (_editorJetBrains != null) return _editorJetBrains!!
            _editorJetBrains = create("EditorJetBrains", PathDef("M3.1725 13.9985C2.86161 13.9982 2.56354 13.8746 2.34371 13.6548C2.12388 13.435 2.00026 13.1369 2 12.826V7.494C2 6.8325 2.2675 6.185 2.7365 5.7165L5.719 2.736C5.95192 2.50247 6.22867 2.31724 6.53335 2.19094C6.83804 2.06464 7.16467 1.99975 7.4945 2H12.8275C13.1384 2.00027 13.4365 2.12388 13.6563 2.34371C13.8761 2.56354 13.9997 2.86162 14 3.1725V8.5045C13.9983 9.17074 13.7336 9.80936 13.2635 10.2815L10.281 13.264C10.0477 13.4976 9.7706 13.6829 9.46561 13.8092C9.16059 13.9355 8.83364 14.0003 8.5035 14V13.9985H3.1725ZM7.657 10.5715H4.743V11.257H7.657V10.5715ZM3.9815 5.257H10.743V12.0165L12.8715 9.888C13.2373 9.52036 13.4433 9.02316 13.4445 8.5045V3.1725C13.4445 2.8335 13.1685 2.5555 12.8275 2.5555H7.4945C7.23753 2.55499 6.983 2.6053 6.74556 2.70356C6.50813 2.80181 6.29246 2.94606 6.111 3.128L3.9815 5.257ZM3.8855 5.353L3.128 6.11C2.76258 6.47809 2.5569 6.97533 2.5555 7.494V12.826C2.5555 13.165 2.8315 13.443 3.1725 13.443H8.5055C8.76249 13.4434 9.01701 13.3929 9.25445 13.2946C9.49188 13.1963 9.7075 13.052 9.889 12.87L10.645 12.1145H3.8855V5.353Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _editorJetBrains!!
        }

    private var _editorSublime: ImageVector? = null
    val EditorSublime: ImageVector
        get() {
            if (_editorSublime != null) return _editorSublime!!
            _editorSublime = create("EditorSublime", PathDef("M12.5945 8.03524C12.5945 7.89532 12.4911 7.81464 12.3642 7.85473L3.63453 10.6229C3.50739 10.6632 3.40424 10.8095 3.40424 10.9492V13.7784C3.40424 13.9183 3.50739 13.9992 3.63453 13.9589L12.3642 11.191C12.4911 11.1506 12.5945 11.0043 12.5945 10.8644V8.03524Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M3.40424 7.9451C3.40424 8.08501 3.50739 8.23131 3.63453 8.27165L12.3655 11.04C12.4926 11.0804 12.5958 10.9994 12.5958 10.8598V8.03037C12.5958 7.89071 12.4926 7.74442 12.3655 7.70407L3.63453 4.93565C3.50739 4.89531 3.40424 4.97599 3.40424 5.1159V7.9451Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M12.5945 2.22161C12.5945 2.08169 12.4911 2.00076 12.3642 2.0411L3.63453 4.80901C3.50739 4.84935 3.40424 4.99565 3.40424 5.13557V7.96476C3.40424 8.10467 3.50739 8.18535 3.63453 8.14527L12.3642 5.3771C12.4911 5.33676 12.5945 5.19046 12.5945 5.0508V2.22161Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _editorSublime!!
        }

    private var _editorVsCode: ImageVector? = null
    val EditorVsCode: ImageVector
        get() {
            if (_editorVsCode != null) return _editorVsCode!!
            _editorVsCode = create("EditorVsCode", PathDef("M10.5094 13.9181C10.6984 13.9917 10.9139 13.987 11.1047 13.8952L13.5753 12.7064C13.8349 12.5814 14 12.3187 14 12.0305V3.9696C14 3.68136 13.8349 3.41862 13.5753 3.2937L11.1047 2.10485C10.8543 1.98438 10.5614 2.01389 10.3416 2.17363C10.3102 2.19645 10.2803 2.22193 10.2523 2.25001L5.52261 6.56498L3.46246 5.00115C3.27068 4.85558 3.00244 4.86751 2.82432 5.02953L2.16356 5.63059C1.94569 5.82877 1.94544 6.17152 2.16302 6.37004L3.94965 8.00001L2.16302 9.62998C1.94544 9.82849 1.94569 10.1713 2.16356 10.3694L2.82432 10.9705C3.00244 11.1325 3.27068 11.1444 3.46246 10.9989L5.52261 9.43504L10.2523 13.75C10.3271 13.8249 10.415 13.8812 10.5094 13.9181ZM11.0018 5.27587L7.41309 8.00001L11.0018 10.7241V5.27587Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _editorVsCode!!
        }

    private var _ellipsis: ImageVector? = null
    val Ellipsis: ImageVector
        get() {
            if (_ellipsis != null) return _ellipsis!!
            _ellipsis = create("Ellipsis", PathDef("M 2.000 8.000 a 1.000 1.000 0 1 0 2.000 0 a 1.000 1.000 0 1 0 -2.000 0", isFill = true, isStroke = true, strokeWidth = 0.5f), PathDef("M 7.000 8.000 a 1.000 1.000 0 1 0 2.000 0 a 1.000 1.000 0 1 0 -2.000 0", isFill = true, isStroke = true, strokeWidth = 0.5f), PathDef("M 12.000 8.000 a 1.000 1.000 0 1 0 2.000 0 a 1.000 1.000 0 1 0 -2.000 0", isFill = true, isStroke = true, strokeWidth = 0.5f))
            return _ellipsis!!
        }

    private var _ellipsisVertical: ImageVector? = null
    val EllipsisVertical: ImageVector
        get() {
            if (_ellipsisVertical != null) return _ellipsisVertical!!
            _ellipsisVertical = create("EllipsisVertical", PathDef("M 7.000 3.000 a 1.000 1.000 0 1 0 2.000 0 a 1.000 1.000 0 1 0 -2.000 0", isFill = true, isStroke = true, strokeWidth = 0.5f), PathDef("M 7.000 8.000 a 1.000 1.000 0 1 0 2.000 0 a 1.000 1.000 0 1 0 -2.000 0", isFill = true, isStroke = true, strokeWidth = 0.5f), PathDef("M 7.000 13.000 a 1.000 1.000 0 1 0 2.000 0 a 1.000 1.000 0 1 0 -2.000 0", isFill = true, isStroke = true, strokeWidth = 0.5f))
            return _ellipsisVertical!!
        }

    private var _envelope: ImageVector? = null
    val Envelope: ImageVector
        get() {
            if (_envelope != null) return _envelope!!
            _envelope = create("Envelope", PathDef("M13 4C13.5523 4 14 4.44772 14 5V11C14 11.5523 13.5523 12 13 12H3C2.44772 12 2 11.5523 2 11V5C2 4.44772 2.44772 4 3 4H13Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.5 5L7.9999 8.5L2.5 5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _envelope!!
        }

    private var _eraser: ImageVector? = null
    val Eraser: ImageVector
        get() {
            if (_eraser != null) return _eraser!!
            _eraser = create("Eraser", PathDef("m5.015 12.983-2.567-2.382c-.597-.554-.597-1.385 0-1.884L8.179 3.4c.597-.554 1.493-.554 2.03 0L13.552 6.5c.597.554.597 1.385 0 1.884l-4.955 4.598M14 12.983H5M4.5 7.483l5 5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _eraser!!
        }

    private var _escape: ImageVector? = null
    val Escape: ImageVector
        get() {
            if (_escape != null) return _escape!!
            _escape = create("Escape", PathDef("M3 6V3h3M3 3l5 5M8 3a5 5 0 1 1-5 5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _escape!!
        }

    private var _exit: ImageVector? = null
    val Exit: ImageVector
        get() {
            if (_exit != null) return _exit!!
            _exit = create("Exit", PathDef("M10.437 11.0461L13.4831 8L10.437 4.95392", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13 8L8 8", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.6553 13.4659H4.21843C3.89528 13.4659 3.58537 13.3375 3.35687 13.109C3.12837 12.8805 3 12.5706 3 12.2475V3.71843C3 3.39528 3.12837 3.08537 3.35687 2.85687C3.58537 2.62837 3.89528 2.5 4.21843 2.5H6.6553", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _exit!!
        }

    private var _expandDown: ImageVector? = null
    val ExpandDown: ImageVector
        get() {
            if (_expandDown != null) return _expandDown!!
            _expandDown = create("ExpandDown", PathDef("M11.1998 9.60002L7.9998 12.8M7.9998 12.8L4.7998 9.60002M7.9998 12.8V6.40002", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.33325 3.73334H10.6666", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _expandDown!!
        }

    private var _expandUp: ImageVector? = null
    val ExpandUp: ImageVector
        get() {
            if (_expandUp != null) return _expandUp!!
            _expandUp = create("ExpandUp", PathDef("M4.80005 6.93334L8.00005 3.73334M8.00005 3.73334L11.2 6.93334M8.00005 3.73334V10.1333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.3335 12.8H10.6668", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _expandUp!!
        }

    private var _expandVertical: ImageVector? = null
    val ExpandVertical: ImageVector
        get() {
            if (_expandVertical != null) return _expandVertical!!
            _expandVertical = create("ExpandVertical", PathDef("M8 14.667v-4M8 5.333v-4M2.667 8H1.333M6.667 8H5.333M10.667 8H9.333M14.667 8h-1.334M10 12.667l-2 2-2-2M10 3.333l-2-2-2 2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M0 0h16v16H0z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _expandVertical!!
        }

    private var _eye: ImageVector? = null
    val Eye: ImageVector
        get() {
            if (_eye != null) return _eye!!
            _eye = create("Eye", PathDef("M2.0375 8.2088C1.9875 8.07409 1.9875 7.92592 2.0375 7.79122C2.5245 6.61039 3.35114 5.60076 4.41264 4.89031C5.47414 4.17986 6.72268 3.8006 7.99999 3.8006C9.2773 3.8006 10.5258 4.17986 11.5873 4.89031C12.6488 5.60076 13.4755 6.61039 13.9625 7.79122C14.0125 7.92592 14.0125 8.07409 13.9625 8.2088C13.4755 9.38962 12.6488 10.3993 11.5873 11.1097C10.5258 11.8202 9.2773 12.1994 7.99999 12.1994C6.72268 12.1994 5.47414 11.8202 4.41264 11.1097C3.35114 10.3993 2.5245 9.38962 2.0375 8.2088Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.0001 9.79988C8.99416 9.79988 9.80001 8.99404 9.80001 7.99998C9.80001 7.00592 8.99416 6.20007 8.0001 6.20007C7.00604 6.20007 6.2002 7.00592 6.2002 7.99998C6.2002 8.99404 7.00604 9.79988 8.0001 9.79988Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _eye!!
        }

    private var _eyeOff: ImageVector? = null
    val EyeOff: ImageVector
        get() {
            if (_eyeOff != null) return _eyeOff!!
            _eyeOff = create("EyeOff", PathDef("M9.5248 9.52487C9.32192 9.74576 9.07604 9.92297 8.80229 10.0457C8.52854 10.1685 8.23269 10.2341 7.93287 10.2384C7.63305 10.2427 7.33543 10.1857 7.05826 10.0709C6.78109 9.95608 6.53019 9.78592 6.32115 9.57088C6.11211 9.35584 5.94929 9.10052 5.84242 8.82002C5.73556 8.53953 5.68693 8.23974 5.69959 7.93908C5.71225 7.63842 5.78588 7.34389 5.9159 7.07326C6.04593 6.80263 6.22978 6.56148 6.45605 6.36487", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.58521 3.93988C7.04677 3.8469 7.51825 3.80005 7.99115 3.80055C9.27177 3.80055 10.5219 4.18055 11.584 4.89055C12.6461 5.60055 13.472 6.61055 13.956 7.79055C13.9839 7.85737 13.9989 7.92893 14 8.00131C14.0011 8.07369 13.9882 8.14566 13.9622 8.21327C13.706 8.81927 13.3778 9.39377 12.9841 9.92417", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.48047 5.37988C2.85585 5.97555 2.36015 6.69431 2.02605 7.49388C1.90005 7.80488 1.90005 8.15188 2.02605 8.46288C2.52405 9.64988 3.35605 10.6599 4.41705 11.3699C5.47805 12.0799 6.72205 12.4559 7.99305 12.4559C9.01905 12.4559 10.0291 12.2019 10.9311 11.7179", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2 2L14 14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _eyeOff!!
        }

    private var _fastForward: ImageVector? = null
    val FastForward: ImageVector
        get() {
            if (_fastForward != null) return _fastForward!!
            _fastForward = create("FastForward", PathDef("M8 4.4366C8.00005 4.20171 8.06974 3.97211 8.20026 3.77683C8.33078 3.58154 8.51627 3.42934 8.73328 3.33946C8.95029 3.24958 9.18908 3.22605 9.41946 3.27186C9.64983 3.31767 9.86146 3.43076 10.0276 3.59683L13.591 7.16022C13.8136 7.38297 13.9387 7.68503 13.9387 8C13.9387 8.31496 13.8136 8.61702 13.591 8.83977L10.0276 12.4032C9.86146 12.5692 9.64983 12.6823 9.41946 12.7281C9.18908 12.7739 8.95029 12.7504 8.73328 12.6605C8.51627 12.5707 8.33078 12.4185 8.20026 12.2232C8.06974 12.0279 8.00005 11.7983 8 11.5634V4.4366Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.061 4.4366C2.06105 4.20171 2.13075 3.97211 2.26127 3.77683C2.39179 3.58154 2.57728 3.42934 2.79429 3.33946C3.0113 3.24958 3.25008 3.22605 3.48046 3.27186C3.71084 3.31767 3.92246 3.43076 4.08858 3.59683L7.65197 7.16022C7.87465 7.38297 7.99974 7.68503 7.99974 8C7.99974 8.31496 7.87465 8.61702 7.65197 8.83977L4.08858 12.4032C3.92246 12.5692 3.71084 12.6823 3.48046 12.7281C3.25008 12.7739 3.0113 12.7504 2.79429 12.6605C2.57728 12.5707 2.39179 12.4185 2.26127 12.2232C2.13075 12.0279 2.06105 11.7983 2.061 11.5634V4.4366Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fastForward!!
        }

    private var _fastForwardOff: ImageVector? = null
    val FastForwardOff: ImageVector
        get() {
            if (_fastForwardOff != null) return _fastForwardOff!!
            _fastForwardOff = create("FastForwardOff", PathDef("M8 10.3715V11.5634C8.00005 11.7983 8.06974 12.0279 8.20026 12.2232C8.33078 12.4185 8.51627 12.5707 8.73328 12.6605C8.95029 12.7504 9.18908 12.7739 9.41946 12.7281C9.64983 12.6823 9.86146 12.5692 10.0276 12.4032L10.2748 12.1559M8 5.38478V4.4366C8.00005 4.20171 8.06974 3.97211 8.20026 3.77683C8.33078 3.58154 8.51627 3.42934 8.73328 3.33946C8.95029 3.24958 9.18908 3.22605 9.41946 3.27186C9.64983 3.31767 9.86146 3.43076 10.0276 3.59683L13.591 7.16022C13.8136 7.38297 13.9387 7.68503 13.9387 8C13.9387 8.31496 13.8136 8.61702 13.591 8.83977L12.7618 9.66893", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.061 6.99803V11.5634C2.06105 11.7983 2.13075 12.0279 2.26127 12.2232C2.39179 12.4185 2.57728 12.5707 2.79429 12.6605C3.0113 12.7504 3.25008 12.7739 3.48046 12.7281C3.71084 12.6823 3.92246 12.5692 4.08858 12.4032L6.46394 10.0278", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M1.5015 2.54385L14.4985 13.4561", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fastForwardOff!!
        }

    private var _file: ImageVector? = null
    val File: ImageVector
        get() {
            if (_file != null) return _file!!
            _file = create("File", PathDef("M9 2V4.24394C9 4.5622 9.12643 4.86743 9.35147 5.09247C9.57652 5.31751 9.88174 5.44394 10.2 5.44394H12.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.4283 2.79015C9.95564 2.28602 9.29544 2 8.60442 2H4.625C4.32663 2 4.04048 2.12643 3.8295 2.35147C3.61853 2.57652 3.5 2.88174 3.5 3.2V12.8C3.5 13.1183 3.61853 13.4235 3.8295 13.6485C4.04048 13.8736 4.32663 14 4.625 14H11.375C11.6734 14 11.9595 13.8736 12.1705 13.6485C12.3815 13.4235 12.5 13.1183 12.5 12.8V5.98862C12.5 5.35347 12.2582 4.74213 11.8238 4.27877L10.4283 2.79015Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _file!!
        }

    private var _fileCode: ImageVector? = null
    val FileCode: ImageVector
        get() {
            if (_fileCode != null) return _fileCode!!
            _fileCode = create("FileCode", PathDef("M10.4283 2.79015C9.95564 2.28602 9.29544 2 8.60442 2H4.625C4.32663 2 4.04048 2.12643 3.8295 2.35147C3.61853 2.57652 3.5 2.88174 3.5 3.2V12.8C3.5 13.1183 3.61853 13.4235 3.8295 13.6485C4.04048 13.8736 4.32663 14 4.625 14H11.375C11.6734 14 11.9595 13.8736 12.1705 13.6485C12.3815 13.4235 12.5 13.1183 12.5 12.8V5.98862C12.5 5.35347 12.2582 4.74213 11.8238 4.27877L10.4283 2.79015Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.80001 6.5L5.60001 8L6.80001 9.5M9.20001 6.5L10.4 8L9.20001 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileCode!!
        }

    private var _fileCodeOff: ImageVector? = null
    val FileCodeOff: ImageVector
        get() {
            if (_fileCodeOff != null) return _fileCodeOff!!
            _fileCodeOff = create("FileCodeOff", PathDef("M1.91129 3.37805L14.0887 12.6219", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.94603 7.6676V12.3242C3.94603 12.6109 4.05281 12.8859 4.24288 13.0886C4.43294 13.2914 4.69073 13.4053 4.95952 13.4053H10.7097", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.95952 2.59473H8.54451C9.16704 2.59473 9.76181 2.8524 10.1876 3.30656L11.4448 4.64763C11.8362 5.06507 12.054 5.61581 12.054 6.18801V7.98098", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.2881 7.1399L5.6 8L6.8 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileCodeOff!!
        }

    private var _fileDiff: ImageVector? = null
    val FileDiff: ImageVector
        get() {
            if (_fileDiff != null) return _fileDiff!!
            _fileDiff = create("FileDiff", PathDef("M10.4283 2.79015C9.95564 2.28602 9.29544 2 8.60442 2H4.625C4.32663 2 4.04048 2.12643 3.8295 2.35147C3.61853 2.57652 3.5 2.88174 3.5 3.2V12.8C3.5 13.1183 3.61853 13.4235 3.8295 13.6485C4.04048 13.8736 4.32663 14 4.625 14H11.375C11.6734 14 11.9595 13.8736 12.1705 13.6485C12.3815 13.4235 12.5 13.1183 12.5 12.8V5.98862C12.5 5.35347 12.2582 4.74213 11.8238 4.27877L10.4283 2.79015Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.35106 7.02662H9.64893M7.99999 8.67555V5.37769M6.35106 10.8741H9.64893", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileDiff!!
        }

    private var _fileDoc: ImageVector? = null
    val FileDoc: ImageVector
        get() {
            if (_fileDoc != null) return _fileDoc!!
            _fileDoc = create("FileDoc", PathDef("M13 11V11.8374C13 11.9431 12.9665 12.046 12.9044 12.1315L12.1498 13.1691C12.0557 13.2985 11.9054 13.375 11.7454 13.375H4.25461C4.09464 13.375 3.94433 13.2985 3.85024 13.1691L3.09563 12.1315C3.03348 12.046 3 11.9431 3 11.8374V3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 13V11L8 12H13V13H3Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6.63246 3.04418C7.44914 3.31641 8 4.08069 8 4.94155V11.7306C8 12.0924 7.62757 12.3345 7.29693 12.1875L3.79693 10.632C3.61637 10.5518 3.5 10.3727 3.5 10.1751V2.69374C3.5 2.35246 3.83435 2.11148 4.15811 2.2194L6.63246 3.04418Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.5 3C8.67157 3 8 3.67157 8 4.5V13C8 12.1954 11.2366 12.0382 12.5017 12.0075C12.7778 12.0008 13 11.7761 13 11.5V3.5C13 3.22386 12.7761 3 12.5 3H9.5Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileDoc!!
        }

    private var _fileGeneric: ImageVector? = null
    val FileGeneric: ImageVector
        get() {
            if (_fileGeneric != null) return _fileGeneric!!
            _fileGeneric = create("FileGeneric", PathDef("M3 5H11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 8H13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 11H9", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileGeneric!!
        }

    private var _fileGit: ImageVector? = null
    val FileGit: ImageVector
        get() {
            if (_fileGit != null) return _fileGit!!
            _fileGit = create("FileGit", PathDef("M5 13C6.10457 13 7 12.1046 7 11C7 9.89543 6.10457 9 5 9C3.89543 9 3 9.89543 3 11C3 12.1046 3.89543 13 5 13Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11 7C12.1046 7 13 6.10457 13 5C13 3.89543 12.1046 3 11 3C9.89543 3 9 3.89543 9 5C9 6.10457 9.89543 7 11 7Z", isFill = true, isStroke = true, strokeWidth = 1.2f), PathDef("M4.625 3.625V8.375", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11 7C11 9.20914 9.20914 11 7 11", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileGit!!
        }

    private var _fileIgnored: ImageVector? = null
    val FileIgnored: ImageVector
        get() {
            if (_fileIgnored != null) return _fileIgnored!!
            _fileIgnored = create("FileIgnored", PathDef("M1.91129 3.37805L14.0887 12.6219", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.94603 7.6676V12.3242C3.94603 12.6109 4.05281 12.8859 4.24288 13.0886C4.43294 13.2914 4.69073 13.4053 4.95952 13.4053H10.7097", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.95952 2.59473H8.54451C9.16704 2.59473 9.76181 2.8524 10.1876 3.30656L11.4448 4.64763C11.8362 5.06507 12.054 5.61581 12.054 6.18801V7.98098", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileIgnored!!
        }

    private var _fileLock: ImageVector? = null
    val FileLock: ImageVector
        get() {
            if (_fileLock != null) return _fileLock!!
            _fileLock = create("FileLock", PathDef("M5 5C5 3.89543 5.89543 3 7 3H9C10.1046 3 11 3.89543 11 5V6H5V5Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.25 6.5C3.25 5.80964 3.80964 5.25 4.5 5.25H11.5C12.1904 5.25 12.75 5.80964 12.75 6.5V12.5C12.75 13.1904 12.1904 13.75 11.5 13.75H4.5C3.80964 13.75 3.25 13.1904 3.25 12.5V6.5ZM8.75 9.66146C8.90559 9.48517 9 9.25361 9 9C9 8.44772 8.55228 8 8 8C7.44772 8 7 8.44772 7 9C7 9.25361 7.09441 9.48517 7.25 9.66146V11C7.25 11.4142 7.58579 11.75 8 11.75C8.41421 11.75 8.75 11.4142 8.75 11V9.66146Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _fileLock!!
        }

    private var _fileMarkdown: ImageVector? = null
    val FileMarkdown: ImageVector
        get() {
            if (_fileMarkdown != null) return _fileMarkdown!!
            _fileMarkdown = create("FileMarkdown", PathDef("M13 13.5v-8L9.5 2h-6a.5.5 0 0 0-.5.5V6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 2v4h4M8 9.5V13h1a1.75 1.75 0 0 0 0-3.5H8ZM6 13V9.5L4.25 12 2.5 9.5V13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M0 0h16v16H0z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _fileMarkdown!!
        }

    private var _fileMultiple: ImageVector? = null
    val FileMultiple: ImageVector
        get() {
            if (_fileMultiple != null) return _fileMultiple!!
            _fileMultiple = create("FileMultiple", PathDef("M9.50458 4V6.43334C9.50458 6.77846 9.64168 7.10944 9.88571 7.35348C10.1298 7.59752 10.4607 7.73462 10.8059 7.73462H13.3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.5735 4.65846C11.1797 4.23835 10.6295 4 10.0537 4H6.73749C6.48885 4 6.25039 4.10536 6.07458 4.29289C5.89876 4.48043 5.79999 4.73478 5.79999 5V13C5.79999 13.2652 5.89876 13.5196 6.07458 13.7071C6.25039 13.8946 6.48885 14 6.73749 14H12.3625C12.6111 14 12.8496 13.8946 13.0254 13.7071C13.2012 13.5196 13.3 13.2652 13.3 13V7.32385C13.3 6.79456 13.0985 6.28511 12.7365 5.89897L11.5735 4.65846Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.5 12H3.73749C3.48885 12 3.25039 11.8946 3.07458 11.7071C2.89876 11.5196 2.79999 11.2652 2.79999 11V3C2.79999 2.73478 2.89876 2.48043 3.07458 2.29289C3.25039 2.10536 3.48885 2 3.73749 2H7.05367C7.62952 2 8.17969 2.23835 8.57354 2.65846L9.83124 4", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileMultiple!!
        }

    private var _fileRust: ImageVector? = null
    val FileRust: ImageVector
        get() {
            if (_fileRust != null) return _fileRust!!
            _fileRust = create("FileRust", PathDef("M5.27935 10.9821C5.32063 10.4038 4.9204 9.89049 4.35998 9.80276L3.60081 9.68387C3.37979 9.64945 3.20167 9.48001 3.15225 9.25614L3.01378 8.63511C2.96382 8.41235 3.05233 8.1807 3.23696 8.05125L3.8631 7.61242C4.33337 7.28297 4.47456 6.6369 4.18621 6.13364L3.79467 5.45092C3.68118 5.25261 3.69801 5.00374 3.83757 4.82321L4.22314 4.32436C4.3627 4.14438 4.59621 4.06994 4.81071 4.13772L5.57531 4.37769C6.11944 4.54879 6.70048 4.26159 6.90683 3.71886L7.1811 2.99782C7.26255 2.78395 7.46345 2.64285 7.68772 2.6423L8.31007 2.64063C8.53434 2.64007 8.73579 2.78006 8.81834 2.99337L9.09965 3.72275C9.30821 4.26214 9.88655 4.54712 10.429 4.37714L11.1632 4.14716C11.3772 4.07994 11.6096 4.15382 11.7492 4.3327L12.1374 4.83099", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.76988 11.5933C8.76988 11.6595 8.8236 11.7133 8.88988 11.7133H8.97588C9.32602 11.7133 9.60988 11.9971 9.60988 12.3472C9.60988 12.6974 9.32602 12.9812 8.97588 12.9812H7.05587C6.70573 12.9812 6.42188 12.6974 6.42188 12.3472C6.42188 11.9971 6.70573 11.7133 7.05587 11.7133H7.14188C7.20815 11.7133 7.26188 11.6595 7.26188 11.5933V7.66925C7.26188 7.60298 7.20815 7.54925 7.14188 7.54925H7.05588C6.70573 7.54925 6.42188 7.2654 6.42188 6.91525C6.42188 6.5651 6.70573 6.28125 7.05588 6.28125H9.89988C11.0518 6.28125 12.8619 6.71487 12.8619 8.15185C12.8619 8.67078 12.7284 9.10362 12.4642 9.45348C12.1981 9.79765 11.8458 10.0564 11.4056 10.2293C11.3782 10.2401 11.3673 10.273 11.3829 10.298L12.2163 11.6342C12.247 11.6834 12.3008 11.7133 12.3588 11.7133H12.7319C13.082 11.7133 13.3659 11.9971 13.3659 12.3472C13.3659 12.6974 13.082 12.9812 12.7319 12.9812H11.5637C11.4955 12.9812 11.432 12.9465 11.3952 12.889L9.96523 10.6541C9.92847 10.5966 9.86495 10.5618 9.79675 10.5618H8.96988C8.85942 10.5618 8.76988 10.6514 8.76988 10.7619V11.5933ZM9.61188 7.54925C10.0296 7.54925 11.125 7.54925 11.2339 8.18785C11.2975 8.56123 11.1181 8.86557 10.8812 9.07715C10.6423 9.29046 10.2053 9.38985 9.58788 9.38985H8.86988C8.81465 9.38985 8.76988 9.34508 8.76988 9.28985V7.64925C8.76988 7.59402 8.81465 7.54925 8.86988 7.54925H9.61188Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _fileRust!!
        }

    private var _fileTextFilled: ImageVector? = null
    val FileTextFilled: ImageVector
        get() {
            if (_fileTextFilled != null) return _fileTextFilled!!
            _fileTextFilled = create("FileTextFilled", PathDef("M8.60449 1.7002C9.37841 1.70022 10.1181 2.02036 10.6475 2.58496L12.043 4.07324C12.5294 4.59213 12.7997 5.27703 12.7998 5.98828V12.7998C12.7998 13.1915 12.6544 13.571 12.3896 13.8535C12.1241 14.1367 11.7594 14.2998 11.375 14.2998H4.625C4.24059 14.2998 3.87588 14.1367 3.61035 13.8535C3.34559 13.571 3.2002 13.1915 3.2002 12.7998V3.2002C3.2002 2.80851 3.34559 2.42903 3.61035 2.14648C3.87588 1.86326 4.24059 1.7002 4.625 1.7002H8.60449ZM5.73242 9.9209C5.29071 9.92103 4.93262 10.279 4.93262 10.7207C4.93262 11.1624 5.29071 11.5204 5.73242 11.5205H10.2666C10.7084 11.5205 11.0674 11.1625 11.0674 10.7207C11.0674 10.2789 10.7084 9.9209 10.2666 9.9209H5.73242ZM5.73242 7.7002C5.29071 7.70033 4.93262 8.05825 4.93262 8.5C4.93262 8.94175 5.29071 9.29967 5.73242 9.2998H8.45312C8.89495 9.2998 9.25293 8.94183 9.25293 8.5C9.25293 8.05817 8.89495 7.7002 8.45312 7.7002H5.73242Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _fileTextFilled!!
        }

    private var _fileTextOutlined: ImageVector? = null
    val FileTextOutlined: ImageVector
        get() {
            if (_fileTextOutlined != null) return _fileTextOutlined!!
            _fileTextOutlined = create("FileTextOutlined", PathDef("M9 2V4.24394C9 4.5622 9.12643 4.86743 9.35147 5.09247C9.57652 5.31751 9.88174 5.44394 10.2 5.44394H12.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.4283 2.79015C9.95564 2.28602 9.29544 2 8.60442 2H4.625C4.32663 2 4.04048 2.12643 3.8295 2.35147C3.61853 2.57652 3.5 2.88174 3.5 3.2V12.8C3.5 13.1183 3.61853 13.4235 3.8295 13.6485C4.04048 13.8736 4.32663 14 4.625 14H11.375C11.6734 14 11.9595 13.8736 12.1705 13.6485C12.3815 13.4235 12.5 13.1183 12.5 12.8V5.98862C12.5 5.35347 12.2582 4.74213 11.8238 4.27877L10.4283 2.79015Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.4534 8.5H5.73267", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.2672 10.7207H5.73267", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileTextOutlined!!
        }

    private var _fileToml: ImageVector? = null
    val FileToml: ImageVector
        get() {
            if (_fileToml != null) return _fileToml!!
            _fileToml = create("FileToml", PathDef("M6 6H10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 6V11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5 3H3.5C3.22386 3 3 3.22386 3 3.5V12.5C3 12.7761 3.22386 13 3.5 13H5M11 3H12.5C12.7761 3 13 3.22386 13 3.5V12.5C13 12.7761 12.7761 13 12.5 13H11", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fileToml!!
        }

    private var _fileTree: ImageVector? = null
    val FileTree: ImageVector
        get() {
            if (_fileTree != null) return _fileTree!!
            _fileTree = create("FileTree", PathDef("M3 2.5V3.5M3 3.5V9M3 3.5C3 5.46875 5.96875 5 5.96875 5M3 9C3 11 5.96875 11 5.96875 11M3 9V12.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12 3H9.5C8.67157 3 8 3.67157 8 4.5V5.5C8 6.32843 8.67157 7 9.5 7H12C12.8284 7 13.5 6.32843 13.5 5.5V4.5C13.5 3.67157 12.8284 3 12 3Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M12 9H9.5C8.67157 9 8 9.67157 8 10.5V11.5C8 12.3284 8.67157 13 9.5 13H12C12.8284 13 13.5 12.3284 13.5 11.5V10.5C13.5 9.67157 12.8284 9 12 9Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _fileTree!!
        }

    private var _filter: ImageVector? = null
    val Filter: ImageVector
        get() {
            if (_filter != null) return _filter!!
            _filter = create("Filter", PathDef("M2 5H4", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 5H14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12 11H14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2 11H8", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 7C7.10457 7 8 6.10457 8 5C8 3.89543 7.10457 3 6 3C4.89543 3 4 3.89543 4 5C4 6.10457 4.89543 7 6 7Z", isFill = true, isStroke = true, strokeWidth = 1.2f), PathDef("M10 13C11.1046 13 12 12.1046 12 11C12 9.89543 11.1046 9 10 9C8.89543 9 8 9.89543 8 11C8 12.1046 8.89543 13 10 13Z", isFill = true, isStroke = true, strokeWidth = 1.2f), PathDef("M6 7C7.10457 7 8 6.10457 8 5C8 3.89543 7.10457 3 6 3C4.89543 3 4 3.89543 4 5C4 6.10457 4.89543 7 6 7Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 13C11.1046 13 12 12.1046 12 11C12 9.89543 11.1046 9 10 9C8.89543 9 8 9.89543 8 11C8 12.1046 8.89543 13 10 13Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _filter!!
        }

    private var _filterFunnel: ImageVector? = null
    val FilterFunnel: ImageVector
        get() {
            if (_filterFunnel != null) return _filterFunnel!!
            _filterFunnel = create("FilterFunnel", PathDef("M12.9416 2.99643C13.08 2.79636 12.9568 2.5 12.7352 2.5H3.26475C3.04317 2.5 2.91999 2.79636 3.0584 2.99643L6.04033 7.30646C6.24713 7.60535 6.35981 7.97674 6.35981 8.3596C6.35981 9.18422 6.35981 11.4639 6.35981 12.891C6.35981 13.2285 6.59643 13.5 6.88831 13.5H9.11168C9.40357 13.5 9.64019 13.2285 9.64019 12.891C9.64019 11.4639 9.64019 9.18422 9.64019 8.3596C9.64019 7.97674 9.75289 7.60535 9.95969 7.30646L12.9416 2.99643Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _filterFunnel!!
        }

    private var _flame: ImageVector? = null
    val Flame: ImageVector
        get() {
            if (_flame != null) return _flame!!
            _flame = create("Flame", PathDef("M5.5 9.868c.474 0 .928-.18 1.263-.5.335-.321.523-.756.523-1.21 0-.944-.357-1.369-.715-2.053C5.806 4.64 6.411 3.331 8 2c.357 1.71 1.429 3.353 2.857 4.447C12.286 7.542 13 8.842 13 10.21c0 .63-.13 1.252-.38 1.833a4.781 4.781 0 0 1-1.084 1.554 5.021 5.021 0 0 1-1.623 1.038 5.191 5.191 0 0 1-3.826 0 5.02 5.02 0 0 1-1.623-1.038 4.78 4.78 0 0 1-1.083-1.554A4.615 4.615 0 0 1 3 10.211c0-.79.31-1.57.714-2.053 0 .454.188.889.523 1.21.335.32.79.5 1.263.5Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _flame!!
        }

    private var _foldVertical: ImageVector? = null
    val FoldVertical: ImageVector
        get() {
            if (_foldVertical != null) return _foldVertical!!
            _foldVertical = create("FoldVertical", PathDef("M7.99999 10.667V14.667M9.99999 12.667L7.99999 10.667L5.99999 12.667M7.99999 1.33301V5.33301M9.99999 3.33301L7.99999 5.33301L5.99999 3.33301M2.66699 8.00001H1.33299M6.66699 8.00001H5.33299M10.667 8.00001H9.33299M14.667 8.00001H13.333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 0.000 0.000 h 16.000 v 16.000 h -16.000 Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _foldVertical!!
        }

    private var _folder: ImageVector? = null
    val Folder: ImageVector
        get() {
            if (_folder != null) return _folder!!
            _folder = create("Folder", PathDef("M4.41707 12.4786H6.20854H11.5829C12.5724 12.4786 13.3744 11.6766 13.3744 10.6872V7.55212V7.10426C13.3744 6.11486 12.5724 5.3128 11.5829 5.3128H9.63778C9.16265 5.3128 8.70699 5.12406 8.37102 4.78808L7.62898 4.04604C7.29301 3.71007 6.83735 3.52133 6.36222 3.52133H4.41707C3.42768 3.52133 2.62561 4.3234 2.62561 5.3128V10.6872C2.62561 11.6766 3.42768 12.4786 4.41707 12.4786Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _folder!!
        }

    private var _folderAdd: ImageVector? = null
    val FolderAdd: ImageVector
        get() {
            if (_folderAdd != null) return _folderAdd!!
            _folderAdd = create("FolderAdd", PathDef("M9 11.8H11.8M11.8 11.8H14.6M11.8 11.8V9M11.8 11.8V14.6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 13H4C2.89543 13 2 12.1046 2 11V5C2 3.89543 2.89543 3 4 3H6.17157C6.70201 3 7.21071 3.21071 7.58579 3.58579L8.41421 4.41421C8.78929 4.78929 9.29799 5 9.82843 5H12C13.1046 5 14 5.89543 14 7V7.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _folderAdd!!
        }

    private var _folderInclude: ImageVector? = null
    val FolderInclude: ImageVector
        get() {
            if (_folderInclude != null) return _folderInclude!!
            _folderInclude = create("FolderInclude", PathDef("M6 13H4C2.89543 13 2 12.1046 2 11V5C2 3.89543 2.89543 3 4 3H6.17157C6.70201 3 7.21071 3.21071 7.58579 3.58579L8.41421 4.41421C8.78929 4.78929 9.29799 5 9.82843 5H12C13.1046 5 14 5.89543 14 7V7.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.2045 9.12397V13.8967", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.5926 12.0882L11.2046 14.4761L8.81659 12.0882", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _folderInclude!!
        }

    private var _folderOpen: ImageVector? = null
    val FolderOpen: ImageVector
        get() {
            if (_folderOpen != null) return _folderOpen!!
            _folderOpen = create("FolderOpen", PathDef("M5.46293 7.92298C5.46938 7.6844 5.66427 7.49307 5.90369 7.49307H13.7073C13.9467 7.49307 14.1401 7.6844 14.1335 7.92298C14.1 9.16418 13.9102 12.4787 12.8403 12.4787H4.50925C5.57932 12.4787 5.4293 9.16418 5.46293 7.92298Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M5.46293 7.92298C5.46938 7.6844 5.66427 7.49307 5.90369 7.49307H13.7073C13.9467 7.49307 14.1401 7.6844 14.1335 7.92298C14.1 9.16418 13.9102 12.4787 12.8403 12.4787H4.50925C5.57932 12.4787 5.4293 9.16418 5.46293 7.92298Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.0299 12.481H4.0299C2.92533 12.481 2.0299 11.5856 2.0299 10.481L2 5C2 3.89543 2.89543 3 4 3H5.12223C5.65267 3 6.16137 3.21071 6.53645 3.58579L7.36487 4.41421C7.73995 4.78929 8.24865 5 8.77909 5H10.9507C12.0553 5 12.9507 5.89543 12.9507 7V7.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _folderOpen!!
        }

    private var _folderSearch: ImageVector? = null
    val FolderSearch: ImageVector
        get() {
            if (_folderSearch != null) return _folderSearch!!
            _folderSearch = create("FolderSearch", PathDef("M14 14.2816L12.5804 12.8621", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.0113 13.5346C12.2491 13.5346 13.2527 12.531 13.2527 11.2932C13.2527 10.0552 12.2491 9.05173 11.0113 9.05173C9.77331 9.05173 8.76978 10.0552 8.76978 11.2932C8.76978 12.531 9.77331 13.5346 11.0113 13.5346Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 13H4C2.89543 13 2 12.1046 2 11V5C2 3.89543 2.89543 3 4 3H6.17157C6.70201 3 7.21071 3.21071 7.58579 3.58579L8.41421 4.41421C8.78929 4.78929 9.29799 5 9.82843 5H12C13.1046 5 14 5.89543 14 7V7.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _folderSearch!!
        }

    private var _folderShare: ImageVector? = null
    val FolderShare: ImageVector
        get() {
            if (_folderShare != null) return _folderShare!!
            _folderShare = create("FolderShare", PathDef("M6 13H4C2.89543 13 2 12.1046 2 11V5C2 3.89543 2.89543 3 4 3H6.17157C6.70201 3 7.21071 3.21071 7.58579 3.58579L8.41421 4.41421C8.78929 4.78929 9.29799 5 9.82843 5H12C13.1046 5 14 5.89543 14 7V7.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.2045 14.4761V9.7034", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.5926 11.5119L11.2046 9.12396L8.81659 11.5119", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _folderShare!!
        }

    private var _folderShared: ImageVector? = null
    val FolderShared: ImageVector
        get() {
            if (_folderShared != null) return _folderShared!!
            _folderShared = create("FolderShared", PathDef("M6 13H4C2.89543 13 2 12.1046 2 11V5C2 3.89543 2.89543 3 4 3H6.17157C6.70201 3 7.21071 3.21071 7.58579 3.58579L8.41421 4.41421C8.78929 4.78929 9.29799 5 9.82843 5H12C13.1046 5 14 5.89543 14 7V7.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4 13H6H12C13.1046 13 14 12.1046 14 11V7.5V7C14 5.89543 13.1046 5 12 5H9.82843C9.29799 5 8.78929 4.78929 8.41421 4.41421L7.58579 3.58579C7.21071 3.21071 6.70201 3 6.17157 3H4C2.89543 3 2 3.89543 2 5V11C2 12.1046 2.89543 13 4 13Z", isFill = true, isStroke = true, strokeWidth = 1.2f), PathDef("M11.2045 14.4761V9.7034", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.5926 11.5119L11.2046 9.12396L8.81659 11.5119", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _folderShared!!
        }

    private var _font: ImageVector? = null
    val Font: ImageVector
        get() {
            if (_font != null) return _font!!
            _font = create("Font", PathDef("M3 5V3h10v2M6 13h4M8 3v10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _font!!
        }

    private var _fontSize: ImageVector? = null
    val FontSize: ImageVector
        get() {
            if (_fontSize != null) return _fontSize!!
            _fontSize = create("FontSize", PathDef("M14 9.333h-3.333M10.667 10.667V8.333a1.667 1.667 0 1 1 3.333 0v2.334", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 8.667h4", isFill = false, isStroke = true, strokeWidth = 1.333f), PathDef("m2 10.667 3-6 3 6", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fontSize!!
        }

    private var _fontWeight: ImageVector? = null
    val FontWeight: ImageVector
        get() {
            if (_fontWeight != null) return _fontWeight!!
            _fontWeight = create("FontWeight", PathDef("M4.27 8h5.626a2.5 2.5 0 1 1 0 5h-5a.625.625 0 0 1-.625-.625v-8.75A.625.625 0 0 1 4.896 3H9.27a2.5 2.5 0 1 1 0 5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _fontWeight!!
        }

    private var _forgejo: ImageVector? = null
    val Forgejo: ImageVector
        get() {
            if (_forgejo != null) return _forgejo!!
            _forgejo = create("Forgejo", PathDef("M10.4889 1.74811C11.3234 1.74811 12 2.42467 12 3.25924C12 4.09382 11.3234 4.77032 10.4889 4.77032C9.92344 4.77032 9.43053 4.45981 9.17144 3.99993H8.4741C7.25904 3.99993 6.27176 4.97512 6.25212 6.18549L6.25176 7.28869C6.87559 6.81941 7.63228 6.56028 8.41283 6.54862L8.4741 6.5481L9.17144 6.5482C9.43053 6.08832 9.92344 5.77776 10.4889 5.77776C11.3234 5.77776 12 6.45432 12 7.28889C12 8.12347 11.3234 8.79998 10.4889 8.79998C9.92344 8.79998 9.43053 8.48947 9.17144 8.02959H8.4741C7.25904 8.02959 6.27176 9.00478 6.25212 10.2151L6.25176 11.4233C6.71164 11.6824 7.0222 12.1753 7.0222 12.7407C7.0222 13.5754 6.34564 14.2519 5.51107 14.2519C4.67654 14.2519 3.99998 13.5753 3.99998 12.7407C3.99998 12.1753 4.3105 11.6824 4.77043 11.4233L4.77032 6.22222C4.77032 4.19713 6.39555 2.55168 8.41283 2.51902L8.4741 2.5185H9.17144C9.43053 2.05872 9.92349 1.74811 10.4889 1.74811ZM5.51107 12.1185C5.16742 12.1185 4.88885 12.3971 4.88885 12.7407C4.88885 13.0844 5.16742 13.363 5.51107 13.363C5.85471 13.363 6.13334 13.0844 6.13334 12.7407C6.13334 12.3971 5.85471 12.1185 5.51107 12.1185ZM10.4889 6.66668C10.1453 6.66668 9.86665 6.94525 9.86665 7.28889C9.86665 7.63254 10.1453 7.91111 10.4889 7.91111C10.8326 7.91111 11.1111 7.63254 11.1111 7.28889C11.1111 6.94525 10.8326 6.66668 10.4889 6.66668ZM10.4889 2.63702C10.1453 2.63702 9.86665 2.9156 9.86665 3.25924C9.86665 3.60289 10.1453 3.88146 10.4889 3.88146C10.8326 3.88146 11.1111 3.60289 11.1111 3.25924C11.1111 2.9156 10.8326 2.63702 10.4889 2.63702Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _forgejo!!
        }

    private var _forwardArrow: ImageVector? = null
    val ForwardArrow: ImageVector
        get() {
            if (_forwardArrow != null) return _forwardArrow!!
            _forwardArrow = create("ForwardArrow", PathDef("M10 11.3334L13.3333 8.00002L10 4.66669", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.66675 12V10.6667C2.66675 9.95942 2.9477 9.28115 3.4478 8.78105C3.94789 8.28095 4.62617 8 5.33341 8H13.3334", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _forwardArrow!!
        }

    private var _forwardArrowUp: ImageVector? = null
    val ForwardArrowUp: ImageVector
        get() {
            if (_forwardArrowUp != null) return _forwardArrowUp!!
            _forwardArrowUp = create("ForwardArrowUp", PathDef("M10.0001 6.66669L13.3334 10L10.0001 13.3334", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.66675 5V7.33335C2.66675 8.0406 2.94765 8.71888 3.44775 9.21897C3.94785 9.71907 4.62615 10 5.33345 10H13.3334", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _forwardArrowUp!!
        }

    private var _genericClose: ImageVector? = null
    val GenericClose: ImageVector
        get() {
            if (_genericClose != null) return _genericClose!!
            _genericClose = create("GenericClose", PathDef("M11.5 4.5L4.5 11.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.5 4.5L11.5 11.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _genericClose!!
        }

    private var _genericMaximize: ImageVector? = null
    val GenericMaximize: ImageVector
        get() {
            if (_genericMaximize != null) return _genericMaximize!!
            _genericMaximize = create("GenericMaximize", PathDef("M11.5 4.5H4.5V11.5H11.5V4.5Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _genericMaximize!!
        }

    private var _genericMinimize: ImageVector? = null
    val GenericMinimize: ImageVector
        get() {
            if (_genericMinimize != null) return _genericMinimize!!
            _genericMinimize = create("GenericMinimize", PathDef("M4 8H12", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _genericMinimize!!
        }

    private var _genericRestore: ImageVector? = null
    val GenericRestore: ImageVector
        get() {
            if (_genericRestore != null) return _genericRestore!!
            _genericRestore = create("GenericRestore", PathDef("M9.5 6.5H3.5V12.5H9.5V6.5Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 8.5H12.5V3.5H7.5V6", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _genericRestore!!
        }

    private var _gerrit: ImageVector? = null
    val Gerrit: ImageVector
        get() {
            if (_gerrit != null) return _gerrit!!
            _gerrit = create("Gerrit", PathDef("M11.2308 4.7609V2.92308C11.2308 2.41328 10.8175 2 10.3077 2H2.92308C2.41328 2 2 2.41328 2 2.92308V10.3077C2 10.8175 2.41328 11.2308 2.92308 11.2308H5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.0769 4.76926H5.6923C5.1825 4.76926 4.76923 5.18253 4.76923 5.69233V13.077C4.76923 13.5868 5.1825 14 5.6923 14H13.0769C13.5867 14 14 13.5868 14 13.077V5.69233C14 5.18253 13.5867 4.76926 13.0769 4.76926Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.15385 7.07693H8.92308V8.00001H6.15385V7.07693Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M9.84615 7.07693H12.6154V8.00001H9.84615V7.07693Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6.15385 10.3077H7.07692V9.38461H8V10.3077H8.92308V11.2308H8V12.1538H7.07692V11.2308H6.15385V10.3077Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M9.84615 10.3077H10.7692V9.38461H11.6923V10.3077H12.6154V11.2308H11.6923V12.1538H10.7692V11.2308H9.84615V10.3077Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _gerrit!!
        }

    private var _gitBranch: ImageVector? = null
    val GitBranch: ImageVector
        get() {
            if (_gitBranch != null) return _gitBranch!!
            _gitBranch = create("GitBranch", PathDef("M4.5 13C5.32843 13 6 12.3284 6 11.5C6 10.6716 5.32843 10 4.5 10C3.67157 10 3 10.6716 3 11.5C3 12.3284 3.67157 13 4.5 13Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.5 6C12.3284 6 13 5.3284 13 4.5C13 3.6716 12.3284 3 11.5 3C10.6716 3 10 3.6716 10 4.5C10 5.3284 10.6716 6 11.5 6Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.5 10L4.5 3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 4.44133C8.54131 4.44133 7.14236 5.02697 6.11091 6.06943C5.07946 7.11188 4.5 8.52575 4.5 10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _gitBranch!!
        }

    private var _gitBranchPlus: ImageVector? = null
    val GitBranchPlus: ImageVector
        get() {
            if (_gitBranchPlus != null) return _gitBranchPlus!!
            _gitBranchPlus = create("GitBranchPlus", PathDef("M4 2V10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 4C8.4087 4 6.88258 4.63214 5.75736 5.75736C4.63214 6.88258 4 8.4087 4 10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12 10V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14 12H10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4 13C4.82843 13 5.5 12.3284 5.5 11.5C5.5 10.6716 4.82843 10 4 10C3.17157 10 2.5 10.6716 2.5 11.5C2.5 12.3284 3.17157 13 4 13Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.5 5.5C12.3284 5.5 13 4.8284 13 4C13 3.1716 12.3284 2.5 11.5 2.5C10.6716 2.5 10 3.1716 10 4C10 4.8284 10.6716 5.5 11.5 5.5Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _gitBranchPlus!!
        }

    private var _gitCommit: ImageVector? = null
    val GitCommit: ImageVector
        get() {
            if (_gitCommit != null) return _gitCommit!!
            _gitCommit = create("GitCommit", PathDef("M8 2V6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 10C9.10457 10 10 9.10457 10 8C10 6.89543 9.10457 6 8 6C6.89543 6 6 6.89543 6 8C6 9.10457 6.89543 10 8 10Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 10V14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _gitCommit!!
        }

    private var _gitGraph: ImageVector? = null
    val GitGraph: ImageVector
        get() {
            if (_gitGraph != null) return _gitGraph!!
            _gitGraph = create("GitGraph", PathDef("M4.19617 6.09808L4.19617 13.7058", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.8159 11.8038L11.8159 13.7058", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.816 11.8038C12.8664 11.8038 13.7179 10.9523 13.7179 9.90192C13.7179 8.85152 12.8664 8 11.816 8C10.7656 8 9.91403 8.85152 9.91403 9.90192C9.91403 10.9523 10.7656 11.8038 11.816 11.8038Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.19617 6.09808C5.24657 6.09808 6.09809 5.24656 6.09809 4.19616C6.09809 3.14575 5.24657 2.29424 4.19617 2.29424C3.14577 2.29424 2.29425 3.14575 2.29425 4.19616C2.29425 5.24656 3.14577 6.09808 4.19617 6.09808Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.0842 9.90192H7.30429C5.58772 9.90192 4.19617 8.51036 4.19617 6.79379V5.58465", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _gitGraph!!
        }

    private var _gitMergeConflict: ImageVector? = null
    val GitMergeConflict: ImageVector
        get() {
            if (_gitMergeConflict != null) return _gitMergeConflict!!
            _gitMergeConflict = create("GitMergeConflict", PathDef("M8 4.32848H10.4477C10.7723 4.32848 11.0835 4.45742 11.3131 4.68693C11.5426 4.91644 11.6715 5.22773 11.6715 5.55232V9.83575", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.32849 8V13.5073", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.16426 2.49272L2.49274 6.16424", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.16426 6.16424L2.49274 2.49272", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.6715 13.5073C12.6854 13.5073 13.5073 12.6854 13.5073 11.6715C13.5073 10.6577 12.6854 9.83575 11.6715 9.83575C10.6577 9.83575 9.83575 10.6577 9.83575 11.6715C9.83575 12.6854 10.6577 13.5073 11.6715 13.5073Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _gitMergeConflict!!
        }

    private var _gitWorktree: ImageVector? = null
    val GitWorktree: ImageVector
        get() {
            if (_gitWorktree != null) return _gitWorktree!!
            _gitWorktree = create("GitWorktree", PathDef("M7.78314 8.0003L12.3252 3.45825", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.49899 9.71719L12.3237 12.5419", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.25763 8.00031H7.77134", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.7424 6.47908V3.04047H9.3038", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.30225 12.9595H12.7409V9.52094", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _gitWorktree!!
        }

    private var _gitea: ImageVector? = null
    val Gitea: ImageVector
        get() {
            if (_gitea != null) return _gitea!!
            _gitea = create("Gitea", PathDef("M3.45524 3.60059C3.31116 3.60059 3.14899 3.61226 2.96524 3.65192C2.77099 3.69276 2.21858 3.81701 1.76707 4.25101C0.764907 5.14467 1.02041 6.56509 1.05191 6.77917C1.08982 7.03934 1.20532 7.76326 1.75774 8.39384C2.77799 9.64276 4.97366 9.61418 4.97366 9.61418C4.97366 9.61418 5.24316 10.2576 5.65499 10.8503C6.21208 11.587 6.78433 12.1616 7.34083 12.231C8.74433 12.231 11.5478 12.2287 11.5478 12.2287C11.5478 12.2287 11.815 12.231 12.1778 11.9988C12.4899 11.8098 12.7687 11.4779 12.7687 11.4779C12.7687 11.4779 13.0557 11.1705 13.4571 10.4688C13.5796 10.2529 13.6817 10.0435 13.7709 9.84576C13.7709 9.84576 15 7.23768 15 4.69901C14.9755 3.93017 14.7859 3.79484 14.7416 3.74992C14.6506 3.65892 14.5281 3.66067 14.5281 3.66067C14.5281 3.66067 11.9177 3.80767 10.5661 3.83917C10.2697 3.84559 9.97575 3.85259 9.68408 3.85492V6.46476L9.31425 6.28917C9.31425 5.47834 9.31191 3.85667 9.31191 3.85667C8.66616 3.86601 7.32566 3.80767 7.32566 3.80767C7.32566 3.80767 4.17624 3.65017 3.83324 3.61867C3.72416 3.61226 3.59933 3.60059 3.45524 3.60059ZM3.66174 4.66926H3.72649C3.72649 4.66926 3.88458 5.99284 4.07649 6.76751C4.23691 7.41792 4.62833 8.49884 4.62833 8.49884C4.62833 8.49884 4.04733 8.42943 3.67108 8.29584C3.09358 8.10684 2.84916 7.87934 2.84916 7.87934C2.84916 7.87934 2.42333 7.58126 2.20983 6.99268C1.84232 6.00801 2.17891 5.40717 2.17891 5.40717C2.17891 5.40717 2.36558 4.90609 3.03641 4.73926C3.26683 4.67742 3.53983 4.66926 3.66174 4.66926ZM8.52091 6.15909C8.67258 6.16084 8.81783 6.23317 8.81783 6.23317L9.32416 6.47934L9.01558 7.10642C8.94244 7.10526 8.87038 7.12417 8.80724 7.16109C8.74409 7.19801 8.69227 7.25153 8.65741 7.31584C8.62013 7.3853 8.60423 7.46422 8.61171 7.5427C8.61918 7.62117 8.64969 7.69567 8.69941 7.75684L8.15166 8.87918C8.0625 8.88053 7.97631 8.91146 7.90663 8.9671C7.83695 9.02274 7.78772 9.09994 7.76666 9.18659C7.74656 9.27272 7.75551 9.36308 7.79213 9.44358C7.82874 9.52409 7.89096 9.59022 7.96908 9.63168C8.05388 9.67515 8.15141 9.68693 8.24412 9.6649C8.33684 9.64287 8.41864 9.58848 8.47483 9.51151C8.52969 9.43471 8.55573 9.34103 8.54837 9.24693C8.541 9.15284 8.50072 9.06435 8.43458 8.99701L8.96891 7.90384C9.01532 7.90827 9.06215 7.90432 9.10716 7.89218C9.16538 7.87825 9.21952 7.85088 9.26525 7.81226C9.46902 7.89896 9.66699 7.99873 9.85791 8.11093C9.92725 8.14983 9.98487 8.20664 10.0247 8.27543C10.0673 8.39793 9.98216 8.60734 9.98216 8.60734C9.93141 8.77651 9.57266 9.51151 9.57266 9.51151C9.48573 9.50923 9.40039 9.53508 9.32933 9.58521C9.25828 9.63535 9.20532 9.70709 9.17833 9.78976C9.15763 9.85611 9.15471 9.92673 9.16985 9.99456C9.18498 10.0624 9.21765 10.1251 9.26459 10.1763C9.31153 10.2276 9.3711 10.2656 9.43734 10.2867C9.50359 10.3077 9.57419 10.311 9.6421 10.2962C9.71001 10.2814 9.77285 10.2491 9.82435 10.2024C9.87585 10.1557 9.9142 10.0963 9.93557 10.0302C9.95694 9.96406 9.96058 9.89347 9.94614 9.82548C9.93169 9.7575 9.89966 9.69449 9.85325 9.64276C9.89583 9.56051 9.9355 9.47826 9.97808 9.39134C10.0889 9.15976 10.2785 8.71468 10.2785 8.71468C10.2989 8.67618 10.4057 8.48484 10.3386 8.23984C10.2832 7.98609 10.0586 7.86768 10.0586 7.86768C9.78616 7.69209 9.40758 7.52934 9.40758 7.52934C9.40758 7.52934 9.40758 7.43834 9.38308 7.37184C9.36435 7.31951 9.33495 7.27164 9.29675 7.23126L9.59775 6.61176L11.2836 7.42901C11.2836 7.42901 11.5636 7.55618 11.6237 7.79009C11.6662 7.95459 11.6126 8.10159 11.5834 8.17334C11.4434 8.51576 10.3584 10.6916 10.3584 10.6916C10.3584 10.6916 10.2231 11.0148 9.92208 11.0346C9.8447 11.0402 9.76694 11.0313 9.69283 11.0083L9.575 10.9617L7.06083 9.73668C7.06083 9.73668 6.81758 9.60951 6.77499 9.38901C6.72658 9.20818 6.83566 8.98593 6.83566 8.98593L8.04491 6.49392C8.04491 6.49392 8.15166 6.27809 8.31675 6.20401C8.38086 6.17478 8.45045 6.15947 8.52091 6.15909Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _gitea!!
        }

    private var _github: ImageVector? = null
    val Github: ImageVector
        get() {
            if (_github != null) return _github!!
            _github = create("Github", PathDef("M9.849 14.288v-2.515a3.018 3.018 0 0 0-.629-2.201c1.887 0 3.773-1.258 3.773-3.459.05-.786-.17-1.559-.629-2.2a4.65 4.65 0 0 0 0-2.201s-.629 0-1.886.943a13.533 13.533 0 0 0-5.03 0c-1.259-.943-1.887-.943-1.887-.943a4.35 4.35 0 0 0 0 2.2 3.398 3.398 0 0 0-.63 2.201c0 2.201 1.887 3.459 3.774 3.459a2.965 2.965 0 0 0-.63 2.2v2.516", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.076 11.773c-2.836 1.258-3.144-1.258-4.402-1.258", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _github!!
        }

    private var _gitlab: ImageVector? = null
    val Gitlab: ImageVector
        get() {
            if (_gitlab != null) return _gitlab!!
            _gitlab = create("Gitlab", PathDef("M14.0228 6.75008L14.0053 6.70533L12.3092 2.27915C12.2747 2.19237 12.2136 2.11876 12.1347 2.06887C12.0557 2.01987 11.9636 1.99627 11.8708 2.00128C11.7779 2.00628 11.6889 2.03964 11.6156 2.09686C11.5432 2.15571 11.4906 2.23546 11.4651 2.32525L10.32 5.82877H5.68303L4.53784 2.32525C4.513 2.23496 4.46031 2.1548 4.38727 2.09618C4.31401 2.03898 4.22496 2.00564 4.13214 2.00065C4.03932 1.99567 3.94721 2.01928 3.86824 2.0683C3.78948 2.11837 3.72842 2.1919 3.69368 2.27852L1.99452 6.70273L1.97764 6.74748C1.73349 7.38539 1.70335 8.08539 1.89177 8.74192C2.08018 9.39845 2.47694 9.97594 3.02221 10.3873L3.02808 10.3918L3.04365 10.4029L5.62716 12.3376L6.90542 13.305L7.68395 13.8928C7.77502 13.9619 7.88623 13.9994 8.00058 13.9994C8.11493 13.9994 8.22613 13.9619 8.31721 13.8928L9.09574 13.305L10.3739 12.3376L12.973 10.3912L12.9795 10.386C13.5236 9.97456 13.9194 9.39768 14.1075 8.74203C14.2957 8.08638 14.2659 7.38738 14.0228 6.75008Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _gitlab!!
        }

    private var _hash: ImageVector? = null
    val Hash: ImageVector
        get() {
            if (_hash != null) return _hash!!
            _hash = create("Hash", PathDef("m11.748 3.015-2.893 9.573M7.161 3.424l-2.893 9.572M3.611 6.148h10M2.398 9.856h10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _hash!!
        }

    private var _historyRerun: ImageVector? = null
    val HistoryRerun: ImageVector
        get() {
            if (_historyRerun != null) return _historyRerun!!
            _historyRerun = create("HistoryRerun", PathDef("M2 8C2 9.18669 2.35189 10.3467 3.01118 11.3334C3.67047 12.3201 4.60754 13.0892 5.7039 13.5433C6.80026 13.9974 8.00666 14.1162 9.17054 13.8847C10.3344 13.6532 11.4035 13.0818 12.2426 12.2426C13.0818 11.4035 13.6532 10.3344 13.8847 9.17054C14.1162 8.00666 13.9974 6.80026 13.5433 5.7039C13.0892 4.60754 12.3201 3.67047 11.3334 3.01118C10.3467 2.35189 9.18669 2 8 2C6.32263 2.00631 4.71265 2.66082 3.50667 3.82667L2 5.33333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2 2V5.33333H5.33333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 5V8.5L10 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _historyRerun!!
        }

    private var _image: ImageVector? = null
    val Image: ImageVector
        get() {
            if (_image != null) return _image!!
            _image = create("Image", PathDef("M11.889 3H4.11C3.497 3 3 3.497 3 4.111v7.778C3 12.503 3.497 13 4.111 13h7.778c.614 0 1.111-.498 1.111-1.111V4.11C13 3.497 12.502 3 11.889 3Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.333 7.444a1.111 1.111 0 1 0 0-2.222 1.111 1.111 0 0 0 0 2.222ZM13 9.667l-1.714-1.715a1.11 1.11 0 0 0-1.571 0L4.667 13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _image!!
        }

    private var _inception: ImageVector? = null
    val Inception: ImageVector
        get() {
            if (_inception != null) return _inception!!
            _inception = create("Inception", PathDef("M14.6738 1.32619H1.32619V14.6738H14.6738V1.32619Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M9.6781 1.32619H5.50173L1.32536 5.50256V9.67892H5.50173V5.50256H9.6781V1.32619Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6.32088 14.6738H10.4973L14.6736 10.4974V6.32104H10.4973V10.4974H6.32088V14.6738Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _inception!!
        }

    private var _indicator: ImageVector? = null
    val Indicator: ImageVector
        get() {
            if (_indicator != null) return _indicator!!
            _indicator = create("Indicator", PathDef("M11.5 15C13.433 15 15 13.433 15 11.5C15 9.567 13.433 8 11.5 8C9.567 8 8 9.567 8 11.5C8 13.433 9.567 15 11.5 15Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _indicator!!
        }

    private var _info: ImageVector? = null
    val Info: ImageVector
        get() {
            if (_info != null) return _info!!
            _info = create("Info", PathDef("M8 14C11.3137 14 14 11.3137 14 8C14 4.68629 11.3137 2 8 2C4.68629 2 2 4.68629 2 8C2 11.3137 4.68629 14 8 14Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7 11H8M8 11H9M8 11V8.1C8 8.04477 7.95523 8 7.9 8H7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 6.5C8.55228 6.5 9 6.05228 9 5.5C9 4.94772 8.55228 4.5 8 4.5C7.44772 4.5 7 4.94772 7 5.5C7 6.05228 7.44772 6.5 8 6.5Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _info!!
        }

    private var _json: ImageVector? = null
    val Json: ImageVector
        get() {
            if (_json != null) return _json!!
            _json = create("Json", PathDef("M5.78125 3C3.90625 3 3.90625 4.5 3.90625 5.5C3.90625 6.5 3.40625 7.50106 2.40625 8C3.40625 8.50106 3.90625 9.5 3.90625 10.5C3.90625 11.5 3.90625 13 5.78125 13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.2422 3C12.1172 3 12.1172 4.5 12.1172 5.5C12.1172 6.5 12.6172 7.50106 13.6172 8C12.6172 8.50106 12.1172 9.5 12.1172 10.5C12.1172 11.5 12.1172 13 10.2422 13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _json!!
        }

    private var _keyboard: ImageVector? = null
    val Keyboard: ImageVector
        get() {
            if (_keyboard != null) return _keyboard!!
            _keyboard = create("Keyboard", PathDef("M6.75 5.5h.007M8 8h.007M9.25 5.5h.007M10.5 8h.007M11.75 5.5h.007M4.25 5.5h.007M4.875 10.5h6.25M5.5 8h.007M13 3H3c-.69 0-1.25.56-1.25 1.25v7.5c0 .69.56 1.25 1.25 1.25h10c.69 0 1.25-.56 1.25-1.25v-7.5C14.25 3.56 13.69 3 13 3Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _keyboard!!
        }

    private var _lineHeight: ImageVector? = null
    val LineHeight: ImageVector
        get() {
            if (_lineHeight != null) return _lineHeight!!
            _lineHeight = create("LineHeight", PathDef("M4 13.667h8M4 2.333h8M5 11l3-6 3 6M6 9h4", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _lineHeight!!
        }

    private var _link: ImageVector? = null
    val Link: ImageVector
        get() {
            if (_link != null) return _link!!
            _link = create("Link", PathDef("M6.2 11H5C4.20435 11 3.44129 10.6839 2.87868 10.1213C2.31607 9.55871 2 8.79565 2 8C2 7.20435 2.31607 6.44129 2.87868 5.87868C3.44129 5.31607 4.20435 5 5 5H6.2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.80005 5H11C11.7957 5 12.5588 5.31607 13.1214 5.87868C13.684 6.44129 14 7.20435 14 8C14 8.79565 13.684 9.55871 13.1214 10.1213C12.5588 10.6839 11.7957 11 11 11H9.80005", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.6001 8H10.4001", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _link!!
        }

    private var _linux: ImageVector? = null
    val Linux: ImageVector
        get() {
            if (_linux != null) return _linux!!
            _linux = create("Linux", PathDef("M16 0H0V16H16V0Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M3.71141 7.06133C3.76141 6.47267 3.78341 5.88133 3.81608 5.29133C4.10416 0.190202 11.896 0.190203 12.1841 5.29133C12.2174 5.898 12.2441 6.50333 12.3067 7.10733C12.6951 7.94202 14.3637 11.6214 13.4134 12.006C13.1894 12.096 12.8041 11.7227 12.3694 11.052C12.207 11.9614 11.7273 12.8132 11.0587 13.4467C11.7441 13.68 12.3334 13.998 12.3334 14.3333C12.3334 14.9176 3.66675 14.9257 3.66675 14.3333C3.66675 13.998 4.25608 13.68 4.94141 13.4467C4.26191 12.803 3.82279 11.9657 3.62408 11.056C3.19075 11.724 2.80608 12.096 2.58341 12.006C1.626 11.6185 3.31478 7.90684 3.71141 7.06133Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.11822 6.6L7.68822 7.89C7.85822 8.03 8.12822 8.03 8.29822 7.89L9.86822 6.6C10.1382 6.38 9.94822 6 9.56822 6H6.42822C6.04822 6 5.85822 6.38 6.12822 6.6H6.11822Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M 0.000 0.000 h 16.000 v 16.000 h -16.000 Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _linux!!
        }

    private var _listCollapse: ImageVector? = null
    val ListCollapse: ImageVector
        get() {
            if (_listCollapse != null) return _listCollapse!!
            _listCollapse = create("ListCollapse", PathDef("M2 4H7.33333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2 8H7.33333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2 12H7.33333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 4L12 6L14 4", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 12L12 10L14 12", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _listCollapse!!
        }

    private var _listTodo: ImageVector? = null
    val ListTodo: ImageVector
        get() {
            if (_listTodo != null) return _listTodo!!
            _listTodo = create("ListTodo", PathDef("M5.333 3.333H2.667A.667.667 0 0 0 2 4v2.667c0 .368.298.666.667.666h2.666A.667.667 0 0 0 6 6.667V4a.667.667 0 0 0-.667-.667ZM2 11.333l1.333 1.334L6 10M8.667 4H14M8.667 8H14M8.667 12H14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _listTodo!!
        }

    private var _listTree: ImageVector? = null
    val ListTree: ImageVector
        get() {
            if (_listTree != null) return _listTree!!
            _listTree = create("ListTree", PathDef("M13.5 8H9.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.5 4L6.5 4", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.5 12H9.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 3.5V6.33333C3 7.25 3.72 8 4.6 8H7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 6V10.5C3 11.325 3.72 12 4.6 12H7", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _listTree!!
        }

    private var _listX: ImageVector? = null
    val ListX: ImageVector
        get() {
            if (_listX != null) return _listX!!
            _listX = create("ListX", PathDef("M8.33333 8H3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.6667 4H3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.6667 12H3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.6667 6.66663L11 9.33329", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11 6.66663L13.6667 9.33329", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _listX!!
        }

    private var _loadCircle: ImageVector? = null
    val LoadCircle: ImageVector
        get() {
            if (_loadCircle != null) return _loadCircle!!
            _loadCircle = create("LoadCircle", PathDef("M13 8a5 5 0 1 1-3.455-4.755", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _loadCircle!!
        }

    private var _locationEdit: ImageVector? = null
    val LocationEdit: ImageVector
        get() {
            if (_locationEdit != null) return _locationEdit!!
            _locationEdit = create("LocationEdit", PathDef("M12 6.502a4.904 4.904 0 0 0-1.686-3.28 5.059 5.059 0 0 0-3.522-1.22A5.045 5.045 0 0 0 3.39 3.52 4.889 4.889 0 0 0 2 6.93c0 2.89 3.06 5.893 4.397 7.068M13.655 11.013a1.18 1.18 0 0 0-1.67-1.67l-2.227 2.23a1.112 1.112 0 0 0-.282.475l-.465 1.594a.278.278 0 0 0 .345.345l1.594-.465a1.11 1.11 0 0 0 .475-.281l2.23-2.228Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7 8.998a2 2 0 1 0 0-4 2 2 0 0 0 0 4Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _locationEdit!!
        }

    private var _lock: ImageVector? = null
    val Lock: ImageVector
        get() {
            if (_lock != null) return _lock!!
            _lock = create("Lock", PathDef("M5 5C5 3.89543 5.89543 3 7 3H9C10.1046 3 11 3.89543 11 5V6H5V5Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 9V11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 7.000 9.000 a 1.000 1.000 0 1 0 2.000 0 a 1.000 1.000 0 1 0 -2.000 0", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M 5.000 5.750 h 6.000 a 1.250 1.250 0 0 1 1.250 1.250 v 5.000 a 1.250 1.250 0 0 1 -1.250 1.250 h -6.000 a 1.250 1.250 0 0 1 -1.250 -1.250 v -5.000 a 1.250 1.250 0 0 1 1.250 -1.250 Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _lock!!
        }

    private var _lockOff: ImageVector? = null
    val LockOff: ImageVector
        get() {
            if (_lockOff != null) return _lockOff!!
            _lockOff = create("LockOff", PathDef("M8 9V11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 10C8.55228 10 9 9.55228 9 9C9 8.44772 8.55228 8 8 8C7.44772 8 7 8.44772 7 9C7 9.55228 7.44772 10 8 10Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M11 5.75H5C4.30964 5.75 3.75 6.30964 3.75 7V12C3.75 12.6904 4.30964 13.25 5 13.25H11C11.6904 13.25 12.25 12.6904 12.25 12V7C12.25 6.30964 11.6904 5.75 11 5.75Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.779 5.74999C5.17527 4.23271 5.91585 2.5133 7.43313 1.90957C8.34244 1.54775 9.32436 1.66876 10.0952 2.15042", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _lockOff!!
        }

    private var _magnifyingGlass: ImageVector? = null
    val MagnifyingGlass: ImageVector
        get() {
            if (_magnifyingGlass != null) return _magnifyingGlass!!
            _magnifyingGlass = create("MagnifyingGlass", PathDef("M13 13L10.4138 10.4138M3 7.31034C3 4.92981 4.92981 3 7.31034 3C9.6909 3 11.6207 4.92981 11.6207 7.31034C11.6207 9.6909 9.6909 11.6207 7.31034 11.6207C4.92981 11.6207 3 9.6909 3 7.31034Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _magnifyingGlass!!
        }

    private var _maximize: ImageVector? = null
    val Maximize: ImageVector
        get() {
            if (_maximize != null) return _maximize!!
            _maximize = create("Maximize", PathDef("M10 3H13V6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 13H3V10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13 3L9.5 6.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 13L6.5 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _maximize!!
        }

    private var _maximizeAlt: ImageVector? = null
    val MaximizeAlt: ImageVector
        get() {
            if (_maximizeAlt != null) return _maximizeAlt!!
            _maximizeAlt = create("MaximizeAlt", PathDef("M2.25 4.80555V3.52777C2.25 3.18889 2.38462 2.86388 2.62425 2.62425C2.86388 2.38462 3.18889 2.25 3.52777 2.25H4.80555", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.1945 2.25H12.4722C12.8111 2.25 13.1361 2.38462 13.3758 2.62425C13.6154 2.86388 13.75 3.18889 13.75 3.52777V4.80555", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.75 11.1945V12.4722C13.75 12.8111 13.6154 13.1361 13.3758 13.3758C13.1361 13.6154 12.8111 13.75 12.4722 13.75H11.1945", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.80555 13.75H3.52777C3.18889 13.75 2.86388 13.6154 2.62425 13.3758C2.38462 13.1361 2.25 12.8111 2.25 12.4722V11.1945", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _maximizeAlt!!
        }

    private var _menu: ImageVector? = null
    val Menu: ImageVector
        get() {
            if (_menu != null) return _menu!!
            _menu = create("Menu", PathDef("M2.667 8h10.666M2.667 4h10.666M2.667 12h10.666", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _menu!!
        }

    private var _mic: ImageVector? = null
    val Mic: ImageVector
        get() {
            if (_mic != null) return _mic!!
            _mic = create("Mic", PathDef("M8 12.2028V14.3042", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.2027 6.94928V8.11672C12.2027 9.20041 11.7599 10.2397 10.9717 11.006C10.1836 11.7723 9.11457 12.2028 7.99992 12.2028C6.88527 12.2028 5.81627 11.7723 5.02809 11.006C4.23991 10.2397 3.79712 9.20041 3.79712 8.11672V6.94928", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.1015 3.63555C10.1015 2.56426 9.16065 1.6958 8.00008 1.6958C6.83951 1.6958 5.89868 2.56426 5.89868 3.63555V8.16165C5.89868 9.23294 6.83951 10.1014 8.00008 10.1014C9.16065 10.1014 10.1015 9.23294 10.1015 8.16165V3.63555Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _mic!!
        }

    private var _micMute: ImageVector? = null
    val MicMute: ImageVector
        get() {
            if (_micMute != null) return _micMute!!
            _micMute = create("MicMute", PathDef("M3 3L13 13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12 9C12 8.74858 12 8.49375 12 8.23839V7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.00043 7V8.09869C3.98856 8.86731 4.22157 9.62164 4.66938 10.2643C5.11718 10.907 5.75924 11.4085 6.51267 11.7042C7.2661 11.9999 8.09632 12.0761 8.89619 11.923C9.47851 11.8115 10.0253 11.5823 10.5 11.2539", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 6V3.62904C9.99714 3.26103 9.8347 2.90448 9.53885 2.6168C9.24299 2.32913 8.83093 2.12707 8.36903 2.04316C7.90713 1.95926 7.42226 1.9984 6.99252 2.15427C6.56278 2.31015 6.21317 2.57369 6 2.90245", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 6V8.00088C6.00031 8.39636 6.10356 8.78287 6.29674 9.11159C6.48991 9.44031 6.76433 9.69649 7.08534 9.84779C7.40634 9.99909 7.75954 10.0387 8.10032 9.96165C8.4411 9.88459 8.75417 9.69431 9 9.41483", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 12V14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _micMute!!
        }

    private var _minimize: ImageVector? = null
    val Minimize: ImageVector
        get() {
            if (_minimize != null) return _minimize!!
            _minimize = create("Minimize", PathDef("M3.5 9.5H6.5V12.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.5 6.5H9.5V3.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.5 6.5L13 3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 13L6.5 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _minimize!!
        }

    private var _newFile: ImageVector? = null
    val NewFile: ImageVector
        get() {
            if (_newFile != null) return _newFile!!
            _newFile = create("NewFile", PathDef("M 9 2 V 4.244 a 1.2 1.2 0 0 0 1.2 1.2 H 12.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 8.5 2 H 4.625 A 1.2 1.2 0 0 0 3.5 3.2 v 9.6 A 1.2 1.2 0 0 0 4.625 14 H 8", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 12.5 6.5 V 5.5 L 9 2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 11.5 10 v 4", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 9.5 12 h 4", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _newFile!!
        }

    private var _notepad: ImageVector? = null
    val Notepad: ImageVector
        get() {
            if (_notepad != null) return _notepad!!
            _notepad = create("Notepad", PathDef("M6 8h4M6 10.5h4M3 3h10v9.565c0 .38-.158.746-.44 1.015-.28.269-.662.42-1.06.42h-7c-.398 0-.78-.151-1.06-.42A1.404 1.404 0 0 1 3 12.565V3ZM6.5 1v4M9.5 1v4", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M0 0h16v16H0z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _notepad!!
        }

    private var _onCall: ImageVector? = null
    val OnCall: ImageVector
        get() {
            if (_onCall != null) return _onCall!!
            _onCall = create("OnCall", PathDef("M9.5 3C10.3409 3.22145 11.108 3.66214 11.723 4.27705C12.3379 4.89196 12.7785 5.65906 13 6.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 5C10.0325 5.27625 10.7237 5.9675 11 7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.59842 9.46784C9.66164 9.42577 9.73436 9.40013 9.81 9.39326C9.88563 9.38638 9.96178 9.39848 10.0316 9.42846L12.7229 10.6343C12.8136 10.6731 12.8893 10.7402 12.9387 10.8256C12.988 10.9109 13.0084 11.01 12.9968 11.108C12.9081 11.7706 12.5819 12.3784 12.0786 12.8184C11.5754 13.2585 10.9295 13.5008 10.261 13.5003C8.20257 13.5003 6.22847 12.6826 4.77295 11.227C3.31744 9.77153 2.49974 7.79743 2.49974 5.73902C2.49923 5.07053 2.74153 4.42461 3.18157 3.92137C3.62161 3.41814 4.22944 3.09185 4.89203 3.00319C4.98997 2.99155 5.08906 3.01195 5.17444 3.06133C5.25983 3.11071 5.32693 3.18642 5.36569 3.27711L6.57154 5.97072C6.60116 6.0399 6.61323 6.11534 6.60666 6.19031C6.60008 6.26528 6.57508 6.33747 6.53387 6.40044L5.31433 7.85054C5.27107 7.91581 5.24549 7.9912 5.24009 8.06932C5.23469 8.14744 5.24965 8.22563 5.28351 8.29624C5.75546 9.26239 6.75415 10.2491 7.72317 10.7165C7.79415 10.7502 7.87269 10.7648 7.95105 10.7589C8.02941 10.753 8.10488 10.7268 8.17001 10.6828L9.59842 9.46784Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _onCall!!
        }

    private var _option: ImageVector? = null
    val Option: ImageVector
        get() {
            if (_option != null) return _option!!
            _option = create("Option", PathDef("M3 3H6.33333L9.66667 13H13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.11108 3H13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _option!!
        }

    private var _pageDown: ImageVector? = null
    val PageDown: ImageVector
        get() {
            if (_pageDown != null) return _pageDown!!
            _pageDown = create("PageDown", PathDef("M9.19131 16V8.53964H10.6313L13.2953 14.3455C13.2553 13.8719 13.2153 13.4016 13.1753 12.9347C13.1353 12.4677 13.1153 11.9975 13.1153 11.5238V8.53964H14.3993V16H12.9593L10.2953 10.1941C10.3353 10.6678 10.3753 11.1381 10.4153 11.605C10.4553 12.0719 10.4753 12.5422 10.4753 13.0159V16H9.19131Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2 16V8.53964H4.208C4.408 8.53964 4.608 8.55318 4.808 8.58024C5.008 8.60731 5.2 8.65806 5.384 8.73249C5.568 8.80016 5.74 8.88813 5.9 8.9964C6.068 9.10467 6.216 9.22647 6.344 9.3618C6.472 9.49037 6.584 9.62909 6.68 9.77796C6.776 9.92683 6.86 10.0825 6.932 10.2449C7.004 10.4073 7.064 10.5731 7.112 10.7422C7.16 10.9046 7.196 11.0704 7.22 11.2396C7.252 11.4087 7.272 11.5813 7.28 11.7572C7.296 11.9264 7.304 12.0956 7.304 12.2647C7.304 12.4407 7.296 12.6166 7.28 12.7926C7.272 12.9617 7.252 13.1309 7.22 13.3001C7.196 13.4692 7.16 13.6384 7.112 13.8076C7.064 13.97 7.004 14.1324 6.932 14.2948C6.86 14.4572 6.776 14.6128 6.68 14.7617C6.584 14.9105 6.472 15.0526 6.344 15.188C6.216 15.3166 6.068 15.435 5.9 15.5432C5.74 15.6515 5.568 15.7429 5.384 15.8173C5.2 15.885 5.008 15.9323 4.808 15.9594C4.608 15.9865 4.408 16 4.208 16H2ZM3.284 15.0662H4.208C4.344 15.0662 4.48 15.0526 4.616 15.0256C4.752 14.9917 4.876 14.941 4.988 14.8733C5.108 14.7989 5.212 14.7177 5.3 14.6297C5.388 14.535 5.464 14.4369 5.528 14.3354C5.6 14.2339 5.66 14.129 5.708 14.0207C5.764 13.9057 5.808 13.7906 5.84 13.6756C5.872 13.5606 5.9 13.4455 5.924 13.3305C5.948 13.2155 5.968 13.1004 5.984 12.9854C6 12.8636 6.008 12.7452 6.008 12.6301C6.016 12.5083 6.02 12.3865 6.02 12.2647C6.02 12.1497 6.016 12.0347 6.008 11.9196C6.008 11.7978 6 11.6794 5.984 11.5644C5.968 11.4426 5.948 11.3242 5.924 11.2091C5.9 11.0941 5.872 10.9791 5.84 10.864C5.808 10.749 5.764 10.6373 5.708 10.5291C5.66 10.414 5.6 10.3058 5.528 10.2043C5.464 10.1028 5.388 10.008 5.3 9.92006C5.212 9.82533 5.108 9.74413 4.988 9.67646C4.876 9.60202 4.752 9.55127 4.616 9.52421C4.48 9.49037 4.344 9.47346 4.208 9.47346H3.284V15.0662Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M11.7473 7.62276C11.5233 7.62276 11.2953 7.60584 11.0633 7.57201C10.8393 7.53817 10.6193 7.48404 10.4033 7.4096C10.1953 7.3284 10.0033 7.22352 9.82731 7.09495C9.65931 6.95961 9.51931 6.80736 9.40731 6.63819C9.29531 6.46226 9.21531 6.27955 9.16731 6.09009C9.11931 5.90062 9.09531 5.70776 9.09531 5.51153V2.11123C9.09531 1.91499 9.11531 1.72214 9.15531 1.53267C9.20331 1.33644 9.28331 1.15373 9.39531 0.984564C9.51531 0.815395 9.65931 0.666526 9.82731 0.537957C10.0033 0.402622 10.1953 0.294354 10.4033 0.213153C10.6193 0.131952 10.8393 0.0778178 11.0633 0.0507507C11.2953 0.0169169 11.5273 0 11.7593 0C11.9833 0 12.2033 0.0135335 12.4193 0.0406006C12.6353 0.0676677 12.8433 0.115035 13.0433 0.182703C13.2513 0.25037 13.4433 0.345105 13.6193 0.466907C13.7953 0.581942 13.9433 0.717277 14.0633 0.872912C14.1833 1.02855 14.2713 1.19772 14.3273 1.38042C14.3913 1.55635 14.4233 1.73906 14.4233 1.92853C14.4233 1.92853 14.4233 1.93191 14.4233 1.93868C14.4233 1.93868 14.4233 1.94206 14.4233 1.94883H13.1393C13.1393 1.94206 13.1393 1.93868 13.1393 1.93868C13.1393 1.78981 13.1033 1.64771 13.0313 1.51237C12.9593 1.37704 12.8553 1.26538 12.7193 1.17742C12.5913 1.08945 12.4433 1.02855 12.2753 0.994714C12.1073 0.954113 11.9353 0.933813 11.7593 0.933813C11.5753 0.933813 11.3913 0.957497 11.2073 1.00486C11.0313 1.05223 10.8753 1.13343 10.7393 1.24847C10.6113 1.35674 10.5193 1.48869 10.4633 1.64432C10.4073 1.79996 10.3793 1.95559 10.3793 2.11123V5.51153C10.3793 5.66716 10.4073 5.8228 10.4633 5.97843C10.5193 6.1273 10.6113 6.25925 10.7393 6.37429C10.8673 6.48256 11.0193 6.56376 11.1953 6.61789C11.3713 6.66526 11.5513 6.68894 11.7353 6.68894C11.8633 6.68894 11.9873 6.67879 12.1073 6.65849C12.2353 6.63819 12.3553 6.60436 12.4673 6.55699C12.5793 6.50962 12.6793 6.45211 12.7673 6.38444C12.8633 6.31 12.9353 6.22542 12.9833 6.13069C13.0393 6.03595 13.0753 5.93445 13.0913 5.82618C13.1073 5.71791 13.1153 5.61303 13.1153 5.51153V4.36456H11.7953V3.43075H14.3993V5.51153C14.3993 5.70776 14.3833 5.904 14.3513 6.10023C14.3273 6.29647 14.2593 6.48256 14.1473 6.65849C14.0353 6.82766 13.8873 6.97991 13.7033 7.11525C13.5273 7.24382 13.3313 7.34532 13.1153 7.41975C12.8993 7.49419 12.6753 7.54494 12.4433 7.57201C12.2193 7.60584 11.9873 7.62276 11.7473 7.62276Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2 7.54155V0.081192H4.58C4.812 0.081192 5.044 0.101492 5.276 0.142093C5.508 0.175926 5.728 0.240211 5.936 0.334945C6.144 0.42968 6.328 0.551482 6.488 0.700351C6.648 0.842452 6.776 1.00485 6.872 1.18756C6.976 1.36349 7.048 1.54958 7.088 1.74582C7.128 1.94205 7.148 2.14167 7.148 2.34467C7.148 2.54091 7.128 2.73715 7.088 2.93338C7.048 3.12962 6.976 3.31909 6.872 3.50179C6.776 3.67773 6.648 3.84013 6.488 3.989C6.328 4.13787 6.144 4.25967 5.936 4.3544C5.728 4.44914 5.508 4.5168 5.276 4.5574C5.044 4.59124 4.812 4.60816 4.58 4.60816H3.284V7.54155H2ZM4.58 3.66419C4.772 3.66419 4.956 3.63036 5.132 3.56269C5.316 3.49502 5.464 3.3969 5.576 3.26834C5.688 3.133 5.764 2.98752 5.804 2.83188C5.844 2.66948 5.864 2.50708 5.864 2.34467C5.864 2.18227 5.844 2.01987 5.804 1.85747C5.764 1.69506 5.688 1.54958 5.576 1.42101C5.464 1.28568 5.316 1.18417 5.132 1.11651C4.956 1.04884 4.772 1.01501 4.58 1.01501H3.284V3.66419H4.58Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _pageDown!!
        }

    private var _pageUp: ImageVector? = null
    val PageUp: ImageVector
        get() {
            if (_pageUp != null) return _pageUp!!
            _pageUp = create("PageUp", PathDef("M9.4433 15.9192V8.49652H12.0233C12.2553 8.49652 12.4873 8.51672 12.7193 8.55711C12.9513 8.59078 13.1713 8.65474 13.3793 8.74899C13.5873 8.84325 13.7713 8.96444 13.9313 9.11255C14.0913 9.25394 14.2193 9.41552 14.3153 9.5973C14.4193 9.77235 14.4913 9.95749 14.5313 10.1527C14.5713 10.348 14.5913 10.5466 14.5913 10.7486C14.5913 10.9438 14.5713 11.1391 14.5313 11.3343C14.4913 11.5296 14.4193 11.7181 14.3153 11.8998C14.2193 12.0749 14.0913 12.2365 13.9313 12.3846C13.7713 12.5327 13.5873 12.6539 13.3793 12.7482C13.1713 12.8424 12.9513 12.9097 12.7193 12.9501C12.4873 12.9838 12.2553 13.0006 12.0233 13.0006H10.7273V15.9192H9.4433ZM12.0233 12.0614C12.2153 12.0614 12.3993 12.0278 12.5753 11.9604C12.7593 11.8931 12.9073 11.7955 13.0193 11.6676C13.1313 11.5329 13.2073 11.3882 13.2473 11.2333C13.2873 11.0717 13.3073 10.9102 13.3073 10.7486C13.3073 10.587 13.2873 10.4254 13.2473 10.2638C13.2073 10.1022 13.1313 9.95749 13.0193 9.82957C12.9073 9.69492 12.7593 9.59393 12.5753 9.52661C12.3993 9.45928 12.2153 9.42562 12.0233 9.42562H10.7273V12.0614H12.0233Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M4.604 16C4.372 16 4.144 15.9832 3.92 15.9495C3.696 15.9226 3.48 15.8687 3.272 15.7879C3.064 15.7071 2.876 15.5994 2.708 15.4648C2.54 15.3301 2.4 15.1786 2.288 15.0103C2.184 14.842 2.108 14.6636 2.06 14.4751C2.02 14.2798 2 14.0879 2 13.8994V8.49652H3.284V13.8994C3.284 14.0543 3.308 14.2058 3.356 14.3539C3.404 14.502 3.488 14.6333 3.608 14.7477C3.736 14.8622 3.888 14.9463 4.064 15.0002C4.24 15.0473 4.42 15.0709 4.604 15.0709C4.788 15.0709 4.968 15.0473 5.144 15.0002C5.32 14.9463 5.468 14.8622 5.588 14.7477C5.716 14.6333 5.804 14.502 5.852 14.3539C5.9 14.2058 5.924 14.0543 5.924 13.8994V8.49652H7.208V13.8994C7.208 14.0879 7.184 14.2798 7.136 14.4751C7.096 14.6636 7.02 14.842 6.908 15.0103C6.804 15.1786 6.668 15.3301 6.5 15.4648C6.332 15.5994 6.144 15.7071 5.936 15.7879C5.728 15.8687 5.512 15.9226 5.288 15.9495C5.064 15.9832 4.836 16 4.604 16Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M11.7473 7.58426C11.5233 7.58426 11.2953 7.56743 11.0633 7.53377C10.8393 7.50011 10.6193 7.44625 10.4033 7.37219C10.1953 7.2914 10.0033 7.18704 9.82731 7.05912C9.65931 6.92447 9.51931 6.77299 9.40731 6.60467C9.29531 6.42963 9.21531 6.24785 9.16731 6.05933C9.11931 5.87082 9.09531 5.67894 9.09531 5.4837V2.10057C9.09531 1.90532 9.11531 1.71344 9.15531 1.52493C9.20331 1.32969 9.28331 1.14791 9.39531 0.979592C9.51531 0.811277 9.65931 0.66316 9.82731 0.535241C10.0033 0.400589 10.1953 0.292868 10.4033 0.212076C10.6193 0.131285 10.8393 0.0774248 11.0633 0.0504944C11.2953 0.0168315 11.5273 0 11.7593 0C11.9833 0 12.2033 0.0134652 12.4193 0.0403956C12.6353 0.0673261 12.8433 0.114454 13.0433 0.18178C13.2513 0.249106 13.4433 0.343362 13.6193 0.464549C13.7953 0.579003 13.9433 0.713655 14.0633 0.868505C14.1833 1.02335 14.2713 1.19167 14.3273 1.37345C14.3913 1.5485 14.4233 1.73028 14.4233 1.91879C14.4233 1.91879 14.4233 1.92215 14.4233 1.92889C14.4233 1.92889 14.4233 1.93225 14.4233 1.93899H13.1393C13.1393 1.93225 13.1393 1.92889 13.1393 1.92889C13.1393 1.78077 13.1033 1.63939 13.0313 1.50473C12.9593 1.37008 12.8553 1.25899 12.7193 1.17147C12.5913 1.08395 12.4433 1.02335 12.2753 0.989691C12.1073 0.949295 11.9353 0.929098 11.7593 0.929098C11.5753 0.929098 11.3913 0.952662 11.2073 0.99979C11.0313 1.04692 10.8753 1.12771 10.7393 1.24216C10.6113 1.34988 10.5193 1.48117 10.4633 1.63602C10.4073 1.79087 10.3793 1.94572 10.3793 2.10057V5.4837C10.3793 5.63855 10.4073 5.7934 10.4633 5.94824C10.5193 6.09636 10.6113 6.22765 10.7393 6.3421C10.8673 6.44982 11.0193 6.53061 11.1953 6.58447C11.3713 6.6316 11.5513 6.65517 11.7353 6.65517C11.8633 6.65517 11.9873 6.64507 12.1073 6.62487C12.2353 6.60467 12.3553 6.57101 12.4673 6.52388C12.5793 6.47675 12.6793 6.41953 12.7673 6.3522C12.8633 6.27814 12.9353 6.19398 12.9833 6.09973C13.0393 6.00547 13.0753 5.90448 13.0913 5.79676C13.1073 5.68904 13.1153 5.58468 13.1153 5.4837V4.34252H11.7953V3.41342H14.3993V5.4837C14.3993 5.67894 14.3833 5.87419 14.3513 6.06943C14.3273 6.26468 14.2593 6.44982 14.1473 6.62487C14.0353 6.79319 13.8873 6.94467 13.7033 7.07932C13.5273 7.20724 13.3313 7.30823 13.1153 7.38229C12.8993 7.45635 12.6753 7.50684 12.4433 7.53377C12.2193 7.56743 11.9873 7.58426 11.7473 7.58426Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2 7.50346V0.08078H4.58C4.812 0.08078 5.044 0.100978 5.276 0.141373C5.508 0.175036 5.728 0.238996 5.936 0.333252C6.144 0.427508 6.328 0.548695 6.488 0.696812C6.648 0.838196 6.776 0.999778 6.872 1.18156C6.976 1.35661 7.048 1.54175 7.088 1.737C7.128 1.93224 7.148 2.13085 7.148 2.33283C7.148 2.52808 7.128 2.72332 7.088 2.91857C7.048 3.11381 6.976 3.30233 6.872 3.48411C6.776 3.65915 6.648 3.82073 6.488 3.96885C6.328 4.11697 6.144 4.23816 5.936 4.33241C5.728 4.42667 5.508 4.49399 5.276 4.53439C5.044 4.56805 4.812 4.58488 4.58 4.58488H3.284V7.50346H2ZM4.58 3.64569C4.772 3.64569 4.956 3.61202 5.132 3.5447C5.316 3.47737 5.464 3.37975 5.576 3.25183C5.688 3.11718 5.764 2.97243 5.804 2.81758C5.844 2.656 5.864 2.49441 5.864 2.33283C5.864 2.17125 5.844 2.00967 5.804 1.84809C5.764 1.6865 5.688 1.54175 5.576 1.41383C5.464 1.27918 5.316 1.17819 5.132 1.11087C4.956 1.04354 4.772 1.00988 4.58 1.00988H3.284V3.64569H4.58Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M 0.000 0.000 h 16.000 v 16.000 h -16.000 Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _pageUp!!
        }

    private var _paperclip: ImageVector? = null
    val Paperclip: ImageVector
        get() {
            if (_paperclip != null) return _paperclip!!
            _paperclip = create("Paperclip", PathDef("M10.1645 4.45825L5.20344 9.52074C4.98225 9.74193 4.85798 10.0419 4.85798 10.3548C4.85798 10.6676 4.98225 10.9676 5.20344 11.1888C5.42464 11.41 5.72464 11.5342 6.03746 11.5342C6.35028 11.5342 6.65028 11.41 6.87148 11.1888L11.8326 6.12629C12.2749 5.68397 12.5234 5.08407 12.5234 4.45854C12.5234 3.83302 12.2749 3.23311 11.8326 2.7908C11.3902 2.34849 10.7903 2.1 10.1648 2.1C9.53928 2.1 8.93938 2.34849 8.49707 2.7908L3.55663 7.83265C3.22373 8.16017 2.95897 8.55037 2.77762 8.98072C2.59628 9.41108 2.50193 9.87308 2.50003 10.3401C2.49813 10.8071 2.58871 11.2698 2.76654 11.7017C2.94438 12.1335 3.20595 12.5258 3.53618 12.856C3.8664 13.1863 4.25873 13.4478 4.69055 13.6257C5.12237 13.8035 5.58513 13.8941 6.05213 13.8922C6.51913 13.8903 6.98114 13.7959 7.41149 13.6146C7.84185 13.4332 8.23204 13.1685 8.55957 12.8356L13.5 7.79373", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _paperclip!!
        }

    private var _pencil: ImageVector? = null
    val Pencil: ImageVector
        get() {
            if (_pencil != null) return _pencil!!
            _pencil = create("Pencil", PathDef("M12.5871 5.40582C12.8514 5.14152 13 4.78304 13 4.40922C13 4.03541 12.8516 3.67688 12.5873 3.41252C12.323 3.14816 11.9645 2.99962 11.5907 2.99957C11.2169 2.99953 10.8584 3.14798 10.594 3.41227L3.92098 10.0869C3.80488 10.2027 3.71903 10.3452 3.67097 10.5019L3.01047 12.678C2.99754 12.7212 2.99657 12.7672 3.00764 12.8109C3.01872 12.8547 3.04143 12.8946 3.07337 12.9265C3.1053 12.9584 3.14528 12.981 3.18905 12.992C3.23282 13.003 3.27875 13.002 3.32197 12.989L5.49849 12.329C5.65508 12.2813 5.79758 12.196 5.91349 12.0805L12.5871 5.40582Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 5L11 7", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _pencil!!
        }

    private var _pencilUnavailable: ImageVector? = null
    val PencilUnavailable: ImageVector
        get() {
            if (_pencilUnavailable != null) return _pencilUnavailable!!
            _pencilUnavailable = create("PencilUnavailable", PathDef("M8.5 5.50621L10.5941 3.41227C10.8585 3.14798 11.217 2.99953 11.5908 2.99957C11.9646 2.99962 12.3231 3.14816 12.5874 3.41252C12.8517 3.67688 13.0001 4.03541 13.0001 4.40922C13.0001 4.78304 12.8515 5.14152 12.5872 5.40582L10.493 7.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.50789 8.5L3.92098 10.0869C3.80488 10.2027 3.71903 10.3452 3.67097 10.5019L3.01047 12.678C2.99754 12.7212 2.99657 12.7672 3.00764 12.8109C3.01872 12.8547 3.04143 12.8946 3.07337 12.9265C3.1053 12.9584 3.14528 12.981 3.18905 12.992C3.23282 13.003 3.27875 13.002 3.32197 12.989L5.49849 12.329C5.65508 12.2813 5.79758 12.196 5.91349 12.0805L7.49184 10.5019", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 5L11 7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 3L13 13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _pencilUnavailable!!
        }

    private var _person: ImageVector? = null
    val Person: ImageVector
        get() {
            if (_person != null) return _person!!
            _person = create("Person", PathDef("M12.667 14v-1.333A2.667 2.667 0 0 0 10 10H6a2.667 2.667 0 0 0-2.667 2.667V14M8 7.333A2.667 2.667 0 1 0 8 2a2.667 2.667 0 0 0 0 5.333Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _person!!
        }

    private var _pin: ImageVector? = null
    val Pin: ImageVector
        get() {
            if (_pin != null) return _pin!!
            _pin = create("Pin", PathDef("M8 10V13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.71429 7.088C6.7142 7.26164 6.66963 7.43181 6.58559 7.57938C6.50156 7.72695 6.38138 7.84606 6.23857 7.92333L5.47571 8.34333C5.33291 8.4206 5.21273 8.53972 5.12869 8.68729C5.04465 8.83486 5.00008 9.00503 5 9.17867V9.53333C5 9.6571 5.04515 9.7758 5.12553 9.86332C5.2059 9.95083 5.31491 10 5.42857 10H10.5714C10.6851 10 10.7941 9.95083 10.8745 9.86332C10.9548 9.7758 11 9.6571 11 9.53333V9.17867C10.9999 9.00503 10.9553 8.83486 10.8713 8.68729C10.7873 8.53972 10.6671 8.4206 10.5243 8.34333L9.76143 7.92333C9.61862 7.84606 9.49844 7.72695 9.41441 7.57938C9.33037 7.43181 9.2858 7.26164 9.28571 7.088V5.33333C9.28571 5.20957 9.33087 5.09087 9.41124 5.00335C9.49161 4.91583 9.60062 4.86667 9.71429 4.86667C9.94161 4.86667 10.1596 4.76833 10.3204 4.5933C10.4811 4.41827 10.5714 4.18087 10.5714 3.93333C10.5714 3.6858 10.4811 3.4484 10.3204 3.27337C10.1596 3.09833 9.94161 3 9.71429 3H6.28571C6.05839 3 5.84037 3.09833 5.67962 3.27337C5.51888 3.4484 5.42857 3.6858 5.42857 3.93333C5.42857 4.18087 5.51888 4.41827 5.67962 4.5933C5.84037 4.76833 6.05839 4.86667 6.28571 4.86667C6.39938 4.86667 6.50839 4.91583 6.58876 5.00335C6.66913 5.09087 6.71429 5.20957 6.71429 5.33333V7.088Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _pin!!
        }

    private var _playFilled: ImageVector? = null
    val PlayFilled: ImageVector
        get() {
            if (_playFilled != null) return _playFilled!!
            _playFilled = create("PlayFilled", PathDef("M5 4L12 8L5 12V4Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _playFilled!!
        }

    private var _playOutlined: ImageVector? = null
    val PlayOutlined: ImageVector
        get() {
            if (_playOutlined != null) return _playOutlined!!
            _playOutlined = create("PlayOutlined", PathDef("M5 4L12 8L5 12V4Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _playOutlined!!
        }

    private var _plus: ImageVector? = null
    val Plus: ImageVector
        get() {
            if (_plus != null) return _plus!!
            _plus = create("Plus", PathDef("M3.33325 8H12.6666", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 3.33333V12.6667", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _plus!!
        }

    private var _power: ImageVector? = null
    val Power: ImageVector
        get() {
            if (_power != null) return _power!!
            _power = create("Power", PathDef("M8 2v5M11.536 4a5.368 5.368 0 0 1 1.367 2.696 5.54 5.54 0 0 1-.28 3.042 5.223 5.223 0 0 1-1.836 2.367A4.82 4.82 0 0 1 8.016 13a4.817 4.817 0 0 1-2.777-.877 5.22 5.22 0 0 1-1.85-2.354 5.54 5.54 0 0 1-.298-3.041 5.371 5.371 0 0 1 1.35-2.705", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _power!!
        }

    private var _public: ImageVector? = null
    val Public: ImageVector
        get() {
            if (_public != null) return _public!!
            _public = create("Public", PathDef("M4 6.375A5.625 5.625 0 0 1 9.625 12M4 10a2 2 0 0 1 2 2M4 3a9 9 0 0 1 9 9", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _public!!
        }

    private var _pullRequest: ImageVector? = null
    val PullRequest: ImageVector
        get() {
            if (_pullRequest != null) return _pullRequest!!
            _pullRequest = create("PullRequest", PathDef("M4 6a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3ZM4 6v7M12 13a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3ZM10 6.5l-2-2 2-2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.5 4.389h2.357c.303 0 .594.117.808.325.215.209.335.491.335.786V10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _pullRequest!!
        }

    private var _queueMessage: ImageVector? = null
    val QueueMessage: ImageVector
        get() {
            if (_queueMessage != null) return _queueMessage!!
            _queueMessage = create("QueueMessage", PathDef("M10.3404 3.53018H2.73401", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.3404 7.62592H2.73401", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.24467 11.7217H2.73401", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.3404 9.96637L8.58511 11.7217L10.3404 13.477", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.266 3.53018V10.5515C13.266 10.8619 13.1427 11.1595 12.9232 11.379C12.7038 11.5984 12.4061 11.7217 12.0958 11.7217H8.58511", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _queueMessage!!
        }

    private var _quote: ImageVector? = null
    val Quote: ImageVector
        get() {
            if (_quote != null) return _quote!!
            _quote = create("Quote", PathDef("M11.333 4H2M14 8H5.333M12 12H5M2 8v4", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _quote!!
        }

    private var _reader: ImageVector? = null
    val Reader: ImageVector
        get() {
            if (_reader != null) return _reader!!
            _reader = create("Reader", PathDef("M11.8889 2H4.11111C3.49746 2 3 2.59695 3 3.33333V12.6667C3 13.403 3.49746 14 4.11111 14H11.8889C12.5025 14 13 13.403 13 12.6667V3.33333C13 2.59695 12.5025 2 11.8889 2Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 6H6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 10H6", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _reader!!
        }

    private var _refreshTitle: ImageVector? = null
    val RefreshTitle: ImageVector
        get() {
            if (_refreshTitle != null) return _refreshTitle!!
            _refreshTitle = create("RefreshTitle", PathDef("M4.667 14V8m0 0H2m2.667 0h2.666", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14 12.667h-3.333V9.333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.03 3.5a.667.667 0 0 0 .883 1l-.882-1ZM8 3.333A4.667 4.667 0 0 1 12.666 8H14a6 6 0 0 0-6-6v1.333ZM12.666 8a4.656 4.656 0 0 1-1.75 3.643l.834 1.04A5.99 5.99 0 0 0 14 8h-1.334ZM5.667 3.957A4.642 4.642 0 0 1 8 3.333V2a5.976 5.976 0 0 0-3 .803l.667 1.154Zm-.754.543c.232-.205.485-.387.754-.543l-.668-1.154c-.346.2-.67.434-.968.697l.882 1Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _refreshTitle!!
        }

    private var _regex: ImageVector? = null
    val Regex: ImageVector
        get() {
            if (_regex != null) return _regex!!
            _regex = create("Regex", PathDef("M4.57132 13.7143C5.20251 13.7143 5.71418 13.2026 5.71418 12.5714C5.71418 11.9403 5.20251 11.4286 4.57132 11.4286C3.94014 11.4286 3.42847 11.9403 3.42847 12.5714C3.42847 13.2026 3.94014 13.7143 4.57132 13.7143Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M10.2856 2.85712V5.71426M10.2856 5.71426V8.5714M10.2856 5.71426H13.1428M10.2856 5.71426H7.42847M10.2856 5.71426L12.1904 3.80949M10.2856 5.71426L8.38084 7.61906M10.2856 5.71426L12.1904 7.61906M10.2856 5.71426L8.38084 3.80949", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _regex!!
        }

    private var _replNeutral: ImageVector? = null
    val ReplNeutral: ImageVector
        get() {
            if (_replNeutral != null) return _replNeutral!!
            _replNeutral = create("ReplNeutral", PathDef("M12.5 6C13.3284 6 14 5.32843 14 4.5C14 3.67157 13.3284 3 12.5 3C11.6716 3 11 3.67157 11 4.5C11 5.32843 11.6716 6 12.5 6Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.5 13C4.32843 13 5 12.3284 5 11.5C5 10.6716 4.32843 10 3.5 10C2.67157 10 2 10.6716 2 11.5C2 12.3284 2.67157 13 3.5 13Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.00391 13.9293C8.16208 14.1122 9.35055 13.9659 10.4234 13.5085C11.4962 13.0511 12.4066 12.3024 13.0426 11.3545C13.6787 10.4066 14.0128 9.30075 14.0037 8.17293C13.9977 7.42342 13.8404 6.68587 13.5444 6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.00391 2.07233C7.83928 1.90288 6.64809 2.05936 5.57504 2.52278C4.502 2.9862 3.59331 3.73659 2.95939 4.68279C2.32547 5.62899 1.99362 6.73024 2.00415 7.85274C2.0111 8.59299 2.16675 9.32147 2.45883 10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _replNeutral!!
        }

    private var _replace: ImageVector? = null
    val Replace: ImageVector
        get() {
            if (_replace != null) return _replace!!
            _replace = create("Replace", PathDef("M7.99988 13C5.97267 13 4.22723 11.7936 3.44238 10.0595M7.99988 3C10.1122 3 11.9185 4.30981 12.6511 6.16152", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.65625 3.29688C3.00143 3.29688 3.28125 3.01705 3.28125 2.67188C3.28125 2.3267 3.00143 2.04688 2.65625 2.04688C2.31107 2.04688 2.03125 2.3267 2.03125 2.67188C2.03125 3.01705 2.31107 3.29688 2.65625 3.29688Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M4.71094 3.29688C5.05612 3.29688 5.33594 3.01705 5.33594 2.67188C5.33594 2.3267 5.05612 2.04688 4.71094 2.04688C4.36576 2.04688 4.08594 2.3267 4.08594 2.67188C4.08594 3.01705 4.36576 3.29688 4.71094 3.29688Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M5.96094 4.99219C6.30612 4.99219 6.58594 4.71237 6.58594 4.36719C6.58594 4.02201 6.30612 3.74219 5.96094 3.74219C5.61576 3.74219 5.33594 4.02201 5.33594 4.36719C5.33594 4.71237 5.61576 4.99219 5.96094 4.99219Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M4.71094 6.42188C5.05612 6.42188 5.33594 6.14205 5.33594 5.79688C5.33594 5.4517 5.05612 5.17188 4.71094 5.17188C4.36576 5.17188 4.08594 5.4517 4.08594 5.79688C4.08594 6.14205 4.36576 6.42188 4.71094 6.42188Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M5.60156 8.29688C5.94674 8.29688 6.22656 8.01705 6.22656 7.67188C6.22656 7.3267 5.94674 7.04688 5.60156 7.04688C5.25638 7.04688 4.97656 7.3267 4.97656 7.67188C4.97656 8.01705 5.25638 8.29688 5.60156 8.29688Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2.65625 5.79687C3.00143 5.79687 3.28125 5.51705 3.28125 5.17187C3.28125 4.8267 3.00143 4.54688 2.65625 4.54688C2.31107 4.54688 2.03125 4.8267 2.03125 5.17187C2.03125 5.51705 2.31107 5.79687 2.65625 5.79687Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2.65625 8.29688C3.00143 8.29688 3.28125 8.01705 3.28125 7.67188C3.28125 7.3267 3.00143 7.04688 2.65625 7.04688C2.31107 7.04688 2.03125 7.3267 2.03125 7.67188C2.03125 8.01705 2.31107 8.29688 2.65625 8.29688Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M11.7802 11.8195C11.838 11.8195 11.8906 11.8527 11.9155 11.9048L12.7174 13.5811C12.8088 13.7721 13.0017 13.8938 13.2135 13.8938H13.3394C13.7483 13.8938 14.0142 13.4635 13.8314 13.0978L13.1619 11.7589C13.1232 11.6816 13.1582 11.5823 13.241 11.5349C13.7565 11.2397 14.0695 10.6686 14.0695 10.0039C14.0695 9.43362 13.8777 8.97007 13.5248 8.64952C13.1725 8.32951 12.6652 8.15704 12.043 8.15704H10.496C10.1923 8.15704 9.94604 8.40328 9.94604 8.70704V13.3438C9.94604 13.6475 10.1923 13.8938 10.496 13.8938H10.6015C10.9053 13.8938 11.1516 13.6475 11.1516 13.3438V11.9695C11.1516 11.8867 11.2187 11.8195 11.3016 11.8195H11.7802ZM11.1516 9.31329C11.1516 9.23045 11.2187 9.16329 11.3016 9.16329H11.8984C12.2023 9.16329 12.4371 9.24491 12.5954 9.38815C12.7529 9.53081 12.8406 9.73994 12.8406 10.0078C12.8406 10.2816 12.751 10.4946 12.5909 10.6397C12.4302 10.7854 12.1925 10.868 11.8867 10.868H11.3016C11.2187 10.868 11.1516 10.8008 11.1516 10.718V9.31329Z", isFill = true, isStroke = true, strokeWidth = 0.25f))
            return _replace!!
        }

    private var _replaceAll: ImageVector? = null
    val ReplaceAll: ImageVector
        get() {
            if (_replaceAll != null) return _replaceAll!!
            _replaceAll = create("ReplaceAll", PathDef("M4.94725 6.87672L4.94725 6.87672L5.74909 8.553C5.86125 8.78748 6.09809 8.93673 6.35802 8.93673H6.48391C6.98569 8.93673 7.31204 8.40867 7.08765 7.95986L6.97585 8.01576L7.08765 7.95986L6.41818 6.62094C6.41818 6.62093 6.41818 6.62093 6.41818 6.62093C6.41567 6.6159 6.414 6.60731 6.41826 6.59524C6.42256 6.58306 6.43223 6.57013 6.44764 6.56131L6.38553 6.45283L6.44764 6.56131C7.00658 6.24123 7.33902 5.62588 7.33902 4.92189C7.33902 4.32236 7.13648 3.82296 6.75336 3.47496L6.66932 3.56749L6.75336 3.47496C6.37232 3.12885 5.83204 2.95001 5.18746 2.95001H3.64058C3.26779 2.95001 2.96558 3.25222 2.96558 3.62501V8.26173C2.96558 8.63453 3.26779 8.93673 3.64058 8.93673H3.74605C4.11884 8.93673 4.42105 8.63453 4.42105 8.26173V6.88751C4.42105 6.87371 4.43224 6.86251 4.44605 6.86251H4.92471C4.93433 6.86251 4.9431 6.86804 4.94725 6.87672ZM5.65595 4.39879L5.65595 4.3988C5.78276 4.51357 5.86012 4.68648 5.86012 4.92579C5.86012 5.17095 5.78081 5.34783 5.65146 5.46508L5.65146 5.46508C5.51987 5.58438 5.31538 5.66095 5.03121 5.66095H4.44605C4.43224 5.66095 4.42105 5.64976 4.42105 5.63595V4.23126C4.42105 4.21746 4.43224 4.20626 4.44605 4.20626H5.04293C5.32535 4.20626 5.52689 4.28197 5.65595 4.39879Z", isFill = true, isStroke = true, strokeWidth = 0.25f), PathDef("M10.3281 7.65625V10.3281M10.3281 10.3281V13M10.3281 10.3281H13M10.3281 10.3281H7.65625M10.3281 10.3281L12.1094 8.54688M10.3281 10.3281L8.54688 12.1094M10.3281 10.3281L12.1094 12.1094M10.3281 10.3281L8.54688 8.54688", isFill = false, isStroke = true, strokeWidth = 1.25f))
            return _replaceAll!!
        }

    private var _replaceNext: ImageVector? = null
    val ReplaceNext: ImageVector
        get() {
            if (_replaceNext != null) return _replaceNext!!
            _replaceNext = create("ReplaceNext", PathDef("M8.5 6.88672C10.433 6.88672 12 8.45372 12 10.3867V13M12 13L14 11M12 13L10 11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4.94725 6.87672L4.94725 6.87672L5.74909 8.553C5.86125 8.78748 6.09809 8.93673 6.35802 8.93673H6.48391C6.98569 8.93673 7.31204 8.40867 7.08765 7.95986L6.97585 8.01576L7.08765 7.95986L6.41818 6.62094C6.41818 6.62093 6.41818 6.62093 6.41818 6.62093C6.41567 6.6159 6.414 6.60731 6.41826 6.59524C6.42256 6.58306 6.43223 6.57013 6.44764 6.56131L6.38553 6.45283L6.44764 6.56131C7.00658 6.24123 7.33902 5.62588 7.33902 4.92189C7.33902 4.32236 7.13648 3.82296 6.75336 3.47496L6.66932 3.56749L6.75336 3.47496C6.37232 3.12885 5.83204 2.95001 5.18746 2.95001H3.64058C3.26779 2.95001 2.96558 3.25222 2.96558 3.62501V8.26173C2.96558 8.63453 3.26779 8.93673 3.64058 8.93673H3.74605C4.11884 8.93673 4.42105 8.63453 4.42105 8.26173V6.88751C4.42105 6.87371 4.43224 6.86251 4.44605 6.86251H4.92471C4.93433 6.86251 4.9431 6.86804 4.94725 6.87672ZM5.65595 4.39879L5.65595 4.3988C5.78276 4.51357 5.86012 4.68648 5.86012 4.92579C5.86012 5.17095 5.78081 5.34783 5.65146 5.46508L5.65146 5.46508C5.51987 5.58438 5.31538 5.66095 5.03121 5.66095H4.44605C4.43224 5.66095 4.42105 5.64976 4.42105 5.63595V4.23126C4.42105 4.21746 4.43224 4.20626 4.44605 4.20626H5.04293C5.32535 4.20626 5.52689 4.28197 5.65595 4.39879Z", isFill = true, isStroke = true, strokeWidth = 0.25f))
            return _replaceNext!!
        }

    private var _replyArrowRight: ImageVector? = null
    val ReplyArrowRight: ImageVector
        get() {
            if (_replyArrowRight != null) return _replyArrowRight!!
            _replyArrowRight = create("ReplyArrowRight", PathDef("M2.668 11.332V10.535C2.668 9.415 2.668 8.852 2.887 8.425C3.078 8.051 3.383 7.742 3.757 7.551C4.187 7.332 4.747 7.332 5.867 7.332H13.336M10.668 10L13.336 7.332L10.668 4.668", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _replyArrowRight!!
        }

    private var _rerun: ImageVector? = null
    val Rerun: ImageVector
        get() {
            if (_rerun != null) return _rerun!!
            _rerun = create("Rerun", PathDef("M2 8a6 6 0 0 1 6-6 6.5 6.5 0 0 1 4.493 1.827L14 5.333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14 2v3.333h-3.333M14 8a6 6 0 0 1-6 6 6.5 6.5 0 0 1-4.493-1.827L2 10.667", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.333 10.667H2V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.667 6.247c0-.257.279-.418.501-.288l3.005 1.753c.22.129.22.447 0 .576L7.168 10.04a.333.333 0 0 1-.501-.288V6.247Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _rerun!!
        }

    private var _return: ImageVector? = null
    val Return: ImageVector
        get() {
            if (_return != null) return _return!!
            _return = create("Return", PathDef("M6.00008 6.66669L2.66675 10L6.00008 13.3334", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.3334 2.66669V7.33335C13.3334 8.0406 13.0525 8.71888 12.5524 9.21897C12.0523 9.71907 11.374 10 10.6667 10H2.66675", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _return!!
        }

    private var _rotateCcw: ImageVector? = null
    val RotateCcw: ImageVector
        get() {
            if (_rotateCcw != null) return _rotateCcw!!
            _rotateCcw = create("RotateCcw", PathDef("m3 5.778 1.256-1.256A5.417 5.417 0 0 1 8 3a5 5 0 1 1-4.583 7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 3v3h3", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _rotateCcw!!
        }

    private var _rotateCw: ImageVector? = null
    val RotateCw: ImageVector
        get() {
            if (_rotateCw != null) return _rotateCw!!
            _rotateCw = create("RotateCw", PathDef("m13 5.778-1.256-1.256A5.416 5.416 0 0 0 8 3a5 5 0 1 0 4.583 7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13 3v3h-3", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _rotateCw!!
        }

    private var _save: ImageVector? = null
    val Save: ImageVector
        get() {
            if (_save != null) return _save!!
            _save = create("Save", PathDef("M 12.667 14 H 3.333 a 1.333 1.333 0 0 1 -1.333 -1.333 V 3.333 a 1.333 1.333 0 0 1 1.333 -1.333 h 7.334 l 3.333 3.333 v 7.334 a 1.333 1.333 0 0 1 -1.333 1.333 Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 11.333 14 V 8.667 H 4.667 V 14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 4.667 2 V 5.333 H 10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _save!!
        }

    private var _scissors: ImageVector? = null
    val Scissors: ImageVector
        get() {
            if (_scissors != null) return _scissors!!
            _scissors = create("Scissors", PathDef("M6.03641 5.53641L8.33797 7.83797M13.0825 3.0934L6.03641 10.1395M9.99896 9.49896L13.0825 12.5825M4.77932 6.05864C5.25123 6.05864 5.7038 5.87118 6.03749 5.53749C6.37118 5.2038 6.55864 4.75123 6.55864 4.27932C6.55864 3.80742 6.37118 3.35484 6.03749 3.02115C5.7038 2.68746 5.25123 2.5 4.77932 2.5C4.30742 2.5 3.85484 2.68746 3.52115 3.02115C3.18746 3.35484 3 3.80742 3 4.27932C3 4.75123 3.18746 5.2038 3.52115 5.53749C3.85484 5.87118 4.30742 6.05864 4.77932 6.05864ZM4.77932 13.1759C5.25123 13.1759 5.7038 12.9885 6.03749 12.6548C6.37118 12.3211 6.55864 11.8685 6.55864 11.3966C6.55864 10.9247 6.37118 10.4721 6.03749 10.1384C5.7038 9.80475 5.25123 9.61729 4.77932 9.61729C4.30742 9.61729 3.85484 9.80475 3.52115 10.1384C3.18746 10.4721 3 10.9247 3 11.3966C3 11.8685 3.18746 12.3211 3.52115 12.6548C3.85484 12.9885 4.30742 13.1759 4.77932 13.1759Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _scissors!!
        }

    private var _screen: ImageVector? = null
    val Screen: ImageVector
        get() {
            if (_screen != null) return _screen!!
            _screen = create("Screen", PathDef("M12.8 3H3.2C2.53726 3 2 3.51167 2 4.14286V9.85714C2 10.4883 2.53726 11 3.2 11H12.8C13.4627 11 14 10.4883 14 9.85714V4.14286C14 3.51167 13.4627 3 12.8 3Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.33325 14H10.6666", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 11.3333V14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _screen!!
        }

    private var _selectAll: ImageVector? = null
    val SelectAll: ImageVector
        get() {
            if (_selectAll != null) return _selectAll!!
            _selectAll = create("SelectAll", PathDef("M10.857 8v2.857m0 0v2.857m0-2.857h2.857m-2.857 0H8m2.857 0 1.905-1.905m-1.905 1.905-1.905 1.905m1.905-1.905 1.905 1.905m-1.905-1.905L8.952 8.952", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.507 4.4c-.002.473.154.856.472 1.14.313.279.737.482 1.268.611l.678.17a3.6 3.6 0 0 1 .566.18.89.89 0 0 1 .337.228.462.462 0 0 1 .111.315.568.568 0 0 1-.124.363.834.834 0 0 1-.362.253 1.521 1.521 0 0 1-.56.093c-.221 0-.418-.033-.59-.099a.94.94 0 0 1-.405-.295.826.826 0 0 1-.145-.33c-.025-.116-.122-.215-.25-.215h-.916a.231.231 0 0 0-.234.249c.034.375.141.698.325.968.216.312.515.547.895.705.381.158.827.235 1.335.235.512 0 .953-.076 1.32-.232.37-.158.655-.38.852-.668.2-.29.3-.632.302-1.023a1.712 1.712 0 0 0-.148-.715 1.612 1.612 0 0 0-.4-.541 2.33 2.33 0 0 0-.604-.384 4.002 4.002 0 0 0-.759-.246l-.559-.134a3.236 3.236 0 0 1-.376-.108 1.584 1.584 0 0 1-.305-.149.673.673 0 0 1-.199-.198.456.456 0 0 1-.06-.26v-.002c0-.122.034-.23.103-.325a.71.71 0 0 1 .316-.227c.14-.057.313-.087.523-.087.309 0 .546.066.717.193a.687.687 0 0 1 .262.378c.03.109.126.204.251.204h.91c.133 0 .246-.11.232-.248a1.759 1.759 0 0 0-.297-.82 1.971 1.971 0 0 0-.832-.68l-.024.052M2.507 4.4c-.002-.388.101-.729.312-1.021.21-.291.5-.517.865-.679a3.03 3.03 0 0 1 1.24-.242c.468 0 .88.08 1.233.242l-.024.052m-.66 4.962a.89.89 0 0 0 .387-.27l-.386.27Zm.387-.27a.625.625 0 0 0 .137-.399l-.137.399Zm.137-.399a.518.518 0 0 0-.125-.352l.125.352Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2.507 4.4c-.002.473.154.856.472 1.14.313.279.737.482 1.268.611l.678.17a3.6 3.6 0 0 1 .566.18.89.89 0 0 1 .337.228.462.462 0 0 1 .111.315.568.568 0 0 1-.124.363.834.834 0 0 1-.362.253 1.521 1.521 0 0 1-.56.093c-.221 0-.418-.033-.59-.099a.94.94 0 0 1-.405-.295.826.826 0 0 1-.145-.33c-.025-.116-.122-.215-.25-.215h-.916a.231.231 0 0 0-.234.249c.034.375.141.698.325.968.216.312.515.547.895.705.381.158.827.235 1.335.235.512 0 .953-.076 1.32-.232.37-.158.655-.38.852-.668.2-.29.3-.632.302-1.023a1.712 1.712 0 0 0-.148-.715 1.612 1.612 0 0 0-.4-.541 2.33 2.33 0 0 0-.604-.384 4.002 4.002 0 0 0-.759-.246l-.559-.134a3.236 3.236 0 0 1-.376-.108 1.584 1.584 0 0 1-.305-.149.673.673 0 0 1-.199-.198.456.456 0 0 1-.06-.26v-.002c0-.122.034-.23.103-.325a.71.71 0 0 1 .316-.227c.14-.057.313-.087.523-.087.309 0 .546.066.717.193a.687.687 0 0 1 .262.378c.03.109.126.204.251.204h.91c.133 0 .246-.11.232-.248a1.759 1.759 0 0 0-.297-.82 1.971 1.971 0 0 0-.832-.68m-3.65 1.7c-.002-.388.101-.729.312-1.021.21-.291.5-.517.865-.679a3.03 3.03 0 0 1 1.24-.242c.468 0 .88.08 1.233.242m-3.65 1.7h.057m3.593-1.7-.024.052m0 0c-.344-.158-.748-.237-1.21-.237-.454 0-.86.08-1.216.237a2.03 2.03 0 0 0-.842.66m3.268-.66c.347.159.617.378.81.66.159.234.255.498.286.794a.17.17 0 0 1-.175.185h-.91c-.094 0-.17-.072-.196-.162a.744.744 0 0 0-.283-.41c-.184-.135-.435-.203-.75-.203m.559 4.098a1.577 1.577 0 0 1-.581.098c-.227 0-.43-.035-.611-.104a.997.997 0 0 1-.429-.313m1.62.32a.89.89 0 0 0 .387-.271m-.386.27.386-.27m0 0a.625.625 0 0 0 .137-.399m-.137.399.137-.399m0 0a.518.518 0 0 0-.125-.352l.125.352Z", isFill = false, isStroke = true, strokeWidth = 0.114f))
            return _selectAll!!
        }

    private var _send: ImageVector? = null
    val Send: ImageVector
        get() {
            if (_send != null) return _send!!
            _send = create("Send", PathDef("M3.377 3.028a.25.25 0 0 0-.292.045.291.291 0 0 0-.067.303l1.496 4.236c.088.25.088.526 0 .776l-1.496 4.236a.291.291 0 0 0 .067.303.25.25 0 0 0 .292.045l9.472-4.72a.267.267 0 0 0 .11-.103.288.288 0 0 0-.11-.4L3.377 3.028ZM5 8h8", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _send!!
        }

    private var _server: ImageVector? = null
    val Server: ImageVector
        get() {
            if (_server != null) return _server!!
            _server = create("Server", PathDef("M12.8 9H3.2C2.53726 9 2 9.44772 2 10V12C2 12.5523 2.53726 13 3.2 13H12.8C13.4627 13 14 12.5523 14 12V10C14 9.44772 13.4627 9 12.8 9Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.8 3H3.2C2.53726 3 2 3.44772 2 4V6C2 6.55228 2.53726 7 3.2 7H12.8C13.4627 7 14 6.55228 14 6V4C14 3.44772 13.4627 3 12.8 3Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4 11H4.00667", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4 5H4.00667", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _server!!
        }

    private var _settings: ImageVector? = null
    val Settings: ImageVector
        get() {
            if (_settings != null) return _settings!!
            _settings = create("Settings", PathDef("M8.13418 2H7.86581C7.54229 2 7.23202 2.12643 7.00326 2.35148C6.7745 2.57652 6.64597 2.88174 6.64597 3.2V3.308C6.64576 3.51843 6.58929 3.72512 6.48224 3.9073C6.37518 4.08949 6.22132 4.24078 6.03605 4.346L5.77379 4.496C5.58836 4.60132 5.378 4.65677 5.16387 4.65677C4.94974 4.65677 4.73939 4.60132 4.55395 4.496L4.46246 4.44799C4.18255 4.28915 3.85 4.24606 3.53783 4.32819C3.22565 4.4103 2.95935 4.61092 2.79738 4.886L2.6632 5.11399C2.50174 5.38936 2.45793 5.7165 2.5414 6.02359C2.62488 6.33069 2.82881 6.59266 3.10844 6.75199L3.19993 6.81199C3.38429 6.9167 3.53759 7.06704 3.64459 7.24809C3.75159 7.42914 3.80857 7.63457 3.80985 7.84399V8.14999C3.8107 8.36144 3.75475 8.56937 3.64764 8.7527C3.54054 8.93602 3.38609 9.08826 3.19993 9.19399L3.10844 9.24799C2.82881 9.40732 2.62488 9.66929 2.5414 9.97638C2.45793 10.2835 2.50174 10.6106 2.6632 10.886L2.79738 11.114C2.95935 11.3891 3.22565 11.5897 3.53783 11.6718C3.85 11.7539 4.18255 11.7109 4.46246 11.552L4.55395 11.5039C4.73939 11.3986 4.94974 11.3432 5.16387 11.3432C5.378 11.3432 5.58836 11.3986 5.77379 11.5039L6.03605 11.654C6.22132 11.7592 6.37518 11.9105 6.48224 12.0927C6.58929 12.2749 6.64576 12.4815 6.64597 12.6919V12.7999C6.64597 13.1183 6.7745 13.4235 7.00326 13.6486C7.23202 13.8735 7.54229 14 7.86581 14H8.13418C8.4577 14 8.76797 13.8735 8.99674 13.6486C9.22551 13.4235 9.35402 13.1183 9.35402 12.7999V12.6919C9.35424 12.4815 9.4107 12.2749 9.51776 12.0927C9.62481 11.9105 9.77869 11.7592 9.96397 11.654L10.2262 11.5039C10.4116 11.3986 10.622 11.3432 10.8361 11.3432C11.0503 11.3432 11.2606 11.3986 11.4461 11.5039L11.5376 11.552C11.8174 11.7109 12.15 11.7539 12.4621 11.6718C12.7744 11.5897 13.0406 11.3891 13.2026 11.114L13.3368 10.88C13.4982 10.6047 13.5421 10.2775 13.4586 9.97035C13.3751 9.66329 13.1712 9.40131 12.8916 9.24199L12.8001 9.19399C12.6139 9.08826 12.4595 8.93602 12.3524 8.7527C12.2452 8.56937 12.1893 8.36144 12.1901 8.14999V7.84999C12.1893 7.63854 12.2452 7.43062 12.3524 7.24729C12.4595 7.06396 12.6139 6.91172 12.8001 6.80599L12.8916 6.75199C13.1712 6.59266 13.3751 6.33069 13.4586 6.02359C13.5421 5.7165 13.4982 5.38936 13.3368 5.11399L13.2026 4.886C13.0406 4.61092 12.7744 4.4103 12.4621 4.32819C12.15 4.24606 11.8174 4.28915 11.5376 4.44799L11.4461 4.496C11.2606 4.60132 11.0503 4.65677 10.8361 4.65677C10.622 4.65677 10.4116 4.60132 10.2262 4.496L9.96397 4.346C9.77869 4.24078 9.62481 4.08949 9.51776 3.9073C9.4107 3.72512 9.35424 3.51843 9.35402 3.308V3.2C9.35402 2.88174 9.22551 2.57652 8.99674 2.35148C8.76797 2.12643 8.4577 2 8.13418 2Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 10C9.10457 10 10 9.10457 10 8C10 6.89543 9.10457 6 8 6C6.89543 6 6 6.89543 6 8C6 9.10457 6.89543 10 8 10Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _settings!!
        }

    private var _share: ImageVector? = null
    val Share: ImageVector
        get() {
            if (_share != null) return _share!!
            _share = create("Share", PathDef("M7.99689 2.05652L7.99929 9.98113", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11.1699 5.22637L8 2.05652L4.83014 5.22637", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.24521 8V12.2653C3.24521 12.7104 3.37045 13.1372 3.59337 13.4519C3.8163 13.7667 4.11865 13.9435 4.43391 13.9435H11.5661C11.8813 13.9435 12.1837 13.7667 12.4066 13.4519C12.6295 13.1372 12.7548 12.7104 12.7548 12.2653V8", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _share!!
        }

    private var _shift: ImageVector? = null
    val Shift: ImageVector
        get() {
            if (_shift != null) return _shift!!
            _shift = create("Shift", PathDef("M3.07136 7.95724L7.86916 3.05405C7.93967 2.98199 8.06036 2.98198 8.13087 3.05405L12.9286 7.95724C13.0866 8.11865 12.9652 8.38015 12.7324 8.38015H10.226V12.748C10.226 12.8872 10.1065 13 9.95892 13H6.04111C5.89358 13 5.77399 12.8872 5.77399 12.748V8.38015H3.26765C3.03479 8.38015 2.91342 8.11865 3.07136 7.95724Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _shift!!
        }

    private var _signalHigh: ImageVector? = null
    val SignalHigh: ImageVector
        get() {
            if (_signalHigh != null) return _signalHigh!!
            _signalHigh = create("SignalHigh", PathDef("M12.5 3V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.5 6V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.5 9V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.5 12V14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _signalHigh!!
        }

    private var _signalLow: ImageVector? = null
    val SignalLow: ImageVector
        get() {
            if (_signalLow != null) return _signalLow!!
            _signalLow = create("SignalLow", PathDef("M12.5 3V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.5 6V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.5 9V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.5 12V14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _signalLow!!
        }

    private var _signalMedium: ImageVector? = null
    val SignalMedium: ImageVector
        get() {
            if (_signalMedium != null) return _signalMedium!!
            _signalMedium = create("SignalMedium", PathDef("M12.5 3V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.5 6V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.5 9V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.5 12V14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _signalMedium!!
        }

    private var _slash: ImageVector? = null
    val Slash: ImageVector
        get() {
            if (_slash != null) return _slash!!
            _slash = create("Slash", PathDef("M12.9999 2.99988L2.99976 13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _slash!!
        }

    private var _sourcehut: ImageVector? = null
    val Sourcehut: ImageVector
        get() {
            if (_sourcehut != null) return _sourcehut!!
            _sourcehut = create("Sourcehut", PathDef("M8 2C4.68548 2 2 4.68548 2 8C2 11.3145 4.68548 14 8 14C11.3145 14 14 11.3145 14 8C14 4.68548 11.3145 2 8 2ZM8 12.8387C5.32661 12.8387 3.16129 10.6734 3.16129 8C3.16129 5.32661 5.32661 3.16129 8 3.16129C10.6734 3.16129 12.8387 5.32661 12.8387 8C12.8387 10.6734 10.6734 12.8387 8 12.8387Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _sourcehut!!
        }

    private var _space: ImageVector? = null
    val Space: ImageVector
        get() {
            if (_space != null) return _space!!
            _space = create("Space", PathDef("M13.9999 11.4V12C13.9999 12.3 13.6999 12.6 13.3999 12.6H2.59976C2.29976 12.6 1.99976 12.3 1.99976 12V11.4", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _space!!
        }

    private var _sparkle: ImageVector? = null
    val Sparkle: ImageVector
        get() {
            if (_sparkle != null) return _sparkle!!
            _sparkle = create("Sparkle", PathDef("M6.762 10.1a1.2 1.2 0 0 0-.862-.862l-3.68-.95a.3.3 0 0 1 0-.577l3.68-.95a1.2 1.2 0 0 0 .862-.86l.95-3.682a.3.3 0 0 1 .577 0L9.238 5.9a1.2 1.2 0 0 0 .862.862l3.68.949a.3.3 0 0 1 0 .578l-3.68.949a1.2 1.2 0 0 0-.862.862l-.95 3.68a.3.3 0 0 1-.577 0l-.949-3.68Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _sparkle!!
        }

    private var _split: ImageVector? = null
    val Split: ImageVector
        get() {
            if (_split != null) return _split!!
            _split = create("Split", PathDef("M13.4 2H2.6C2.26863 2 2 2.26863 2 2.6V13.4C2 13.7314 2.26863 14 2.6 14H13.4C13.7314 14 14 13.7314 14 13.4V2.6C14 2.26863 13.7314 2 13.4 2Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 2V14", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _split!!
        }

    private var _splitAlt: ImageVector? = null
    val SplitAlt: ImageVector
        get() {
            if (_splitAlt != null) return _splitAlt!!
            _splitAlt = create("SplitAlt", PathDef("M10 2.833h3v3M6 2.833H3v3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 13.833V9.028a2.401 2.401 0 0 0-.165-.9 2.325 2.325 0 0 0-.486-.763L3 2.833M10 5.833l3-3", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _splitAlt!!
        }

    private var _squareDot: ImageVector? = null
    val SquareDot: ImageVector
        get() {
            if (_squareDot != null) return _squareDot!!
            _squareDot = create("SquareDot", PathDef("M11.8889 3H4.11111C3.49746 3 3 3.49746 3 4.11111V11.8889C3 12.5025 3.49746 13 4.11111 13H11.8889C12.5025 13 13 12.5025 13 11.8889V4.11111C13 3.49746 12.5025 3 11.8889 3Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 9C8.55228 9 9 8.55228 9 8C9 7.44772 8.55228 7 8 7C7.44772 7 7 7.44772 7 8C7 8.55228 7.44772 9 8 9Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _squareDot!!
        }

    private var _squareMinus: ImageVector? = null
    val SquareMinus: ImageVector
        get() {
            if (_squareMinus != null) return _squareMinus!!
            _squareMinus = create("SquareMinus", PathDef("M11.8889 3H4.11111C3.49746 3 3 3.49746 3 4.11111V11.8889C3 12.5025 3.49746 13 4.11111 13H11.8889C12.5025 13 13 12.5025 13 11.8889V4.11111C13 3.49746 12.5025 3 11.8889 3Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 8H10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _squareMinus!!
        }

    private var _squarePlus: ImageVector? = null
    val SquarePlus: ImageVector
        get() {
            if (_squarePlus != null) return _squarePlus!!
            _squarePlus = create("SquarePlus", PathDef("M11.8889 3H4.11111C3.49746 3 3 3.49746 3 4.11111V11.8889C3 12.5025 3.49746 13 4.11111 13H11.8889C12.5025 13 13 12.5025 13 11.8889V4.11111C13 3.49746 12.5025 3 11.8889 3Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6 8H10", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 6V10", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _squarePlus!!
        }

    private var _squareR: ImageVector? = null
    val SquareR: ImageVector
        get() {
            if (_squareR != null) return _squareR!!
            _squareR = create("SquareR", PathDef("M4.5 2H11.5C12.8807 2 14 3.11929 14 4.5V11.5C14 12.8807 12.8807 14 11.5 14H4.5C3.11929 14 2 12.8807 2 11.5V4.5C2 3.11929 3.11929 2 4.5 2Z", isFill = false, isStroke = true, strokeWidth = 0.75f), PathDef("M5.88477 12.3281C5.33398 12.3281 5 11.9883 5 11.4082V4.66992C5 4.08984 5.32812 3.75 5.88477 3.75H8.46289C10.4082 3.75 11.5215 4.77539 11.5215 6.44531C11.5215 7.5 11 8.40234 10.0684 8.80078L11.2871 10.9102C11.4336 11.1621 11.4746 11.3145 11.4746 11.5195C11.4746 11.9883 11.0996 12.3281 10.584 12.3281C10.1621 12.3281 9.96875 12.1758 9.68164 11.6602L8.27539 9.11133H6.76953V11.4082C6.76953 11.9883 6.44141 12.3281 5.88477 12.3281ZM6.76953 7.82812H8.29297C9.18359 7.82812 9.70508 7.31836 9.70508 6.48047C9.70508 5.66016 9.1543 5.13281 8.27539 5.13281H6.76953V7.82812Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _squareR!!
        }

    private var _star: ImageVector? = null
    val Star: ImageVector
        get() {
            if (_star != null) return _star!!
            _star = create("Star", PathDef("M7.68323 1.53C7.71245 1.47097 7.75758 1.42129 7.81353 1.38655C7.86949 1.35181 7.93404 1.3334 7.9999 1.3334C8.06576 1.3334 8.13031 1.35181 8.18626 1.38655C8.24222 1.42129 8.28735 1.47097 8.31656 1.53L9.85656 4.64933C9.95802 4.85465 10.1078 5.03227 10.293 5.16697C10.4782 5.30167 10.6933 5.38941 10.9199 5.42267L14.3639 5.92667C14.4292 5.93612 14.4905 5.96365 14.5409 6.00613C14.5913 6.04862 14.6289 6.10437 14.6492 6.16707C14.6696 6.22978 14.6721 6.29694 14.6563 6.36096C14.6405 6.42498 14.6071 6.4833 14.5599 6.52933L12.0692 8.95467C11.905 9.11473 11.7821 9.31232 11.7111 9.53042C11.6402 9.74852 11.6233 9.98059 11.6619 10.2067L12.2499 13.6333C12.2614 13.6986 12.2544 13.7657 12.2296 13.8271C12.2048 13.8885 12.1632 13.9417 12.1096 13.9807C12.056 14.0196 11.9926 14.0427 11.9265 14.0473C11.8604 14.0519 11.7944 14.0378 11.7359 14.0067L8.65723 12.388C8.45438 12.2815 8.22868 12.2258 7.99956 12.2258C7.77044 12.2258 7.54475 12.2815 7.3419 12.388L4.2639 14.0067C4.20545 14.0376 4.1395 14.0515 4.07353 14.0468C4.00757 14.0421 3.94424 14.019 3.89076 13.9801C3.83728 13.9413 3.79579 13.8881 3.771 13.8268C3.74622 13.7655 3.73914 13.6985 3.75056 13.6333L4.3379 10.2073C4.3767 9.98116 4.35989 9.74893 4.28892 9.5307C4.21796 9.31246 4.09497 9.11477 3.93056 8.95467L1.4399 6.53C1.39229 6.48402 1.35856 6.4256 1.34254 6.36138C1.32652 6.29717 1.32886 6.22975 1.34928 6.16679C1.36971 6.10384 1.40741 6.04789 1.45808 6.00532C1.50876 5.96275 1.57037 5.93527 1.6359 5.926L5.07923 5.42267C5.30607 5.38967 5.52149 5.30204 5.70695 5.16733C5.89242 5.03261 6.04237 4.85485 6.1439 4.64933L7.68323 1.53Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _star!!
        }

    private var _starFilled: ImageVector? = null
    val StarFilled: ImageVector
        get() {
            if (_starFilled != null) return _starFilled!!
            _starFilled = create("StarFilled", PathDef("M7.68323 1.53C7.71245 1.47097 7.75758 1.42129 7.81353 1.38655C7.86949 1.35181 7.93404 1.3334 7.9999 1.3334C8.06576 1.3334 8.13031 1.35181 8.18626 1.38655C8.24222 1.42129 8.28735 1.47097 8.31656 1.53L9.85656 4.64933C9.95802 4.85465 10.1078 5.03227 10.293 5.16697C10.4782 5.30167 10.6933 5.38941 10.9199 5.42267L14.3639 5.92667C14.4292 5.93612 14.4905 5.96365 14.5409 6.00613C14.5913 6.04862 14.6289 6.10437 14.6492 6.16707C14.6696 6.22978 14.6721 6.29694 14.6563 6.36096C14.6405 6.42498 14.6071 6.4833 14.5599 6.52933L12.0692 8.95467C11.905 9.11473 11.7821 9.31233 11.7111 9.53043C11.6402 9.74853 11.6233 9.9806 11.6619 10.2067L12.2499 13.6333C12.2614 13.6986 12.2544 13.7657 12.2296 13.8271C12.2048 13.8885 12.1632 13.9417 12.1096 13.9807C12.056 14.0196 11.9926 14.0427 11.9265 14.0473C11.8604 14.0519 11.7944 14.0378 11.7359 14.0067L8.65723 12.388C8.45438 12.2815 8.22868 12.2258 7.99956 12.2258C7.77044 12.2258 7.54475 12.2815 7.3419 12.388L4.2639 14.0067C4.20545 14.0376 4.1395 14.0515 4.07353 14.0468C4.00757 14.0421 3.94424 14.019 3.89076 13.9801C3.83728 13.9413 3.79579 13.8881 3.771 13.8268C3.74622 13.7655 3.73914 13.6985 3.75056 13.6333L4.3379 10.2073C4.3767 9.98116 4.35989 9.74893 4.28892 9.5307C4.21796 9.31246 4.09497 9.11477 3.93056 8.95467L1.4399 6.53C1.39229 6.48402 1.35856 6.4256 1.34254 6.36138C1.32652 6.29717 1.32886 6.22975 1.34928 6.16679C1.36971 6.10384 1.40741 6.04789 1.45808 6.00532C1.50876 5.96275 1.57037 5.93527 1.6359 5.926L5.07923 5.42267C5.30607 5.38967 5.52149 5.30204 5.70695 5.16733C5.89242 5.03261 6.04237 4.85485 6.1439 4.64933L7.68323 1.53Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _starFilled!!
        }

    private var _stop: ImageVector? = null
    val Stop: ImageVector
        get() {
            if (_stop != null) return _stop!!
            _stop = create("Stop", PathDef("M4.5 11.2667V4.73333C4.5 4.60446 4.60446 4.5 4.73333 4.5H11.2667C11.3956 4.5 11.5 4.60446 11.5 4.73333V11.2667C11.5 11.3956 11.3956 11.5 11.2667 11.5H4.73333C4.60446 11.5 4.5 11.3956 4.5 11.2667Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _stop!!
        }

    private var _tab: ImageVector? = null
    val Tab: ImageVector
        get() {
            if (_tab != null) return _tab!!
            _tab = create("Tab", PathDef("M10.3333 8H2", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.33325 12L10.3333 8L6.33325 4", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13 3.33331V12.6666", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _tab!!
        }

    private var _table: ImageVector? = null
    val Table: ImageVector
        get() {
            if (_table != null) return _table!!
            _table = create("Table", PathDef("M 3.500 2.000 h 9.000 a 1.500 1.500 0 0 1 1.500 1.500 v 9.000 a 1.500 1.500 0 0 1 -1.500 1.500 h -9.000 a 1.500 1.500 0 0 1 -1.500 -1.500 v -9.000 a 1.500 1.500 0 0 1 1.500 -1.500 Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 3.500 2.000 h 9.000 a 1.500 1.500 0 0 1 1.500 1.500 v 1.000 a 1.500 1.500 0 0 1 -1.500 1.500 h -9.000 a 1.500 1.500 0 0 1 -1.500 -1.500 v -1.000 a 1.500 1.500 0 0 1 1.500 -1.500 Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 2.000 6.000 L 14.000 6.000", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 6.000 6.000 L 6.000 14.000", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 10.000 6.000 L 10.000 14.000", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 2.000 10.000 L 14.000 10.000", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _table!!
        }

    private var _terminal: ImageVector? = null
    val Terminal: ImageVector
        get() {
            if (_terminal != null) return _terminal!!
            _terminal = create("Terminal", PathDef("M2.5 4C2.5 3.17157 3.17157 2.5 4 2.5H12C12.8284 2.5 13.5 3.17157 13.5 4V12C13.5 12.8284 12.8284 13.5 12 13.5H4C3.17157 13.5 2.5 12.8284 2.5 12V4ZM4.66789 10.7071L5.02145 10.3536L4.66789 10.7071C5.05842 11.0976 5.69158 11.0976 6.08211 10.7071L8.08211 8.70711C8.47263 8.31658 8.47263 7.68342 8.08211 7.29289L6.08211 5.29289C5.69158 4.90237 5.05842 4.90237 4.66789 5.29289C4.27737 5.68342 4.27737 6.31658 4.66789 6.70711L5.96079 8L4.66789 9.29289C4.27737 9.68342 4.27737 10.3166 4.66789 10.7071ZM8.625 9C8.07271 9 7.625 9.44771 7.625 10C7.625 10.5523 8.07271 11 8.625 11H10.9062C11.4585 11 11.9062 10.5523 11.9062 10C11.9062 9.44771 11.4585 9 10.9062 9H8.625Z", isFill = true, isStroke = true, strokeWidth = 1.2f))
            return _terminal!!
        }

    private var _terminalAlt: ImageVector? = null
    val TerminalAlt: ImageVector
        get() {
            if (_terminalAlt != null) return _terminalAlt!!
            _terminalAlt = create("TerminalAlt", PathDef("M12.2782 2.49951H3.72184C3.04677 2.49951 2.49951 3.04677 2.49951 3.72184V12.2782C2.49951 12.9532 3.04677 13.5005 3.72184 13.5005H12.2782C12.9532 13.5005 13.5005 12.9532 13.5005 12.2782V3.72184C13.5005 3.04677 12.9532 2.49951 12.2782 2.49951Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 10.7502H10.7502", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.24976 9.21777L7.08325 7.38428L5.24976 5.55078", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _terminalAlt!!
        }

    private var _textSnippet: ImageVector? = null
    val TextSnippet: ImageVector
        get() {
            if (_textSnippet != null) return _textSnippet!!
            _textSnippet = create("TextSnippet", PathDef("M3.333 2A1.333 1.333 0 0 0 2 3.333M12.667 2A1.334 1.334 0 0 1 14 3.333M14 12.667A1.334 1.334 0 0 1 12.667 14M3.333 14A1.334 1.334 0 0 1 2 12.667M6 2h.667M6 14h.667M9.333 2H10M9.333 14H10M2 6v.667M14 6v.667M2 9.333V10M14 9.333V10M4.667 5.333H10M4.667 8h6.666M4.667 10.667h4", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _textSnippet!!
        }

    private var _textUnwrap: ImageVector? = null
    val TextUnwrap: ImageVector
        get() {
            if (_textUnwrap != null) return _textUnwrap!!
            _textUnwrap = create("TextUnwrap", PathDef("M11.748 5.74794L14 7.99998L11.748 10.252", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14 7.99997L3 7.99997", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 3L8 6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 10L8 13", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _textUnwrap!!
        }

    private var _textWrap: ImageVector? = null
    val TextWrap: ImageVector
        get() {
            if (_textWrap != null) return _textWrap!!
            _textWrap = create("TextWrap", PathDef("M5.19924 8.90081L2.9472 6.64876L5.19924 4.39673", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M2.9472 6.64877H7.67649C8.00178 6.64877 8.32391 6.71285 8.6245 6.83734C8.92501 6.96184 9.19813 7.14431 9.42817 7.37434C9.6582 7.60437 9.84067 7.87746 9.96512 8.17802C10.0897 8.47856 10.1537 8.8007 10.1537 9.12601C10.1537 9.45131 10.0897 9.77345 9.96512 10.074C9.84067 10.3745 9.6582 10.6477 9.42817 10.8777C9.19813 11.1077 8.92501 11.2902 8.6245 11.4147C8.32391 11.5392 8.00178 11.6033 7.67649 11.6033H6.10005", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13.0528 3.33331V12.6666", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _textWrap!!
        }

    private var _thinkingMode: ImageVector? = null
    val ThinkingMode: ImageVector
        get() {
            if (_thinkingMode != null) return _thinkingMode!!
            _thinkingMode = create("ThinkingMode", PathDef("M9.95263 10.2625C10.0833 9.62316 9.95263 9.60567 10.9316 8.47947C11.5008 7.82462 11.9105 7.07307 11.9105 6.242C11.9105 5.22472 11.4979 4.24911 10.7637 3.52978C10.0294 2.81046 9.03341 2.40635 7.99495 2.40635C6.95647 2.40635 5.96054 2.81046 5.22622 3.52978C4.49192 4.24911 4.07938 5.22472 4.07938 6.242C4.07938 6.88128 4.2099 7.64842 5.05828 8.47947C6.03717 9.62442 5.90669 9.62316 6.03721 10.2625M9.95263 10.2625V12.3893C9.95263 13.0544 9.40226 13.5937 8.72322 13.5937H7.26668C6.58764 13.5937 6.03717 13.0544 6.03717 12.3893L6.03721 10.2625M9.95263 10.2625H7.99495H6.03721", isFill = false, isStroke = true, strokeWidth = 1.25f), PathDef("M12.3337 9.57205C13.1747 8.60454 13.78 7.49416 13.78 6.2663C13.78 4.76332 13.1704 3.3219 12.0857 2.25913C11.0008 1.19638 9.52923 0.599314 7.99494 0.599314C6.46065 0.599314 4.98921 1.19638 3.90429 2.25913C2.81939 3.3219 2.20988 4.76332 2.20988 6.2663C2.20988 7.21081 2.40273 8.34422 3.65616 9.57205", isFill = false, isStroke = true, strokeWidth = 1.25f), PathDef("M13.6508 10.7862C14.7471 9.52502 15.5363 8.07755 15.5363 6.47692C15.5363 4.51766 14.7416 2.63864 13.3276 1.25323C11.9133 -0.132159 9.99501 -0.910484 7.99494 -0.910484C5.99485 -0.910484 4.07671 -0.132159 2.66243 1.25323C1.24817 2.63864 0.453617 4.51766 0.453617 6.47692C0.453617 7.70816 0.705009 9.18567 2.33896 10.7862", isFill = false, isStroke = true, strokeWidth = 1.25f), PathDef("M9.95263 10.2625C10.0833 9.62316 9.95263 9.60567 10.9316 8.47947C11.5008 7.82462 11.9105 7.07307 11.9105 6.242C11.9105 5.22472 11.4979 4.24911 10.7637 3.52978C10.0294 2.81046 9.03341 2.40635 7.99495 2.40635C6.95647 2.40635 5.96054 2.81046 5.22622 3.52978C4.49192 4.24911 4.07938 5.22472 4.07938 6.242C4.07938 6.88128 4.2099 7.64842 5.05828 8.47947C6.03717 9.62442 5.90669 9.62316 6.03721 10.2625M9.95263 10.2625H7.99495H6.03721", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M 0.000 0.000 h 16.000 v 16.000 h -16.000 Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _thinkingMode!!
        }

    private var _thinkingModeOff: ImageVector? = null
    val ThinkingModeOff: ImageVector
        get() {
            if (_thinkingModeOff != null) return _thinkingModeOff!!
            _thinkingModeOff = create("ThinkingModeOff", PathDef("M6.03722 10.2625C5.9067 9.62317 6.03718 9.62443 5.05829 8.47948C4.73761 8.16534 4.51949 7.86034 4.37222 7.56793M6.03722 10.2625L6.03718 12.3893C6.03718 13.0544 6.58765 13.5937 7.2667 13.5937H8.72323C9.40228 13.5937 9.95264 13.0544 9.95264 12.3893V12.0283M6.03722 10.2625H7.5", isFill = false, isStroke = true, strokeWidth = 1.25f), PathDef("M6 2.9415C6.59896 2.59412 7.28707 2.40634 7.99495 2.40634C9.03341 2.40634 10.0294 2.81046 10.7637 3.52978C11.4979 4.2491 11.9105 5.22472 11.9105 6.242C11.9105 6.87697 11.6713 7.46553 11.3046 8", isFill = false, isStroke = true, strokeWidth = 1.25f), PathDef("M1.5015 2.54385L14.4985 13.4561", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _thinkingModeOff!!
        }

    private var _thisWindow: ImageVector? = null
    val ThisWindow: ImageVector
        get() {
            if (_thisWindow != null) return _thisWindow!!
            _thisWindow = create("ThisWindow", PathDef("M14.5468 7.40531L14.5468 3.93294C14.5468 3.5674 14.4016 3.21682 14.1431 2.95835C13.8846 2.69987 13.5341 2.55466 13.1685 2.55466H2.83141C2.46586 2.55466 2.11529 2.69987 1.85681 2.95835C1.59834 3.21682 1.45313 3.5674 1.45312 3.93294V10.8243C1.45312 11.5824 2.07335 12.2026 2.83141 12.2026H7.17117", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.423 9.8227L12.423 14.0673", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.2993 12.4589L12.423 14.5826L14.5468 12.4589", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _thisWindow!!
        }

    private var _thread: ImageVector? = null
    val Thread: ImageVector
        get() {
            if (_thread != null) return _thread!!
            _thread = create("Thread", PathDef("M5.97658 12.549C7.04814 13.0987 8.2808 13.2476 9.45243 12.9688C10.624 12.6901 11.6576 12.0021 12.3668 11.0287C13.076 10.0554 13.4143 8.8607 13.3206 7.66002C13.2269 6.45934 12.7075 5.33159 11.8559 4.48C11.0043 3.62841 9.87664 3.10898 8.67592 3.01531C7.47524 2.92164 6.28059 3.2599 5.30723 3.96912C4.33388 4.67834 3.64584 5.71188 3.3671 6.88351C3.08836 8.05514 3.23724 9.2878 3.78693 10.3594L2.66404 13.6719L5.97658 12.549Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _thread!!
        }

    private var _threadFromSummary: ImageVector? = null
    val ThreadFromSummary: ImageVector
        get() {
            if (_threadFromSummary != null) return _threadFromSummary!!
            _threadFromSummary = create("ThreadFromSummary", PathDef("M8.98795 10.4323C9.40771 10.9919 9.99294 11.4054 10.6607 11.614C11.3285 11.8226 12.045 11.8158 12.7087 11.5945C13.3724 11.3733 13.9497 10.9488 14.3588 10.3813C14.7678 9.81373 14.9879 9.13186 14.9879 8.43225C14.9879 7.6366 14.6719 6.87354 14.1093 6.31093C13.5467 5.74832 12.7836 5.43225 11.9879 5.43225C11.6685 5.43225 11.3595 5.47897 11.0677 5.56586C10.0571 5.86681 9.46945 6.84992 8.98796 7.78806V7.78806", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.01318 5.93652V8.60319H10.6799", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.01318 5.93652V8.60319H10.6799", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.00558 12.4263C6.16246 12.4494 5.3211 12.2612 4.56083 11.8712L1.24829 12.994L2.37119 9.68151C1.8215 8.60995 1.67261 7.37729 1.95135 6.20566C2.23009 5.03403 2.91813 4.00048 3.89148 3.29126C4.86484 2.58204 6.05949 2.24379 7.26018 2.33746C7.86645 2.38475 8.45413 2.54061 8.99705 2.79296", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _threadFromSummary!!
        }

    private var _threadsSidebarLeftClosed: ImageVector? = null
    val ThreadsSidebarLeftClosed: ImageVector
        get() {
            if (_threadsSidebarLeftClosed != null) return _threadsSidebarLeftClosed!!
            _threadsSidebarLeftClosed = create("ThreadsSidebarLeftClosed", PathDef("M7 2V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 3.500 2.000 h 9.000 a 1.500 1.500 0 0 1 1.500 1.500 v 9.000 a 1.500 1.500 0 0 1 -1.500 1.500 h -9.000 a 1.500 1.500 0 0 1 -1.500 -1.500 v -9.000 a 1.500 1.500 0 0 1 1.500 -1.500 Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _threadsSidebarLeftClosed!!
        }

    private var _threadsSidebarLeftOpen: ImageVector? = null
    val ThreadsSidebarLeftOpen: ImageVector
        get() {
            if (_threadsSidebarLeftOpen != null) return _threadsSidebarLeftOpen!!
            _threadsSidebarLeftOpen = create("ThreadsSidebarLeftOpen", PathDef("M 2.000 0.000 h 1.000 a 2.000 2.000 0 0 1 2.000 2.000 v 8.000 a 2.000 2.000 0 0 1 -2.000 2.000 h -1.000 a 2.000 2.000 0 0 1 -2.000 -2.000 v -8.000 a 2.000 2.000 0 0 1 2.000 -2.000 Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M7 2V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 3.500 2.000 h 9.000 a 1.500 1.500 0 0 1 1.500 1.500 v 9.000 a 1.500 1.500 0 0 1 -1.500 1.500 h -9.000 a 1.500 1.500 0 0 1 -1.500 -1.500 v -9.000 a 1.500 1.500 0 0 1 1.500 -1.500 Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _threadsSidebarLeftOpen!!
        }

    private var _threadsSidebarRightClosed: ImageVector? = null
    val ThreadsSidebarRightClosed: ImageVector
        get() {
            if (_threadsSidebarRightClosed != null) return _threadsSidebarRightClosed!!
            _threadsSidebarRightClosed = create("ThreadsSidebarRightClosed", PathDef("M9 2V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 3.500 2.000 h 9.000 a 1.500 1.500 0 0 1 1.500 1.500 v 9.000 a 1.500 1.500 0 0 1 -1.500 1.500 h -9.000 a 1.500 1.500 0 0 1 -1.500 -1.500 v -9.000 a 1.500 1.500 0 0 1 1.500 -1.500 Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _threadsSidebarRightClosed!!
        }

    private var _threadsSidebarRightOpen: ImageVector? = null
    val ThreadsSidebarRightOpen: ImageVector
        get() {
            if (_threadsSidebarRightOpen != null) return _threadsSidebarRightOpen!!
            _threadsSidebarRightOpen = create("ThreadsSidebarRightOpen", PathDef("M 2.000 0.000 h 1.000 a 2.000 2.000 0 0 1 2.000 2.000 v 8.000 a 2.000 2.000 0 0 1 -2.000 2.000 h -1.000 a 2.000 2.000 0 0 1 -2.000 -2.000 v -8.000 a 2.000 2.000 0 0 1 2.000 -2.000 Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M9 2V14", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M 3.500 2.000 h 9.000 a 1.500 1.500 0 0 1 1.500 1.500 v 9.000 a 1.500 1.500 0 0 1 -1.500 1.500 h -9.000 a 1.500 1.500 0 0 1 -1.500 -1.500 v -9.000 a 1.500 1.500 0 0 1 1.500 -1.500 Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _threadsSidebarRightOpen!!
        }

    private var _thumbsDown: ImageVector? = null
    val ThumbsDown: ImageVector
        get() {
            if (_thumbsDown != null) return _thumbsDown!!
            _thumbsDown = create("ThumbsDown", PathDef("M3.013 8.57h2.478V3.2H3.013a.413.413 0 0 0-.413.413v4.544a.413.413 0 0 0 .413.413ZM5.491 8.57l2.066 4.13a1.652 1.652 0 0 0 1.652-1.652v-1.24h3.304a.826.826 0 0 0 .82-.929l-.62-4.956a.827.827 0 0 0-.82-.723H5.492", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M0 0h16v16H0z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _thumbsDown!!
        }

    private var _thumbsUp: ImageVector? = null
    val ThumbsUp: ImageVector
        get() {
            if (_thumbsUp != null) return _thumbsUp!!
            _thumbsUp = create("ThumbsUp", PathDef("M3.013 7.33h2.478v5.37H3.013a.413.413 0 0 1-.413-.413V7.743a.413.413 0 0 1 .413-.413ZM5.491 7.33 7.557 3.2a1.652 1.652 0 0 1 1.652 1.652v1.24h3.304a.826.826 0 0 1 .82.929l-.62 4.956a.827.827 0 0 1-.82.723H5.492", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M0 0h16v16H0z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _thumbsUp!!
        }

    private var _todoComplete: ImageVector? = null
    val TodoComplete: ImageVector
        get() {
            if (_todoComplete != null) return _todoComplete!!
            _todoComplete = create("TodoComplete", PathDef("M8 13A5 5 0 1 0 8 3a5 5 0 0 0 0 10Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("m5.949 9.026 1.538 1.025 2.564-3.59", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _todoComplete!!
        }

    private var _todoPending: ImageVector? = null
    val TodoPending: ImageVector
        get() {
            if (_todoPending != null) return _todoPending!!
            _todoPending = create("TodoPending", PathDef("M7 3C7.66045 3 8.33955 3 9 3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11 4C11.3949 4.26602 11.7345 4.60558 12 5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13 7C13 7.66045 13 8.33955 13 9", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12 11C11.734 11.3949 11.3944 11.7345 11 12", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 13C8.33954 13 7.66046 13 7 13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5 12C4.6051 11.734 4.26554 11.3944 4 11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 9C3 8.33955 3 7.66045 3 7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4 5C4.26602 4.6051 4.60558 4.26554 5 4", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _todoPending!!
        }

    private var _todoProgress: ImageVector? = null
    val TodoProgress: ImageVector
        get() {
            if (_todoProgress != null) return _todoProgress!!
            _todoProgress = create("TodoProgress", PathDef("M7 3C7.66045 3 8.33955 3 9 3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M11 4C11.3949 4.26602 11.7345 4.60558 12 5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M13 7C13 7.66045 13 8.33955 13 9", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12 11C11.734 11.3949 11.3944 11.7345 11 12", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 13C8.33954 13 7.66046 13 7 13", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5 12C4.6051 11.734 4.26554 11.3944 4 11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 9C3 8.33955 3 7.66045 3 7", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M4 5C4.26602 4.6051 4.60558 4.26554 5 4", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.00016 8.66665C8.36835 8.66665 8.66683 8.36817 8.66683 7.99998C8.66683 7.63179 8.36835 7.33331 8.00016 7.33331C7.63197 7.33331 7.3335 7.63179 7.3335 7.99998C7.3335 8.36817 7.63197 8.66665 8.00016 8.66665Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _todoProgress!!
        }

    private var _toolCopy: ImageVector? = null
    val ToolCopy: ImageVector
        get() {
            if (_toolCopy != null) return _toolCopy!!
            _toolCopy = create("ToolCopy", PathDef("M9.5 2.5H6.5C6.22386 2.5 6 2.83579 6 3.25V4.75C6 5.16421 6.22386 5.5 6.5 5.5H9.5C9.77614 5.5 10 5.16421 10 4.75V3.25C10 2.83579 9.77614 2.5 9.5 2.5Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 3.5H11C11.2652 3.5 11.5196 3.61706 11.7071 3.82544C11.8946 4.03381 12 4.31643 12 4.61111V12.3889C12 12.6836 11.8946 12.9662 11.7071 13.1746C11.5196 13.3829 11.2652 13.5 11 13.5H5C4.73478 13.5 4.48043 13.3829 4.29289 13.1746C4.10536 12.9662 4 12.6836 4 12.3889V4.61111C4 4.31643 4.10536 4.03381 4.29289 3.82544C4.48043 3.61706 4.73478 3.5 5 3.5H6", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolCopy!!
        }

    private var _toolDeleteFile: ImageVector? = null
    val ToolDeleteFile: ImageVector
        get() {
            if (_toolDeleteFile != null) return _toolDeleteFile!!
            _toolDeleteFile = create("ToolDeleteFile", PathDef("M9.50002 2.5H5C4.73478 2.5 4.48043 2.6159 4.29289 2.82219C4.10535 3.02848 4 3.30826 4 3.6V12.3999C4 12.6917 4.10535 12.9715 4.29289 13.1778C4.48043 13.3841 4.73478 13.5 5 13.5H11C11.2652 13.5 11.5195 13.3841 11.7071 13.1778C11.8946 12.9715 12 12.6917 12 12.3999V5.25L9.50002 2.5Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.3427 6.82379L6.65698 9.5095", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.65698 6.82379L9.3427 9.5095", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolDeleteFile!!
        }

    private var _toolDiagnostics: ImageVector? = null
    val ToolDiagnostics: ImageVector
        get() {
            if (_toolDiagnostics != null) return _toolDiagnostics!!
            _toolDiagnostics = create("ToolDiagnostics", PathDef("M13.7244 11.5299L9.01711 3.2922C8.91447 3.11109 8.76562 2.96045 8.58576 2.85564C8.4059 2.75084 8.20145 2.69562 7.99328 2.69562C7.7851 2.69562 7.58066 2.75084 7.40079 2.85564C7.22093 2.96045 7.07209 3.11109 6.96945 3.2922L2.26218 11.5299C2.15844 11.7096 2.10404 11.9135 2.1045 12.121C2.10495 12.3285 2.16026 12.5321 2.2648 12.7113C2.36934 12.8905 2.5194 13.0389 2.69978 13.1415C2.88015 13.244 3.08443 13.297 3.2919 13.2951H12.7064C12.9129 13.2949 13.1157 13.2404 13.2944 13.137C13.4731 13.0336 13.6215 12.8851 13.7247 12.7062C13.8278 12.5273 13.8821 12.3245 13.882 12.118C13.882 11.9115 13.8276 11.7087 13.7244 11.5299Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.99927 6.23425V8.58788", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.99927 10.9415H8.00492", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolDiagnostics!!
        }

    private var _toolHammer: ImageVector? = null
    val ToolHammer: ImageVector
        get() {
            if (_toolHammer != null) return _toolHammer!!
            _toolHammer = create("ToolHammer", PathDef("M9 8.5L4.94864 12.6222C4.71647 12.8544 4.40157 12.9848 4.07323 12.9848C3.74488 12.9848 3.42999 12.8544 3.19781 12.6222C2.96564 12.39 2.83521 12.0751 2.83521 11.7468C2.83521 11.4185 2.96564 11.1036 3.19781 10.8714L7.5 6.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10.8352 9.98474L13.8352 6.98474", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.8352 7.42495L11.7634 6.4298C11.5533 6.23484 11.4353 5.97039 11.4352 5.69462V5.08526L10.1696 3.91022C9.54495 3.33059 8.69961 3.00261 7.81649 2.99722L5.83521 2.98474L6.35041 3.41108C6.71634 3.71233 7.00935 4.08216 7.21013 4.4962C7.4109 4.91024 7.51488 5.35909 7.51521 5.81316L7.5 6.5L9 8.5L9.5 8C9.5 8 9.87337 7.79457 10.0834 7.98959L11.1552 8.98474", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolHammer!!
        }

    private var _toolNotification: ImageVector? = null
    val ToolNotification: ImageVector
        get() {
            if (_toolNotification != null) return _toolNotification!!
            _toolNotification = create("ToolNotification", PathDef("M6.5 12C6.65203 12.304 6.87068 12.5565 7.13399 12.7321C7.39729 12.9076 7.69597 13 8 13C8.30403 13 8.60271 12.9076 8.86601 12.7321C9.12932 12.5565 9.34797 12.304 9.5 12", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.63088 9.21874C3.56556 9.28556 3.52246 9.36865 3.50681 9.45791C3.49116 9.54718 3.50364 9.63876 3.54273 9.72152C3.58183 9.80429 3.64585 9.87467 3.72701 9.92409C3.80817 9.97352 3.90298 9.99987 3.99989 9.99994H12.0001C12.097 9.99997 12.1918 9.97372 12.273 9.92439C12.3542 9.87505 12.4183 9.80476 12.4575 9.72205C12.4967 9.63934 12.5093 9.54778 12.4938 9.45851C12.4783 9.36924 12.4353 9.2861 12.3701 9.21921C11.705 8.57941 11 7.89947 11 5.79994C11 5.05733 10.684 4.34514 10.1213 3.82004C9.55872 3.29494 8.79564 2.99994 7.99997 2.99994C7.20431 2.99994 6.44123 3.29494 5.87861 3.82004C5.31599 4.34514 4.99991 5.05733 4.99991 5.79994C4.99991 7.89947 4.2944 8.57941 3.63088 9.21874Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolNotification!!
        }

    private var _toolPencil: ImageVector? = null
    val ToolPencil: ImageVector
        get() {
            if (_toolPencil != null) return _toolPencil!!
            _toolPencil = create("ToolPencil", PathDef("M12.5871 5.40582C12.8514 5.14152 13 4.78304 13 4.40922C13 4.03541 12.8516 3.67688 12.5873 3.41252C12.323 3.14816 11.9645 2.99962 11.5907 2.99957C11.2169 2.99953 10.8584 3.14798 10.594 3.41227L3.92098 10.0869C3.80488 10.2027 3.71903 10.3452 3.67097 10.5019L3.01047 12.678C2.99754 12.7212 2.99657 12.7672 3.00764 12.8109C3.01872 12.8547 3.04143 12.8946 3.07337 12.9265C3.1053 12.9584 3.14528 12.981 3.18905 12.992C3.23282 13.003 3.27875 13.002 3.32197 12.989L5.49849 12.329C5.65508 12.2813 5.79758 12.196 5.91349 12.0805L12.5871 5.40582Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9 5L11 7", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolPencil!!
        }

    private var _toolSearch: ImageVector? = null
    val ToolSearch: ImageVector
        get() {
            if (_toolSearch != null) return _toolSearch!!
            _toolSearch = create("ToolSearch", PathDef("M13 13L11 11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.5 12C9.98528 12 12 9.98528 12 7.5C12 5.01472 9.98528 3 7.5 3C5.01472 3 3 5.01472 3 7.5C3 9.98528 5.01472 12 7.5 12Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolSearch!!
        }

    private var _toolTerminal: ImageVector? = null
    val ToolTerminal: ImageVector
        get() {
            if (_toolTerminal != null) return _toolTerminal!!
            _toolTerminal = create("ToolTerminal", PathDef("M12.2782 2.49951H3.72184C3.04677 2.49951 2.49951 3.04677 2.49951 3.72184V12.2782C2.49951 12.9532 3.04677 13.5005 3.72184 13.5005H12.2782C12.9532 13.5005 13.5005 12.9532 13.5005 12.2782V3.72184C13.5005 3.04677 12.9532 2.49951 12.2782 2.49951Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 10.7502H10.7502", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M5.24976 9.21777L7.08325 7.38428L5.24976 5.55078", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolTerminal!!
        }

    private var _toolThink: ImageVector? = null
    val ToolThink: ImageVector
        get() {
            if (_toolThink != null) return _toolThink!!
            _toolThink = create("ToolThink", PathDef("M9.9526 10.2625C10.0833 9.62316 9.9526 9.60566 10.9315 8.47946C11.5008 7.82461 11.9105 7.07306 11.9105 6.242C11.9105 5.22472 11.4979 4.2491 10.7637 3.52978C10.0294 2.81046 9.03338 2.40634 7.99491 2.40634C6.95644 2.40634 5.96051 2.81046 5.22619 3.52978C4.49189 4.2491 4.07935 5.22472 4.07935 6.242C4.07935 6.88128 4.20987 7.64842 5.05825 8.47946C6.03714 9.62442 5.90666 9.62316 6.03718 10.2625M9.9526 10.2625V12.3893C9.9526 13.0544 9.40223 13.5937 8.72319 13.5937H7.26665C6.58761 13.5937 6.03714 13.0544 6.03714 12.3893L6.03718 10.2625M9.9526 10.2625H7.99491H6.03718", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolThink!!
        }

    private var _toolWeb: ImageVector? = null
    val ToolWeb: ImageVector
        get() {
            if (_toolWeb != null) return _toolWeb!!
            _toolWeb = create("ToolWeb", PathDef("M7.99993 13.4804C11.0267 13.4804 13.4803 11.0267 13.4803 7.99999C13.4803 4.97325 11.0267 2.51959 7.99993 2.51959C4.97319 2.51959 2.51953 4.97325 2.51953 7.99999C2.51953 11.0267 4.97319 13.4804 7.99993 13.4804Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8 3C6.71611 4.34807 6 6.13836 6 7.99999C6 9.86163 6.71611 11.6519 8 13C9.28387 11.6519 10 9.86163 10 7.99999C10 6.13836 9.28387 4.34807 8 3Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3.24121 7.04827C4.52425 8.27022 6.22817 8.95178 7.99999 8.95178C9.77182 8.95178 11.4757 8.27022 12.7588 7.04827", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _toolWeb!!
        }

    private var _trash: ImageVector? = null
    val Trash: ImageVector
        get() {
            if (_trash != null) return _trash!!
            _trash = create("Trash", PathDef("M3 5L13 5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12 5V12.875C12 13.4375 11.4286 14 10.8571 14H5.14286C4.57143 14 4 13.4375 4 12.875V5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 5V3C10 2.44772 9.55228 2 9 2H7C6.44772 2 6 2.44772 6 3V5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _trash!!
        }

    private var _triangle: ImageVector? = null
    val Triangle: ImageVector
        get() {
            if (_triangle != null) return _triangle!!
            _triangle = create("Triangle", PathDef("M7.99996 3L2.82349 12H13.1764L7.99996 3Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _triangle!!
        }

    private var _triangleRight: ImageVector? = null
    val TriangleRight: ImageVector
        get() {
            if (_triangleRight != null) return _triangleRight!!
            _triangleRight = create("TriangleRight", PathDef("M6 11.4667V4L10.8 7.73333L6 11.4667Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _triangleRight!!
        }

    private var _undo: ImageVector? = null
    val Undo: ImageVector
        get() {
            if (_undo != null) return _undo!!
            _undo = create("Undo", PathDef("M6.125 9.25001L3 6.125L6.125 3", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M3 6.125H9.56251C10.0139 6.125 10.4609 6.21391 10.878 6.38666C11.295 6.55942 11.674 6.81262 11.9932 7.13182C12.3124 7.45102 12.5656 7.82997 12.7383 8.24703C12.9111 8.66408 13 9.11108 13 9.5625C13 10.0139 12.9111 10.4609 12.7383 10.878C12.5656 11.295 12.3124 11.674 11.9932 11.9932C11.674 12.3124 11.295 12.5656 10.878 12.7383C10.4609 12.9111 10.0139 13 9.56251 13H7.375", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _undo!!
        }

    private var _unpin: ImageVector? = null
    val Unpin: ImageVector
        get() {
            if (_unpin != null) return _unpin!!
            _unpin = create("Unpin", PathDef("M6.28561 2.25C5.83777 2.25 5.42262 2.44429 5.12712 2.76607C4.8336 3.08568 4.67847 3.50652 4.67847 3.93333C4.67847 4.00474 4.68281 4.07598 4.69142 4.14661L10.0356 6.63864V5.58279C10.3579 5.51401 10.6495 5.3435 10.8728 5.10053C11.1662 4.78092 11.3213 4.36012 11.3213 3.93333C11.3213 3.50655 11.1661 3.08559 10.8726 2.76598C10.5771 2.44432 10.1621 2.25 9.71419 2.25H6.28561Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M1.70131 4.68303C1.87636 4.30763 2.3226 4.14521 2.698 4.32027L13.9361 9.5607C14.3115 9.73575 14.474 10.182 14.2989 10.5574C14.1239 10.9328 13.6776 11.0952 13.3022 10.9202L11.6006 10.1267C11.5536 10.2137 11.4958 10.2957 11.4272 10.3704C11.2121 10.6045 10.9057 10.75 10.5715 10.75H8.75007V13C8.75007 13.4142 8.41428 13.75 8.00007 13.75C7.58585 13.75 7.25007 13.4142 7.25007 13V10.75H5.42864C5.09445 10.75 4.78832 10.6049 4.57321 10.3706C4.36002 10.1385 4.25007 9.83637 4.25007 9.53334V9.17868C4.25021 8.87805 4.32715 8.57932 4.47703 8.31614C4.6266 8.05351 4.84546 7.83234 5.11609 7.68521L5.68873 7.36993L2.06407 5.67973C1.68867 5.50467 1.52625 5.05844 1.70131 4.68303Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _unpin!!
        }

    private var _userArrowUp: ImageVector? = null
    val UserArrowUp: ImageVector
        get() {
            if (_userArrowUp != null) return _userArrowUp!!
            _userArrowUp = create("UserArrowUp", PathDef("M12.0295 14.8008V10.0281", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14.4177 11.8366L12.0297 9.44867L9.64166 11.8366", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M1.66669 12.3688C1.66667 11.445 1.93321 10.5408 2.43433 9.76481C2.93545 8.98877 3.64985 8.37383 4.49181 7.99376C5.33376 7.61369 6.26751 7.48465 7.18099 7.62211C8.09447 7.75958 8.94888 8.15772 9.64169 8.76875", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.61473 7.34036C7.25075 7.49113 6.86064 7.56873 6.46668 7.56873C5.67103 7.56873 4.90796 7.25266 4.34535 6.69005C3.78275 6.12744 3.46667 5.36438 3.46667 4.56873C3.46667 3.77308 3.78275 3.01001 4.34535 2.44741C4.90796 1.8848 5.67103 1.56873 6.46668 1.56873C6.86064 1.56873 7.25075 1.64632 7.61473 1.79709C7.9787 1.94785 8.30942 2.16883 8.58799 2.44741C8.86657 2.72598 9.08755 3.0567 9.23831 3.42068C9.38908 3.78465 9.46667 4.17476 9.46667 4.56873C9.46667 4.96269 9.38908 5.3528 9.23831 5.71678C9.08755 6.08075 8.86657 6.41147 8.58799 6.69005C8.30942 6.96862 7.9787 7.1896 7.61473 7.34036Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _userArrowUp!!
        }

    private var _userCheck: ImageVector? = null
    val UserCheck: ImageVector
        get() {
            if (_userCheck != null) return _userCheck!!
            _userCheck = create("UserCheck", PathDef("M2 13.4a4.8 4.8 0 0 1 7.975-3.6", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.8 8.6a3 3 0 1 0 0-6 3 3 0 0 0 0 6ZM10.4 12.2l1.2 1.2L14 11", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _userCheck!!
        }

    private var _userGroup: ImageVector? = null
    val UserGroup: ImageVector
        get() {
            if (_userGroup != null) return _userGroup!!
            _userGroup = create("UserGroup", PathDef("M6.79118 8.27005C8.27568 8.27005 9.4791 7.06663 9.4791 5.58214C9.4791 4.09765 8.27568 2.89423 6.79118 2.89423C5.30669 2.89423 4.10327 4.09765 4.10327 5.58214C4.10327 7.06663 5.30669 8.27005 6.79118 8.27005Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.79112 8.60443C4.19441 8.60443 2.08936 10.7095 2.08936 13.3062H11.4929C11.4929 10.7095 9.38784 8.60443 6.79112 8.60443Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6.79112 8.60443C4.19441 8.60443 2.08936 10.7095 2.08936 13.3062H11.4929C11.4929 10.7095 9.38784 8.60443 6.79112 8.60443Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14.6984 12.9263C14.6984 10.8893 13.4895 8.99736 12.2806 8.09067C12.6779 7.79254 12.9957 7.40104 13.2057 6.95083C13.4157 6.50062 13.5115 6.00558 13.4846 5.50952C13.4577 5.01346 13.309 4.53168 13.0515 4.10681C12.7941 3.68194 12.4358 3.3271 12.0085 3.07367", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _userGroup!!
        }

    private var _userRoundPen: ImageVector? = null
    val UserRoundPen: ImageVector
        get() {
            if (_userRoundPen != null) return _userRoundPen!!
            _userRoundPen = create("UserRoundPen", PathDef("M2 13.433a4.8 4.8 0 0 1 6.493-4.492M13.627 10.809a1.275 1.275 0 0 0-1.803-1.803l-2.406 2.408a1.2 1.2 0 0 0-.303.512l-.502 1.722a.3.3 0 0 0 .372.372l1.722-.502c.193-.057.37-.161.512-.304l2.408-2.405Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M6.8 8.633a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _userRoundPen!!
        }

    private var _warning: ImageVector? = null
    val Warning: ImageVector
        get() {
            if (_warning != null) return _warning!!
            _warning = create("Warning", PathDef("M13.84 11.6 9.037 3.199a1.2 1.2 0 0 0-2.089 0l-4.802 8.403a1.2 1.2 0 0 0 1.05 1.8h9.604a1.201 1.201 0 0 0 1.038-1.8ZM8 6v2.667M8 11.333h.007", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _warning!!
        }

    private var _wholeWord: ImageVector? = null
    val WholeWord: ImageVector
        get() {
            if (_wholeWord != null) return _wholeWord!!
            _wholeWord = create("WholeWord", PathDef("m5.425 10.842-.773-3.948-.782 3.948H2.487L1.147 4.58H2.6l.617 3.897.764-3.886h1.342l.754 3.88.616-3.89H8.15l-1.341 6.261H5.425ZM9.885 10.656c-.384-.218-.648-.577-.802-1.047-.152-.463-.222-1.104-.222-1.91 0-.798.066-1.431.21-1.885v-.002c.155-.47.419-.826.804-1.037.374-.212.88-.306 1.496-.306.447 0 .816.052 1.082.177.128.059.244.14.35.243V2.32h1.377v8.52h-1.376v-.337a1.545 1.545 0 0 1-.393.271c-.26.125-.601.178-1.007.178-.622 0-1.134-.09-1.514-.293l-.005-.003Zm2.817-1.679c.08-.288.124-.71.124-1.278 0-.56-.044-.975-.124-1.255-.078-.274-.199-.434-.342-.521l-.008-.005c-.146-.097-.385-.161-.748-.161-.395 0-.665.064-.835.167l-.005.003c-.158.09-.287.251-.37.522-.087.277-.135.69-.135 1.25 0 .568.048.984.134 1.262.084.27.214.439.376.536.17.102.44.167.835.167.364 0 .605-.061.752-.153.146-.094.268-.261.346-.534Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2 13h12", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _wholeWord!!
        }

    private var _xCircle: ImageVector? = null
    val XCircle: ImageVector
        get() {
            if (_xCircle != null) return _xCircle!!
            _xCircle = create("XCircle", PathDef("M9.864 3C9.99635 3.00003 10.1233 3.05253 10.217 3.146L12.853 5.782C12.8996 5.82844 12.9365 5.88361 12.9618 5.94435C12.987 6.0051 13 6.07023 13 6.136V9.864C13 9.99635 12.9475 10.1233 12.854 10.217L10.217 12.854C10.1233 12.9475 9.99635 13 9.864 13H6.136C6.0703 13.0001 6.00521 12.9873 5.94447 12.9622C5.88373 12.9372 5.82852 12.9004 5.782 12.854L3.146 10.218C3.0996 10.1715 3.06282 10.1163 3.03777 10.0555C3.01272 9.99479 2.99988 9.92971 3 9.864V6.136C2.99988 6.0703 3.01272 6.00521 3.03777 5.94447C3.06282 5.88373 3.0996 5.82852 3.146 5.782L5.782 3.146C5.82852 3.0996 5.88373 3.06282 5.94447 3.03777C6.00521 3.01272 6.0703 2.99988 6.136 3H9.864Z", isFill = true, isStroke = true, strokeWidth = 1.2f), PathDef("M9.864 3C9.99635 3.00003 10.1233 3.05253 10.217 3.146L12.853 5.782C12.8996 5.82844 12.9365 5.88361 12.9618 5.94435C12.987 6.0051 13 6.07023 13 6.136V9.864C13 9.99635 12.9475 10.1233 12.854 10.217L10.217 12.854C10.1233 12.9475 9.99635 13 9.864 13H6.136C6.0703 13.0001 6.00521 12.9873 5.94447 12.9622C5.88373 12.9372 5.82852 12.9004 5.782 12.854L3.146 10.218C3.0996 10.1715 3.06282 10.1163 3.03777 10.0555C3.01272 9.99479 2.99988 9.92971 3 9.864V6.136C2.99988 6.0703 3.01272 6.00521 3.03777 5.94447C3.06282 5.88373 3.0996 5.82852 3.146 5.782L5.782 3.146C5.82852 3.0996 5.88373 3.06282 5.94447 3.03777C6.00521 3.01272 6.0703 2.99988 6.136 3H9.864Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.5 6.5L6.5 9.5M9.5 9.5L6.5 6.5", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _xCircle!!
        }

    private var _xCircleFilled: ImageVector? = null
    val XCircleFilled: ImageVector
        get() {
            if (_xCircleFilled != null) return _xCircleFilled!!
            _xCircleFilled = create("XCircleFilled", PathDef("M8 2C11.3137 2 14 4.68629 14 8C14 11.3137 11.3137 14 8 14C4.68629 14 2 11.3137 2 8C2 4.68629 4.68629 2 8 2ZM10.4238 5.57617C10.1895 5.34187 9.81049 5.3419 9.57617 5.57617L8 7.15234L6.42383 5.57617C6.18953 5.34187 5.81049 5.3419 5.57617 5.57617C5.34186 5.81049 5.34186 6.18951 5.57617 6.42383L7.15234 8L5.57617 9.57617C5.34186 9.81049 5.34186 10.1895 5.57617 10.4238C5.81049 10.6581 6.18954 10.6581 6.42383 10.4238L8 8.84766L9.57617 10.4238C9.81049 10.6581 10.1895 10.6581 10.4238 10.4238C10.6581 10.1895 10.658 9.81048 10.4238 9.57617L8.84766 8L10.4238 6.42383C10.6581 6.18954 10.658 5.81048 10.4238 5.57617Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _xCircleFilled!!
        }

    private var _zedAgent: ImageVector? = null
    val ZedAgent: ImageVector
        get() {
            if (_zedAgent != null) return _zedAgent!!
            _zedAgent = create("ZedAgent", PathDef("M11 8.75V10.5C8.93097 10.5 8.06903 10.5 6 10.5V10L11 6V5.5H6V7.25", isFill = false, isStroke = true, strokeWidth = 1.5f), PathDef("M2 8.5C2.27614 8.5 2.5 8.27614 2.5 8C2.5 7.72386 2.27614 7.5 2 7.5C1.72386 7.5 1.5 7.72386 1.5 8C1.5 8.27614 1.72386 8.5 2 8.5Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2.99976 6.33002C3.2759 6.33002 3.49976 6.10616 3.49976 5.83002C3.49976 5.55387 3.2759 5.33002 2.99976 5.33002C2.72361 5.33002 2.49976 5.55387 2.49976 5.83002C2.49976 6.10616 2.72361 6.33002 2.99976 6.33002Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2.99976 10.66C3.2759 10.66 3.49976 10.4361 3.49976 10.16C3.49976 9.88383 3.2759 9.65997 2.99976 9.65997C2.72361 9.65997 2.49976 9.88383 2.49976 10.16C2.49976 10.4361 2.72361 10.66 2.99976 10.66Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M15 8.5C15.2761 8.5 15.5 8.27614 15.5 8C15.5 7.72386 15.2761 7.5 15 7.5C14.7239 7.5 14.5 7.72386 14.5 8C14.5 8.27614 14.7239 8.5 15 8.5Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M14 6.33002C14.2761 6.33002 14.5 6.10616 14.5 5.83002C14.5 5.55387 14.2761 5.33002 14 5.33002C13.7239 5.33002 13.5 5.55387 13.5 5.83002C13.5 6.10616 13.7239 6.33002 14 6.33002Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M14 10.66C14.2761 10.66 14.5 10.4361 14.5 10.16C14.5 9.88383 14.2761 9.65997 14 9.65997C13.7239 9.65997 13.5 9.88383 13.5 10.16C13.5 10.4361 13.7239 10.66 14 10.66Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M8.49219 2C8.76833 2 8.99219 1.77614 8.99219 1.5C8.99219 1.22386 8.76833 1 8.49219 1C8.21605 1 7.99219 1.22386 7.99219 1.5C7.99219 1.77614 8.21605 2 8.49219 2Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6 3C6.27614 3 6.5 2.77614 6.5 2.5C6.5 2.22386 6.27614 2 6 2C5.72386 2 5.5 2.22386 5.5 2.5C5.5 2.77614 5.72386 3 6 3Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M4 4C4.27614 4 4.5 3.77614 4.5 3.5C4.5 3.22386 4.27614 3 4 3C3.72386 3 3.5 3.22386 3.5 3.5C3.5 3.77614 3.72386 4 4 4Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M3.99976 13C4.2759 13 4.49976 12.7761 4.49976 12.5C4.49976 12.2239 4.2759 12 3.99976 12C3.72361 12 3.49976 12.2239 3.49976 12.5C3.49976 12.7761 3.72361 13 3.99976 13Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2 12.5C2.27614 12.5 2.5 12.2761 2.5 12C2.5 11.7239 2.27614 11.5 2 11.5C1.72386 11.5 1.5 11.7239 1.5 12C1.5 12.2761 1.72386 12.5 2 12.5Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M2 4.5C2.27614 4.5 2.5 4.27614 2.5 4C2.5 3.72386 2.27614 3.5 2 3.5C1.72386 3.5 1.5 3.72386 1.5 4C1.5 4.27614 1.72386 4.5 2 4.5Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M15 12.5C15.2761 12.5 15.5 12.2761 15.5 12C15.5 11.7239 15.2761 11.5 15 11.5C14.7239 11.5 14.5 11.7239 14.5 12C14.5 12.2761 14.7239 12.5 15 12.5Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M15 4.5C15.2761 4.5 15.5 4.27614 15.5 4C15.5 3.72386 15.2761 3.5 15 3.5C14.7239 3.5 14.5 3.72386 14.5 4C14.5 4.27614 14.7239 4.5 15 4.5Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M3.99976 15C4.2759 15 4.49976 14.7761 4.49976 14.5C4.49976 14.2239 4.2759 14 3.99976 14C3.72361 14 3.49976 14.2239 3.49976 14.5C3.49976 14.7761 3.72361 15 3.99976 15Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M4 2C4.27614 2 4.5 1.77614 4.5 1.5C4.5 1.22386 4.27614 1 4 1C3.72386 1 3.5 1.22386 3.5 1.5C3.5 1.77614 3.72386 2 4 2Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M13 15C13.2761 15 13.5 14.7761 13.5 14.5C13.5 14.2239 13.2761 14 13 14C12.7239 14 12.5 14.2239 12.5 14.5C12.5 14.7761 12.7239 15 13 15Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M13 2C13.2761 2 13.5 1.77614 13.5 1.5C13.5 1.22386 13.2761 1 13 1C12.7239 1 12.5 1.22386 12.5 1.5C12.5 1.77614 12.7239 2 13 2Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M13 4C13.2761 4 13.5 3.77614 13.5 3.5C13.5 3.22386 13.2761 3 13 3C12.7239 3 12.5 3.22386 12.5 3.5C12.5 3.77614 12.7239 4 13 4Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M13 13C13.2761 13 13.5 12.7761 13.5 12.5C13.5 12.2239 13.2761 12 13 12C12.7239 12 12.5 12.2239 12.5 12.5C12.5 12.7761 12.7239 13 13 13Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M11 3C11.2761 3 11.5 2.77614 11.5 2.5C11.5 2.22386 11.2761 2 11 2C10.7239 2 10.5 2.22386 10.5 2.5C10.5 2.77614 10.7239 3 11 3Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M8.5 15C8.77614 15 9 14.7761 9 14.5C9 14.2239 8.77614 14 8.5 14C8.22386 14 8 14.2239 8 14.5C8 14.7761 8.22386 15 8.5 15Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M6 14C6.27614 14 6.5 13.7761 6.5 13.5C6.5 13.2239 6.27614 13 6 13C5.72386 13 5.5 13.2239 5.5 13.5C5.5 13.7761 5.72386 14 6 14Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M11 14C11.2761 14 11.5 13.7761 11.5 13.5C11.5 13.2239 11.2761 13 11 13C10.7239 13 10.5 13.2239 10.5 13.5C10.5 13.7761 10.7239 14 11 14Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _zedAgent!!
        }

    private var _zedAgentTwo: ImageVector? = null
    val ZedAgentTwo: ImageVector
        get() {
            if (_zedAgentTwo != null) return _zedAgentTwo!!
            _zedAgentTwo = create("ZedAgentTwo", PathDef("M6.2224 1.32129L5.2036 4.41875C5.15145 4.57727 5.06282 4.72134 4.94481 4.83934C4.82681 4.95735 4.68274 5.04598 4.52422 5.09813L1.42676 6.11693L4.52422 7.13574C4.68274 7.18788 4.82681 7.27652 4.94481 7.39453C5.06282 7.51253 5.15145 7.6566 5.2036 7.81512L6.2224 10.9126L7.24121 7.81512C7.29335 7.6566 7.38199 7.51253 7.5 7.39453C7.618 7.27652 7.76207 7.18788 7.9206 7.13574L11.018 6.11693L7.9206 5.09813C7.76207 5.04598 7.618 4.95735 7.5 4.83934C7.38199 4.72134 7.29335 4.57727 7.24121 4.41875L6.2224 1.32129Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.76681 13.9373C9.76681 13.6048 9.95997 13.3083 10.5126 12.7917L11.8872 11.4978C12.3545 11.0575 12.5612 10.77 12.5612 10.4735C12.5612 10.1411 12.3185 9.91643 11.9681 9.91643C11.6986 9.91643 11.5054 10.0242 11.2673 10.3208C10.9933 10.6622 10.7956 10.779 10.4946 10.779C10.0633 10.779 9.75781 10.4915 9.75781 10.0916C9.75781 9.21559 10.8136 8.44287 12.067 8.44287C13.3743 8.44287 14.3492 9.22907 14.3492 10.2848C14.3492 10.9452 13.9988 11.5742 13.2845 12.2077L12.2242 13.1511V13.223H13.7292C14.2503 13.223 14.5738 13.5015 14.5738 13.9552C14.5738 14.4089 14.2593 14.6785 13.7292 14.6785H10.5979C10.1037 14.6785 9.76681 14.3775 9.76681 13.9373Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M12.8994 1.32129V4.00482M11.5576 2.66302H14.2412", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _zedAgentTwo!!
        }

    private var _zedAssistant: ImageVector? = null
    val ZedAssistant: ImageVector
        get() {
            if (_zedAssistant != null) return _zedAssistant!!
            _zedAssistant = create("ZedAssistant", PathDef("M8 2.93652L6.9243 6.20697C6.86924 6.37435 6.77565 6.52646 6.65105 6.65105C6.52646 6.77565 6.37435 6.86924 6.20697 6.9243L2.93652 8L6.20697 9.0757C6.37435 9.13076 6.52646 9.22435 6.65105 9.34895C6.77565 9.47354 6.86924 9.62565 6.9243 9.79306L8 13.0635L9.0757 9.79306C9.13076 9.62565 9.22435 9.47354 9.34895 9.34895C9.47354 9.22435 9.62565 9.13076 9.79306 9.0757L13.0635 8L9.79306 6.9243C9.62565 6.86924 9.47354 6.77565 9.34895 6.65105C9.22435 6.52646 9.13076 6.37435 9.0757 6.20697L8 2.93652Z", isFill = true, isStroke = true, strokeWidth = 1.2f), PathDef("M3.33334 2V4.66666M2 3.33334H4.66666", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.6665 11.3333V14M11.3333 12.6666H13.9999", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _zedAssistant!!
        }

    private var _zedPredict: ImageVector? = null
    val ZedPredict: ImageVector
        get() {
            if (_zedPredict != null) return _zedPredict!!
            _zedPredict = create("ZedPredict", PathDef("M12 5L14 8L12 11", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M10 6.5L11 8L10 9.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.5 8.9V11C5.43097 11 4.56903 11 2.5 11V10.4L7.5 5.6V5H2.5V7.1", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _zedPredict!!
        }

    private var _zedPredictDisabled: ImageVector? = null
    val ZedPredictDisabled: ImageVector
        get() {
            if (_zedPredictDisabled != null) return _zedPredictDisabled!!
            _zedPredictDisabled = create("ZedPredictDisabled", PathDef("M6.75 9.31247L8.25 10.5576V11.75H1.75V10.0803L4.49751 7.44273L5.65909 8.40693L3.73923 10.25H6.75V9.31247ZM8.25 5.85739V4.25H6.31358L8.25 5.85739ZM1.75 5.16209V7.1H3.25V6.4072L1.75 5.16209Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M10.9624 9.40853L11.9014 8L10.6241 6.08397L9.37598 6.91603L10.0986 8L9.80184 8.44518L10.9624 9.40853Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M12.8936 11.0116L14.9014 8L12.6241 4.58397L11.376 5.41603L13.0986 8L11.7331 10.0483L12.8936 11.0116Z", isFill = true, isStroke = false, strokeWidth = 1.2f), PathDef("M14.1225 13.809C14.0341 13.9146 13.877 13.9289 13.7711 13.8409L1.19311 3.40021C1.08659 3.31178 1.07221 3.15362 1.16104 3.04743L1.87752 2.19101C1.96588 2.0854 2.123 2.07112 2.22895 2.15906L14.8069 12.5998C14.9134 12.6882 14.9278 12.8464 14.839 12.9526L14.1225 13.809Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _zedPredictDisabled!!
        }

    private var _zedPredictDown: ImageVector? = null
    val ZedPredictDown: ImageVector
        get() {
            if (_zedPredictDown != null) return _zedPredictDown!!
            _zedPredictDown = create("ZedPredictDown", PathDef("M15 9.33333L14.5 9.66667L12.5 11L10.5 9.66667L10 9.33333", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.5 11V4.5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.5 8.9V11C5.43097 11 4.56903 11 2.5 11V10.4L7.5 5.6V5H2.5V7.1", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _zedPredictDown!!
        }

    private var _zedPredictError: ImageVector? = null
    val ZedPredictError: ImageVector
        get() {
            if (_zedPredictError != null) return _zedPredictError!!
            _zedPredictError = create("ZedPredictError", PathDef("M7.5 8.9V11C5.43097 11 4.56903 11 2.5 11V10.4L7.5 5.6V5H2.5V7.1", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M14 8L10 12M14 12L10 8", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _zedPredictError!!
        }

    private var _zedPredictUp: ImageVector? = null
    val ZedPredictUp: ImageVector
        get() {
            if (_zedPredictUp != null) return _zedPredictUp!!
            _zedPredictUp = create("ZedPredictUp", PathDef("M10 6.66667L10.5 6.33333L12.5 5L14.5 6.33333L15 6.66667", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M12.5 11V5", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M7.5 8.9V11C5.43097 11 4.56903 11 2.5 11V10.4L7.5 5.6V5H2.5V7.1", isFill = false, isStroke = true, strokeWidth = 1.2f))
            return _zedPredictUp!!
        }

    private var _zedSrcCustom: ImageVector? = null
    val ZedSrcCustom: ImageVector
        get() {
            if (_zedSrcCustom != null) return _zedSrcCustom!!
            _zedSrcCustom = create("ZedSrcCustom", PathDef("M 4.000 2.000 h 8.000 a 2.000 2.000 0 0 1 2.000 2.000 v 8.000 a 2.000 2.000 0 0 1 -2.000 2.000 h -8.000 a 2.000 2.000 0 0 1 -2.000 -2.000 v -8.000 a 2.000 2.000 0 0 1 2.000 -2.000 Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M8.17871 4.15039C9.57718 4.15047 10.7699 4.84416 11.25 6.00879L11.292 6.125C11.3291 6.2423 11.3496 6.36246 11.3496 6.47656C11.3496 6.67403 11.2827 6.86644 11.1357 7.00879C10.99 7.14999 10.797 7.21191 10.6035 7.21191C10.4311 7.21184 10.263 7.16459 10.1172 7.05469C9.97557 6.94786 9.88031 6.80045 9.81543 6.6416V6.64062C9.54483 5.99474 8.92921 5.62898 8.17871 5.62891C7.58712 5.62891 7.11895 5.85535 6.79297 6.24512C6.46181 6.64107 6.25488 7.2348 6.25488 7.99805C6.25495 8.76969 6.4603 9.36343 6.79004 9.75781C7.11426 10.1456 7.5828 10.3711 8.18359 10.3711C9.00554 10.371 9.57612 10.0476 9.83789 9.44922L9.83984 9.44531C9.90093 9.30959 9.98754 9.17654 10.1211 9.08008C10.2598 8.97992 10.4154 8.94341 10.5693 8.94336C10.9809 8.94336 11.3203 9.24379 11.3203 9.67383C11.3203 9.89213 11.2593 10.0749 11.1641 10.2578L11.1631 10.2568C10.6246 11.2962 9.56725 11.8495 8.17871 11.8496C7.12036 11.8496 6.22667 11.4786 5.60059 10.7891C4.97793 10.1031 4.65047 9.13626 4.65039 7.99805C4.65039 6.86743 4.98182 5.90203 5.60547 5.21582C6.23235 4.52617 7.12584 4.15039 8.17871 4.15039ZM7.67773 11.4678C7.68226 11.4684 7.68688 11.4682 7.69141 11.4688C7.68688 11.4682 7.68226 11.4684 7.67773 11.4678ZM7.35059 11.4082C7.37261 11.4133 7.39471 11.4182 7.41699 11.4229C7.39471 11.4182 7.37261 11.4133 7.35059 11.4082ZM7.07617 11.333C7.08849 11.337 7.10087 11.3408 7.11328 11.3447C7.10087 11.3408 7.08849 11.337 7.07617 11.333ZM6.80469 11.2295C6.81416 11.2336 6.82348 11.2381 6.83301 11.2422C6.82347 11.2381 6.81416 11.2336 6.80469 11.2295ZM6.32812 10.9648C6.33354 10.9686 6.33929 10.9719 6.34473 10.9756C6.33928 10.9719 6.33354 10.9686 6.32812 10.9648ZM6.10156 10.7891C6.11103 10.7972 6.12128 10.8045 6.13086 10.8125C6.12128 10.8045 6.11103 10.7972 6.10156 10.7891ZM10.5449 10.5586V10.5596V10.5586ZM5.90234 10.5986C5.909 10.6056 5.91613 10.6122 5.92285 10.6191C5.91612 10.6122 5.909 10.6056 5.90234 10.5986ZM5.71094 10.374C5.71943 10.3851 5.72769 10.3963 5.73633 10.4072C5.72769 10.3963 5.71944 10.3851 5.71094 10.374ZM5.55469 10.1504C5.55922 10.1576 5.56378 10.1647 5.56836 10.1719C5.56377 10.1647 5.55922 10.1576 5.55469 10.1504ZM10.9131 9.95898C10.9213 9.9374 10.9302 9.91676 10.9365 9.89551C10.9301 9.91674 10.9214 9.93742 10.9131 9.95898ZM10.21 9.49219C10.192 9.52099 10.1752 9.55324 10.1592 9.58887L10.1953 9.51758C10.2002 9.50891 10.2049 9.50031 10.21 9.49219ZM10.499 9.29688C10.4547 9.30262 10.4145 9.31428 10.3779 9.33203C10.4145 9.31437 10.4547 9.30259 10.499 9.29688ZM5.18652 9.33203C5.18988 9.34309 5.19284 9.35425 5.19629 9.36523C5.19284 9.35424 5.18988 9.34309 5.18652 9.33203ZM10.5693 9.29297C10.628 9.29297 10.6829 9.3029 10.7314 9.32129C10.6827 9.30276 10.6281 9.29297 10.5693 9.29297ZM5.10352 9.01172C5.1083 9.03397 5.11306 9.05613 5.11816 9.07812C5.11306 9.05612 5.1083 9.03397 5.10352 9.01172ZM5.01465 8.39062C5.02368 8.51203 5.03633 8.63062 5.05371 8.74609C5.03633 8.63061 5.02368 8.51204 5.01465 8.39062ZM5.01465 7.60742V7.6084V7.60742ZM10.6035 6.86133C10.6321 6.86133 10.6594 6.85865 10.6855 6.85449C10.6596 6.85862 10.632 6.86133 10.6035 6.86133ZM10.7002 6.85059C10.7213 6.84652 10.7415 6.84169 10.7607 6.83496C10.7415 6.8417 10.7213 6.84652 10.7002 6.85059ZM10.7773 6.82812C10.7929 6.82186 10.8081 6.81563 10.8223 6.80762C10.8081 6.81566 10.7929 6.82185 10.7773 6.82812ZM10.8516 6.78809C10.8602 6.782 10.868 6.77535 10.876 6.76855C10.8681 6.77537 10.8602 6.78198 10.8516 6.78809ZM10.8994 6.74707C10.9093 6.73683 10.9173 6.72535 10.9258 6.71387C10.9173 6.72537 10.9092 6.73681 10.8994 6.74707ZM10.9912 6.37305C10.9893 6.3598 10.9861 6.34659 10.9834 6.33301C10.9861 6.34658 10.9892 6.35981 10.9912 6.37305ZM10.9102 6.10645C10.8889 6.05715 10.867 6.00836 10.8428 5.96094C10.867 6.00837 10.8889 6.05714 10.9102 6.10645ZM10.7871 5.86328C10.7743 5.84084 10.7625 5.81787 10.749 5.7959C10.7625 5.81788 10.7743 5.84084 10.7871 5.86328ZM10.6973 5.7168C10.6775 5.68719 10.6578 5.65759 10.6367 5.62891C10.6578 5.65759 10.6775 5.68719 10.6973 5.7168ZM10.584 5.56152C10.563 5.53497 10.5425 5.5081 10.5205 5.48242C10.5425 5.50811 10.563 5.53497 10.584 5.56152ZM10.4492 5.4043C10.4285 5.3821 10.4083 5.35937 10.3867 5.33789C10.4083 5.35938 10.4285 5.38209 10.4492 5.4043ZM7.68457 5.32812H7.68555H7.68457ZM10.3096 5.26562C10.2895 5.24727 10.2697 5.2287 10.249 5.21094C10.2697 5.22871 10.2895 5.24726 10.3096 5.26562ZM10.1553 5.13477C10.1356 5.11933 10.1159 5.10379 10.0957 5.08887C10.1159 5.10379 10.1356 5.11933 10.1553 5.13477ZM10.0078 5.02734C9.9783 5.00732 9.94843 4.98772 9.91797 4.96875C9.94843 4.98773 9.9783 5.00731 10.0078 5.02734ZM9.83887 4.9209C9.81069 4.90462 9.78183 4.88942 9.75293 4.87402C9.78184 4.88943 9.81069 4.90461 9.83887 4.9209ZM9.65039 4.82129C9.62853 4.81074 9.60622 4.80108 9.58398 4.79102C9.60622 4.80108 9.62853 4.81073 9.65039 4.82129ZM9.45703 4.73633C9.43574 4.72785 9.41417 4.71996 9.39258 4.71191C9.41418 4.71996 9.43574 4.72784 9.45703 4.73633ZM9.27441 4.66895C9.23013 4.65444 9.18506 4.64161 9.13965 4.62891C9.18506 4.64161 9.23013 4.65444 9.27441 4.66895ZM9.08008 4.6123C9.03442 4.60046 8.98811 4.59009 8.94141 4.58008C8.98812 4.59009 9.03441 4.60046 9.08008 4.6123ZM8.85547 4.5625C8.83187 4.55807 8.80802 4.55474 8.78418 4.55078C8.80802 4.55474 8.83187 4.55807 8.85547 4.5625ZM10.9404 6.69336C10.9509 6.67671 10.96 6.65941 10.9678 6.64062C10.9601 6.65941 10.9509 6.67671 10.9404 6.69336ZM9.82812 5.99707C9.80503 5.96962 9.78129 5.94293 9.75684 5.91699C9.78129 5.94293 9.80502 5.96962 9.82812 5.99707Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _zedSrcCustom!!
        }

    private var _zedSrcExtension: ImageVector? = null
    val ZedSrcExtension: ImageVector
        get() {
            if (_zedSrcExtension != null) return _zedSrcExtension!!
            _zedSrcExtension = create("ZedSrcExtension", PathDef("M 4.000 2.000 h 8.000 a 2.000 2.000 0 0 1 2.000 2.000 v 8.000 a 2.000 2.000 0 0 1 -2.000 2.000 h -8.000 a 2.000 2.000 0 0 1 -2.000 -2.000 v -8.000 a 2.000 2.000 0 0 1 2.000 -2.000 Z", isFill = false, isStroke = true, strokeWidth = 1.2f), PathDef("M9.62109 4.65039C9.80393 4.65039 9.98678 4.70637 10.1279 4.83203C10.2722 4.96055 10.3496 5.14167 10.3496 5.33691C10.3496 5.53215 10.2723 5.71329 10.1279 5.8418C9.98678 5.96744 9.80392 6.02344 9.62109 6.02344H7.1416V7.24902H9.46289C9.6423 7.24902 9.82303 7.30362 9.96387 7.42773C10.1085 7.55531 10.1875 7.73591 10.1875 7.93164C10.1874 8.12674 10.1072 8.30592 9.96484 8.43262C9.82536 8.55656 9.64499 8.61426 9.46289 8.61426H7.1416V9.97656H9.62109C9.80392 9.97656 9.98678 10.0326 10.1279 10.1582C10.2723 10.2867 10.3496 10.4678 10.3496 10.6631C10.3496 10.8583 10.2722 11.0394 10.1279 11.168C9.98678 11.2936 9.80393 11.3496 9.62109 11.3496H6.39648C6.20308 11.3496 6.00965 11.289 5.86328 11.1465C5.7159 11.0028 5.65039 10.8095 5.65039 10.6133V5.38672C5.65039 5.19054 5.7159 4.99723 5.86328 4.85352C6.00965 4.71101 6.20308 4.65039 6.39648 4.65039H9.62109ZM9.70215 10.9941C9.72618 10.9903 9.74882 10.9838 9.77051 10.9766C9.74884 10.9838 9.72616 10.9903 9.70215 10.9941ZM9.78809 10.9688C9.80381 10.9626 9.81877 10.9561 9.83301 10.9482C9.81877 10.9561 9.80381 10.9626 9.78809 10.9688ZM9.85059 10.9375C9.86364 10.9292 9.87617 10.9209 9.8877 10.9111C9.87616 10.9209 9.86365 10.9293 9.85059 10.9375ZM6.1123 10.8994C6.12346 10.9099 6.1358 10.9188 6.14844 10.9277C6.1358 10.9188 6.12346 10.9099 6.1123 10.8994ZM9.90039 10.8984C9.91122 10.8882 9.92149 10.8778 9.93066 10.8662C9.92147 10.8778 9.91123 10.8882 9.90039 10.8984ZM6.07129 10.8516C6.0792 10.8626 6.08754 10.8729 6.09668 10.8828C6.08754 10.8729 6.0792 10.8626 6.07129 10.8516ZM9.94434 10.8477C9.95104 10.8377 9.95638 10.8272 9.96191 10.8164C9.95637 10.8271 9.95106 10.8377 9.94434 10.8477ZM6.03418 10.7842C6.04066 10.7995 6.04735 10.8143 6.05566 10.8281C6.04735 10.8143 6.04066 10.7995 6.03418 10.7842ZM9.97559 10.7891C9.97984 10.7783 9.98321 10.7673 9.98633 10.7559C9.98321 10.7673 9.97984 10.7783 9.97559 10.7891ZM6.01367 10.7236C6.0173 10.7388 6.02121 10.7535 6.02637 10.7676C6.02121 10.7535 6.0173 10.7388 6.01367 10.7236ZM9.62109 10.3262C9.67716 10.3262 9.72942 10.3346 9.77539 10.3506C9.72927 10.3345 9.67733 10.3262 9.62109 10.3262ZM9.56641 8.25098C9.5802 8.24792 9.59348 8.24449 9.60645 8.24023C9.59348 8.2445 9.58021 8.24792 9.56641 8.25098ZM9.625 8.2334C9.64073 8.22735 9.65566 8.2207 9.66992 8.21289C9.65565 8.22072 9.64074 8.22733 9.625 8.2334ZM9.68848 8.20117C9.69832 8.19495 9.70781 8.18872 9.7168 8.18164C9.70781 8.18874 9.69832 8.19493 9.68848 8.20117ZM9.74121 8.16016C9.7511 8.15059 9.76008 8.14059 9.76855 8.12988C9.76009 8.1406 9.75109 8.15057 9.74121 8.16016ZM9.77734 8.11914C9.78753 8.10499 9.79605 8.09004 9.80371 8.07422C9.79606 8.09005 9.78751 8.10498 9.77734 8.11914ZM9.79883 5.6377C9.80686 5.6343 9.81463 5.63082 9.82227 5.62695C9.81463 5.63084 9.80687 5.63429 9.79883 5.6377ZM9.93457 5.53516C9.91124 5.56582 9.88273 5.59214 9.84863 5.61328C9.88277 5.5922 9.91121 5.56576 9.93457 5.53516ZM9.94434 5.52246C9.95363 5.50886 9.96171 5.4946 9.96875 5.47949C9.96172 5.4946 9.9536 5.50885 9.94434 5.52246ZM6.02637 5.23145C6.02118 5.24552 6.01733 5.26024 6.01367 5.27539C6.01734 5.26023 6.02118 5.24552 6.02637 5.23145ZM6.05566 5.17188C6.04766 5.18525 6.04049 5.19914 6.03418 5.21387C6.04049 5.19914 6.04765 5.18525 6.05566 5.17188ZM6.09961 5.11328C6.08938 5.124 6.08003 5.13538 6.07129 5.14746C6.08003 5.13538 6.08938 5.12399 6.09961 5.11328ZM6.14844 5.07129C6.13601 5.08003 6.12428 5.08938 6.11328 5.09961C6.12428 5.08938 6.13601 5.08003 6.14844 5.07129ZM6.23242 5.02637C6.21195 5.03382 6.19287 5.04334 6.1748 5.05371C6.19287 5.04335 6.21195 5.03382 6.23242 5.02637ZM6.1748 10.9453C6.19195 10.9552 6.21017 10.9635 6.22949 10.9707C6.21017 10.9635 6.19195 10.9552 6.1748 10.9453ZM6.30957 5.00684C6.28239 5.01136 6.25651 5.01759 6.23242 5.02637C6.25651 5.01759 6.28239 5.01136 6.30957 5.00684Z", isFill = true, isStroke = false, strokeWidth = 1.2f))
            return _zedSrcExtension!!
        }

    // --- Semantic Convenience Aliases ---
    val Search: ImageVector get() = MagnifyingGlass
    val SettingsGear: ImageVector get() = Settings
    val Files: ImageVector get() = File
    val SourceControl: ImageVector get() = GitBranch
    val Refresh: ImageVector get() = RotateCw
    val ClearAll: ImageVector get() = Eraser
    val CollapseAll: ImageVector get() = ListCollapse
    val NewFolder: ImageVector get() = FolderAdd
    val KebabVertical: ImageVector get() = EllipsisVertical
}
