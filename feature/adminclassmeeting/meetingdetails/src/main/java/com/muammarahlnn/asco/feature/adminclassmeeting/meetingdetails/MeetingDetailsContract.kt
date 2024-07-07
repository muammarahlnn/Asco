package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails

import java.time.LocalDate

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDetailsContract, 06/07/2024 23.25
 */
internal data class MeetingDetailsState(
    val meetingName: String = "Control Flow",
    val practicumName: String = "Pemrograman Mobile",
    val date: LocalDate = LocalDate.now()
)

internal data class MeetingDetailsActions(
    val onBackClick: () -> Unit = {},
    val onEditClick: () -> Unit = {},
    val onOpenModuleClick: () -> Unit = {},
)