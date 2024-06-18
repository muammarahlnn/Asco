package com.muammarahlnn.asco.feature.adminuserdetails

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserDetailsContract, 18/06/2024 17.01
 */
internal data class AdminUserDetailsState(
    val name: String = "Muammar Ahlan Abimanyu",
    val username: String = "Ardan",
    val batch: Int = 2019,
    val role: String = "Asisten",
)

internal data class AdminUserActions(
    val onBackClick: () -> Unit = {},
    val onEditClick: () -> Unit = {},
)