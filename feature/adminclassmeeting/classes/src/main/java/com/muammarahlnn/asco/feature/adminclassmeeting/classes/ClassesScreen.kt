package com.muammarahlnn.asco.feature.adminclassmeeting.classes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.feature.adminclassmeeting.classes.component.ClassCard
import com.muammarahlnn.asco.feature.adminclassmeeting.classes.component.ClassesTopAppBar
import java.time.LocalTime

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesScreen, 03/07/2024 22.32
 */
@Composable
internal fun ClassesScreen(
    onBackClick: () -> Unit,
    onClassClick: () -> Unit,
    state: ClassesState = ClassesState(),
) {
    Scaffold(
        topBar = {
            ClassesTopAppBar(
                title = state.practicumName,
                onBackClick = onBackClick,
            )
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(10) {
                ClassCard(
                    practicumName = "Pemrograman Mobile",
                    className = "Kelas A",
                    day = "Sabtu",
                    startTime = LocalTime.of(8, 0),
                    endTime = LocalTime.of(10, 30),
                    onClick = onClassClick,
                )
            }
        }
    }
}

@Preview
@Composable
private fun ClassesScreenPreview() {
    AscoTheme {
        ClassesScreen(
            state = ClassesState(practicumName = "Pemrograman Mobile"),
            onBackClick = {},
            onClassClick = {},
        )
    }
}