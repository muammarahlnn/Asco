package com.muammarahlnn.asco.feature.adminclassmeeting.meetings.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.component.OutlinedSearchBar
import com.muammarahlnn.asco.feature.adminclassmeeting.meetings.R
import com.muammarahlnn.asco.feature.adminclassmeeting.meetings.SortBy

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SearchBar, 04/07/2024 23.12
 */
@Composable
internal fun MeetingsSearchBar(
    searchQuery: String,
    sortBy: SortBy,
    onSearchQueryChange: (String) -> Unit,
    onSortClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier,
    ) {
        OutlinedSearchBar(
            query = searchQuery,
            onQueryChange = onSearchQueryChange,
            placeholder = stringResource(id = R.string.search_placeholder),
            modifier = Modifier.weight(1f),
        )

        Spacer(modifier = Modifier.width(8.dp))

        AnimatedContent(
            targetState = sortBy,
            label = "Sort icon animation"
        ) { sortBy ->
            Icon(
                imageVector = when (sortBy) {
                    SortBy.ASCENDING -> Icons.Rounded.ArrowUpward
                    SortBy.DESCENDING -> Icons.Rounded.ArrowDownward
                },
                contentDescription = null,
                tint = Purple,
                modifier = Modifier.clickable { onSortClick() }
            )
        }
    }
}

@Preview
@Composable
private fun MeetingsSearchBarPreview() {
    AscoTheme {
        MeetingsSearchBar(
            searchQuery = "",
            sortBy = SortBy.ASCENDING,
            onSearchQueryChange = {},
            onSortClick = {},
        )
    }
}