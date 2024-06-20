package com.muammarahlnn.asco.feature.adminpracticumdetails.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassCard, 20/06/2024 13.17
 */
@Composable
internal fun ClassCard(
    className: String,
    day: String,
    startTime: String,
    endTime: String,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PureWhite,
        ),
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = className,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp,
                ),
                color = DarkerPurple,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                text = "Setiap $day $startTime - $endTime",
                style = MaterialTheme.typography.bodySmall,
                color = Purple,
            )
        }
    }
}

@Preview
@Composable
private fun ClassCardPreview() {
    AscoTheme {
        ClassCard(
            className = "Kelas A",
            day = "Sabtu",
            startTime = "10:00",
            endTime = "12.30",
            modifier = Modifier.fillMaxWidth()
        )
    }
}