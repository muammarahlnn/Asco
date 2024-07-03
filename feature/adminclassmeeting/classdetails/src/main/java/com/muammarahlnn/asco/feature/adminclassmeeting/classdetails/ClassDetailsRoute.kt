package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsRoute, 04/07/2024 00.07
 */
@Composable
internal fun ClassDetailsRoute(
    onBackClick: () -> Unit,
    onAddStudentsClick: () -> Unit,
    onDeleteStudentClick: () -> Unit,
    viewModel: ClassDetailsViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    ClassDetailsScreen(
        state = state,
        onBackClick = onBackClick,
        onAddStudentsClick = onAddStudentsClick,
        onDeleteStudentClick = onDeleteStudentClick,
    )
}