package com.muammarahlnn.asco.feature.adminclassmeeting.classes

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesViewModel, 03/07/2024 23.41
 */
@HiltViewModel
internal class ClassesViewModel @Inject constructor() : BaseViewModel<ClassesState>(ClassesState())