package com.muammarahlnn.asco.feature.adminclassmeeting.classes.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.component.BaseCard
import com.muammarahlnn.asco.core.ui.ext.toFormattedTime
import com.muammarahlnn.asco.feature.adminclassmeeting.classes.R
import java.time.LocalTime

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassCard, 03/07/2024 23.28
 */
@Composable
internal fun ClassCard(
    practicumName: String,
    className: String,
    day: String,
    startTime: LocalTime,
    endTime: LocalTime,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    BaseCard(
        onClick = onClick,
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = practicumName,
                style = MaterialTheme.typography.titleSmall,
                color = Purple,
            )
            Text(
                text = className,
                style = MaterialTheme.typography.titleMedium,
                color = DarkerPurple,
            )
            Text(
                text = stringResource(
                    id = R.string.class_schedule,
                    day,
                    startTime.toFormattedTime(),
                    endTime.toFormattedTime(),
                ),
                style = MaterialTheme.typography.bodySmall,
                color = Gray,
            )
        }
    }
}

@Preview
@Composable
private fun ClassCardPreview() {
    AscoTheme {
        ClassCard(
            practicumName = "Pemrograman Mobile",
            className = "Kelas A",
            day = "Sabtu",
            startTime = LocalTime.of(10, 0),
            endTime = LocalTime.of(12, 30),
            onClick = {}
        )
    }
}