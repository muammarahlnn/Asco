package com.muammarahlnn.feature.login.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.feature.login.LoginRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LoginNavigation, 03/06/2024 17.21
 */
fun NavGraphBuilder.loginScreen(
    navController: NavController,
) {
    composable<AscoDestination.Login> {
        LoginRoute(
            navController = navController,
        )
    }
}