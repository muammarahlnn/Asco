package com.muammarahlnn.asco.feature.adminpracticum

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumViewModel, 19/06/2024 23.46
 */
@HiltViewModel
internal class AdminPracticumViewModel @Inject constructor() : BaseViewModel<AdminPracticumState>(AdminPracticumState())