package com.muammarahlnn.asco.feature.adminpracticum.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.core.navigation.AscoDestination
import com.muammarahlnn.asco.feature.adminpracticum.AdminPracticumRoute

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumNavigation, 19/06/2024 02.44
 */
fun NavGraphBuilder.adminPracticumScreen() {
    composable<AscoDestination.AdminPracticum> {
        AdminPracticumRoute()
    }
}