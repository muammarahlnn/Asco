package com.muammarahlnn.asco.feature.adminuser

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserScreen, 13/06/2024 23.31
 */
@Composable
internal fun AdminUserDestination(
    modifier: Modifier = Modifier,
) {
    AdminUserScreen(
        modifier = modifier,
    )
}

@Composable
private fun AdminUserScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = "Admin User")
    }
}