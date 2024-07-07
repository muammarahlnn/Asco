package com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
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
import androidx.compose.ui.unit.sp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.component.BaseCard
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.R
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.component.SpeakerType.CO_SPEAKER
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingdetails.component.SpeakerType.SPEAKER

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SpeakerSection, 06/07/2024 23.15
 */
internal fun LazyListScope.speakerSection() {
    item {
        Text(
            text = stringResource(id = R.string.speaker_and_co_speaker),
            style = MaterialTheme.typography.titleMedium,
            color = DarkerPurple,
        )
    }
    
    item { Spacer(modifier = Modifier.height(8.dp)) }

    items(5) {
        SpeakerCard(
            username = "Ardan",
            fullName = "Muammar Ahlan Abimanyu",
            speakerType = SPEAKER,
            onClick = {},
            modifier = Modifier.padding(bottom = 8.dp)
        )
    }
}

@Composable
private fun SpeakerCard(
    username: String,
    fullName: String,
    speakerType: SpeakerType,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    BaseCard(
        onClick = onClick,
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                imageVector = Icons.Rounded.Person,
                contentDescription = null,
                modifier = Modifier.size(52.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = username,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Purple,
                )
                Text(
                    text = fullName,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    ),
                    color = DarkerPurple,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )

                Spacer(modifier = Modifier.height(4.dp))

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(Purple)
                        .padding(
                            horizontal = 8.dp,
                            vertical = 4.dp,
                        )
                ) {
                    Text(
                        text = stringResource(
                            id = when (speakerType) {
                                SPEAKER -> R.string.speaker
                                CO_SPEAKER -> R.string.co_speaker
                            }
                        ),
                        style = MaterialTheme.typography.bodySmall,
                        color = PureWhite,
                    )
                }
            }
        }
    }
}

enum class SpeakerType {
    SPEAKER,
    CO_SPEAKER
}

@Preview
@Composable
private fun SpeakerSectionPreview() {
    AscoTheme {
        LazyColumn {
            speakerSection()
        }
    }
}