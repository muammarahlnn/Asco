package com.muammarahlnn.feature.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.muammarahlnn.asco.core.navigation.AscoDestination
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LoginCoordinator, 17/06/2024 22.16
 */
@Composable
internal fun rememberLoginCoordinator(
    navController: NavController,
    viewModel: LoginViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): LoginCoordinator {
    return remember(navController, viewModel, scope) {
        LoginCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class LoginCoordinator(
    val navController: NavController,
    val viewModel: LoginViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateToAdminHome() {
        navController.navigate(AscoDestination.AdminHome) {
            popUpTo(AscoDestination.Login) {
                inclusive = true
            }
        }
    }
}