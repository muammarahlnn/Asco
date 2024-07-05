package com.muammarahlnn.asco.feature.adminclassmeeting.meetings.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.meetings.MeetingsRoute
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsNavigation, 04/07/2024 22.14
 */
fun NavGraphBuilder.meetingsScreen(
    navController: NavController,
) {
    composable<AdminClassMeetingDestination.Meetings> {
        MeetingsRoute(navController = navController)
    }
}