package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDetailsRoute, 06/07/2024 22.40
 */
@Composable
internal fun MeetingDetailsRoute(
    navController: NavController,
    viewModel: MeetingDetailsViewModel = hiltViewModel(),
    coordinator: MeetingDetailsCoordinator = rememberMeetingDetailsCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberMeetingDetailsActions(coordinator = coordinator)

    MeetingDetailsScreen(
        state = state,
        actions = actions,
    )
}


@Composable
private fun rememberMeetingDetailsActions(coordinator: MeetingDetailsCoordinator): MeetingDetailsActions {
    return remember(coordinator) {
        MeetingDetailsActions(
            onBackClick = coordinator::navigateBack,
            onEditClick = {},
            onOpenModuleClick = {},
        )
    }
}
