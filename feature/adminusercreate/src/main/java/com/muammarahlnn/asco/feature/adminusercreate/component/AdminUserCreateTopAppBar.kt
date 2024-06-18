package com.muammarahlnn.asco.feature.adminusercreate.component

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material.icons.rounded.Check
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
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.feature.adminusercreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserCreateTopAppBar, 18/06/2024 19.12
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun AdminUserCreateTopAppBar(
    onBackClick: () -> Unit,
    onCreateUserClick: () -> Unit,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.create_user),
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
        actions = {
            IconButton(
                onClick = onCreateUserClick,
            ) {
                Icon(
                    imageVector = Icons.Rounded.Check,
                    contentDescription = null,
                    tint = PureWhite,
                    modifier = Modifier.size(32.dp),
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = DarkerPurple,
        ),
    )
}