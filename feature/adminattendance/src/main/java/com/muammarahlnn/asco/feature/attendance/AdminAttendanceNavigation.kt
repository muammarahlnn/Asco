package com.muammarahlnn.asco.feature.attendance

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.feature.adminattendance.navigation.AdminAttendanceDestination
import com.muammarahlnn.feature.adminattendance.practicums.navigation.practicumsScreen

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminAttendanceNavigation, 19/07/2024 21.21
 */
fun NavGraphBuilder.adminAttendanceScreen(
    navController: NavController,
) {
    navigation<AscoDestination.AdminAttendance>(
        startDestination = AdminAttendanceDestination.Practicums
    ) {
        practicumsScreen(navController)
    }
}