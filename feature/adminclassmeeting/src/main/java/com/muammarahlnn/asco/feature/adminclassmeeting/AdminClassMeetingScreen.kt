package com.muammarahlnn.asco.feature.adminclassmeeting

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.feature.adminclassmeeting.component.PracticumClassMeetingCard
import com.muammarahlnn.asco.feature.adminclassmeeting.component.PracticumClassMeetingTopAppBar
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingActions
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingState

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingScreen, 30/06/2024 02.23
 */
@Composable
internal fun AdminClassMeetingScreen(
    state: AdminClassMeetingState = AdminClassMeetingState(),
    actions: AdminClassMeetingActions = AdminClassMeetingActions(),
) {
    Scaffold(
        topBar = {
            PracticumClassMeetingTopAppBar(
                title = stringResource(id = R.string.choose_practicum),
                onBackClick = actions.onBackClick,
            )
        },
        modifier = Modifier.fillMaxSize(),
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            items(5) {
                PracticumClassMeetingCard(
                    practicumName = "Pemrograman Mobile",
                    totalClasses = 4,
                    totalMeetings = 12,
                    onClassButtonClick = {},
                    onMeetingButtonClick = {},
                )
            }
        }
    }
}