package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.LocalDate
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingCreateViewModel, 08/07/2024 21.01
 */
@HiltViewModel
internal class MeetingCreateViewModel @Inject constructor() : BaseViewModel<MeetingCreateState>(MeetingCreateState()) {

    fun onMaterialNameChange(materialName: String) {
        updateState { copy(materialName = materialName) }
    }

    fun onMeetingDateChange(meetingDate: LocalDate) {
        updateState { copy(meetingDate = meetingDate) }
    }

    fun onSpeakerSelected(index: Int) {
        updateState { copy(selectedSpeakerIndex = index) }
    }

    fun onCoSpeakerSelected(index: Int) {
        updateState { copy(selectedCoSpeakerIndex = index) }
    }
}