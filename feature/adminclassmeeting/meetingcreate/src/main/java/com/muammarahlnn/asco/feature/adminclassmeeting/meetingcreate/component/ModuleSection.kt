package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.FileUpload
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkBlue
import com.muammarahlnn.asco.core.designsystem.theme.DarkPink
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ModuleSection, 08/07/2024 20.53
 */
@Composable
internal fun FileSection(
    onShowClick: () -> Unit,
    onUploadClick: () -> Unit,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier,
    ) {
        Button(
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = DarkBlue
            ),
            onClick = onShowClick,
            modifier = Modifier.weight(1f),
        ) {
            Text(
                text = stringResource(id = R.string.show_file_text),
                style = MaterialTheme.typography.bodyMedium,
                color = PureWhite,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(Purple)
                .clickable { onUploadClick() },
        ) {
            Icon(
                imageVector = Icons.Outlined.FileUpload,
                contentDescription = null,
                tint = PureWhite,
                modifier = Modifier
                    .padding(10.dp)
                    .size(24.dp)
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(DarkPink)
                .clickable { onDeleteClick() },
        ) {
            Icon(
                imageVector = Icons.Outlined.Delete,
                contentDescription = null,
                tint = PureWhite,
                modifier = Modifier
                    .padding(10.dp)
                    .size(24.dp)
            )
        }
    }
}

@Preview
@Composable
private fun BadgeRowPreview() {
    AscoTheme {
        FileSection(
            onShowClick = {},
            onUploadClick = {},
            onDeleteClick = {},
            modifier = Modifier.fillMaxWidth(),
        )
    }
}