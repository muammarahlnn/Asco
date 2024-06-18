package com.muammarahlnn.asco.feature.adminuserdetails.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminuserdetails.AdminUserDetailsRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserDetailsNavigation, 18/06/2024 17.21
 */
fun NavGraphBuilder.adminUserDetailsScreen(
    navController: NavController,
) {
    composable<AscoDestination.AdminUserDetails> {
        AdminUserDetailsRoute(navController = navController)
    }
}