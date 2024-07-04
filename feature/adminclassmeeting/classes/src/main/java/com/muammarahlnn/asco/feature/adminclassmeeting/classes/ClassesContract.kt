package com.muammarahlnn.asco.feature.adminclassmeeting.classes

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesContract, 03/07/2024 23.37
 */
internal data class ClassesState(
    val practicumName: String = "Pemrograman Mobile",
)

internal data class ClassesActions(
    val onBackClick: () -> Unit = {},
    val onClassClick: () -> Unit = {},
)