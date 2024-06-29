package com.muammarahlnn.asco.feature.adminhome

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminhome.AdminMenu.CLASS_AND_MEETING
import com.muammarahlnn.asco.feature.adminhome.AdminMenu.PRACTICUM
import com.muammarahlnn.asco.feature.adminhome.AdminMenu.USER
import kotlinx.coroutines.CoroutineScope

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeCoordinator, 17/06/2024 23.51
 */
@Composable
internal fun rememberAdminHomeCoordinator(
    navController: NavController,
    viewModel: AdminHomeViewModel,
    scope: CoroutineScope = rememberCoroutineScope(),
): AdminHomeCoordinator {
    return remember(navController, viewModel, scope) {
        AdminHomeCoordinator(
            navController = navController,
            viewModel = viewModel,
            scope = scope,
        )
    }
}

internal class AdminHomeCoordinator(
    val navController: NavController,
    val viewModel: AdminHomeViewModel,
    private val scope: CoroutineScope,
) {
    val state = viewModel.state

    fun navigateToMenu(adminMenu: AdminMenu) {
        navController.navigate(
            when (adminMenu) {
                USER -> AscoDestination.AdminUser
                PRACTICUM -> AscoDestination.AdminPracticum
                CLASS_AND_MEETING -> AscoDestination.AdminClassMeeting
                else -> throw Throwable()
            }
        )
    }
}