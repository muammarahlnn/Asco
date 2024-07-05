package com.muammarahlnn.asco.feature.adminclassmeeting.meetings

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsViewModel, 04/07/2024 23.06
 */
@HiltViewModel
internal class MeetingsViewModel @Inject constructor() : BaseViewModel<MeetingsState>(MeetingsState()) {

    fun onSearchQueryChange(query: String) {
        updateState {
            copy(searchQuery = query)
        }
    }

    fun onSortClick() {
        updateState {
            copy(sortBy = this.sortBy.toggle())
        }
    }
}