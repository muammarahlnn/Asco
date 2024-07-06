package com.muammarahlnn.asco.feature.adminpracticumdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumDetailsRoute, 20/06/2024 02.29
 */
@Composable
internal fun AdminPracticumDetailsRoute(
    navController: NavController,
    viewModel: AdminPracticumDetailsViewModel = hiltViewModel(),
    coordinator: AdminPracticumDetailsCoordinator = rememberAdminPracticumDetailsCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val actions = rememberAdminPracticumDetailsActions(coordinator = coordinator)
    AdminPracticumDetailsScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberAdminPracticumDetailsActions(
    coordinator: AdminPracticumDetailsCoordinator,
): AdminPracticumDetailsActions {
    return remember(coordinator) {
        AdminPracticumDetailsActions(
            onBackClick = coordinator::navigateBack,
            onEditClick = coordinator::navigateToAdminPracticumCreate,
        )
    }
}