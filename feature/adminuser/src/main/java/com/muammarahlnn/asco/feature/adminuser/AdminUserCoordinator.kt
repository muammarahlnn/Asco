package com.muammarahlnn.asco.feature.adminuser

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserCoordinator, 18/06/2024 00.08
 */
@Composable
internal fun rememberAdminUserCoordinator(
    navController: NavController,
    viewModel: AdminUserViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminUserCoordinator {
    return remember(navController, viewModel, scope) {
        AdminUserCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class AdminUserCoordinator(
    val navController: NavController,
    val viewModel: AdminUserViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}