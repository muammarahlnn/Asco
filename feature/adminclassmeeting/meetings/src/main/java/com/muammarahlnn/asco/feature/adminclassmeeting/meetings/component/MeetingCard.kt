package com.muammarahlnn.asco.feature.adminclassmeeting.meetings.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.Black
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.component.CircleDeleteButton
import com.muammarahlnn.asco.core.ui.ext.toFormattedDate
import com.muammarahlnn.asco.feature.adminclassmeeting.meetings.R
import java.time.LocalDate

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingCard, 04/07/2024 22.17
 */
@Composable
internal fun MeetingCard(
    number: Int,
    meetingName: String,
    date: LocalDate,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(50.dp),
        colors = CardDefaults.cardColors(
            containerColor = PureWhite,
        ),
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Purple)
                    .size(48.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.meeting_number, number),
                    style = MaterialTheme.typography.titleMedium,
                    color = PureWhite,
                    modifier = Modifier.padding(4.dp)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))
            Column(
                modifier = Modifier.weight(1f),
            ) {
                Text(
                    text = meetingName,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                    ),
                    color = Black,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    text = date.toFormattedDate(),
                    style = MaterialTheme.typography.bodySmall,
                    color = Gray,
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            CircleDeleteButton(onClick = {})
        }
    }
}

@Preview
@Composable
private fun MeetingCardPreview() {
    AscoTheme {
        MeetingCard(
            number = 1,
            meetingName = "Control Flow",
            date = LocalDate.of(2024, 10, 21),
            onClick = {},
        )
    }
}