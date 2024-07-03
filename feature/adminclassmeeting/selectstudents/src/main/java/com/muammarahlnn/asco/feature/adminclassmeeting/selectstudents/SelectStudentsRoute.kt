package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsRoute, 04/07/2024 03.22
 */
@Composable
internal fun SelectStudentsRoute(
    onCloseClick: () -> Unit,
    viewModel: SelectStudentsViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    SelectStudentsScreen(
        state = state,
        onCloseClick = onCloseClick,
        onSearchQueryChange = viewModel::onSearchQueryChange,
    )
}