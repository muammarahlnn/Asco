package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.component.AscoDarkCenteredTopAppBar
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDetailsTopAppBar, 06/07/2024 23.01
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MeetingDetailsTopAppBar(
    meetingNumber: Int,
    onBackClick: () -> Unit,
    onEditClick: () -> Unit,
) {
    AscoDarkCenteredTopAppBar(
        title = stringResource(id = R.string.meeting_number, meetingNumber),
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBackIosNew,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }
        },
        actions = {
            IconButton(onClick = onEditClick) {
                Icon(
                    imageVector = Icons.Rounded.Edit,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }
        }
    )
}

@Preview
@Composable
private fun MeetingDetailsTopAppBarPreview() {
    AscoTheme {
        MeetingDetailsTopAppBar(
            meetingNumber = 2,
            onBackClick = {},
            onEditClick = {}
        )
    }
}