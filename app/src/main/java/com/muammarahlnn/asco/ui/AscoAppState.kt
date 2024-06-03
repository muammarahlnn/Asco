package com.muammarahlnn.asco.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.muammarahlnn.asco.core.designsystem.theme.White
import com.muammarahlnn.asco.core.designsystem.theme.WhitePurple

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AscoAppState, 03/06/2024 17.33
 */
@Composable
fun rememberAscoAppState(
    navController: NavHostController = rememberNavController(),
): AscoAppState {
    return remember(
        navController,
    ) {
        AscoAppState(
            navController,
        )
    }
}

@Stable
class AscoAppState(
    val navController: NavHostController,
) {

    private val currentDestination: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

    private val currentRoute: String?
        @Composable get() = currentDestination?.route

    val currentStatusBarColor: Color
        @Composable get() = when (currentRoute) {
            else -> White
        }
}