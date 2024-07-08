package com.muammarahlnn.asco.feature.adminclassmeeting.meetings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsRoute, 04/07/2024 22.12
 */
@Composable
internal fun MeetingsRoute(
    navController: NavController,
    viewModel: MeetingsViewModel = hiltViewModel(),
    coordinator: MeetingsCoordinator = rememberMeetingsCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberMeetingsActions(coordinator = coordinator)

    MeetingsScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberMeetingsActions(coordinator: MeetingsCoordinator): MeetingsActions {
    return remember(coordinator) {
        MeetingsActions(
            onBackClick = coordinator::navigateBack,
            onSearchQueryChange = coordinator.viewModel::onSearchQueryChange,
            onSortClick = coordinator.viewModel::onSortClick,
            onMeetingClick = coordinator::navigateToMeetingDetails,
            onDeleteMeetingClick = {},
            onFabAddClick = coordinator::navigateToMeetingCreate,
        )
    }
}