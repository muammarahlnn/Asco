package com.muammarahlnn.asco.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

/**
 * @Author Muammar Ahlan Abimanyu
 * @File Background, 31/05/2024 18.55
 */
@Immutable
data class BackgroundTheme(
    val color: Color = Color.Unspecified,
    val tonalElevation: Dp = Dp.Unspecified,
)

val LocalBackgroundTheme = staticCompositionLocalOf { BackgroundTheme() }