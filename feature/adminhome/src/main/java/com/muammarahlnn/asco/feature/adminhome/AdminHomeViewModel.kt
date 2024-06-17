package com.muammarahlnn.asco.feature.adminhome

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeViewModel, 17/06/2024 23.49
 */
@HiltViewModel
class AdminHomeViewModel @Inject constructor() : BaseViewModel<AdminHomeState>(AdminHomeState())