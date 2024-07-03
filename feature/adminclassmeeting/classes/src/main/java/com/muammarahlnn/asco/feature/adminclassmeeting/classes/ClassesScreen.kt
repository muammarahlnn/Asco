package com.muammarahlnn.asco.feature.adminclassmeeting.classes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesScreen, 03/07/2024 22.32
 */
@Composable
internal fun ClassesScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Classes",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}