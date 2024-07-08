package com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.ext.toFormattedDate
import com.muammarahlnn.asco.feature.adminclassmeeting.meetingcreate.R
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId

/**
 * @Author Muammar Ahlan Abimanyu
 * @File MeetingDateInput, 08/07/2024 19.43
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MeetingDateInput(
    meetingDate: LocalDate,
    onMeetingDateChange: (LocalDate) -> Unit,
    modifier: Modifier = Modifier
) {
    var showDialog by remember { mutableStateOf(false) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 1.dp,
                color = DarkerPurple,
                shape = RoundedCornerShape(8.dp),
            )
            .background(PureWhite)
            .clickable { showDialog = true }
            .padding(16.dp)
    ) {
        Icon(
            imageVector = Icons.Rounded.DateRange,
            contentDescription = null,
            tint = DarkerPurple,
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = meetingDate.toFormattedDate("d/M/YYYY"),
            style = MaterialTheme.typography.bodySmall,
            color = DarkerPurple,
        )
    }

    if (showDialog) {
        val datePickerState = rememberDatePickerState()
        val confirmEnabled = remember {
            derivedStateOf { datePickerState.selectedDateMillis != null }
        }

        DatePickerDialog(
            onDismissRequest = { showDialog = false },
            dismissButton = {
                TextButton(
                    onClick = { showDialog = false },
                ) {
                    Text(
                        text = stringResource(id = R.string.cancel_date_dialog_text)
                    )
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onMeetingDateChange(convertMillisToLocalDate(datePickerState.selectedDateMillis!!))
                        showDialog = false
                    },
                    enabled = confirmEnabled.value
                ) {
                    Text(
                        text = stringResource(id = R.string.confirm_date_dialog_text)
                    )
                }
            },
        ) {
            DatePicker(state = datePickerState)
        }
    }
}

private fun convertMillisToLocalDate(millis: Long): LocalDate =
    Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDate()

@Preview
@Composable
private fun MeetingDateInputPreview() {
    AscoTheme {
        MeetingDateInput(
            meetingDate = LocalDate.now(),
            onMeetingDateChange = {},
        )
    }
}