package com.muammarahlnn.asco.feature.adminpracticumdetails

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumDetailsContract, 20/06/2024 20.40
 */
internal data class AdminPracticumDetailsState(
    val practicumName: String = "Pemrograman Mobile",
)

internal data class AdminPracticumDetailsActions(
    val onBackClick: () -> Unit = {},
    val onEditClick: () -> Unit = {},
)