package com.muammarahlnn.asco.feature.adminpracticumcreate.component.createbadge

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.PurpleBlue


@Composable
fun rememberBadgeBorder(color: Color): ImageVector {
    return remember(color) {
        ImageVector.Builder(
            name = "BadgeBorder",
            defaultWidth = 200.dp,
            defaultHeight = 219.dp,
            viewportWidth = 200f,
            viewportHeight = 219f
        ).apply {
            val outerLayerColor = lightenColor(color, (1/3f))
            val innerLayerColor = lightenColor(color, (2/3f))

            // outer layer border
            path(
                fill = SolidColor(outerLayerColor),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(79.5461f, 5.68049f)
                curveTo(92.197f, -1.8935f, 107.989f, -1.8935f, 120.64f, 5.6805f)
                lineTo(149.543f, 22.9846f)
                lineTo(179.321f, 39.8473f)
                curveTo(191.9f, 46.9705f, 199.657f, 60.3265f, 199.611f, 74.7822f)
                lineTo(199.5f, 109.379f)
                lineTo(199.611f, 143.976f)
                curveTo(199.657f, 158.432f, 191.9f, 171.788f, 179.321f, 178.911f)
                lineTo(149.543f, 195.774f)
                lineTo(120.64f, 213.078f)
                curveTo(107.989f, 220.652f, 92.197f, 220.652f, 79.5461f, 213.078f)
                lineTo(50.6429f, 195.774f)
                lineTo(20.5893f, 178.755f)
                curveTo(8.1575f, 171.716f, 0.4241f, 158.58f, 0.301f, 144.293f)
                lineTo(0f, 109.379f)
                lineTo(0.300984f, 74.4651f)
                curveTo(0.4241f, 60.1789f, 8.1575f, 47.043f, 20.5893f, 40.0032f)
                lineTo(50.6429f, 22.9846f)
                lineTo(79.5461f, 5.68049f)
                close()
            }

            // outer layer border
            path(
                fill = SolidColor(outerLayerColor),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(79.5461f, 5.68049f)
                curveTo(92.197f, -1.8935f, 107.989f, -1.8935f, 120.64f, 5.6805f)
                lineTo(149.543f, 22.9846f)
                lineTo(179.321f, 39.8473f)
                curveTo(191.9f, 46.9705f, 199.657f, 60.3265f, 199.611f, 74.7822f)
                lineTo(199.5f, 109.379f)
                lineTo(199.611f, 143.976f)
                curveTo(199.657f, 158.432f, 191.9f, 171.788f, 179.321f, 178.911f)
                lineTo(149.543f, 195.774f)
                lineTo(120.64f, 213.078f)
                curveTo(107.989f, 220.652f, 92.197f, 220.652f, 79.5461f, 213.078f)
                lineTo(50.6429f, 195.774f)
                lineTo(20.5893f, 178.755f)
                curveTo(8.1575f, 171.716f, 0.4241f, 158.58f, 0.301f, 144.293f)
                lineTo(0f, 109.379f)
                lineTo(0.300984f, 74.4651f)
                curveTo(0.4241f, 60.1789f, 8.1575f, 47.043f, 20.5893f, 40.0032f)
                lineTo(50.6429f, 22.9846f)
                lineTo(79.5461f, 5.68049f)
                close()
            }

            // inner layer border
            path(
                fill = SolidColor(innerLayerColor),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(84.1669f, 27.8197f)
                curveTo(94.0538f, 21.8993f, 106.395f, 21.8993f, 116.282f, 27.8197f)
                lineTo(138.871f, 41.3461f)
                lineTo(162.143f, 54.5274f)
                curveTo(171.974f, 60.0955f, 178.036f, 70.5356f, 178f, 81.8354f)
                lineTo(177.913f, 108.879f)
                lineTo(178f, 135.923f)
                curveTo(178.036f, 147.223f, 171.974f, 157.663f, 162.143f, 163.231f)
                lineTo(138.871f, 176.413f)
                lineTo(116.282f, 189.939f)
                curveTo(106.395f, 195.86f, 94.0538f, 195.86f, 84.1669f, 189.939f)
                lineTo(61.5785f, 176.413f)
                lineTo(38.091f, 163.11f)
                curveTo(28.3752f, 157.607f, 22.3315f, 147.338f, 22.2352f, 136.171f)
                lineTo(22f, 108.879f)
                lineTo(22.2352f, 81.5876f)
                curveTo(22.3315f, 70.4203f, 28.3752f, 60.1522f, 38.091f, 54.6492f)
                lineTo(61.5785f, 41.3461f)
                lineTo(84.1669f, 27.8197f)
                close()
            }

            // inner layer border
            path(
                fill = SolidColor(innerLayerColor),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(84.1669f, 27.8197f)
                curveTo(94.0538f, 21.8993f, 106.395f, 21.8993f, 116.282f, 27.8197f)
                lineTo(138.871f, 41.3461f)
                lineTo(162.143f, 54.5274f)
                curveTo(171.974f, 60.0955f, 178.036f, 70.5356f, 178f, 81.8354f)
                lineTo(177.913f, 108.879f)
                lineTo(178f, 135.923f)
                curveTo(178.036f, 147.223f, 171.974f, 157.663f, 162.143f, 163.231f)
                lineTo(138.871f, 176.413f)
                lineTo(116.282f, 189.939f)
                curveTo(106.395f, 195.86f, 94.0538f, 195.86f, 84.1669f, 189.939f)
                lineTo(61.5785f, 176.413f)
                lineTo(38.091f, 163.11f)
                curveTo(28.3752f, 157.607f, 22.3315f, 147.338f, 22.2352f, 136.171f)
                lineTo(22f, 108.879f)
                lineTo(22.2352f, 81.5876f)
                curveTo(22.3315f, 70.4203f, 28.3752f, 60.1522f, 38.091f, 54.6492f)
                lineTo(61.5785f, 41.3461f)
                lineTo(84.1669f, 27.8197f)
                close()
            }

            // circle background
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(159f, 108.879f)
                arcTo(58.5f, 58.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.5f, 167.37900000000002f)
                arcTo(58.5f, 58.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42f, 108.879f)
                arcTo(58.5f, 58.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 159f, 108.879f)
                close()
            }
        }.build()
    }
}

private fun lightenColor(
    color: Color,
    factor: Float,
): Color {
    val inverseRatio = 1 - factor
    val red = (color.red * factor + PureWhite.red * inverseRatio).coerceIn(0f, 1f)
    val green = (color.green * factor + PureWhite.green * inverseRatio).coerceIn(0f, 1f)
    val blue = (color.blue * factor + PureWhite.blue * inverseRatio).coerceIn(0f, 1f)
    return Color(red, green, blue)
}

@Preview(showBackground = true)
@Composable
private fun BadgeBorderPreview() {
    AscoTheme {
        Image(
            imageVector = rememberBadgeBorder(PurpleBlue),
            contentDescription = null,
        )
    }
}