package com.muammarahlnn.asco.feature.adminusercreate.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminusercreate.AdminUserCreateRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserCreateNavigation, 18/06/2024 22.28
 */
fun NavGraphBuilder.adminUserCreateScreen(
    navController: NavController,
) {
    composable<AscoDestination.AdminUserCreate> { 
        AdminUserCreateRoute(navController = navController)
    }
}