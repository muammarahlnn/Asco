package com.muammarahlnn.asco.feature.adminusercreate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserCreateRoute, 18/06/2024 22.25
 */
@Composable
internal fun AdminUserCreateRoute(
    navController: NavController,
    viewModel: AdminUserCreateViewModel = hiltViewModel(),
    coordinator: AdminUserCreateCoordinator = rememberAdminUserCreateCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberAdminUserCreateActions(coordinator = coordinator)
    AdminUserCreateScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberAdminUserCreateActions(coordinator: AdminUserCreateCoordinator): AdminUserCreateActions {
    return remember(coordinator) {
        AdminUserCreateActions(
            onBackClick = coordinator::navigateBack,
            onUsernameChange = coordinator.viewModel::onUsernameChange,
            onFullNameChange = coordinator.viewModel::onFullNameChange,
            onBatchChange = coordinator.viewModel::onBatchChange,
            onRoleChange = coordinator.viewModel::onRoleChange,
        )
    }
}