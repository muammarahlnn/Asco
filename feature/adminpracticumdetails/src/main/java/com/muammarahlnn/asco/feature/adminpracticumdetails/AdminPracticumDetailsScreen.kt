package com.muammarahlnn.asco.feature.adminpracticumdetails

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.AscoTheme
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.feature.adminpracticumdetails.component.AdminPracticumDetailsTopAppBar
import com.muammarahlnn.asco.feature.adminpracticumdetails.component.AssistantCard
import com.muammarahlnn.asco.feature.adminpracticumdetails.component.ClassCard
import com.muammarahlnn.asco.feature.adminpracticumdetails.component.PracticumHeaderCard

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumDetailsScreen, 20/06/2024 02.27
 */
@Composable
internal fun AdminPracticumDetailsScreen(
    state: AdminPracticumDetailsState = AdminPracticumDetailsState(),
    actions: AdminPracticumDetailsActions = AdminPracticumDetailsActions(),
) {
    Scaffold(
        topBar = {
            AdminPracticumDetailsTopAppBar(
                onBackClick = actions.onBackClick,
                onEditClick = actions.onEditClick,
            )
        },
        modifier = Modifier.fillMaxSize(),
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.padding(paddingValues)
        ) {
            item {
                PracticumHeaderCard(
                    practicumName = state.practicumName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.clazz),
                    style = MaterialTheme.typography. titleSmall.copy(
                        fontWeight = FontWeight.SemiBold,
                    ),
                    color = DarkerPurple,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }

            items(5) {
                ClassCard(
                    className = "Kelas A",
                    day = "Sabtu",
                    startTime = "10:00",
                    endTime = "12:30",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.assistant),
                    style = MaterialTheme.typography. titleSmall.copy(
                        fontWeight = FontWeight.SemiBold,
                    ),
                    color = DarkerPurple,
                    modifier = Modifier.padding(vertical = 8.dp),
                )
            }

            items(5) {
                AssistantCard(
                    username = "Ardan",
                    fullName = "Muammar Ahlan Abimanyu",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun AdminPracticumDetailsScreenPreview() {
    AscoTheme {
        AdminPracticumDetailsScreen()
    }
}