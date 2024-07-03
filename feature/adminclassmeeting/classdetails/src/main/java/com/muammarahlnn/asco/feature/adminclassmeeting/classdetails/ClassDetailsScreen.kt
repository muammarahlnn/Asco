package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsScreen, 04/07/2024 00.07
 */
@Composable
internal fun ClassDetailsScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Class Details",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}