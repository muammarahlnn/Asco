package com.muammarahlnn.asco.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.muammarahlnn.asco.core.designsystem.theme.White
import com.muammarahlnn.asco.core.navigation.AscoDestination

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

    val currentStatusBarStyle: StatusBarStyle
        @Composable get() = when (currentRoute) {
            AscoDestination.AdminUser.canonicalName() -> StatusBarStyle(Color.Transparent, true)
            AscoDestination.AdminUserDetails.canonicalName() -> StatusBarStyle(Color.Transparent, true)
            AscoDestination.AdminUserCreate.canonicalName() -> StatusBarStyle(Color.Transparent, true)
            else -> StatusBarStyle(White)
        }
}

data class StatusBarStyle(
    val color: Color,
    val isDark: Boolean = false,
)

fun Any.canonicalName(): String? = this::class.java.canonicalName