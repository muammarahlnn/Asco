package com.muammarahlnn.asco.feature.adminclassmeeting.component

import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.rounded.Circle
import androidx.compose.material.icons.rounded.Group
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.LighterPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.component.BaseCard
import com.muammarahlnn.asco.feature.adminclassmeeting.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumClassMeetingCard, 01/07/2024 22.42
 */
@Composable
internal fun PracticumClassMeetingCard(
    practicumName: String,
    totalClasses: Int,
    totalMeetings: Int,
    onClassButtonClick: () -> Unit,
    onMeetingButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    BaseCard(
        onClick = {},
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row {
                Image(
                    imageVector = Icons.Rounded.Group,
                    contentDescription = null,
                    modifier = Modifier.size(52.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Column {
                    Text(
                        text = practicumName,
                        style = MaterialTheme.typography.titleSmall.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                        ),
                        color = DarkerPurple,
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = stringResource(
                                id = R.string.total_classes,
                                totalClasses,
                            ),
                            style = MaterialTheme.typography.bodyMedium,
                            color = Purple,
                        )

                        Spacer(modifier = Modifier.width(4.dp))

                        Icon(
                            imageVector = Icons.Rounded.Circle,
                            contentDescription = null,
                            tint = Purple,
                            modifier = Modifier.size(5.dp)
                        )

                        Spacer(modifier = Modifier.width(4.dp))

                        Text(
                            text = stringResource(
                                id = R.string.total_meetings,
                                totalMeetings,
                            ),
                            style = MaterialTheme.typography.bodyMedium,
                            color = Purple,
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            Row {
                Button(
                    onClick = onClassButtonClick,
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = LighterPurple,
                    ),
                    modifier = Modifier.weight(1f),
                ) {
                    Text(
                        text = stringResource(id = R.string.clazz),
                        style = MaterialTheme.typography.bodyLarge,
                        color = PureWhite,
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Button(
                    onClick = onMeetingButtonClick,
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Purple,
                    ),
                    modifier = Modifier.weight(1f),
                ) {
                    Text(
                        text = stringResource(id = R.string.meeting),
                        style = MaterialTheme.typography.bodyLarge,
                        color = PureWhite,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun PracticumClassMeetingCardPreview() {
    AscoTheme {
        PracticumClassMeetingCard(
            practicumName = "Pemrograman Mobile",
            totalClasses = 3,
            totalMeetings = 12,
            onClassButtonClick = {},
            onMeetingButtonClick = {},
        )
    }
}