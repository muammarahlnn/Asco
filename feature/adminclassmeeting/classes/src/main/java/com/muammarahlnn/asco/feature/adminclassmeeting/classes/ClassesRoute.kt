package com.muammarahlnn.asco.feature.adminclassmeeting.classes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesRoute, 03/07/2024 22.33
 */
@Composable
internal fun ClassesRoute(
    navController: NavController,
    viewModel: ClassesViewModel = hiltViewModel(),
    coordinator: ClassesCoordinator = rememberClassesCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberClassesActions(coordinator = coordinator)

    ClassesScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberClassesActions(coordinator: ClassesCoordinator): ClassesActions {
    return remember(coordinator) {
        ClassesActions(
            onBackClick = coordinator::navigateBack,
            onClassClick = coordinator::navigateToClassDetails,
        )
    }
}