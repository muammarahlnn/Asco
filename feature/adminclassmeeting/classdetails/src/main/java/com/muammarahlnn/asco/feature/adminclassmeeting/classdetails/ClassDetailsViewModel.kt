package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsViewModel, 04/07/2024 02.13
 */
@HiltViewModel
internal class ClassDetailsViewModel @Inject constructor() : BaseViewModel<ClassDetailsState>(ClassDetailsState())