package com.muammarahlnn.asco.feature.adminuser.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.feature.adminuser.R
import com.muammarahlnn.asco.feature.adminuser.composable.FilterBy.*

/**
 * @Author Muammar Ahlan Abimanyu
 * @File FilterRow, 16/06/2024 01.54
 */
@Composable
internal fun FilterRow(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
    ) {
        FilterBy.entries.forEach {
            FilterRowItem(
                filterBy = it,
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
private fun FilterRowItem(
    filterBy: FilterBy,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .border(
                width = 1.dp,
                color = DarkerPurple,
                shape = RoundedCornerShape(8.dp)
            )
            .clip(
                RoundedCornerShape(8.dp)
            )
            .padding(
                vertical = 8.dp,
                horizontal = 12.dp,
            ),
    ) {
        Text(
            text = stringResource(
                id = when (filterBy) {
                    ALL -> R.string.filter_by_all
                    ASSISTANT -> R.string.filter_by_assistant
                    MENTEE -> R.string.filter_by_mentee
                }
            ),
            style = MaterialTheme.typography.bodySmall,
            color = DarkerPurple,
        )
    }
}

enum class FilterBy {
    ALL,
    ASSISTANT,
    MENTEE,
}