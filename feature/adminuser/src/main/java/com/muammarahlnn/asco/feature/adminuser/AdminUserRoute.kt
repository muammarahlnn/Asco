package com.muammarahlnn.asco.feature.adminuser

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserRoute, 18/06/2024 00.11
 */
@Composable
internal fun AdminUserRoute(
    navController: NavController,
    viewModel: AdminUserViewModel = hiltViewModel(),
    coordinator: AdminUserCoordinator = rememberAdminUserCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberAdminUserActions(coordinator)
    AdminUserScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberAdminUserActions(coordinator: AdminUserCoordinator): AdminUserActions {
    return remember(coordinator) {
        AdminUserActions(
            onBackClick = coordinator::navigateBack,
            onSearchQueryChange = coordinator.viewModel::onSearchQueryChange,
            onFilterChange = coordinator.viewModel::onFilterChange,
            onShowFilterDialog = coordinator.viewModel::onShowFilterDialog,
            onApplyFilterDialog = coordinator.viewModel::onApplyFilterDialog,
        )
    }
}