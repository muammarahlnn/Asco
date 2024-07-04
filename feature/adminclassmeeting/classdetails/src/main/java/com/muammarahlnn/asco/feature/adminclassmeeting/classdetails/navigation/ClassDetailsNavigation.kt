package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.ClassDetailsRoute
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsNavigation, 04/07/2024 00.08
 */
fun NavGraphBuilder.classDetailsScreen(
    navController: NavController,
) {
    composable<AdminClassMeetingDestination.ClassDetails> {
        ClassDetailsRoute(navController = navController)
    }
}