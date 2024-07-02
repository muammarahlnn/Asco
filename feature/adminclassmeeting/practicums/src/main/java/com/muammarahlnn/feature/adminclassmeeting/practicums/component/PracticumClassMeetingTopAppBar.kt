package com.muammarahlnn.feature.adminclassmeeting.practicums.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.component.AscoDarkCenteredTopAppBar

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumClassMeetingTopAppBar, 01/07/2024 23.36
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun PracticumClassMeetingTopAppBar(
    title: String,
    onBackClick: () -> Unit,
) {
    AscoDarkCenteredTopAppBar(
        title = title,
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBackIosNew,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }
        }
    )
}