package com.muammarahlnn.asco.feature.adminpracticumcreate

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.muammarahlnn.asco.feature.adminpracticumcreate.CurrentPage.FIRST
import com.muammarahlnn.asco.feature.adminpracticumcreate.CurrentPage.SECOND

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCreateRoute, 20/06/2024 21.56
 */
@Composable
internal fun AdminPracticumCreateRoute(
    navController: NavController,
    viewModel: AdminPracticumCreateViewModel = hiltViewModel(),
    coordinator: AdminPracticumCreateCoordinator = rememberAdminPracticumCreateCoordinator(
        navController = navController,
        viewModel = viewModel,
    ),
) {
    val state by coordinator.state.collectAsStateWithLifecycle()
    val actions = rememberAdminPracticumCreateActions(coordinator = coordinator)

    BackHandler {
        when (state.currentPage) {
            FIRST -> actions.onCloseClick()
            SECOND -> actions.onPreviousClick()
        }
    }

    AdminPracticumCreateScreen(
        state = state,
        actions = actions,
    )
}

@Composable
private fun rememberAdminPracticumCreateActions(
    coordinator: AdminPracticumCreateCoordinator,
): AdminPracticumCreateActions {
    return remember(coordinator) {
        AdminPracticumCreateActions(
            onCloseClick = coordinator::navigateBack,
            onNextClick = coordinator.viewModel::onNextClick,
            onPreviousClick = coordinator.viewModel::onPreviousClick,
            onSubjectNameChange = coordinator.viewModel::onSubjectNameChange,
        )
    }
}