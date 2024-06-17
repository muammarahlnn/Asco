package com.muammarahlnn.feature.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LoginRoute, 17/06/2024 22.56
 */
@Composable
internal fun LoginRoute(
    navController: NavController,
    viewModel: LoginViewModel = hiltViewModel(),
    coordinator: LoginCoordinator = rememberLoginCoordinator(
        navController = navController,
        viewModel = viewModel,
    )
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberLoginActions(coordinator)
    LoginScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberLoginActions(coordinator: LoginCoordinator): LoginActions {
    return remember(coordinator) {
        LoginActions(
            onShowLoginDialog = coordinator.viewModel::showLoginDialog,
            onUsernameChange = coordinator.viewModel::onUsernameChange,
            onPasswordChange = coordinator.viewModel::onPasswordChange,
            onLoginClick = coordinator::navigateToAdminHome,
        )
    }
}