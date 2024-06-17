package com.muammarahlnn.feature.login

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LoginState, 17/06/2024 21.32
 */
data class LoginState(
    val username: String = "",
    val password: String = "",
    val showLoginDialog: Boolean = false,
)

data class LoginActions(
    val onShowLoginDialog: (Boolean) -> Unit = {},
    val onUsernameChange: (String) -> Unit = {},
    val onPasswordChange: (String) -> Unit = {},
    val onLoginClick: () -> Unit = {},
)