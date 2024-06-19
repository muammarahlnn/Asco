package com.muammarahlnn.asco.core.navigation

import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AscoDestination, 17/06/2024 21.09
 */
sealed interface AscoDestination {

    @Serializable
    data object Login : AscoDestination

    @Serializable
    data object AdminHome : AscoDestination

    @Serializable
    data object AdminUser : AscoDestination

    @Serializable
    data object AdminUserDetails : AscoDestination

    @Serializable
    data object AdminUserCreate : AscoDestination

    @Serializable
    data object AdminPracticum : AscoDestination

    @Serializable
    data object AdminPracticumDetails : AscoDestination
}