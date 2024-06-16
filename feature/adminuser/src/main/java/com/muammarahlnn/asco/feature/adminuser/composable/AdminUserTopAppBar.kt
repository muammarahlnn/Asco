package com.muammarahlnn.asco.feature.adminuser.composable

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material.icons.rounded.FilterList
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.feature.adminuser.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserTopAppBar, 16/06/2024 01.39
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun AdminUserTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.user_data),
                style = MaterialTheme.typography.titleMedium,
                color = PureWhite,
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {},
            ) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBackIosNew,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }
        },
        actions = {
            IconButton(
                onClick = {},
            ) {
                Icon(
                    imageVector = Icons.Rounded.FilterList,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = DarkerPurple,
        ),
        modifier = modifier,
    )
}