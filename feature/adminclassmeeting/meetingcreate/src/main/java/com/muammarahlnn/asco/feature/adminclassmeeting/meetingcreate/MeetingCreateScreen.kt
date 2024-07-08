package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkBlue
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.ui.component.BaseOutlinedTextField
import com.muammarahlnn.asco.core.ui.component.PurpleOutlinedDropdownMenu
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.component.FileSection
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.component.MeetingCreateTopAppBar
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.component.MeetingDateInput

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingCreateScreen, 08/07/2024 18.14
 */
@Composable
internal fun MeetingCreateScreen(
    state: MeetingCreateState = MeetingCreateState(),
    actions: MeetingCreateActions = MeetingCreateActions(),
) {
    Scaffold(
        topBar = {
            MeetingCreateTopAppBar(
                title = stringResource(id = R.string.add_meeting),
                onCloseClick = actions.onCloseClick ,
                onDoneClick = actions.onDoneClick
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            InputSection(title = stringResource(id = R.string.meeting_number_label)) {
                BaseOutlinedTextField(
                    value = "4",
                    onValueChange = {},
                    borderColor = DarkBlue,
                    enabled = false,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            InputSection(title = stringResource(id = R.string.material_name_label)) {
                BaseOutlinedTextField(
                    value = state.materialName,
                    onValueChange = actions.onMaterialNameChange,
                    borderColor = DarkerPurple,
                    imeAction = ImeAction.Next,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            InputSection(title = stringResource(id = R.string.meeting_date_label)) {
                MeetingDateInput(
                    meetingDate = state.meetingDate,
                    onMeetingDateChange = actions.onMeetingDateChange,
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            var isSpeakerDropdownExpanded by rememberSaveable { mutableStateOf(false) }
            InputSection(title = stringResource(id = R.string.speaker_label)) {
                PurpleOutlinedDropdownMenu(
                    value = state.speakers[state.selectedSpeakerIndex],
                    isExpanded = isSpeakerDropdownExpanded,
                    menuItems = state.speakers,
                    onItemClick = { index, _ ->
                        actions.onSpeakerSelected(index)
                        isSpeakerDropdownExpanded = false
                    },
                    onExpandedChange = { isSpeakerDropdownExpanded = it },
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            var isCoSpeakerDropdownExpanded by rememberSaveable { mutableStateOf(false) }
            InputSection(title = stringResource(id = R.string.co_speaker_label)) {
                PurpleOutlinedDropdownMenu(
                    value = state.coSpeakers[state.selectedCoSpeakerIndex],
                    isExpanded = isCoSpeakerDropdownExpanded,
                    menuItems = state.coSpeakers,
                    onItemClick = { index, _ ->
                        actions.onCoSpeakerSelected(index)
                        isCoSpeakerDropdownExpanded = false
                    },
                    onExpandedChange = { isCoSpeakerDropdownExpanded = it },
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            InputSection(title = stringResource(id = R.string.module_label)) {
                FileSection(
                    onShowClick = actions.onShowModuleClick,
                    onUploadClick = actions.onUploadModuleClick,
                    onDeleteClick = actions.onDeleteModuleClick,
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            InputSection(title = stringResource(id = R.string.practicum_question_label)) {
                FileSection(
                    onShowClick = actions.onShowPracticumQuestionClick,
                    onUploadClick = actions.onUploadPracticumQuestionClick,
                    onDeleteClick = actions.onDeletePracticumQuestionClick,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}

@Composable
private fun InputSection(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium,
            color = DarkerPurple,
        )
        
        Spacer(modifier = Modifier.height(8.dp))

        content()
    }
}

@Preview
@Composable
private fun MeetingCreateScreenPreview() {
    AscoTheme {
        MeetingCreateScreen()
    }
}