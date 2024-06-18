package com.muammarahlnn.asco.feature.adminhome

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.feature.adminhome.component.AdminHeaderCard
import com.muammarahlnn.asco.feature.adminhome.component.AdminHomeTopAppBar
import com.muammarahlnn.asco.feature.adminhome.component.AdminMenuCard

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeScreen, 04/06/2024 15.47
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
internal fun AdminHomeScreen(
    state: AdminHomeState = AdminHomeState(),
    actions: AdminHomeActions = AdminHomeActions(),
) {
    Scaffold(
        topBar = {
            AdminHomeTopAppBar()
        },
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {
            AdminHeaderCard(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            )

            FlowRow(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                maxItemsInEachRow = 2,
                modifier = Modifier.padding(horizontal = 16.dp),
            ) {
                AdminMenu.entries.forEach { menu ->
                    AdminMenuCard(
                        icon = menu.icon,
                        title = stringResource(id = menu.textRes),
                        modifier = Modifier
                            .weight(1f)
                            .clickable { actions.onMenuClick(menu) },
                    )
                }
            }
        }
    }
}