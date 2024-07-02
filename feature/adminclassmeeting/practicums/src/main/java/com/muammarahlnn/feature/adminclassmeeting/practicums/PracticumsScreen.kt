package com.muammarahlnn.feature.adminclassmeeting.practicums

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.feature.adminclassmeeting.practicums.R
import com.muammarahlnn.feature.adminclassmeeting.practicums.component.PracticumClassMeetingCard
import com.muammarahlnn.feature.adminclassmeeting.practicums.component.PracticumClassMeetingTopAppBar

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsScreen, 02/07/2024 21.49
 */
@Composable
internal fun PracticumsScreen(
    state: PracticumsState = PracticumsState(),
    onBackClick: () -> Unit,
    onClassButtonClick: () -> Unit,
    onMeetingButtonClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            PracticumClassMeetingTopAppBar(
                title = stringResource(id = R.string.choose_practicum),
                onBackClick = onBackClick,
            )
        },
        modifier = Modifier.fillMaxSize(),
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            items(10) {
                PracticumClassMeetingCard(
                    practicumName = "Pemrograman Mobile",
                    totalClasses = 4,
                    totalMeetings = 12,
                    onClassButtonClick = onClassButtonClick,
                    onMeetingButtonClick = onMeetingButtonClick,
                )
            }
        }
    }
}