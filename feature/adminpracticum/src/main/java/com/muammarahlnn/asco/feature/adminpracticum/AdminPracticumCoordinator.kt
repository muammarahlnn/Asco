package com.muammarahlnn.asco.feature.adminpracticum

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCoordinator, 19/06/2024 23.47
 */
@Composable
internal fun rememberAdminPracticumCoordinator(
    navController: NavController,
    viewModel: AdminPracticumViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminPracticumCoordinator {
    return remember(navController, viewModel, scope) {
        AdminPracticumCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

@Stable
internal class AdminPracticumCoordinator(
    val navController: NavController,
    val viewModel: AdminPracticumViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}