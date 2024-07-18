package com.muammarahlnn.asco.feature.attendance.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.attendance.AdminAttendanceRoute
import com.muammarahlnn.asco.feature.attendance.AdminAttendanceScreen

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminAttendanceNavigation, 18/07/2024 22.33
 */
fun NavGraphBuilder.adminAttendanceScreen(
    navController: NavController,
) {
    composable<AscoDestination.AdminAttendance> {
        AdminAttendanceRoute()
    }
}