package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.MeetingCreateRoute
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingCreateNavigation, 08/07/2024 18.39
 */
fun NavGraphBuilder.meetingCreateScreen(
    navController: NavController,
) {
    composable<AdminClassMeetingDestination.MeetingCreate> { 
        MeetingCreateRoute(navController = navController)
    }
}