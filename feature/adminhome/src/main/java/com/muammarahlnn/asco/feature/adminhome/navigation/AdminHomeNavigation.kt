package com.muammarahlnn.asco.feature.adminhome.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminhome.AdminHomeRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeNavigation, 04/06/2024 16.24
 */
fun NavGraphBuilder.adminHomeScreen(
    navController: NavController,
) {
    composable<AscoDestination.AdminHome> {
        AdminHomeRoute(
            navController = navController,
        )
    }
}