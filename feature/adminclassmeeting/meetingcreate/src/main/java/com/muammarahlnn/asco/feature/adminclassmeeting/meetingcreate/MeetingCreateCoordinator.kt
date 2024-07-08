package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingCreateCoordinator, 08/07/2024 21.02
 */
@Composable
internal fun rememberMeetingCreateCoordinator(
    navController: NavController,
    viewModel: MeetingCreateViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): MeetingCreateCoordinator {
    return remember(navController, viewModel, scope) {
        MeetingCreateCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class MeetingCreateCoordinator(
    val navController: NavController,
    val viewModel: MeetingCreateViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}