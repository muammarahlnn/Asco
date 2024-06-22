package com.muammarahlnn.asco.feature.adminuser.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.White
import com.muammarahlnn.asco.core.ui.component.GrayOutlinedDropdownMenu
import com.muammarahlnn.asco.feature.adminuser.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File FilterDialog, 18/06/2024 01.41
 */
@Composable
internal fun FilterDialog(
    sortBy: FilterSortBy,
    orderBy: FilterOrderBy,
    onDismiss: () -> Unit,
    onApply: (FilterSortBy, FilterOrderBy) -> Unit,
) {
    var selectedSortBy by rememberSaveable { mutableStateOf(sortBy) }
    var selectedOrderBy by rememberSaveable { mutableStateOf(orderBy) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = stringResource(id = R.string.filter_title),
                    style = MaterialTheme.typography.titleMedium,
                    color = DarkerPurple,
                )
            }
        },
        text = {
            FilterDialogContent(
                sortBy = selectedSortBy,
                orderBy = selectedOrderBy,
                onSortByChange = { selectedSortBy = it },
                onOrderByChange = { selectedOrderBy = it },
            )
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss,
            ) {
                Text(
                    text = stringResource(id = R.string.filter_dialog_cancel),
                    style = MaterialTheme.typography.labelLarge,
                    color = Gray,
                )
            }
        },
        confirmButton = {
            TextButton(
                onClick = { onApply(selectedSortBy, selectedOrderBy) },
            ) {
                Text(
                    text = stringResource(id = R.string.filter_dialog_confirm),
                    style = MaterialTheme.typography.labelLarge,
                    color = DarkerPurple,
                )
            }
        },
        shape = RoundedCornerShape(16.dp),
        containerColor = White,
    )
}

@Composable
private fun FilterDialogContent(
    sortBy: FilterSortBy,
    orderBy: FilterOrderBy,
    onSortByChange: (FilterSortBy) -> Unit,
    onOrderByChange: (FilterOrderBy) -> Unit,
    modifier: Modifier = Modifier,
) {
    var isSortByDropdownExpanded by rememberSaveable { mutableStateOf(false) }
    var isOrderByDropdownExpanded by rememberSaveable { mutableStateOf(false) }

    val sortByMenuItems = FilterSortBy.entries.map {
        stringResource(
            id = when (it) {
                FilterSortBy.CREATED_AT -> R.string.sort_by_created_at
                FilterSortBy.USERNAME -> R.string.sort_by_username
                FilterSortBy.FULL_NAME -> R.string.sort_by_name
                FilterSortBy.ROLE -> R.string.sort_by_role
            }
        )
    }

    val orderByMenuItems = FilterOrderBy.entries.map {
        stringResource(
            id = when (it) {
                FilterOrderBy.ASCENDING -> R.string.order_by_ascending
                FilterOrderBy.DESCENDING -> R.string.order_by_descending
            }
        )
    }

    Column(modifier = modifier) {
        Text(
            text = stringResource(id = R.string.filter_sort_by_text),
            style = MaterialTheme.typography.labelLarge,
            color = DarkerPurple,
        )

        Spacer(modifier = Modifier.height(8.dp))

        FilterDropdownMenu(
            value = stringResource(
                id = when (sortBy) {
                    FilterSortBy.CREATED_AT -> R.string.sort_by_created_at
                    FilterSortBy.USERNAME -> R.string.sort_by_username
                    FilterSortBy.FULL_NAME -> R.string.sort_by_name
                    FilterSortBy.ROLE -> R.string.sort_by_role
                }
            ),
            isExpanded = isSortByDropdownExpanded,
            menuItems = sortByMenuItems,
            onValueChange = { onSortByChange(FilterSortBy.entries[it]) },
            onExpandedChange = { isSortByDropdownExpanded = it },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = R.string.filter_order_by_text),
            style = MaterialTheme.typography.labelLarge,
            color = DarkerPurple,
        )

        Spacer(modifier = Modifier.height(8.dp))

        FilterDropdownMenu(
            value = stringResource(
                id = when (orderBy) {
                    FilterOrderBy.ASCENDING -> R.string.order_by_ascending
                    FilterOrderBy.DESCENDING -> R.string.order_by_descending
                }
            ),
            isExpanded = isOrderByDropdownExpanded,
            menuItems = orderByMenuItems,
            onValueChange = { onOrderByChange(FilterOrderBy.entries[it]) },
            onExpandedChange = { isOrderByDropdownExpanded = it },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun FilterDropdownMenu(
    value: String,
    isExpanded: Boolean,
    menuItems: List<String>,
    onValueChange: (Int) -> Unit,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    GrayOutlinedDropdownMenu(
        value = value,
        isExpanded = isExpanded,
        menuItems = menuItems,
        onItemClick = { index, _ ->
            onValueChange(index)
            onExpandedChange(false)
        },
        onExpandedChange = onExpandedChange,
        modifier = modifier,
    )
}

enum class FilterSortBy {
    CREATED_AT,
    USERNAME,
    FULL_NAME,
    ROLE,
}

enum class FilterOrderBy {
    ASCENDING,
    DESCENDING,
}