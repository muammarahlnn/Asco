package com.muammarahlnn.asco.feature.adminuser.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.SpringSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.feature.adminuser.R
import com.muammarahlnn.asco.feature.adminuser.component.FilterBy.ALL
import com.muammarahlnn.asco.feature.adminuser.component.FilterBy.ASSISTANT
import com.muammarahlnn.asco.feature.adminuser.component.FilterBy.MENTEE

/**
 * @Author Muammar Ahlan Abimanyu
 * @File FilterRow, 16/06/2024 01.54
 */
@Composable
internal fun FilterRow(
    selectedFilter: FilterBy,
    onFilterChange: (FilterBy) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
    ) {
        FilterBy.entries.forEach {
            FilterRowItem(
                selected = it == selectedFilter,
                filterBy = it,
                onClick = onFilterChange,
            )

            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
private fun FilterRowItem(
    selected: Boolean,
    filterBy: FilterBy,
    onClick: (FilterBy) -> Unit,
    modifier: Modifier = Modifier,
) {
    val colorAnimationSpec: SpringSpec<Color> = SpringSpec(
        stiffness = Spring.StiffnessLow
    )
    val backgroundColor by animateColorAsState(
        targetValue = if (selected) DarkerPurple else Color.Transparent,
        animationSpec = colorAnimationSpec,
        label = "Background color animation"
    )
    val textColor by animateColorAsState(
        targetValue = if (selected) PureWhite else DarkerPurple,
        animationSpec = colorAnimationSpec,
        label = "Text color animation"
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .border(
                width = 1.dp,
                color = DarkerPurple,
                shape = RoundedCornerShape(8.dp)
            )
            .clip(RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .clickable { onClick(filterBy) }
            .padding(
                vertical = 8.dp,
                horizontal = 12.dp,
            )
            .animateContentSize(),
    ) {
        AnimatedVisibility(visible = selected) {
            Icon(
                imageVector = Icons.Rounded.Check,
                contentDescription = null,
                tint = PureWhite,
                modifier = Modifier.size(16.dp),
            )
        }

        Spacer(modifier = Modifier.width(4.dp))

        Text(
            text = stringResource(
                id = when (filterBy) {
                    ALL -> R.string.filter_by_all
                    ASSISTANT -> R.string.filter_by_assistant
                    MENTEE -> R.string.filter_by_mentee
                }
            ),
            style = MaterialTheme.typography.bodySmall,
            color = textColor,
        )
    }
}

enum class FilterBy {
    ALL,
    ASSISTANT,
    MENTEE,
}