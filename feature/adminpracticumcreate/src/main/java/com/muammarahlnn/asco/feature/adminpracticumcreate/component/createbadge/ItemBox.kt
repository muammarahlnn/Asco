package com.muammarahlnn.asco.feature.adminpracticumcreate.component.createbadge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ItemBox, 25/06/2024 17.57
 */
@Composable
internal fun ItemBox(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(PureWhite)
            .size(80.dp),
        content = content,
    )
}