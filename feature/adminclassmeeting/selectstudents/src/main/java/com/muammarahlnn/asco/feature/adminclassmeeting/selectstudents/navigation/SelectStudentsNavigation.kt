package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination
import com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents.SelectStudentsRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsNavigation, 04/07/2024 03.23
 */
fun NavGraphBuilder.selectStudentsScreen(
    navController: NavController,
) {
    composable<AdminClassMeetingDestination.SelectStudents> {
        SelectStudentsRoute(navController = navController)
    }
}