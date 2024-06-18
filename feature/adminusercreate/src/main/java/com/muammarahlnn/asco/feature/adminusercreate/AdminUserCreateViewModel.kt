package com.muammarahlnn.asco.feature.adminusercreate

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import com.muammarahlnn.asco.feature.adminusercreate.component.UserRole
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserCreateViewModel, 18/06/2024 22.21
 */
@HiltViewModel
internal class AdminUserCreateViewModel @Inject constructor() : BaseViewModel<AdminUserCreateState>(AdminUserCreateState()) {

    fun onUsernameChange(username: String) {
        updateState {
            copy(username = username)
        }
    }

    fun onFullNameChange(fullName: String) {
        updateState {
            copy(fullName = fullName)
        }
    }

    fun onBatchChange(batch: String) {
        updateState {
            copy(batch = batch)
        }
    }

    fun onRoleChange(role: UserRole) {
        updateState {
            copy(role = role)
        }
    }
}