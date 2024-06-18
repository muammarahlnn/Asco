package com.muammarahlnn.asco.feature.adminhome

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeContract, 17/06/2024 23.48
 */
internal class AdminHomeState

internal data class AdminHomeActions(
    val onMenuClick: (AdminMenu) -> Unit = {},
)