package com.muammarahlnn.asco.feature.adminhome

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.FeaturedPlayList
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.rounded.BackHand
import androidx.compose.material.icons.rounded.DataObject
import androidx.compose.material.icons.rounded.FormatListNumbered
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.MeetingRoom
import androidx.compose.material.icons.rounded.Person
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminMenu, 13/06/2024 23.37
 */
enum class AdminMenu(
    val icon: ImageVector,
    @StringRes val textRes: Int,
) {
    USER(
        icon = Icons.Rounded.Person,
        textRes = R.string.user_data,
    ),
    PRACTICUM(
        icon = Icons.Rounded.DataObject,
        textRes = R.string.practicum_data,
    ),
    CLASS_AND_MEETING(
        icon = Icons.Rounded.MeetingRoom,
        textRes = R.string.class_and_meeting_data,
    ),
    ATTENDANCE(
        icon = Icons.AutoMirrored.Rounded.MenuBook,
        textRes = R.string.attendance_data,
    ),
    SCORE(
        icon = Icons.Rounded.FormatListNumbered,
        textRes = R.string.score_data,
    ),
    ASSISTANCE(
        icon = Icons.Rounded.BackHand,
        textRes = R.string.assistance_data,
    ),
    CONTROL_CARD(
        icon = Icons.AutoMirrored.Rounded.FeaturedPlayList,
        textRes = R.string.control_card,
    ),
    LAB_RULES(
        icon = Icons.Rounded.Info,
        textRes = R.string.lab_rules,
    ),
}