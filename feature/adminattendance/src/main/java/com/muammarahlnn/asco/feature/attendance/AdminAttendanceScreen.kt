package com.muammarahlnn.asco.feature.attendance

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
internal fun AdminAttendanceScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Admin Attendance",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}