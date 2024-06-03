package com.muammarahlnn.feature.login.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.feature.login.LoginDestination
import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LoginNavigation, 03/06/2024 17.21
 */
@Serializable
object LoginScreen

fun NavGraphBuilder.loginScreen() {
    composable<LoginScreen> {
        LoginDestination()
    }
}