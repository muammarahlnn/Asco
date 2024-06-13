package com.muammarahlnn.asco.feature.adminuser.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminuser.AdminUserDestination
import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserNavigatino, 13/06/2024 23.33
 */
@Serializable
object AdminUserScreen

fun NavController.navigateToAdminUser() {
    navigate(AdminUserScreen)
}

fun NavGraphBuilder.adminUserScreen() {
    composable<AdminUserScreen> {
        AdminUserDestination()
    }
}