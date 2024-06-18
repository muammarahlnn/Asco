package com.muammarahlnn.asco.feature.adminuserdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserDetailsRoute, 18/06/2024 17.08
 */
@Composable
internal fun AdminUserDetailsRoute(
    navController: NavController,
    viewModel: AdminUserDetailViewModel = hiltViewModel(),
    coordinator: AdminUserDetailsCoordinator = rememberAdminUserDetailsCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberAdminUserDetailsActions(coordinator = coordinator)
    AdminUserDetailsScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberAdminUserDetailsActions(coordinator: AdminUserDetailsCoordinator): AdminUserActions {
    return remember(coordinator) {
        AdminUserActions(
            onBackClick = coordinator::navigateBack
        )
    }
}