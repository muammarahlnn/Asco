package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDetailsScreen, 06/07/2024 22.39
 */
@Composable
internal fun MeetingDetailsScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(text = "Meeting Details")
    }
}