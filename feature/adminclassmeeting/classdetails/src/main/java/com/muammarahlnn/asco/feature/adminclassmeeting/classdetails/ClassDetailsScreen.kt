package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component.ClassDetailsHeaderCard
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component.ClassDetailsTopAppBar
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component.ParticipantCard
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component.ParticipantSeparator

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsScreen, 04/07/2024 00.07
 */
@Composable
internal fun ClassDetailsScreen(
    onBackClick: () -> Unit,
    onAddParticipantsClick: () -> Unit,
    onDeleteParticipantClick: () -> Unit,
    state: ClassDetailsState = ClassDetailsState(),
) {
    Scaffold(
        topBar = {
            ClassDetailsTopAppBar(
                title = state.className,
                onBackClick = onBackClick,
            )
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            item {
                ClassDetailsHeaderCard(
                    className = state.className,
                    practicumName = state.practicumName,
                    day = state.day,
                    startTime = state.startTime,
                    endTime = state.endTime,
                )
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }

            item {
                ParticipantSeparator(onAddParticipantsClick = onAddParticipantsClick)
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }

            items(10) {
                ParticipantCard(
                    studentId = "H071191032",
                    studentName = "Muammar Ahlan Abimanyu",
                    onDeleteClick = { onDeleteParticipantClick() },
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
        }
    }
}