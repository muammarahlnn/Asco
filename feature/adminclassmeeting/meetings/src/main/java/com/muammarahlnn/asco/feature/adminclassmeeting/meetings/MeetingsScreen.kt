package com.muammarahlnn.asco.feature.adminclassmeeting.meetings

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.feature.adminclassmeeting.meetings.component.MeetingCard
import com.muammarahlnn.asco.feature.adminclassmeeting.meetings.component.MeetingsSearchBar
import com.muammarahlnn.asco.feature.adminclassmeeting.meetings.component.MeetingsTopAppBar
import java.time.LocalDate

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsScreen, 04/07/2024 22.12
 */
@Composable
internal fun MeetingsScreen(
    state: MeetingsState = MeetingsState(),
    actions: MeetingsActions = MeetingsActions(),
) {
    Scaffold(
        topBar = {
            MeetingsTopAppBar(
                practicumName = state.practicumName,
                onBackClick = actions.onBackClick
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            item {
                MeetingsSearchBar(
                    searchQuery = state.searchQuery,
                    sortBy = state.sortBy,
                    onSearchQueryChange = actions.onSearchQueryChange,
                    onSortClick = actions.onSortClick,
                )
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }

            items(10) {
                MeetingCard(
                    number = it,
                    meetingName = "Tipe Data",
                    date = LocalDate.of(2024, 10, 12),
                    onClick = actions.onSortClick,
                    modifier = Modifier.padding(bottom = 8.dp),
                )
            }
        }
    }
}