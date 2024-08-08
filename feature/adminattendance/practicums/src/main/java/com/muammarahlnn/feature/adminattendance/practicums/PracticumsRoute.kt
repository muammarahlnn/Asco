package com.muammarahlnn.feature.adminattendance.practicums

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminAttendanceRoute, 18/07/2024 22.32
 */
@Composable
internal fun PracticumsRoute(
    navController: NavController,
    viewModel: PracticumsViewModel = hiltViewModel(),
    coordinator: PracticumsCoordinator = rememberPracticumsCoordinator(
        navController = navController,
        viewModel = viewModel,
    )
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberPracticumsActions(coordinator = coordinator)

    PracticumsScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberPracticumsActions(coordinator: PracticumsCoordinator): PracticumsActions {
    return remember(coordinator) {
        PracticumsActions(
            onBackClick = coordinator::navigateBack,
            onPracticumClick = coordinator::navigateToMeetings,
        )
    }
}