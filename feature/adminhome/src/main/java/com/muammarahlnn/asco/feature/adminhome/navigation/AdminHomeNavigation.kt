package com.muammarahlnn.asco.feature.adminhome.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminhome.AdminHomeDestination
import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeNavigation, 04/06/2024 16.24
 */
@Serializable
object AdminHomeScreen

fun NavController.navigateToAdminHome(popUpToDestination: Any) {
    navigate(AdminHomeScreen) {
        popUpTo(popUpToDestination) {
            inclusive = true
        }
    }
}

fun NavGraphBuilder.adminHomeScreen() {
    composable<AdminHomeScreen> {
        AdminHomeDestination()
    }
}