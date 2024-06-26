package com.muammarahlnn.asco.feature.adminpracticumcreate.component.createbadge

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.Blue
import com.muammarahlnn.asco.core.designsystem.theme.DarkBlue
import com.muammarahlnn.asco.core.designsystem.theme.DarkOrange
import com.muammarahlnn.asco.core.designsystem.theme.DarkPink
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Orange
import com.muammarahlnn.asco.core.designsystem.theme.Pink
import com.muammarahlnn.asco.core.designsystem.theme.Purple

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ColorItem, 25/06/2024 18.04
 */
internal val colors = listOf(
    Purple,
    DarkerPurple,
    Blue,
    DarkBlue,
    Orange,
    DarkOrange,
    Pink,
    DarkPink,
)

@Composable
internal fun ColorItem(
    color: Color,
    onClick: (Color) -> Unit,
    modifier: Modifier = Modifier
) {
    ItemBox(
        modifier = modifier.clickable { onClick(color) }
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(color)
                .size(42.dp)
        )
    }
}