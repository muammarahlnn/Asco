package com.muammarahlnn.asco.feature.adminpracticumcreate.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.mapSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkBlue
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.component.BaseDialog
import com.muammarahlnn.asco.core.ui.component.BaseOutlinedTextField
import com.muammarahlnn.asco.core.ui.component.GrayOutlinedDropdownMenu
import com.muammarahlnn.asco.core.ui.component.TimePickerDialog
import com.muammarahlnn.asco.core.ui.ext.toFormattedTime
import com.muammarahlnn.asco.feature.adminpracticumcreate.R
import java.time.LocalTime

/**
 * @Author Muammar Ahlan Abimanyu
 * @File CreateClassDialog, 22/06/2024 23.18
 */
@Composable
internal fun CreateClassDialog(
    practicumClass: PracticumClass,
    onDismiss: () -> Unit,
    onConfirm: (PracticumClass) -> Unit,
    modifier: Modifier = Modifier,
) {
    var tempPracticumClass by rememberSaveable(stateSaver = PracticumClassSaver) {
        mutableStateOf(practicumClass)
    }

    var showStartTimePickerDialog by remember { mutableStateOf(false) }
    if (showStartTimePickerDialog) {
        TimePickerDialog(
            time = tempPracticumClass.startTime,
            onDismiss = { showStartTimePickerDialog = false },
            onConfirm = {
                tempPracticumClass = tempPracticumClass.copy(startTime = it)
                showStartTimePickerDialog = false
            }
        )
    }

    var showEndTimePickerDialog by remember { mutableStateOf(false) }
    if (showEndTimePickerDialog) {
        TimePickerDialog(
            time = tempPracticumClass.endTime,
            onDismiss = { showEndTimePickerDialog = false },
            onConfirm = {
                tempPracticumClass = tempPracticumClass.copy(endTime = it)
                showEndTimePickerDialog = false
            }
        )
    }

    BaseDialog(
        title = {
            Text(
                text = stringResource(id = R.string.create_class_dialog_title),
                style = MaterialTheme.typography.titleMedium,
                color = DarkerPurple,
            )
        },
        content = {
            DialogContent(
                className = tempPracticumClass.name,
                recurringDay = tempPracticumClass.recurringDay,
                startTime = tempPracticumClass.startTime.toFormattedTime(),
                endTime = tempPracticumClass.endTime.toFormattedTime(),
                onRecurringDayChange = {
                    tempPracticumClass = tempPracticumClass.copy(recurringDay = it)
                },
                onStartTimeClick = { showStartTimePickerDialog = true },
                onEndTimeClick = { showEndTimePickerDialog = true },
            )
        },
        onDismiss = onDismiss,
        onConfirm = { onConfirm(tempPracticumClass)},
        modifier = modifier,
    )
}

@Composable
private fun DialogContent(
    className: String,
    recurringDay: RecurringDay,
    startTime: String,
    endTime: String,
    onRecurringDayChange: (RecurringDay) -> Unit,
    onStartTimeClick: () -> Unit,
    onEndTimeClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var isRecurringDayDropdownExpanded by rememberSaveable { mutableStateOf(false) }
    val days = stringArrayResource(id = R.array.recurring_day_array).toList()
    Column(
        modifier = modifier,
    ) {
        Text(
            text = stringResource(id = R.string.class_name_text_field_label),
            style = MaterialTheme.typography.labelLarge,
            color = DarkerPurple,
        )
        Spacer(modifier = Modifier.height(4.dp))
        BaseOutlinedTextField(
            value = className,
            onValueChange = {},
            borderColor = DarkBlue,
            borderRadius = 16.dp,
            enabled = false,
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = R.string.recurring_day_text_field_label),
            style = MaterialTheme.typography.labelLarge,
            color = DarkerPurple,
        )
        Spacer(modifier = Modifier.height(4.dp))
        GrayOutlinedDropdownMenu(
            value = days[recurringDay.ordinal],
            isExpanded = isRecurringDayDropdownExpanded,
            menuItems = days,
            onItemClick = { index, _ ->
                onRecurringDayChange(RecurringDay.entries[index])
                isRecurringDayDropdownExpanded = false
            },
            onExpandedChange = { isRecurringDayDropdownExpanded = it },
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = R.string.class_time_text_field_label),
            style = MaterialTheme.typography.labelLarge,
            color = DarkerPurple,
        )
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            TimeTextBox(
                time = startTime,
                modifier = Modifier
                    .weight(1f)
                    .clickable { onStartTimeClick() },
            )
            Spacer(modifier = Modifier.width(16.dp))

            TimeTextBox(
                time = endTime,
                modifier = Modifier
                    .weight(1f)
                    .clickable { onEndTimeClick() },
            )
        }
    }
}

@Composable
private fun TimeTextBox(
    time: String,
    modifier: Modifier = Modifier
) {
   Box(
       contentAlignment = Alignment.CenterStart,
       modifier = modifier
           .clip(RoundedCornerShape(16.dp))
           .border(
               width = 1.dp,
               color = DarkBlue,
               shape = RoundedCornerShape(16.dp),
           )
           .background(PureWhite)
   ) {
       Text(
           text = time,
           style = MaterialTheme.typography.bodyMedium,
           color = Gray,
           modifier = Modifier.padding(16.dp)
       )
   }
}

data class PracticumClass(
    val name: String = "A",
    val recurringDay: RecurringDay = RecurringDay.MONDAY,
    val startTime: LocalTime = LocalTime.of(0, 0),
    val endTime: LocalTime = LocalTime.of(0, 0),
)

val PracticumClassSaver: Saver<PracticumClass, Any> = run {
    val nameKey = "Name"
    val recurringDayKey = "Recurring Day"
    val startTimeKey = "Start time"
    val endTimeKey = "End time"
    mapSaver(
        save = {
            mapOf(
                nameKey to it.name,
                recurringDayKey to it.recurringDay,
                startTimeKey to it.startTime,
                endTimeKey to it.endTime,
            )
        },
        restore = {
            PracticumClass(
                name = it[nameKey] as String,
                recurringDay = it[recurringDayKey] as RecurringDay,
                startTime = it[startTimeKey] as LocalTime,
                endTime = it[endTimeKey] as LocalTime,
            )
        }
    )
}

enum class RecurringDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,
}

@Preview
@Composable
private fun CreateClassDialogPreview() {
    AscoTheme {
        CreateClassDialog(
            practicumClass = PracticumClass(),
            onDismiss = {},
            onConfirm = {},
        )
    }
}