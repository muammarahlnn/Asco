package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingCreateScreen, 08/07/2024 18.14
 */
@Composable
internal fun MeetingCreateScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(text = "Meeting Create")
    }
}