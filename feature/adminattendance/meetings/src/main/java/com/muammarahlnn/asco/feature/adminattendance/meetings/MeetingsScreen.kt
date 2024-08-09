package com.muammarahlnn.asco.feature.adminattendance.meetings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsScreen, 09/08/2024 22.07
 */
@Composable
internal fun MeetingsScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Meetings",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}