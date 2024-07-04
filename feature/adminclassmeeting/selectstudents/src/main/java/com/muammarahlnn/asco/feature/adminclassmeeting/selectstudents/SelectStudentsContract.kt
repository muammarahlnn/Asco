package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsContract, 04/07/2024 03.38
 */
internal data class SelectStudentsState(
    val className: String = "Kelas A",
    val searchQuery: String = "",
)

internal data class SelectStudentsActions(
    val onCloseClick: () -> Unit = {},
    val onSearchQueryChange: (String) -> Unit = {},
)