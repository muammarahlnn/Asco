package com.muammarahlnn.asco.feature.adminpracticumcreate

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCreateContract, 21/06/2024 00.34
 */
internal data class AdminPracticumCreateState(
    val currentPage: CurrentPage = CurrentPage.FIRST,
    val subjectName: String = "",
)

internal data class AdminPracticumCreateActions(
    val onCloseClick: () -> Unit = {},
    val onNextClick: () -> Unit = {},
    val onPreviousClick: () -> Unit = {},
    val onDoneClick: () -> Unit = {},
    val onSubjectNameChange: (String) -> Unit = {},
    val onShowBadgeClick: () -> Unit = {},
    val onCreateBadgeClick: () -> Unit = {},
    val onDeleteBadgeClick: () -> Unit = {},
    val onShowLectureContractClick: () -> Unit = {},
    val onUploadLectureContractClick: () -> Unit = {},
    val onDeleteLectureContractClick: () -> Unit = {},
    val onAddClassClick: () -> Unit = {},
    val onEditClassClick: () -> Unit = {},
    val onDeleteClassClick: () -> Unit = {},
    val onAddAssistantsClick: () -> Unit = {},
    val onDeleteAssistantClick: () -> Unit = {},
)