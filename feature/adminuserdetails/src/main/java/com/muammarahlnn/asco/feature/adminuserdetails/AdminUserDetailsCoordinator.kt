package com.muammarahlnn.asco.feature.adminuserdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserDetailsCoordinator, 18/06/2024 17.05
 */
@Composable
internal fun rememberAdminUserDetailsCoordinator(
    navController: NavController,
    viewModel: AdminUserDetailViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminUserDetailsCoordinator {
    return remember(navController, viewModel, scope) {
        AdminUserDetailsCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class AdminUserDetailsCoordinator(
    val navController: NavController,
    val viewModel: AdminUserDetailViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}