package com.muammarahlnn.asco.feature.adminpracticum.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.feature.adminpracticum.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumTopAppBar, 19/06/2024 23.38
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun AdminPracticumTopAppBar(
    onBackClick: () -> Unit,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.practicum_data),
                style = MaterialTheme.typography.titleMedium,
                color = PureWhite,
            )
        },
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
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = DarkerPurple,
        ),
    )
}

@Preview
@Composable
private fun AdminPracticumTopAppBarPreview() {
    AscoTheme {
        AdminPracticumTopAppBar(
            onBackClick = {}
        )
    }
}