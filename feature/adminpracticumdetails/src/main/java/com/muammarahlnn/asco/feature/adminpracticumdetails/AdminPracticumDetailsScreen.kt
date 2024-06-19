package com.muammarahlnn.asco.feature.adminpracticumdetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumDetailsScreen, 20/06/2024 02.27
 */
@Composable
internal fun AdminPracticumDetailsScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Detail Praktikum",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}