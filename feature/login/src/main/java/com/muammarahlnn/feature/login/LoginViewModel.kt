package com.muammarahlnn.feature.login

import com.muammarahlnn.asco.core.ui.viewmodel.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LoginViewModel, 17/06/2024 22.13
 */
@HiltViewModel
internal class LoginViewModel @Inject constructor() : BaseViewModel<LoginState>(LoginState()) {

    fun onUsernameChange(username: String) {
        updateState {
            copy(username = username)
        }
    }

    fun onPasswordChange(password: String) {
        updateState {
            copy(password = password)
        }
    }

    fun showLoginDialog(show: Boolean) {
        updateState {
            copy(showLoginDialog = show)
        }
    }
}