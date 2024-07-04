package com.muammarahlnn.feature.adminclassmeeting.practicums

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsContract, 02/07/2024 21.55
 */
internal class PracticumsState

internal data class PracticumsActions(
    val onBackClick: () -> Unit = {},
    val onClassButtonClick: () -> Unit = {},
    val onMeetingButtonClick: () -> Unit = {},
)