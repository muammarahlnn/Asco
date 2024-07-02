package com.muammarahlnn.feature.adminclassmeeting.practicums

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsViewModel, 02/07/2024 21.54
 */
@HiltViewModel
internal class PracticumsViewModel @Inject constructor() :
    BaseViewModel<PracticumsState>(PracticumsState())