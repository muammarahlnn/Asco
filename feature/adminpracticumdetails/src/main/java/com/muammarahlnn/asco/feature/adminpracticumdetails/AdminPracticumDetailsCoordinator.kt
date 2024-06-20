package com.muammarahlnn.asco.feature.adminpracticumdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumDetailsCoordinator, 20/06/2024 20.55
 */
@Composable
internal fun rememberAdminPracticumDetailsCoordinator(
    navController: NavController,
    viewModel: AdminPracticumDetailsViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminPracticumDetailsCoordinator {
    return remember(navController, viewModel, scope) {
        AdminPracticumDetailsCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class AdminPracticumDetailsCoordinator(
    val navController: NavController,
    val viewModel: AdminPracticumDetailsViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }
}