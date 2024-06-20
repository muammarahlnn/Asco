package com.muammarahlnn.asco.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.muammarahlnn.asco.feature.adminhome.navigation.adminHomeScreen
import com.muammarahlnn.asco.feature.adminpracticum.navigation.adminPracticumScreen
import com.muammarahlnn.asco.feature.adminpracticumcreate.navigation.adminPracticumCreateScreen
import com.muammarahlnn.asco.feature.adminpracticumdetails.navigation.adminPracticumDetailsScreen
import com.muammarahlnn.asco.feature.adminuser.navigation.adminUserScreen
import com.muammarahlnn.asco.feature.adminusercreate.navigation.adminUserCreateScreen
import com.muammarahlnn.asco.feature.adminuserdetails.navigation.adminUserDetailsScreen
import com.muammarahlnn.asco.ui.AscoAppState
import com.muammarahlnn.feature.login.navigation.loginScreen

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AscoNavHost, 03/06/2024 17.51
 */
@Composable
internal fun AscoNavHost(
    appState: AscoAppState,
    startDestination: Any,
    modifier: Modifier = Modifier,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Start,
                animationSpec = tween(600)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Start,
                animationSpec = tween(600)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.End,
                animationSpec = tween(600)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.End,
                animationSpec = tween(600)
            )
        },
    ) {
        loginScreen(navController)
        adminHomeScreen(navController)
        adminUserScreen(navController)
        adminUserDetailsScreen(navController)
        adminUserCreateScreen(navController)
        adminPracticumScreen(navController)
        adminPracticumDetailsScreen(navController)
        adminPracticumCreateScreen(navController)
    }
}