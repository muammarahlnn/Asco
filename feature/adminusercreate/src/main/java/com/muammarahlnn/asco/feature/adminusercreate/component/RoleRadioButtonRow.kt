package com.muammarahlnn.asco.feature.adminusercreate.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.feature.adminusercreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File RoleRadioButtonRow, 18/06/2024 21.46
 */
@Composable
internal fun RoleRadioButtonRow(
    selectedRole: UserRole,
    onRoleSelected: (UserRole) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier,
    ) {
        UserRole.entries.forEach { role ->
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = DarkerPurple,
                        shape = RoundedCornerShape(8.dp),
                    )
                    .clip(RoundedCornerShape(8.dp))
                    .background(PureWhite)
                    .weight(1f)
                    .clickable { onRoleSelected(role) }
                    .padding(16.dp),
            ) {
                Text(
                    text = stringResource(
                        id = when (role) {
                            UserRole.ASSISTANT -> R.string.assistant
                            UserRole.MENTEE -> R.string.mentee
                        }
                    ),
                    style = MaterialTheme.typography.bodyMedium,
                )

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = DarkerPurple,
                            shape = CircleShape,
                        )
                        .clip(CircleShape)
                        .background(Purple)
                        .size(24.dp)
                        .padding(4.dp)
                ) {
                    AnimatedContent(
                        targetState = selectedRole == role,
                        label = "Checked icon animation"
                    ) {
                        if (it) {
                            Icon(
                                imageVector = Icons.Rounded.Check,
                                contentDescription = null,
                                tint = PureWhite,
                            )
                        }
                    }
                }
            }
        }
    }
}

enum class UserRole {
    ASSISTANT,
    MENTEE,
}