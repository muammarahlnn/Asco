package com.muammarahlnn.asco.core.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.HorizontalRule
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Red

/**
 * @Author Muammar Ahlan Abimanyu
 * @File CircleDeleteButton, 19/06/2024 23.09
 */
@Composable
fun CircleDeleteButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(CircleShape)
            .background(Red)
            .clickable { onClick() }
    ) {
        Icon(
            imageVector = Icons.Rounded.HorizontalRule,
            contentDescription = null,
            tint = PureWhite,
            modifier = Modifier.padding(2.dp)
        )
    }
}

@Preview
@Composable
private fun CircleDeleteButtonPreview() {
    AscoTheme {
        CircleDeleteButton(
            onClick = {},
        )
    }
}