package com.muammarahlnn.asco.feature.adminpracticumdetails

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumDetailsViewModel, 20/06/2024 20.45
 */
@HiltViewModel
internal class AdminPracticumDetailsViewModel @Inject constructor() :
    BaseViewModel<AdminPracticumDetailsState>(AdminPracticumDetailsState())