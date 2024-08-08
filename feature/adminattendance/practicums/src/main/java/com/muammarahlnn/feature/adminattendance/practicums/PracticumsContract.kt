package com.muammarahlnn.feature.adminattendance.practicums

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsContract, 07/08/2024 20.52
 */
internal class PracticumsState

internal data class PracticumsActions(
    val onBackClick: () -> Unit = {},
    val onPracticumClick: () -> Unit = {},
)