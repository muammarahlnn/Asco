package com.muammarahlnn.asco.feature.adminclassmeeting

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingActions

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingRoute, 30/06/2024 02.25
 */
@Composable
internal fun AdminClassMeetingRoute(
    navController: NavController,
    viewModel: AdminClassMeetingViewModel = hiltViewModel(),
    coordinator: AdminClassMeetingCoordinator = rememberAdminClassMeetingCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberAdminClassMeetingActions(coordinator = coordinator)
    AdminClassMeetingScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberAdminClassMeetingActions(
    coordinator: AdminClassMeetingCoordinator,
): AdminClassMeetingActions {
    return remember(coordinator) {
        AdminClassMeetingActions(
            onBackClick = coordinator::navigateBack
        )
    }
}