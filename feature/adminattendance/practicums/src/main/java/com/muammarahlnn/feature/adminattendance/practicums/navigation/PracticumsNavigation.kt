package com.muammarahlnn.feature.adminattendance.practicums.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.feature.adminattendance.navigation.AdminAttendanceDestination
import com.muammarahlnn.feature.adminattendance.practicums.PracticumsRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsNavigation, 19/07/2024 21.20
 */
fun NavGraphBuilder.practicumsScreen(
    navController: NavController,
) {
    composable<AdminAttendanceDestination.Practicums> {
        PracticumsRoute()
    }
}