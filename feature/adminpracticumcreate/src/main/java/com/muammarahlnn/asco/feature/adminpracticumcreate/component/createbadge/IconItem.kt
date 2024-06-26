package com.muammarahlnn.asco.feature.adminpracticumcreate.component.createbadge

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.GrayBlue
import com.muammarahlnn.asco.feature.adminpracticumcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File IconItem, 25/06/2024 17.56
 */
internal val icons = listOf(
    IconState(
        iconRes = R.drawable.ic_code,
        nameRes = R.string.icon_default_name,
    ),
    IconState(
        iconRes = R.drawable.ic_android,
        nameRes = R.string.icon_mobile_name,
    ),
    IconState(
        iconRes = R.drawable.ic_web,
        nameRes = R.string.icon_web_name,
    ),
    IconState(
        iconRes = R.drawable.ic_database,
        nameRes = R.string.icon_database_name,
    ),
    IconState(
        iconRes = R.drawable.ic_oop,
        nameRes = R.string.icon_oop_name,
    ),
)

internal data class IconState(
    @DrawableRes val iconRes: Int,
    @StringRes val nameRes: Int,
)

@Composable
internal fun IconItem(
    iconState: IconState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable { onClick() },
    ) {
        ItemBox {
            Icon(
                painter = painterResource(id = iconState.iconRes),
                contentDescription = null,
                tint = GrayBlue,
                modifier = Modifier.size(42.dp)
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = stringResource(id = iconState.nameRes),
            style = MaterialTheme.typography.bodySmall,
            color = Gray,
        )
    }
}