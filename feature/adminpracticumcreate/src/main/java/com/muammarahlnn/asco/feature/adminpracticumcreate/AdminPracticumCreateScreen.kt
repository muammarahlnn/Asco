package com.muammarahlnn.asco.feature.adminpracticumcreate

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCreateScreen, 20/06/2024 21.54
 */
@Composable
internal fun AdminPracticumCreateScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Tambah Praktikum")
    }
}