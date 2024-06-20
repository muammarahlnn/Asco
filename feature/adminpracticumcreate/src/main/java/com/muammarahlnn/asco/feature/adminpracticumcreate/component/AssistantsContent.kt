package com.muammarahlnn.asco.feature.adminpracticumcreate.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.muammarahlnn.asco.core.ui.component.CircleDeleteButton
import com.muammarahlnn.asco.feature.adminpracticumcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AssistantsContent, 21/06/2024 01.41
 */
internal fun LazyListScope.assistantsContent(
    onAddAssistantsClick: () -> Unit,
    onDeleteAssistantClick: () -> Unit,
) {
    item {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(id = R.string.assistant),
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
                    .clickable { onAddAssistantsClick() }
            )
        }
    }

    item {
        Spacer(modifier = Modifier.height(8.dp))
    }

    items(5) {
        AssistantCard(
            username = "Ardan",
            fullName = "Muammar Ahlan Abimanyu",
            onDeleteClick = onDeleteAssistantClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
    }
}

@Composable
private fun AssistantCard(
    username: String,
    fullName: String,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier,
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
            Image(
                imageVector = Icons.Rounded.Person,
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = username,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Purple,
                )
                Text(
                    text = fullName,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp,
                    ),
                    color = DarkerPurple,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            
            CircleDeleteButton(onClick = onDeleteClick)
        }
    }
}

@Preview
@Composable
private fun AssistantsContentPreview() {
    AscoTheme {
        LazyColumn {
            assistantsContent(
                onAddAssistantsClick = {},
                onDeleteAssistantClick = {},
            )
        }
    }
}