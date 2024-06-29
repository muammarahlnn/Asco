package com.muammarahlnn.asco.feature.adminpracticumcreate.component.secondscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.LightGray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.feature.adminpracticumcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesContent, 21/06/2024 01.16
 */
internal fun LazyListScope.classesContent(
    onAddClassClick: () -> Unit,
    onEditClassClick: () -> Unit,
    onDeleteClassClick: () -> Unit,
) {
    item {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(id = R.string.clazz),
                style = MaterialTheme.typography.titleSmall.copy(
                    fontSize = 16.sp,
                ),
                color = DarkerPurple,
            )

            Spacer(modifier = Modifier.width(8.dp))

            HorizontalDivider(
                thickness = 1.dp,
                color = LightGray,
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                imageVector = Icons.Rounded.AddCircle,
                contentDescription = null,
                tint = Purple,
                modifier = Modifier
                    .size(32.dp)
                    .clickable { onAddClassClick() }
            )
        }
    }

    item {
        Spacer(modifier = Modifier.height(8.dp))
    }

    items(5) {
        ClassCard(
            className = "Kelas A",
            day = "Sabtu",
            startTime = "10:00",
            endTime = "12:30",
            onEditClassClick = onEditClassClick,
            onDeleteClassClick = onDeleteClassClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )
    }
}

@Composable
private fun ClassCard(
    className: String,
    day: String,
    startTime: String,
    endTime: String,
    onEditClassClick: () -> Unit,
    onDeleteClassClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PureWhite,
        ),
        modifier = modifier,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = className,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                    ),
                    color = DarkerPurple,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    text = "Setiap $day $startTime - $endTime",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Purple,
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .background(Purple)
                    .size(32.dp)
                    .clickable { onEditClassClick() }
                    .padding(6.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Create,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .background(DarkerPurple)
                    .size(32.dp)
                    .clickable { onDeleteClassClick() }
                    .padding(6.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Delete,
                    contentDescription = null,
                    tint = PureWhite,
                )
            }
        }
    }
}

@Preview
@Composable
private fun ClassesContentPreview() {
    AscoTheme {
        LazyColumn {
            classesContent(
                onAddClassClick = {},
                onEditClassClick = {},
                onDeleteClassClick = {},
            )
        }
    }
}