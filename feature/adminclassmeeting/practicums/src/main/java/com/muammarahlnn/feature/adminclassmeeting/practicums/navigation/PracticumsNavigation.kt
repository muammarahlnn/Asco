package com.muammarahlnn.feature.adminclassmeeting.practicums.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination
import com.muammarahlnn.feature.adminclassmeeting.practicums.PracticumsRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsNavigation, 02/07/2024 22.03
 */
fun NavGraphBuilder.practicumsScreen(
    navController: NavController,
) {
    composable<AdminClassMeetingDestination.Practicums> {
        PracticumsRoute(
            navController = navController,
        )
    }
}