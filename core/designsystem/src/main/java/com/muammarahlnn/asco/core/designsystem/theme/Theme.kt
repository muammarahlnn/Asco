package com.muammarahlnn.asco.core.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp

/**
 * @Author Muammar Ahlan Abimanyu
 * @File Theme, 03/06/2024 01.03
 */
private val LightColorScheme = lightColorScheme(
    primary = Purple,
    onPrimary = White,
    secondary = Pink,
    onSecondary = White,
    tertiary = Blue,
    background = White,
    onBackground = Black,
    surface = White,
    onSurface = Gray,
    surfaceVariant = WhitePurple,
    surfaceTint = White,
)

@Composable
fun AscoTheme(content: @Composable () -> Unit) {
    val defaultBackgroundTheme = BackgroundTheme(
        color = LightColorScheme.surface,
        tonalElevation = 0.dp,
    )
    
    CompositionLocalProvider(
        LocalBackgroundTheme provides defaultBackgroundTheme
    ) {
        MaterialTheme(
            colorScheme = LightColorScheme,
            typography = AscoTypography,
            content = content,
        )
    }
}