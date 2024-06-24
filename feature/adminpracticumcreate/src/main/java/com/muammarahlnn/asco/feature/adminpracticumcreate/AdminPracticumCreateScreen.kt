package com.muammarahlnn.asco.feature.adminpracticumcreate

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.muammarahlnn.asco.feature.adminpracticumcreate.CurrentPage.FIRST
import com.muammarahlnn.asco.feature.adminpracticumcreate.CurrentPage.SECOND
import com.muammarahlnn.asco.feature.adminpracticumcreate.CurrentPage.SELECT_ASSISTANT
import com.muammarahlnn.asco.feature.adminpracticumcreate.component.AdminPracticumCreateTopAppBar
import com.muammarahlnn.asco.feature.adminpracticumcreate.component.CreateClassDialog
import com.muammarahlnn.asco.feature.adminpracticumcreate.component.FirstScreen
import com.muammarahlnn.asco.feature.adminpracticumcreate.component.SecondScreen
import com.muammarahlnn.asco.feature.adminpracticumcreate.component.SelectAssistantScreen

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCreateScreen, 20/06/2024 21.54
 */
@Composable
internal fun AdminPracticumCreateScreen(
    state: AdminPracticumCreateState = AdminPracticumCreateState(),
    actions: AdminPracticumCreateActions = AdminPracticumCreateActions(),
) {
    if (state.showCreateClassDialog) {
        CreateClassDialog(
            practicumClass = state.practicumClass,
            onDismiss = actions.onDismissCreateClassDialog,
            onConfirm = actions.onConfirmCreateClassDialog,
        )
    }

    Scaffold(
        topBar = {
            AdminPracticumCreateTopAppBar(
                currentPage = state.currentPage,
                onCloseClick = actions.onCloseClick,
                onNextClick = actions.onNextClick,
                onPreviousClick = actions.onPreviousClick,
                onDoneCreatePracticumClick = actions.onDoneCreatePracticumClick,
                onDoneSelectAssistantClick = actions.onDoneSelectAssistantClick,
            )
        },
    ) { paddingValues ->
        val screenModifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)

        AnimatedContent(
            targetState = state.currentPage,
            label = "Page animation",
            transitionSpec = {
                if (targetState > initialState) {
                    slideInHorizontally(
                        animationSpec = tween(500),
                        initialOffsetX = { fullWidth -> fullWidth },
                    ) togetherWith slideOutHorizontally(
                        animationSpec = tween(500),
                        targetOffsetX = { fullWidth -> -fullWidth},
                    )
                } else {
                    slideInHorizontally(
                        animationSpec = tween(500),
                        initialOffsetX = { fullWidth -> -fullWidth },
                    ) togetherWith  slideOutHorizontally(
                        animationSpec = tween(500),
                        targetOffsetX = { fullWidth -> fullWidth },
                    )
                }
            },
        ) { currentPage ->
            when (currentPage) {
                FIRST -> FirstScreen(
                    subjectName = state.subjectName,
                    onSubjectNameChange = actions.onSubjectNameChange,
                    onShowBadgeClick = actions.onShowBadgeClick,
                    onCreateBadgeClick = actions.onCreateBadgeClick,
                    onDeleteBadgeClick = actions.onDeleteBadgeClick,
                    onShowLectureContractClick = actions.onShowLectureContractClick,
                    onUploadLectureContractClick = actions.onUploadLectureContractClick,
                    onDeleteLectureContractClick = actions.onDeleteLectureContractClick,
                    modifier = screenModifier,
                )

                SECOND -> SecondScreen(
                    onAddClassClick = actions.onAddClassClick,
                    onEditClassClick = actions.onEditClassClick,
                    onDeleteClassClick = actions.onDeleteClassClick,
                    onAddAssistantsClick = actions.onAddAssistantsClick,
                    onDeleteAssistantClick = actions.onDeleteAssistantClick,
                    modifier = screenModifier,
                )

                SELECT_ASSISTANT -> SelectAssistantScreen(
                    searchQuery = state.searchAssistantQuery,
                    onSearchQueryChange = actions.onSearchAssistantQueryChange,
                    modifier = screenModifier,
                )
            }
        }
    }
}

internal enum class CurrentPage(val pageNumber: Int) {
    FIRST(1),
    SECOND(2),
    SELECT_ASSISTANT(3),
}