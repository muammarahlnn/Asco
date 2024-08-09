package com.muammarahlnn.asco.feature.adminattendance.meetings.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminattendance.meetings.MeetingsRoute
import com.muammarahlnn.feature.adminattendance.navigation.AdminAttendanceDestination

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsNavigation, 09/08/2024 22.09
 */
fun NavGraphBuilder.meetingsScreen(
    navController: NavController,
) {
    composable<AdminAttendanceDestination.Meetings> {
        MeetingsRoute()
    }
}