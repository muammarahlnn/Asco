package com.muammarahlnn.asco.feature.adminclassmeeting.classes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingDestination
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesCoordinator, 04/07/2024 21.29
 */
@Composable
internal fun rememberClassesCoordinator(
    navController: NavController,
    viewModel: ClassesViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): ClassesCoordinator {
    return remember(navController, viewModel, scope) {
        ClassesCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class ClassesCoordinator(
    val navController: NavController,
    val viewModel: ClassesViewModel,
    val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateBack() {
        navController.navigateUp()
    }

    fun navigateToClassDetails() {
        navController.navigate(AdminClassMeetingDestination.ClassDetails)
    }
}