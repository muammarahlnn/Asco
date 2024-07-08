package com.muammarahlnn.asco.feature.adminclassmeeting.navigation

import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminClassMeetingDestination, 04/07/2024 21.11
 */
sealed interface AdminClassMeetingDestination {

    @Serializable
    data object Practicums : AdminClassMeetingDestination

    @Serializable
    data object Classes : AdminClassMeetingDestination

    @Serializable
    data object ClassDetails : AdminClassMeetingDestination

    @Serializable
    data object SelectStudents : AdminClassMeetingDestination

    @Serializable
    data object Meetings : AdminClassMeetingDestination

    @Serializable
    data object MeetingDetails : AdminClassMeetingDestination

    @Serializable
    data object MeetingCreate : AdminClassMeetingDestination
}