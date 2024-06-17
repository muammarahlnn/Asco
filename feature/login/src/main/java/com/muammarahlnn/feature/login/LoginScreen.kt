package com.muammarahlnn.feature.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muammarahlnn.asco.core.designsystem.theme.Black
import com.muammarahlnn.asco.core.designsystem.theme.LightestPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.composable.AscoLogoTitle
import com.muammarahlnn.asco.feature.login.R
import com.muammarahlnn.feature.login.composable.LoginDialog

/**
 * @Author Muammar Ahlan Abimanyu
 * @File LoginScreen, 03/06/2024 17.05
 */
@Composable
internal fun LoginDestination(
    onUserLogin: () -> Unit,
    modifier: Modifier = Modifier,
) {
    LoginScreen(
        onUserLogin = onUserLogin,
        modifier = modifier,
    )
}

@Composable
private fun LoginScreen(
    onUserLogin: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var showLoginDialog by remember { mutableStateOf(false) }
    if (showLoginDialog) {
        LoginDialog(
            onDismissDialog = {
                showLoginDialog = false
            },
            onUserLogin = {
                onUserLogin()
                showLoginDialog = false
            },
        )
    }

    Scaffold(
        topBar = {
            LoginTopAppBar()
        },
    ) { paddingValues ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Spacer(modifier = Modifier.height(100.dp))

            LoginTitleText(
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Text(
                text = stringResource(id = R.string.asco_description),
                style = MaterialTheme.typography.bodyMedium,
                color = Black,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Button(
                    onClick = {
                        showLoginDialog = true
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = PureWhite,
                        contentColor = Black,
                    ),
                    border = BorderStroke(
                        width = (0.5).dp,
                        color = LightestPurple,
                    ),
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 16.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
                            contentDescription = stringResource(id = R.string.continue_button_text),
                            modifier = Modifier.size(18.dp)
                        )

                        Spacer(modifier = Modifier.width(4.dp))

                        Text(
                            text = stringResource(id = R.string.continue_button_text),
                            style = MaterialTheme.typography.labelMedium,
                            color = Black,
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = stringResource(id = R.string.continue_description),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Black,
                )

                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}

@Composable
private fun LoginTitleText(
    modifier: Modifier = Modifier,
) {
    val loginTitle = stringResource(id = R.string.login_title)
    var currentNewLine = 0
    var secondLineIndex = 0
    for (i in loginTitle.indices) {
        val char = loginTitle[i]
        if (char == '\n') currentNewLine++
        if (currentNewLine == 2) {
            secondLineIndex = i
            break
        }
    }
    Text(
        text = AnnotatedString(
            text = loginTitle,
            spanStyles = listOf(
                AnnotatedString.Range(
                    SpanStyle(color = Purple),
                    start = secondLineIndex,
                    end = loginTitle.length
                )
            )
        ),
        style = MaterialTheme.typography.labelLarge.copy(
            fontSize = 52.sp,
            lineHeight = 52.sp,
        ),
        color = Black,
        modifier = modifier,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LoginTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            AscoLogoTitle()
        }
    )
}