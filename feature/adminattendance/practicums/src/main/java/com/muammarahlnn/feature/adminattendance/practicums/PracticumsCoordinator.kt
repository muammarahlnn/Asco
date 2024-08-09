package com.muammarahlnn.feature.adminattendance.practicums

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.muammarahlnn.feature.adminattendance.navigation.AdminAttendanceDestination
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsCoordinator, 07/08/2024 20.54
 */
@Composable
internal fun rememberPracticumsCoordinator(
    navController: NavController,
    viewModel: PracticumsViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): PracticumsCoordinator {
    return remember(navController, viewModel, scope) {
        PracticumsCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class PracticumsCoordinator(
    val navController: NavController,
    val viewModel: PracticumsViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }

    fun navigateToMeetings() {
        navController.navigate(AdminAttendanceDestination.Meetings)
    }
}