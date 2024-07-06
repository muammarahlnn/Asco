package com.muammarahlnn.asco.feature.adminclassmeeting.meetings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsCoordinator, 04/07/2024 23.26
 */
@Composable
internal fun rememberMeetingsCoordinator(
    navController: NavController,
    viewModel: MeetingsViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): MeetingsCoordinator {
    return remember(navController, viewModel, scope) {
        MeetingsCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class MeetingsCoordinator(
    val navController: NavController,
    val viewModel: MeetingsViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }

    fun navigateToMeetingDetails() {
        navController.navigate(AdminClassMeetingDestination.MeetingDetails)
    }
}