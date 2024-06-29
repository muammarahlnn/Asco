package com.muammarahlnn.asco.feature.adminclassmeeting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminclassmeeting.AdminClassMeetingRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingRoute, 30/06/2024 02.26
 */
fun NavGraphBuilder.adminClassMeetingScreen(
    navController: NavController,
) {
    composable<AscoDestination.AdminClassMeeting> { 
        AdminClassMeetingRoute(navController = navController)
    }
}