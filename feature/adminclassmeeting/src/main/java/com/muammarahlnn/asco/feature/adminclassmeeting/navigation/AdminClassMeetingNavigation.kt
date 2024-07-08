package com.muammarahlnn.asco.feature.adminclassmeeting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.navigation
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.navigation.classDetailsScreen
import com.muammarahlnn.asco.feature.adminclassmeeting.classes.navigation.classesScreen
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.navigation.meetingCreateScreen
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.navigation.meetingDetailsScreen
import com.muammarahlnn.asco.feature.adminclassmeeting.meetings.navigation.meetingsScreen
import com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents.navigation.selectStudentsScreen
import com.muammarahlnn.feature.adminclassmeeting.practicums.navigation.practicumsScreen

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingRoute, 30/06/2024 02.26
 */
fun NavGraphBuilder.adminClassMeetingScreen(
    navController: NavController,
) {
    navigation<AscoDestination.AdminClassMeeting>(
        startDestination = AdminClassMeetingDestination.Practicums
    ) {
        practicumsScreen(navController)
        classesScreen(navController)
        classDetailsScreen(navController)
        selectStudentsScreen(navController)
        meetingsScreen(navController)
        meetingDetailsScreen(navController)
        meetingCreateScreen(navController)
    }
}