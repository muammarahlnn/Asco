package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsScreen, 04/07/2024 03.21
 */
@Composable
internal fun SelectStudentsScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Select Students",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}