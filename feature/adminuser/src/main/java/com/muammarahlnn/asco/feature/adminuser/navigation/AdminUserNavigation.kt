package com.muammarahlnn.asco.feature.adminuser.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminuser.AdminUserRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserNavigatino, 13/06/2024 23.33
 */
fun NavGraphBuilder.adminUserScreen(
    navController: NavController,
) {
    composable<AscoDestination.AdminUser> {
        AdminUserRoute(navController = navController)
    }
}