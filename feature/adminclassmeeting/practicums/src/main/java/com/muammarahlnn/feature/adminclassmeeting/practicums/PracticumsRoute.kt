package com.muammarahlnn.feature.adminclassmeeting.practicums

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsRoute, 02/07/2024 21.54
 */
@Composable
internal fun PracticumsRoute(
    navController: NavController,
    viewModel: PracticumsViewModel = hiltViewModel(),
    coordinator: PracticumsCoordinator = rememberPracticumsCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
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
            onClassButtonClick = coordinator::navigateToClasses,
            onMeetingButtonClick = {},
        )
    }
}