package com.muammarahlnn.asco.feature.adminhome.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHeaderCard, 17/06/2024 23.57
 */
@Composable
internal fun AdminHeaderCard(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.height(IntrinsicSize.Min),
    ) {
        Box(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp,
                        bottomStart = 16.dp,
                        bottomEnd = 12.dp,
                    )
                )
                .fillMaxSize()
                .background(DarkerPurple)
        )
        Card(
            colors = CardDefaults.cardColors(
                containerColor = PureWhite,
            ),
            border = BorderStroke(
                width = 1.dp,
                color = DarkerPurple,
            ),
            modifier = Modifier
                .fillMaxWidth(fraction = 0.99f)
                .fillMaxHeight(fraction = 0.97f)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.asco_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .size(32.dp)
                )
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = stringResource(id = com.muammarahlnn.asco.feature.adminhome.R.string.admin),
                        style = MaterialTheme.typography.bodyMedium,
                        color = Purple,
                    )
                    Text(
                        text = stringResource(id = com.muammarahlnn.asco.feature.adminhome.R.string.lab_coordinator),
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                        ),
                        color = DarkerPurple,
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(Purple)
                        .size(48.dp)
                ) {
                    Icon(
                        painter = painterResource(id = com.muammarahlnn.asco.feature.adminhome.R.drawable.ic_logout),
                        contentDescription = null,
                        tint = PureWhite,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }
}