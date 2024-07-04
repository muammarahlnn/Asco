package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsCoordinator, 04/07/2024 21.43
 */
@Composable
internal fun rememberClassDetailsCoordinator(
    navController: NavController,
    viewModel: ClassDetailsViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): ClassDetailsCoordinator {
    return remember(navController, viewModel, scope) {
        ClassDetailsCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class ClassDetailsCoordinator(
    val navController: NavController,
    val viewModel: ClassDetailsViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }

    fun navigateToSelectStudents() {
        navController.navigate(AdminClassMeetingDestination.SelectStudents)
    }
}