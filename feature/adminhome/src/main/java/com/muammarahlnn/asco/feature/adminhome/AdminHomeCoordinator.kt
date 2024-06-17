package com.muammarahlnn.asco.feature.adminhome

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.muammarahlnn.asco.core.navigation.AscoDestination
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeCoordinator, 17/06/2024 23.51
 */
@Composable
internal fun rememberAdminHomeCoordinator(
    navController: NavController,
    viewModel: AdminHomeViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminHomeCoordinator {
    return remember(navController, viewModel, scope) {
        AdminHomeCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class AdminHomeCoordinator(
    val navController: NavController,
    val viewModel: AdminHomeViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateToAdminUser() {
        navController.navigate(AscoDestination.AdminUser)
    }
}