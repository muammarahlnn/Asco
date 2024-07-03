package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Group
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.ext.toFormattedTime
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.R
import java.time.LocalTime
import com.muammarahlnn.asco.core.ui.R as uiR

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsHeaderCard, 04/07/2024 00.18
 */
@Composable
internal fun ClassDetailsHeaderCard(
    className: String,
    practicumName: String,
    day: String,
    startTime: LocalTime,
    endTime: LocalTime,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PureWhite,
        ),
        modifier = modifier,
    ) {
        Column {
            Row(
                modifier = Modifier.height(IntrinsicSize.Min)
            ) {
                Spacer(modifier = Modifier.width(16.dp))

                Image(
                    imageVector = Icons.Rounded.Group,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .size(64.dp),
                )

                Spacer(modifier = Modifier.width(48.dp))

                Image(
                    painter = painterResource(id = uiR.drawable.gray_bricks),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                )
            }

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = practicumName,
                    style = MaterialTheme.typography.titleLarge,
                    color = DarkerPurple,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    text = className,
                    style = MaterialTheme.typography.titleMedium,
                    color = Purple,
                )
                Text(
                    text = stringResource(
                        id = R.string.class_schedule,
                        day,
                        startTime.toFormattedTime(),
                        endTime.toFormattedTime(),
                    ),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Gray,
                )
            }
        }
    }
}

@Preview
@Composable
private fun ClassDetailsHeaderCardPreview() {
    AscoTheme {
        ClassDetailsHeaderCard(
            className = "Kelas A",
            practicumName = "Pemrograman Mobile",
            day = "Sabtu",
            startTime = LocalTime.of(10, 0),
            endTime = LocalTime.of(12, 30),
        )
    }
}