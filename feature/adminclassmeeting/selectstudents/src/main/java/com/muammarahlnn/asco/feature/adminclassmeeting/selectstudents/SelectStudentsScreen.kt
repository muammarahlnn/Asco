package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.muammarahlnn.asco.core.ui.component.SelectMembersScreen
import com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents.component.SelectStudentsTopAppBar

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsScreen, 04/07/2024 03.21
 */
@Composable
internal fun SelectStudentsScreen(
    onCloseClick: () -> Unit,
    onSearchQueryChange: (String) -> Unit,
    state: SelectStudentsState = SelectStudentsState(),
) {
    Scaffold(
        topBar = {
            SelectStudentsTopAppBar(
                title = state.className,
                onCloseClick = onCloseClick,
                onDoneClick = {}
            )
        },
    ) { paddingValues ->
        SelectMembersScreen(
            searchQuery = state.searchQuery,
            onSearchQueryChange = onSearchQueryChange,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        )
    }
}