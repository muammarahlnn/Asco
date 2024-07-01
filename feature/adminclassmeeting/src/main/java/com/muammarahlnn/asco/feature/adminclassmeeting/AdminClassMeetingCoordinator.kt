package com.muammarahlnn.asco.feature.adminclassmeeting

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingCoordinator, 01/07/2024 23.49
 */
@Composable
internal fun rememberAdminClassMeetingCoordinator(
    navController: NavController,
    viewModel: AdminClassMeetingViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminClassMeetingCoordinator {
    return remember(navController, viewModel, scope) {
        AdminClassMeetingCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class AdminClassMeetingCoordinator(
    val navController: NavController,
    val viewModel: AdminClassMeetingViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}