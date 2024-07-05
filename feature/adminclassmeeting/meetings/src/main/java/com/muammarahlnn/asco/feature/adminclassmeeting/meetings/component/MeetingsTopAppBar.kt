package com.muammarahlnn.asco.feature.adminclassmeeting.meetings.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.component.AscoDarkCenteredTopAppBar

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingsTopAppBar, 04/07/2024 23.08
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MeetingsTopAppBar(
    practicumName: String,
    onBackClick: () -> Unit,
) {
    AscoDarkCenteredTopAppBar(
        title = practicumName,
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

@Preview
@Composable
private fun MeetingsTopAppBarPreview() {
    AscoTheme {
        MeetingsTopAppBar(
            practicumName = "Pemrograman Mobile",
            onBackClick = {},
        )
    }
}