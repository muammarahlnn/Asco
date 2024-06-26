package com.muammarahlnn.asco.feature.adminpracticumcreate.component.createbadge

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.GrayBlue
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.PurpleBlue
import com.muammarahlnn.asco.feature.adminpracticumcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File BadgePreview, 25/06/2024 18.21
 */
@Composable
internal fun BadgePreview(
    icon: Painter,
    color: Color,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(PureWhite),
    ) {
        val badgeWidth = 220.dp
        val badgeHeight = 240.dp

        Image(
            imageVector = rememberBadgeBorder(color),
            contentDescription = null,
            modifier = Modifier
                .padding(vertical = 48.dp)
                .width(badgeWidth)
                .height(badgeHeight)
        )

        AnimatedContent(
            targetState = icon,
            label = "Badge icon animation"
        ) { icon ->
            Icon(
                painter = icon,
                contentDescription = null,
                tint = PureWhite,
                modifier = Modifier
                    .width(badgeWidth / 2)
                    .height(badgeHeight / 2)
                    .padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
private fun BadgePreviewPreview() {
    AscoTheme {
        BadgePreview(
            icon = painterResource(id = R.drawable.ic_android),
            color = PurpleBlue,
        )
    }
}