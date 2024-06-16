 package com.muammarahlnn.asco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.graphics.toArgb
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.ui.AscoApp
import com.muammarahlnn.asco.ui.rememberAscoAppState

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            val appState = rememberAscoAppState()
            val currentStatusBarStyle = appState.currentStatusBarStyle
            DisposableEffect(currentStatusBarStyle) {
                enableEdgeToEdge(
                    statusBarStyle = SystemBarStyle.auto(
                        currentStatusBarStyle.color.toArgb(),
                        currentStatusBarStyle.color.toArgb()
                    ) { currentStatusBarStyle.isDark },
                    navigationBarStyle = SystemBarStyle.auto(
                        lightScrim,
                        darkScrim,
                    )
                )
                onDispose {}
            }

            AscoTheme {
                AscoApp(
                    appState = appState
                )
            }
        }
    }
}

// default light and dark scrim defined by androidx
private val lightScrim = android.graphics.Color.argb(0xe6, 0xFF, 0xFF, 0xFF)
private val darkScrim = android.graphics.Color.argb(0x80, 0x1b, 0x1b, 0x1b)