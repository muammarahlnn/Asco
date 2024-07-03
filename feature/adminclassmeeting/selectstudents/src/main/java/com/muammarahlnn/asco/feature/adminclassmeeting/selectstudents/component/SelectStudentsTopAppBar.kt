package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents.component

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.component.AscoDarkCenteredTopAppBar

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsTopAppBar, 04/07/2024 03.33
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun SelectStudentsTopAppBar(
    title: String,
    onCloseClick: () -> Unit,
    onDoneClick: () -> Unit,
) {
    AscoDarkCenteredTopAppBar(
        title = title,
        navigationIcon = {
            IconButton(onClick = onCloseClick) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBackIosNew,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }
        },
        actions = {
            IconButton(onClick = onDoneClick) {
                Icon(
                    imageVector = Icons.Rounded.Check,
                    contentDescription = null,
                    tint = PureWhite,
                    modifier = Modifier.size(28.dp),
                )
            }
        }
    )
}