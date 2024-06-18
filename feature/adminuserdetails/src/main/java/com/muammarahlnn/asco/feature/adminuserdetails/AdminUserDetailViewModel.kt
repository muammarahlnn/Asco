package com.muammarahlnn.asco.feature.adminuserdetails

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserDetailViewModel, 18/06/2024 17.04
 */
@HiltViewModel
internal class AdminUserDetailViewModel @Inject constructor() :
    BaseViewModel<AdminUserDetailsState>(AdminUserDetailsState())