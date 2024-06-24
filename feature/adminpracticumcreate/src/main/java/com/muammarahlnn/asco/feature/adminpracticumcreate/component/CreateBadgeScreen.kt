package com.muammarahlnn.asco.feature.adminpracticumcreate.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Code
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.GrayBlue
import com.muammarahlnn.asco.core.designsystem.theme.LightGray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.feature.adminpracticumcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File CreateBadgeScreen, 25/06/2024 00.12
 */
@Composable
internal fun CreateBadgeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.verticalScroll(
            state = rememberScrollState(),
        ),
    ) {
        BadgePreview(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 32.dp,
                    start = 32.dp,
                    end = 32.dp,
                )
        )

        Spacer(modifier = Modifier.height(32.dp))

        BadgeDecorationRow(
            title = stringResource(id = R.string.icon),
        ) {
            repeat(8) {
                IconItem(
                    name = "Mobile",
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        BadgeDecorationRow(
            title = stringResource(id = R.string.color),
        ) {
            repeat(8) {
                ColorItem(
                    color = Purple,
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        IconSizeContent(
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Purple
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.generate),
                style = MaterialTheme.typography.labelLarge,
                color = PureWhite,
            )
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
private fun BadgePreview(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(PureWhite),
    ) {
        Image(
            imageVector = rememberBadgeBorder(),
            contentDescription = null,
            modifier = Modifier.padding(vertical = 48.dp)
        )
    }
}

@Composable
private fun BadgeDecorationRow(
    title: String,
    modifier: Modifier = Modifier,
    rowContent: @Composable RowScope.() -> Unit,
) {
    Column(
        modifier = modifier,
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.labelLarge.copy(
                fontWeight = FontWeight.SemiBold,
            ),
            color = DarkerPurple,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .horizontalScroll(state = rememberScrollState())
                .padding(
                    start = 16.dp,
                    end = 8.dp,
                ),
        ) {
            rowContent()
        }
    }
}

@Composable
private fun IconItem(
    name: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ) {
        ItemBox {
            Icon(
                imageVector = Icons.Rounded.Code,
                contentDescription = null,
                tint = GrayBlue,
                modifier = Modifier.size(42.dp)
            )
        }

        Spacer(modifier = Modifier.height(4.dp))
        
        Text(
            text = name,
            style = MaterialTheme.typography.bodySmall,
            color = Gray,
        )
    }
}

@Composable
private fun ColorItem(
    color: Color,
    modifier: Modifier = Modifier
) {
    ItemBox(modifier = modifier) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(color)
                .size(42.dp)
        )
    }
}

@Composable
private fun ItemBox(
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

@Composable
private fun IconSizeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = R.string.icon_size),
            style = MaterialTheme.typography.labelLarge.copy(
                fontWeight = FontWeight.SemiBold,
            ),
            color = DarkerPurple,
        )

        Spacer(modifier = Modifier.height(8.dp))

        IconSizeSlider(
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun IconSizeSlider(
    modifier: Modifier = Modifier
) {
    var iconSize by remember { mutableStateOf(0f) }
    Slider(
        value = iconSize,
        onValueChange = { iconSize = it },
        colors = SliderDefaults.colors(
            thumbColor = DarkerPurple,
            activeTrackColor = DarkerPurple,
            activeTickColor = DarkerPurple,
            inactiveTickColor = LightGray,
            inactiveTrackColor = LightGray,
        ),
        modifier = modifier,
    )
}

@Preview
@Composable
private fun CreateBadgeScreenPreview() {
    AscoTheme {
        CreateBadgeScreen(
            modifier = Modifier.fillMaxSize()
        )
    }
}