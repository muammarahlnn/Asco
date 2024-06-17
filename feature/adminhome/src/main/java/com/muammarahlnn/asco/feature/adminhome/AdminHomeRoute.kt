package com.muammarahlnn.asco.feature.adminhome

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeRoute, 17/06/2024 23.54
 */
@Composable
internal fun AdminHomeRoute(
    navController: NavController,
    viewModel: AdminHomeViewModel = hiltViewModel(),
    coordinator: AdminHomeCoordinator = rememberAdminHomeCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberAdminHomeActions(coordinator)
    AdminHomeScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberAdminHomeActions(coordinator: AdminHomeCoordinator): AdminHomeActions {
    return remember(coordinator) {
        AdminHomeActions(
            onUserDataMenuClick = coordinator::navigateToAdminUser,
        )
    }
}