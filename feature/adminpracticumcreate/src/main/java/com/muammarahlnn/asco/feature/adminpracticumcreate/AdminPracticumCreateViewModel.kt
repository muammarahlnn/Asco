package com.muammarahlnn.asco.feature.adminpracticumcreate

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import com.muammarahlnn.asco.feature.adminpracticumcreate.component.PracticumClass
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCreateViewModel, 21/06/2024 00.38
 */
@HiltViewModel
internal class AdminPracticumCreateViewModel @Inject constructor() :
    BaseViewModel<AdminPracticumCreateState>(AdminPracticumCreateState()) {

    fun onNextClick() {
        updateState {
            copy(currentPage = CurrentPage.SECOND)
        }
    }

    fun onPreviousClick() {
        updateState {
            copy(currentPage = CurrentPage.FIRST)
        }
    }

    fun onSubjectNameChange(subjectName: String) {
        updateState {
            copy(subjectName = subjectName)
        }
    }

    fun showCreateClassDialog(show: Boolean) {
        updateState {
            copy(showCreateClassDialog = show)
        }
    }

    fun onConfirmCreateClassDialog(practicumClass: PracticumClass) {
        updateState {
            copy(practicumClass = practicumClass)
        }
    }
}