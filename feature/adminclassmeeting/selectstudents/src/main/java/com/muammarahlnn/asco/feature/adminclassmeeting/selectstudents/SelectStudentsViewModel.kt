package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsViewModel, 04/07/2024 03.52
 */
@HiltViewModel
internal class SelectStudentsViewModel @Inject constructor() :
    BaseViewModel<SelectStudentsState>(SelectStudentsState()) {

    fun onSearchQueryChange(query: String) {
        updateState {
            copy(searchQuery = query)
        }
    }
}