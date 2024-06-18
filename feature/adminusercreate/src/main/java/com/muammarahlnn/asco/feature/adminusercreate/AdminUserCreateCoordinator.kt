package com.muammarahlnn.asco.feature.adminusercreate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserCreateCoordinator, 18/06/2024 22.23
 */
@Composable
internal fun rememberAdminUserCreateCoordinator(
    navController: NavController,
    viewModel: AdminUserCreateViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminUserCreateCoordinator {
    return remember(navController, viewModel, scope) {
        AdminUserCreateCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class AdminUserCreateCoordinator(
    val navController: NavController,
    val viewModel: AdminUserCreateViewModel,
    val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}