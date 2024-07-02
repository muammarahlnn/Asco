package com.muammarahlnn.feature.adminclassmeeting.practicums

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsRoute, 02/07/2024 21.54
 */
@Composable
internal fun PracticumsRoute(
    onBackClick: () -> Unit,
    onClassButtonClick: () -> Unit,
    onMeetingButtonClick: () -> Unit,
    viewModel: PracticumsViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    PracticumsScreen(
        state = state,
        onBackClick = onBackClick,
        onClassButtonClick = onClassButtonClick,
        onMeetingButtonClick = onMeetingButtonClick
    )
}