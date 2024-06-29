package com.muammarahlnn.asco.feature.adminpracticumcreate.component.createbadge

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.LightGray
import com.muammarahlnn.asco.feature.adminpracticumcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File IconSizeContent, 27/06/2024 22.33
 */
@Composable
internal fun IconSizeContent(
    iconSize: Float,
    onIconSizeChange: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
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
            iconSize = iconSize,
            onIconSizeChange = onIconSizeChange,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun IconSizeSlider(
    iconSize: Float,
    onIconSizeChange: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    Slider(
        value = iconSize,
        onValueChange = onIconSizeChange,
        valueRange  = MIN_ICON_SIZE_PERCENTAGE..MAX_ICON_SIZE_PERCENTAGE,
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