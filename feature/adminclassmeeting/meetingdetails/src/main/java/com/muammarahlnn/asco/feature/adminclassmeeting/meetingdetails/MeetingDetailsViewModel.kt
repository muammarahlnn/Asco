package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDetailsViewModel, 06/07/2024 23.35
 */
@HiltViewModel
internal class MeetingDetailsViewModel @Inject constructor() :
    BaseViewModel<MeetingDetailsState>(MeetingDetailsState())