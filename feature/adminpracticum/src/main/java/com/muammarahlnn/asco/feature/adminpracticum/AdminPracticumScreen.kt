package com.muammarahlnn.asco.feature.adminpracticum

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumScreen, 19/06/2024 02.42
 */
@Composable
internal fun AdminPracticumScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Data Praktikum",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}