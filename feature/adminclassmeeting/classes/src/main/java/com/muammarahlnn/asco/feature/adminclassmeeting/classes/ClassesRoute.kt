package com.muammarahlnn.asco.feature.adminclassmeeting.classes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesRoute, 03/07/2024 22.33
 */
@Composable
internal fun ClassesRoute(
    onBackClick: () -> Unit,
    onClassClick: () -> Unit,
    viewModel: ClassesViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    ClassesScreen(
        state = state,
        onBackClick = onBackClick,
        onClassClick = onClassClick,
    )
}