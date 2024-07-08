package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingCreateRoute, 08/07/2024 18.38
 */
@Composable
internal fun MeetingCreateRoute(
    navController: NavController,
    viewModel: MeetingCreateViewModel = hiltViewModel(),
    coordinator: MeetingCreateCoordinator = rememberMeetingCreateCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberMeetingCreateActions(coordinator = coordinator)

    MeetingCreateScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberMeetingCreateActions(coordinator: MeetingCreateCoordinator): MeetingCreateActions {
    return remember(coordinator) {
        MeetingCreateActions(
            onCloseClick = coordinator::navigateBack,
            onMaterialNameChange = coordinator.viewModel::onMaterialNameChange,
            onMeetingDateChange = coordinator.viewModel::onMeetingDateChange,
            onSpeakerSelected = coordinator.viewModel::onSpeakerSelected,
            onCoSpeakerSelected = coordinator.viewModel::onCoSpeakerSelected,
        )
    }
}