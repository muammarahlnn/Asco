package com.muammarahlnn.feature.login.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muammarahlnn.asco.core.designsystem.theme.Black
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.designsystem.theme.White
import com.muammarahlnn.asco.feature.login.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LoginDialog, 03/06/2024 22.15
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun LoginDialog(
    username: String,
    password: String,
    onUsernameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onDismissDialog: () -> Unit,
    onUserLogin: () -> Unit,
    modifier: Modifier = Modifier,
) {
    BasicAlertDialog(
        onDismissRequest = onDismissDialog,
        content = {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Spacer(modifier = Modifier.height(42.dp))

                Text(
                    text = stringResource(id = R.string.login),
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 32.sp
                    ),
                    color = Purple,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = stringResource(id = R.string.login_description),
                    style = MaterialTheme.typography.bodySmall,
                    color = Black,
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = stringResource(id = R.string.username),
                    style = MaterialTheme.typography.labelMedium,
                    color = Gray,
                    modifier = Modifier.padding(bottom = 8.dp),
                )
                LoginTextField(
                    value = username,
                    onValueChange = onUsernameChange,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Person,
                            contentDescription = stringResource(id = R.string.username),
                            tint = Purple,
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = stringResource(id = R.string.password),
                    style = MaterialTheme.typography.labelMedium,
                    color = Gray,
                    modifier = Modifier.padding(bottom = 8.dp),
                )
                LoginTextField(
                    value = password,
                    onValueChange = onPasswordChange,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Lock,
                            contentDescription = stringResource(id = R.string.password),
                            tint = Purple,
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = onUserLogin,
                    shape = RoundedCornerShape(
                        topStart = 12.dp,
                        topEnd = 32.dp,
                        bottomStart = 32.dp,
                        bottomEnd = 32.dp,
                    ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Purple,
                        contentColor = PureWhite,
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 12.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
                            contentDescription = stringResource(id = R.string.login),
                            modifier = Modifier.size(18.dp),
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(
                            text = stringResource(id = R.string.login),
                            style = MaterialTheme.typography.labelLarge,
                            color = PureWhite,
                        )
                    }
                }

                Spacer(modifier = Modifier.height(64.dp))
            }
        },
        modifier = modifier
            .clip(RoundedCornerShape(32.dp))
            .background(White)
    )
}

@Composable
private fun LoginTextField(
    value: String,
    onValueChange: (String) -> Unit,
    leadingIcon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        leadingIcon = leadingIcon,
        maxLines = 1,
        singleLine = true,
        textStyle = MaterialTheme.typography.bodySmall,
        shape = RoundedCornerShape(16.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Gray,
            focusedBorderColor = Gray,
            unfocusedTextColor = Gray,
            focusedTextColor = Black,
            cursorColor = Black,
            unfocusedContainerColor = PureWhite,
            focusedContainerColor = PureWhite,
        ),
        modifier = modifier,
    )
}