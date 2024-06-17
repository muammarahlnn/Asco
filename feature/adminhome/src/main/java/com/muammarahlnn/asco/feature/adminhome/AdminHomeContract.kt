package com.muammarahlnn.asco.feature.adminhome

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeContract, 17/06/2024 23.48
 */
class AdminHomeState

data class AdminHomeActions(
    val onUserDataMenuClick: () -> Unit = {},
)