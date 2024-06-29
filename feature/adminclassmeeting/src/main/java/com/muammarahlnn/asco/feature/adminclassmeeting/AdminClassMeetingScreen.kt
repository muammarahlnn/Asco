package com.muammarahlnn.asco.feature.adminclassmeeting

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingScreen, 30/06/2024 02.23
 */
@Composable
internal fun AdminClassMeetingScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "AdminClassMeeting",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}