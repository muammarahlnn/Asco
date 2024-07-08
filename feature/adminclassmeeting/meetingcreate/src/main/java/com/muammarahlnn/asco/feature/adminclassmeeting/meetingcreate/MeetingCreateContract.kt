package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate

import java.time.LocalDate

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingCreateContract, 08/07/2024 19.04
 */
internal data class MeetingCreateState(
    val materialName: String = "",
    val meetingDate: LocalDate = LocalDate.now(),
    val selectedSpeakerIndex: Int = 0,
    val speakers: List<String> = listOf("Ardan", "Alip"),
    val selectedCoSpeakerIndex: Int = 0,
    val coSpeakers: List<String> = listOf("Alip", "Ardan"),
)

internal data class MeetingCreateActions(
    val onCloseClick: () -> Unit = {},
    val onDoneClick: () -> Unit = {},
    val onMaterialNameChange: (String) -> Unit = {},
    val onMeetingDateChange: (LocalDate) -> Unit = {},
    val onSpeakerSelected: (Int) -> Unit = {},
    val onCoSpeakerSelected: (Int) -> Unit = {},
    val onShowModuleClick: () -> Unit = {},
    val onUploadModuleClick: () -> Unit = {},
    val onDeleteModuleClick: () -> Unit = {},
    val onShowPracticumQuestionClick: () -> Unit = {},
    val onUploadPracticumQuestionClick: () -> Unit = {},
    val onDeletePracticumQuestionClick: () -> Unit = {},
)