package com.muammarahlnn.asco.feature.adminpracticumcreate.component

/**
 * @Author Muammar Ahlan Abimanyu
 * @File BadgeBorder, 25/06/2024 00.06
 */
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


@Composable
fun rememberBadgeBorder(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "BadgeBorder",
            defaultWidth = 200.dp,
            defaultHeight = 218.dp,
            viewportWidth = 200f,
            viewportHeight = 218f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFCBDAFF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(78.3663f, 5.79243f)
                curveTo(91.7533f, -1.9308f, 108.247f, -1.9308f, 121.634f, 5.7924f)
                lineTo(178.366f, 38.5226f)
                curveTo(191.753f, 46.2459f, 200f, 60.519f, 200f, 75.9655f)
                verticalLineTo(141.426f)
                curveTo(200f, 156.872f, 191.753f, 171.145f, 178.366f, 178.869f)
                lineTo(121.634f, 211.599f)
                curveTo(108.247f, 219.322f, 91.7533f, 219.322f, 78.3663f, 211.599f)
                lineTo(21.6337f, 178.869f)
                curveTo(8.2467f, 171.145f, 0f, 156.872f, 0f, 141.426f)
                verticalLineTo(75.9655f)
                curveTo(0f, 60.519f, 8.2467f, 46.2459f, 21.6337f, 38.5226f)
                lineTo(78.3663f, 5.79243f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFABBDFF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(81.8817f, 26.6188f)
                curveTo(93.2607f, 20.0541f, 107.28f, 20.0541f, 118.659f, 26.6188f)
                lineTo(161.975f, 51.6089f)
                curveTo(173.354f, 58.1737f, 180.364f, 70.3058f, 180.364f, 83.4353f)
                verticalLineTo(133.416f)
                curveTo(180.364f, 146.545f, 173.354f, 158.677f, 161.975f, 165.242f)
                lineTo(118.659f, 190.232f)
                curveTo(107.28f, 196.797f, 93.2607f, 196.797f, 81.8818f, 190.232f)
                lineTo(38.5654f, 165.242f)
                curveTo(27.1865f, 158.677f, 20.1767f, 146.545f, 20.1767f, 133.416f)
                verticalLineTo(83.4353f)
                curveTo(20.1767f, 70.3058f, 27.1865f, 58.1737f, 38.5654f, 51.6089f)
                lineTo(81.8817f, 26.6188f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6573EF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(162.467f, 108.696f)
                curveTo(162.467f, 143.17f, 134.5f, 171.117f, 100f, 171.117f)
                curveTo(65.5002f, 171.117f, 37.5326f, 143.17f, 37.5326f, 108.696f)
                curveTo(37.5326f, 74.2215f, 65.5002f, 46.2747f, 100f, 46.2747f)
                curveTo(134.5f, 46.2747f, 162.467f, 74.2215f, 162.467f, 108.696f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBDAFF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(111.628f, 138.69f)
                curveTo(110.555f, 138.69f, 109.657f, 138.327f, 108.933f, 137.601f)
                curveTo(108.206f, 136.877f, 107.842f, 135.979f, 107.842f, 134.907f)
                curveTo(107.842f, 133.835f, 108.206f, 132.937f, 108.933f, 132.213f)
                curveTo(109.657f, 131.487f, 110.555f, 131.124f, 111.628f, 131.124f)
                horizontalLineTo(119.2f)
                curveTo(120.273f, 131.124f, 121.171f, 130.761f, 121.896f, 130.034f)
                curveTo(122.622f, 129.311f, 122.986f, 128.413f, 122.986f, 127.341f)
                verticalLineTo(119.775f)
                curveTo(122.986f, 117.379f, 123.68f, 115.203f, 125.068f, 113.249f)
                curveTo(126.456f, 111.294f, 128.286f, 109.907f, 130.558f, 109.087f)
                verticalLineTo(107.763f)
                curveTo(128.286f, 106.944f, 126.456f, 105.557f, 125.068f, 103.602f)
                curveTo(123.68f, 101.647f, 122.986f, 99.4721f, 122.986f, 97.0762f)
                verticalLineTo(89.51f)
                curveTo(122.986f, 88.4381f, 122.622f, 87.539f, 121.896f, 86.8127f)
                curveTo(121.171f, 86.0888f, 120.273f, 85.7269f, 119.2f, 85.7269f)
                horizontalLineTo(111.628f)
                curveTo(110.555f, 85.7269f, 109.657f, 85.365f, 108.933f, 84.6412f)
                curveTo(108.206f, 83.9148f, 107.842f, 83.0157f, 107.842f, 81.9438f)
                curveTo(107.842f, 80.8719f, 108.206f, 79.9728f, 108.933f, 79.2465f)
                curveTo(109.657f, 78.5227f, 110.555f, 78.1607f, 111.628f, 78.1607f)
                horizontalLineTo(119.2f)
                curveTo(122.355f, 78.1607f, 125.037f, 79.2641f, 127.245f, 81.4709f)
                curveTo(129.453f, 83.6777f, 130.558f, 86.3574f, 130.558f, 89.51f)
                verticalLineTo(97.0762f)
                curveTo(130.558f, 98.148f, 130.921f, 99.0459f, 131.648f, 99.7697f)
                curveTo(132.372f, 100.496f, 133.271f, 100.859f, 134.344f, 100.859f)
                curveTo(135.416f, 100.859f, 136.315f, 101.221f, 137.039f, 101.945f)
                curveTo(137.766f, 102.671f, 138.129f, 103.57f, 138.129f, 104.642f)
                verticalLineTo(112.209f)
                curveTo(138.129f, 113.28f, 137.766f, 114.178f, 137.039f, 114.902f)
                curveTo(136.315f, 115.628f, 135.416f, 115.992f, 134.344f, 115.992f)
                curveTo(133.271f, 115.992f, 132.372f, 116.354f, 131.648f, 117.077f)
                curveTo(130.921f, 117.804f, 130.558f, 118.703f, 130.558f, 119.775f)
                verticalLineTo(127.341f)
                curveTo(130.558f, 130.493f, 129.453f, 133.173f, 127.245f, 135.38f)
                curveTo(125.037f, 137.587f, 122.355f, 138.69f, 119.2f, 138.69f)
                horizontalLineTo(111.628f)
                close()
                moveTo(81.3409f, 138.69f)
                curveTo(78.186f, 138.69f, 75.5043f, 137.587f, 73.2959f, 135.38f)
                curveTo(71.0874f, 133.173f, 69.9832f, 130.493f, 69.9832f, 127.341f)
                verticalLineTo(119.775f)
                curveTo(69.9832f, 118.703f, 69.621f, 117.804f, 68.8966f, 117.077f)
                curveTo(68.1697f, 116.354f, 67.27f, 115.992f, 66.1973f, 115.992f)
                curveTo(65.1246f, 115.992f, 64.2261f, 115.628f, 63.5017f, 114.902f)
                curveTo(62.7748f, 114.178f, 62.4114f, 113.28f, 62.4114f, 112.209f)
                verticalLineTo(104.642f)
                curveTo(62.4114f, 103.57f, 62.7748f, 102.671f, 63.5017f, 101.945f)
                curveTo(64.2261f, 101.221f, 65.1246f, 100.859f, 66.1973f, 100.859f)
                curveTo(67.27f, 100.859f, 68.1697f, 100.496f, 68.8966f, 99.7697f)
                curveTo(69.621f, 99.0459f, 69.9832f, 98.148f, 69.9832f, 97.0762f)
                verticalLineTo(89.51f)
                curveTo(69.9832f, 86.3574f, 71.0874f, 83.6777f, 73.2959f, 81.4709f)
                curveTo(75.5043f, 79.2641f, 78.186f, 78.1607f, 81.3409f, 78.1607f)
                horizontalLineTo(88.9127f)
                curveTo(89.9854f, 78.1607f, 90.8852f, 78.5227f, 91.6121f, 79.2465f)
                curveTo(92.3364f, 79.9728f, 92.6986f, 80.8719f, 92.6986f, 81.9438f)
                curveTo(92.6986f, 83.0157f, 92.3364f, 83.9148f, 91.6121f, 84.6412f)
                curveTo(90.8852f, 85.365f, 89.9854f, 85.7269f, 88.9127f, 85.7269f)
                horizontalLineTo(81.3409f)
                curveTo(80.2682f, 85.7269f, 79.3685f, 86.0888f, 78.6416f, 86.8127f)
                curveTo(77.9172f, 87.539f, 77.555f, 88.4381f, 77.555f, 89.51f)
                verticalLineTo(97.0762f)
                curveTo(77.555f, 99.4721f, 76.8609f, 101.647f, 75.4728f, 103.602f)
                curveTo(74.0846f, 105.557f, 72.2547f, 106.944f, 69.9832f, 107.763f)
                verticalLineTo(109.087f)
                curveTo(72.2547f, 109.907f, 74.0846f, 111.294f, 75.4728f, 113.249f)
                curveTo(76.8609f, 115.203f, 77.555f, 117.379f, 77.555f, 119.775f)
                verticalLineTo(127.341f)
                curveTo(77.555f, 128.413f, 77.9172f, 129.311f, 78.6416f, 130.034f)
                curveTo(79.3685f, 130.761f, 80.2682f, 131.124f, 81.3409f, 131.124f)
                horizontalLineTo(88.9127f)
                curveTo(89.9854f, 131.124f, 90.8852f, 131.487f, 91.6121f, 132.213f)
                curveTo(92.3364f, 132.937f, 92.6986f, 133.835f, 92.6986f, 134.907f)
                curveTo(92.6986f, 135.979f, 92.3364f, 136.877f, 91.6121f, 137.601f)
                curveTo(90.8852f, 138.327f, 89.9854f, 138.69f, 88.9127f, 138.69f)
                horizontalLineTo(81.3409f)
                close()
            }
        }.build()
    }
}