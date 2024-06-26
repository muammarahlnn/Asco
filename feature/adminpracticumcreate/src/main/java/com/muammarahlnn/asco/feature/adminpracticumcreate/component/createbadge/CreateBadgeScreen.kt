package com.muammarahlnn.asco.feature.adminpracticumcreate.component.createbadge

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
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
    var selectedIconResIndex by remember { mutableIntStateOf(0) }
    var selectedColor by remember { mutableStateOf(colors[0]) }

    Column(
        modifier = modifier.verticalScroll(
            state = rememberScrollState(),
        ),
    ) {
        BadgePreview(
            icon = painterResource(id = icons[selectedIconResIndex].iconRes),
            color = selectedColor,
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
            icons.forEachIndexed { index, icon ->
                IconItem(
                    iconState = icon,
                    onClick = { selectedIconResIndex = index },
                    modifier = Modifier.padding(end = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        BadgeDecorationRow(
            title = stringResource(id = R.string.color),
        ) {
            colors.forEach { color ->
                ColorItem(
                    color = color,
                    onClick = { selectedColor = it },
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