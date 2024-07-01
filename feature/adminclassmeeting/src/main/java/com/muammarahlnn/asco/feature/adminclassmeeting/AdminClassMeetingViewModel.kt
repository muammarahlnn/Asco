package com.muammarahlnn.asco.feature.adminclassmeeting

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import com.muammarahlnn.asco.feature.adminclassmeeting.navigation.AdminClassMeetingState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingViewModel, 01/07/2024 23.51
 */
@HiltViewModel
internal class AdminClassMeetingViewModel @Inject constructor() :
    BaseViewModel<AdminClassMeetingState>(AdminClassMeetingState())