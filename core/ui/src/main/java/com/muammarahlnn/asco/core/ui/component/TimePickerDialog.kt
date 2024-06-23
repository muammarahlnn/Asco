package com.muammarahlnn.asco.core.ui.component

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.White
import com.muammarahlnn.asco.core.ui.R
import java.time.LocalTime

/**
 * @Author Muammar Ahlan Abimanyu
 * @File TimePickerDialog, 24/06/2024 01.00
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickerDialog(
    time: LocalTime,
    onDismiss: () -> Unit,
    onConfirm: (LocalTime) -> Unit,
) {
    val timePickerState = rememberTimePickerState(
        initialHour = time.hour,
        initialMinute = time.minute,
        is24Hour = true,
    )

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = stringResource(id = R.string.input_time),
                style = MaterialTheme.typography.labelLarge,
                color = DarkerPurple,
            )
        },
        text = {
            TimeInput(
                state = timePickerState,
                colors = TimePickerDefaults.colors(
                    containerColor = White,
                ),
            )
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirm(LocalTime.of(timePickerState.hour, timePickerState.minute))
                }
            ) {
                Text(
                    text = stringResource(id = R.string.OK),
                    style = MaterialTheme.typography.labelMedium,
                    color = DarkerPurple,
                )
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(
                    text = stringResource(id = R.string.cancel),
                    style = MaterialTheme.typography.labelMedium,
                    color = DarkerPurple,
                )
            }
        }
    )
}

@Preview
@Composable
private fun TimePickerDialogPreview() {
    AscoTheme {
        TimePickerDialog(
            time = LocalTime.of(0, 0),
            onDismiss = {},
            onConfirm = {}
        )
    }
}