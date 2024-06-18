package com.muammarahlnn.asco.feature.adminuserdetails

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Red
import com.muammarahlnn.asco.feature.adminuserdetails.component.AdminUserDetailsTopAppBar

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserDetailsScreen, 18/06/2024 16.33
 */
@Composable
internal fun AdminUserDetailsScreen(
    state: AdminUserDetailsState = AdminUserDetailsState(),
    actions: AdminUserActions = AdminUserActions(),
) {
    Scaffold(
        topBar = {
            AdminUserDetailsTopAppBar(
                onBackClick = actions.onBackClick,
                onEditClick = actions.onEditClick,
            )
        },
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(
                WindowInsets.safeDrawing.only(
                    WindowInsetsSides.Bottom,
                )
            )
    ) { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            Spacer(modifier = Modifier.height(48.dp))

            Image(
                contentScale = ContentScale.Crop,
                imageVector = Icons.Rounded.Person,
                contentDescription = null,
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = PureWhite,
                        shape = CircleShape,
                    )
                    .clip(CircleShape)
                    .size(128.dp)
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Text(
                text = state.name,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                ),
                color = DarkerPurple
            )

            Text(
                text = "(${state.username})",
                style = MaterialTheme.typography.bodyMedium,
                color = DarkerPurple
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = "${state.batch}",
                style = MaterialTheme.typography.titleMedium,
                color = DarkerPurple
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(DarkerPurple)
                    .padding(
                        horizontal = 16.dp,
                        vertical = 4.dp,
                    )
            ) {
                Text(
                    text = state.role,
                    style = MaterialTheme.typography.titleSmall,
                    color = PureWhite
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            OutlinedButton(
                onClick = {},
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = Red,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.reset_password),
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                    ),
                    color = Red,
                )
            }
            
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}