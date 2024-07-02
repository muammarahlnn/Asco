package com.muammarahlnn.feature.adminclassmeeting.practicums.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.feature.adminclassmeeting.practicums.PracticumsRoute
import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsNavigation, 02/07/2024 22.03
 */
@Serializable
object Practicums

fun NavGraphBuilder.practicumsScreen(
    onBackClick: () -> Unit,
    onClassButtonClick: () -> Unit,
    onMeetingButtonClick: () -> Unit,
) {
    composable<Practicums> {
        PracticumsRoute(
            onBackClick = onBackClick,
            onClassButtonClick = onClassButtonClick,
            onMeetingButtonClick = onMeetingButtonClick,
        )
    }
}