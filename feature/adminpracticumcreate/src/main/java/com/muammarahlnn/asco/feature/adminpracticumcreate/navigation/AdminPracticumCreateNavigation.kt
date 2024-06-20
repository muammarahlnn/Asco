package com.muammarahlnn.asco.feature.adminpracticumcreate.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminpracticumcreate.AdminPracticumCreateRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCreateNavigation, 20/06/2024 21.57
 */
fun NavGraphBuilder.adminPracticumCreateScreen(
    navController: NavController,
) {
    composable<AscoDestination.AdminPracticumCreate> {
        AdminPracticumCreateRoute()
    }
}