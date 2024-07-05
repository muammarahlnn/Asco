package com.muammarahlnn.asco.feature.adminclassmeeting.meetings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.component.FabAddButton
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
        floatingActionButton = {
            FabAddButton(onClick = actions.onFabAddClick)
        },
        floatingActionButtonPosition = FabPosition.End,
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

@Preview
@Composable
private fun MeetingsScreenPreview() {
    AscoTheme {
        MeetingsScreen()
    }
}