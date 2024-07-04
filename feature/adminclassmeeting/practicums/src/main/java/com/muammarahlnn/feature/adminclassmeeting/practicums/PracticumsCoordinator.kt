package com.muammarahlnn.feature.adminclassmeeting.practicums

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsCoordinator, 04/07/2024 21.21
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

    fun navigateToClasses() {
        navController.navigate(AdminClassMeetingDestination.Classes)
    }
}