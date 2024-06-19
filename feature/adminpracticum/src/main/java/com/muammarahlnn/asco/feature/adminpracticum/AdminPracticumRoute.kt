package com.muammarahlnn.asco.feature.adminpracticum

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumRoute, 19/06/2024 02.44
 */
@Composable
internal fun AdminPracticumRoute(
    navController: NavController,
    viewModel: AdminPracticumViewModel = hiltViewModel(),
    coordinator: AdminPracticumCoordinator = rememberAdminPracticumCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberAdminPracticumActions(coordinator = coordinator)
    AdminPracticumScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberAdminPracticumActions(coordinator: AdminPracticumCoordinator): AdminPracticumActions {
    return remember(coordinator) {
        AdminPracticumActions(
            onBackClick = coordinator::navigateBack,
        )
    }
}