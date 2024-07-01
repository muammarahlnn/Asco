package com.muammarahlnn.asco.feature.adminclassmeeting.navigation

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingContract, 01/07/2024 23.50
 */
internal class AdminClassMeetingState

internal data class AdminClassMeetingActions(
    val onBackClick: () -> Unit = {},
    val onClassButtonClick: () -> Unit = {},
    val onMeetingButtonClick: () -> Unit = {},
)