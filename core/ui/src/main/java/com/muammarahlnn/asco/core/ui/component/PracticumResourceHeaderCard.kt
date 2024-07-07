package com.muammarahlnn.asco.core.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Group
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PracticumResourceHeaderCard, 06/07/2024 22.51
 */
@Composable
fun PracticumResourceHeaderCard(
    title: String,
    subtitle: String,
    text: String,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PureWhite,
        ),
        modifier = modifier,
    ) {
        Column {
            Row(
                modifier = Modifier.height(IntrinsicSize.Min)
            ) {
                Spacer(modifier = Modifier.width(16.dp))

                Image(
                    imageVector = Icons.Rounded.Group,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .size(64.dp),
                )

                Spacer(modifier = Modifier.width(48.dp))

                Image(
                    painter = painterResource(id = R.drawable.gray_bricks),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                )
            }

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                    color = DarkerPurple,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )

                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.titleMedium,
                    color = Purple,
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = text,
                    style = MaterialTheme.typography.bodySmall,
                    color = Gray,
                )
            }
        }
    }
}

@Preview
@Composable
private fun PracticumResourceHeaderCardPreview() {
    AscoTheme {
        PracticumResourceHeaderCard(
            title = "Kelas A",
            subtitle = "Pemrograman Mobile",
            text = "Setiap Sabtu 07:30 - 10:00",
        )
    }
}