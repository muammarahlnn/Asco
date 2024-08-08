package com.muammarahlnn.feature.adminattendance.practicums

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumsViewModel, 07/08/2024 20.53
 */
@HiltViewModel
internal class PracticumsViewModel @Inject constructor() :
    BaseViewModel<PracticumsState>(PracticumsState())