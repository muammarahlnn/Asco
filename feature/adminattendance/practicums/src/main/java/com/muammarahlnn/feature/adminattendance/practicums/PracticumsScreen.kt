package com.muammarahlnn.feature.adminattendance.practicums

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminAttendanceScreen, 18/07/2024 22.32
 */
@Composable
internal fun PracticumsScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Practicums",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}