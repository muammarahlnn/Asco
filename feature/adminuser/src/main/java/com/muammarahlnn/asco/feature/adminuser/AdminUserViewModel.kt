package com.muammarahlnn.asco.feature.adminuser

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import com.muammarahlnn.asco.feature.adminuser.component.FilterBy
import com.muammarahlnn.asco.feature.adminuser.component.FilterOrderBy
import com.muammarahlnn.asco.feature.adminuser.component.FilterSortBy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
* @Author Muammar Ahlan Abimanyu
* @File AdminUserViewModel, 18/06/2024 00.06
*/
@HiltViewModel
internal class AdminUserViewModel @Inject constructor() : BaseViewModel<AdminUserState>(AdminUserState()) {

    fun onSearchQueryChange(query: String) {
        updateState {
            copy(searchQuery = query)
        }
    }

    fun onFilterChange(filter: FilterBy) {
        updateState {
            copy(filter = filter)
        }
    }

    fun onShowFilterDialog(show: Boolean) {
        updateState {
            copy(showFilterDialog = show)
        }
    }

    fun onApplyFilterDialog(
        sortBy: FilterSortBy,
        orderBy: FilterOrderBy,
    ) {
        updateState {
            copy(
                filterSortBy = sortBy,
                filterOrderBy = orderBy,
            )
        }
    }
}