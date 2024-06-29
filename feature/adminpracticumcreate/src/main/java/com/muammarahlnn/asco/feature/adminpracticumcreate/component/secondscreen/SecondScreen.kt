package com.muammarahlnn.asco.feature.adminpracticumcreate.component.secondscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SecondScreen, 21/06/2024 00.31
 */
@Composable
internal fun SecondScreen(
    onAddClassClick: () -> Unit,
    onEditClassClick: () -> Unit,
    onDeleteClassClick: () -> Unit,
    onAddAssistantsClick: () -> Unit,
    onDeleteAssistantClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        modifier = modifier,
    ) {
        classesContent(
            onAddClassClick = onAddClassClick,
            onEditClassClick = onEditClassClick,
            onDeleteClassClick = onDeleteClassClick,
        )

        item { 
            Spacer(modifier = Modifier.height(8.dp))
        }
        
        assistantsContent(
            onAddAssistantsClick = onAddAssistantsClick,
            onDeleteAssistantClick = onDeleteAssistantClick,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SecondScreenPreview() {
    AscoTheme {
        SecondScreen(
            onAddClassClick = {},
            onEditClassClick = {},
            onDeleteClassClick = {},
            onAddAssistantsClick = {},
            onDeleteAssistantClick = {},
        )
    }
}