package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.LightGray
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ParticipantSeparator, 04/07/2024 02.02
 */
@Composable
internal fun StudentsSeparator(
    onAddStudentsClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier,
    ) {
        Text(
            text = stringResource(id = R.string.students),
            style = MaterialTheme.typography.bodyMedium,
            color = DarkerPurple,
        )

        Spacer(modifier = Modifier.width(8.dp))

        HorizontalDivider(
            thickness = 1.dp,
            color = LightGray,
            modifier = Modifier.weight(1f)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Icon(
            imageVector = Icons.Rounded.AddCircle,
            contentDescription = null,
            tint = Purple,
            modifier = Modifier
                .size(32.dp)
                .clickable { onAddStudentsClick() }
        )
    }
}

@Preview
@Composable
private fun ParticipantSeparatorPreview() {
    AscoTheme {
        StudentsSeparator(onAddStudentsClick = {})
    }
}