package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsRoute, 04/07/2024 03.22
 */
@Composable
internal fun SelectStudentsRoute(
    navController: NavController,
    viewModel: SelectStudentsViewModel = hiltViewModel(),
    coordinator: SelectStudentsCoordinator = rememberSelectStudentsCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val actions = rememberSelectStudentsActions(coordinator = coordinator)

    SelectStudentsScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberSelectStudentsActions(coordinator: SelectStudentsCoordinator): SelectStudentsActions {
    return remember(coordinator) {
        SelectStudentsActions(
            onCloseClick = coordinator::navigateBack,
            onSearchQueryChange = coordinator.viewModel::onSearchQueryChange,
        )
    }
}