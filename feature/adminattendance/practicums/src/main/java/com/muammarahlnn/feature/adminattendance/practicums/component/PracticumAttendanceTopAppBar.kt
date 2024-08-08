package com.muammarahlnn.feature.adminattendance.practicums.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.component.AscoDarkCenteredTopAppBar
import com.muammarahlnn.asco.feature.adminattendance.practicums.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumAttendanceTopAppBar, 07/08/2024 20.43
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun PracticumAttendanceTopAppBar(
    onBackClick: () -> Unit,
) {
    AscoDarkCenteredTopAppBar(
        title = stringResource(id = R.string.choose_practicum),
        navigationIcon = {
            IconButton(
                onClick = onBackClick,
            ) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBackIosNew,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }
        },
    )
}

@Preview
@Composable
private fun AdminPracticumTopAppBarPreview() {
    AscoTheme {
        PracticumAttendanceTopAppBar(
            onBackClick = {}
        )
    }
}