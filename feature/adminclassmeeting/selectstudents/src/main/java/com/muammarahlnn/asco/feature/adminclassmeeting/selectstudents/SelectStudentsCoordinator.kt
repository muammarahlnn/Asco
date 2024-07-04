package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsCoordinator, 04/07/2024 21.46
 */
@Composable
internal fun rememberSelectStudentsCoordinator(
    navController: NavController,
    viewModel: SelectStudentsViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): SelectStudentsCoordinator {
    return remember(navController, viewModel, scope) {
        SelectStudentsCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class SelectStudentsCoordinator(
    val navController: NavController,
    val viewModel: SelectStudentsViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}