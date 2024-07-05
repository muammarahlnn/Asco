package com.muammarahlnn.asco.core.ui.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.Black
import com.muammarahlnn.asco.core.designsystem.theme.DarkestPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite

/**
 * @Author Muammar Ahlan Abimanyu
 * @File FabAddButton, 05/07/2024 18.18
 */
@Composable
fun FabAddButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    FloatingActionButton(
        onClick = onClick,
        shape = CircleShape,
        containerColor = DarkestPurple,
        modifier = modifier
            .border(
                width = 1.dp,
                color = Black,
                shape = CircleShape,
            ),
    ) {
        Icon(
            imageVector = Icons.Rounded.Add,
            contentDescription = null,
            tint = PureWhite,
            modifier = Modifier
                .size(32.dp)
        )
    }
}

@Preview
@Composable
private fun FabAddButtonPreview() {
    AscoTheme {
        FabAddButton(onClick = {})
    }
}