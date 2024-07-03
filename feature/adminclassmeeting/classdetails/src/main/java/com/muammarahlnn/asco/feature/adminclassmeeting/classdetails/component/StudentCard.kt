package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.component.BaseCard
import com.muammarahlnn.asco.core.ui.component.CircleDeleteButton

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ParticipantCard, 04/07/2024 00.32
 */
@Composable
internal fun StudentCard(
    studentId: String,
    studentName: String,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    BaseCard(
        onClick = {},
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp),
        ) {
            Image(
                imageVector = Icons.Rounded.Person,
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = studentId,
                    style = MaterialTheme.typography.bodySmall,
                    color = Purple,
                )
                Text(
                    text = studentName,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.SemiBold
                    ),
                    color = DarkerPurple,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            CircleDeleteButton(onClick = onDeleteClick)
        }
    }
}

@Preview
@Composable
private fun StudentCardPreview() {
    AscoTheme {
        StudentCard(
            studentId = "H071191032",
            studentName = "Muammar Ahlan Abimanyu",
            onDeleteClick = {},
        )
    }
}