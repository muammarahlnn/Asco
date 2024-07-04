package com.muammarahlnn.asco.feature.adminclassmeeting.classes.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.classes.ClassesRoute
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesNavigation, 03/07/2024 22.34
 */
fun NavGraphBuilder.classesScreen(
    navController: NavController,
) {
    composable<AdminClassMeetingDestination.Classes> {
        ClassesRoute(navController = navController)
    }
}