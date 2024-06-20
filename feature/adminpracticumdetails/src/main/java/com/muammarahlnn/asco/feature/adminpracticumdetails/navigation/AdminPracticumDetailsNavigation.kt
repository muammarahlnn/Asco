package com.muammarahlnn.asco.feature.adminpracticumdetails.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminpracticumdetails.AdminPracticumDetailsRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumDetailsNavigation, 20/06/2024 02.30
 */
fun NavGraphBuilder.adminPracticumDetailsScreen(
    navController: NavController,
) {
    composable<AscoDestination.AdminPracticumDetails> {
        AdminPracticumDetailsRoute(navController = navController)
    }
}