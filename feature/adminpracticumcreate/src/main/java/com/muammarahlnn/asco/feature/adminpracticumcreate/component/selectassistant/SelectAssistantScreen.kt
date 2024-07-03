package com.muammarahlnn.asco.feature.adminpracticumcreate.component.selectassistant

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.ui.component.SelectMembersScreen

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectAssistantScreen, 24/06/2024 17.29
 */
@Composable
internal fun SelectAssistantScreen(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    SelectMembersScreen(
        searchQuery = searchQuery,
        onSearchQueryChange = onSearchQueryChange,
        modifier = modifier,
    )
}

@Preview
@Composable
private fun SelectAssistantScreenPreview() {
    AscoTheme {
        SelectAssistantScreen(
            searchQuery = "",
            onSearchQueryChange = {},
            modifier = Modifier.fillMaxSize()
        )
    }
}