package com.muammarahlnn.asco.core.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkestPurple
import com.muammarahlnn.asco.core.designsystem.theme.Purple

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AscoLogoTitle, 03/06/2024 17.15
 */
@Composable
fun AscoLogoTitle(
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier,
    ) {
        Image(
            painter = painterResource(id = R.drawable.asco_logo),
            contentDescription = null,
        )
        Spacer(modifier = Modifier.width(2.dp))
        AscoTitle()
    }
}

@Composable
private fun AscoTitle() {
    val ascoString = stringResource(id = R.string.asco)
    val coStartIndex = 2
    Text(
        text = AnnotatedString(
            text = ascoString,
            spanStyles = listOf(
                AnnotatedString.Range(
                    SpanStyle(color = Purple),
                    start = coStartIndex,
                    ascoString.length,
                )
            ),
        ),
        style = MaterialTheme.typography.titleLarge,
        color = DarkestPurple,
    )
}