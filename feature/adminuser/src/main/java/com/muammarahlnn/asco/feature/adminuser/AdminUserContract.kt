package com.muammarahlnn.asco.feature.adminuser

import com.muammarahlnn.asco.feature.adminuser.component.FilterBy
import com.muammarahlnn.asco.feature.adminuser.component.FilterOrderBy
import com.muammarahlnn.asco.feature.adminuser.component.FilterSortBy

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserContract, 18/06/2024 00.04
 */
data class AdminUserState(
    val searchQuery: String = "",
    val filter: FilterBy = FilterBy.ALL,
    val showFilterDialog: Boolean = false,
    val filterSortBy: FilterSortBy = FilterSortBy.CREATED_AT,
    val filterOrderBy: FilterOrderBy = FilterOrderBy.ASCENDING,
)

data class AdminUserActions(
    val onBackClick: () -> Unit = {},
    val onSearchQueryChange: (String) -> Unit = {},
    val onFilterChange: (FilterBy) -> Unit = {},
    val onShowFilterDialog: (Boolean) -> Unit = {},
    val onApplyFilterDialog: (FilterSortBy, FilterOrderBy) -> Unit = { _, _ -> },
    val onUserClick: () -> Unit = {},
    val onFabAddClick: () -> Unit = {},
)