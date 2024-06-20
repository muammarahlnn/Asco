package com.muammarahlnn.asco.feature.adminpracticumcreate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCreateCoordinator, 21/06/2024 00.40
 */
@Composable
internal fun rememberAdminPracticumCreateCoordinator(
    navController: NavController,
    viewModel: AdminPracticumCreateViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminPracticumCreateCoordinator {
    return remember(navController, viewModel, scope) {
        AdminPracticumCreateCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class AdminPracticumCreateCoordinator(
    val navController: NavController,
    val viewModel: AdminPracticumCreateViewModel,
    val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}