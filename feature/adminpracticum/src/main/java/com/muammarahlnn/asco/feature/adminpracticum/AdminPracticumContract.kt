package com.muammarahlnn.asco.feature.adminpracticum

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumContract, 19/06/2024 23.44
 */
internal class AdminPracticumState

internal data class AdminPracticumActions(
    val onBackClick: () -> Unit = {},
    val onPracticumClick: () -> Unit = {},
    val onFabAddButtonClick: () -> Unit = {},
)