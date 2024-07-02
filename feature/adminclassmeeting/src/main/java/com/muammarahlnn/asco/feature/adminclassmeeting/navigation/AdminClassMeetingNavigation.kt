package com.muammarahlnn.asco.feature.adminclassmeeting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.navigation
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.feature.adminclassmeeting.practicums.navigation.Practicums
import com.muammarahlnn.feature.adminclassmeeting.practicums.navigation.practicumsScreen

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingRoute, 30/06/2024 02.26
 */
fun NavGraphBuilder.adminClassMeetingScreen(
    navController: NavController,
) {
    navigation<AscoDestination.AdminClassMeeting>(startDestination = Practicums) {
        practicumsScreen(
            onBackClick = navController::navigateUp,
            onClassButtonClick = {},
            onMeetingButtonClick = {},
        )
    }
}