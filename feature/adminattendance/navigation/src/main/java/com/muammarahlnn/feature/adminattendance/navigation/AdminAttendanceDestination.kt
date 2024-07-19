package com.muammarahlnn.feature.adminattendance.navigation

import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminAttendanceDestination, 19/07/2024 21.10
 */
sealed interface AdminAttendanceDestination {

    @Serializable
    data object Practicums : AdminAttendanceDestination
}