package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Group
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.ui.component.PracticumResourceHeaderCard
import com.muammarahlnn.asco.core.ui.ext.toFormattedTime
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component.ClassDetailsTopAppBar
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component.StudentCard
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.component.StudentsSeparator

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsScreen, 04/07/2024 00.07
 */
@Composable
internal fun ClassDetailsScreen(
    state: ClassDetailsState = ClassDetailsState(),
    actions: ClassDetailsActions = ClassDetailsActions(),
) {
    Scaffold(
        topBar = {
            ClassDetailsTopAppBar(
                title = state.className,
                onBackClick = actions.onBackClick,
            )
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            item {
                PracticumResourceHeaderCard(
                    title = state.className,
                    subtitle = state.practicumName,
                    text = stringResource(
                        id = R.string.class_schedule,
                        state.day,
                        state.startTime.toFormattedTime(),
                        state.endTime.toFormattedTime(),
                    ),
                    image = {
                        Image(
                            imageVector = Icons.Rounded.Group,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(vertical = 16.dp)
                                .size(64.dp),
                        )
                    }
                )
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }

            item {
                StudentsSeparator(onAddStudentsClick = actions.onAddStudentsClick)
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }

            items(10) {
                StudentCard(
                    studentId = "H071191032",
                    studentName = "Muammar Ahlan Abimanyu",
                    onDeleteClick = { actions.onDeleteStudentClick() },
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun ClassDetailsScreenPreview() {
    AscoTheme {
        ClassDetailsScreen()
    }
}