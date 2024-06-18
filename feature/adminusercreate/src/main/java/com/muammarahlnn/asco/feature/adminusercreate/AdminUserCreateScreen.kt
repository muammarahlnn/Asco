package com.muammarahlnn.asco.feature.adminusercreate

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkGreen
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.feature.adminusercreate.component.AdminUserCreateTopAppBar
import com.muammarahlnn.asco.feature.adminusercreate.component.BatchDropdownMenu
import com.muammarahlnn.asco.feature.adminusercreate.component.RoleRadioButtonRow
import com.muammarahlnn.asco.feature.adminusercreate.component.UserDataTextField

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserCreateScreen, 18/06/2024 19.11
 */
@Composable
internal fun AdminUserCreateScreen(
    state: AdminUserCreateState = AdminUserCreateState(),
    actions: AdminUserCreateActions = AdminUserCreateActions(),
) {
    Scaffold(
        topBar = {
            AdminUserCreateTopAppBar(
                onBackClick = actions.onBackClick,
                onCreateUserClick = {},
            )
        },
        modifier = Modifier.fillMaxSize(),
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.username),
                style = MaterialTheme.typography.bodyMedium,
                color = DarkerPurple,
            )
            Spacer(modifier = Modifier.height(4.dp))
            UserDataTextField(
                value = state.username,
                onValueChange = actions.onUsernameChange,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(id = R.string.full_name),
                style = MaterialTheme.typography.bodyMedium,
                color = DarkerPurple,
            )
            Spacer(modifier = Modifier.height(4.dp))
            UserDataTextField(
                value = state.fullName,
                onValueChange = actions.onFullNameChange,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(id = R.string.batch),
                style = MaterialTheme.typography.bodyMedium,
                color = DarkerPurple,
            )
            Spacer(modifier = Modifier.height(4.dp))
            BatchDropdownMenu(
                batch = state.batch,
                onBatchChange = actions.onBatchChange,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(id = R.string.role),
                style = MaterialTheme.typography.bodyMedium,
                color = DarkerPurple,
            )
            Spacer(modifier = Modifier.height(4.dp))
            RoleRadioButtonRow(
                selectedRole = state.role,
                onRoleSelected = actions.onRoleChange,
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {},
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DarkGreen,
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.import_from_excel),
                    style = MaterialTheme.typography.labelMedium,
                    color = PureWhite,
                )
            }

            OutlinedButton(
                onClick = {},
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = DarkGreen,
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.download_excel_template),
                    style = MaterialTheme.typography.labelMedium,
                    color = DarkGreen,
                )
            }
        }
    }
}

@Preview
@Composable
private fun AdminUserCreateScreenPreview() {
    AscoTheme {
        AdminUserCreateScreen()
    }
}