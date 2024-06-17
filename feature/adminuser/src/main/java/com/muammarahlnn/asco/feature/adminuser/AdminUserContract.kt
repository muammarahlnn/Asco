package com.muammarahlnn.asco.feature.adminuser

import com.muammarahlnn.asco.feature.adminuser.component.FilterBy

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserContract, 18/06/2024 00.04
 */
data class AdminUserState(
    val searchQuery: String = "",
    val filter: FilterBy = FilterBy.ALL,
)

data class AdminUserActions(
    val onSearchQueryChange: (String) -> Unit = {},
    val onFilterChange: (FilterBy) -> Unit = {},
)