package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.component.PracticumResourceHeaderCard
import com.muammarahlnn.asco.core.ui.ext.toFormattedDate
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.component.MeetingDetailsTopAppBar
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.component.ModuleSection
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.component.speakerSection

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDetailsScreen, 06/07/2024 22.39
 */
@Composable
internal fun MeetingDetailsScreen(
    state: MeetingDetailsState = MeetingDetailsState(),
    actions: MeetingDetailsActions = MeetingDetailsActions(),
) {
    Scaffold(
        topBar = {
            MeetingDetailsTopAppBar(
                meetingNumber = 2,
                onBackClick = actions.onBackClick,
                onEditClick = actions.onEditClick,
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            item {
                PracticumResourceHeaderCard(
                    title = state.meetingName,
                    subtitle = state.practicumName,
                    text = state.date.toFormattedDate(),
                    image = {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(Purple)
                                .size(64.dp)
                        ) {
                            Text(
                                text = "#2",
                                style = MaterialTheme.typography.titleMedium,
                                color = PureWhite,
                            )
                        }
                    },
                )
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }

            item {
                ModuleSection(onOpenModuleClick = actions.onOpenModuleClick)
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }

            speakerSection()
        }
    }
}

@Preview
@Composable
private fun MeetingDetailsScreenPreview() {
    AscoTheme {
        MeetingDetailsScreen()
    }
}