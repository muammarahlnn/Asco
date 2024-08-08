package com.muammarahlnn.feature.adminattendance.practicums

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.ui.component.PracticumCard
import com.muammarahlnn.feature.adminattendance.practicums.component.PracticumAttendanceTopAppBar

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminAttendanceScreen, 18/07/2024 22.32
 */
@Composable
internal fun PracticumsScreen(
    state: PracticumsState = PracticumsState(),
    actions: PracticumsActions = PracticumsActions(),
) {
    Scaffold(
        topBar = {
            PracticumAttendanceTopAppBar(
                onBackClick = actions.onBackClick,
            )
        },
        modifier = Modifier.fillMaxSize(),
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            items(10) {
                PracticumCard(
                    practicumName = "Pemrograman Mobile",
                    numberOfClasses = 3,
                    onClick = {},
                )
            }
        }
    }
}

@Preview
@Composable
private fun PracticumsScreenPreview() {
    AscoTheme {
        PracticumsScreen()
    }
}