package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.MeetingDetailsRoute
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDetailsNavigation, 06/07/2024 22.41
 */
fun NavGraphBuilder.meetingDetailsScreen(
    navController: NavController,
) {
    composable<AdminClassMeetingDestination.MeetingDetails> {
        MeetingDetailsRoute(navController = navController)
    }
}