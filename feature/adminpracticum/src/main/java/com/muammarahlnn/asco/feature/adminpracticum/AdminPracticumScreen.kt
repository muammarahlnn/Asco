package com.muammarahlnn.asco.feature.adminpracticum

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.feature.adminpracticum.component.AdminPracticumTopAppBar
import com.muammarahlnn.asco.feature.adminpracticum.component.FabAddButton
import com.muammarahlnn.asco.feature.adminpracticum.component.PracticumCard

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumScreen, 19/06/2024 02.42
 */
@Composable
internal fun AdminPracticumScreen(
    state: AdminPracticumState = AdminPracticumState(),
    actions: AdminPracticumActions = AdminPracticumActions(),
) {
    Scaffold(
        topBar = {
            AdminPracticumTopAppBar(
                onBackClick = actions.onBackClick,
            )
        },
        floatingActionButton = {
            FabAddButton(
                onClick = actions.onFabAddButtonClick,
            )
        },
        floatingActionButtonPosition = FabPosition.End,
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            items(10) {
                PracticumCard(
                    practicumName = "Pemrograman Mobile B",
                    numberOfClasses = 3,
                    onClick = actions.onPracticumClick,
                )
            }
        }
    }
}

@Preview
@Composable
private fun AdminPracticumScreenPreview() {
    AscoTheme {
        AdminPracticumScreen()
    }
}