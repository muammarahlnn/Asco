package com.muammarahlnn.asco.feature.adminusercreate

import com.muammarahlnn.asco.feature.adminusercreate.component.UserRole

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserCreateContract, 18/06/2024 22.19
 */
internal data class AdminUserCreateState(
    val username: String = "",
    val fullName: String = "",
    val batch: String = "",
    val role: UserRole = UserRole.ASSISTANT,
)

internal data class AdminUserCreateActions(
    val onBackClick: () -> Unit = {},
    val onUsernameChange: (String) -> Unit = {},
    val onFullNameChange: (String) -> Unit = {},
    val onBatchChange: (String) -> Unit = {},
    val onRoleChange: (UserRole) -> Unit = {},
)