package com.muammarahlnn.asco.core.ui.component

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite

/**
 * @Author Muammar Ahlan Abimanyu
 * @File BaseCard, 24/06/2024 20.19
 */
@Composable
fun BaseCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PureWhite,
        ),
        onClick = onClick,
        content = content,
        modifier = modifier,
    )
}

@Preview
@Composable
private fun BaseCardPreview() {
    AscoTheme {
        BaseCard(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Test",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}