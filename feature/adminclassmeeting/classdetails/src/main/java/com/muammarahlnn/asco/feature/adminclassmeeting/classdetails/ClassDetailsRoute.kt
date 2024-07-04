package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsRoute, 04/07/2024 00.07
 */
@Composable
internal fun ClassDetailsRoute(
    navController: NavController,
    viewModel: ClassDetailsViewModel = hiltViewModel(),
    coordinator: ClassDetailsCoordinator = rememberClassDetailsCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val actions = rememberClassDetailsActions(coordinator = coordinator)

    ClassDetailsScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberClassDetailsActions(coordinator: ClassDetailsCoordinator): ClassDetailsActions {
    return remember(coordinator) {
        ClassDetailsActions(
            onBackClick = coordinator::navigateBack,
            onAddStudentsClick = coordinator::navigateToSelectStudents,
            onDeleteStudentClick = {},
        )
    }
}