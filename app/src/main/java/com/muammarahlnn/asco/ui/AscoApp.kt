package com.muammarahlnn.asco.ui

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.muammarahlnn.asco.core.designsystem.theme.Black
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.core.ui.component.AscoBackground
import com.muammarahlnn.asco.navigation.AscoNavHost

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AscoApp, 03/06/2024 17.33
 */
@Composable
internal fun AscoApp(
    appState: AscoAppState,
) {
    AscoBackground {
        Scaffold(
            containerColor = Color.Transparent,
            contentColor = Black,
            contentWindowInsets = WindowInsets(0, 0, 0, 0)
        ) { paddingValues ->
            val startDestination = AscoDestination.Login
            AscoNavHost(
                appState = appState,
                startDestination = startDestination,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .consumeWindowInsets(paddingValues)
                    .windowInsetsPadding(
                        WindowInsets.safeDrawing.only(
                            WindowInsetsSides.Horizontal,
                        )
                    )
            )
        }
    }
}