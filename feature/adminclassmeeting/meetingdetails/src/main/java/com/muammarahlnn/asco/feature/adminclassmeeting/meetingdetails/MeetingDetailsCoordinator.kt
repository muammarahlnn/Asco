package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDetailsCoordinator, 07/07/2024 23.38
 */
@Composable
internal fun rememberMeetingDetailsCoordinator(
    navController: NavController,
    viewModel: MeetingDetailsViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): MeetingDetailsCoordinator {
    return remember(navController, viewModel, scope) {
        MeetingDetailsCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class MeetingDetailsCoordinator(
    val navController: NavController,
    val viewModel: MeetingDetailsViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}