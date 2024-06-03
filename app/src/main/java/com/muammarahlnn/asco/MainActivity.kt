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
            val currentStatusBarColor = appState.currentStatusBarColor
            DisposableEffect(currentStatusBarColor) {
                enableEdgeToEdge(
                    statusBarStyle = SystemBarStyle.auto(
                        currentStatusBarColor.toArgb(),
                        currentStatusBarColor.toArgb(),
                    ),
                    navigationBarStyle = SystemBarStyle.auto(
                        currentStatusBarColor.toArgb(),
                        currentStatusBarColor.toArgb(),
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