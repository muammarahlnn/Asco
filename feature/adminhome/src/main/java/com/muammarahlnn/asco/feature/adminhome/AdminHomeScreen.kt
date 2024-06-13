package com.muammarahlnn.asco.feature.adminhome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.FeaturedPlayList
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.rounded.BackHand
import androidx.compose.material.icons.rounded.DataObject
import androidx.compose.material.icons.rounded.FormatListNumbered
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.MeetingRoom
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.DarkestPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.Purple
import com.muammarahlnn.asco.core.ui.AscoLogoTitle
import com.muammarahlnn.asco.feature.adminhome.AdminMenu.*
import com.muammarahlnn.asco.core.ui.R as uiR

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeScreen, 04/06/2024 15.47
 */
@Composable
internal fun AdminHomeDestination(
    navigateToAdminUser: () -> Unit,
    modifier: Modifier = Modifier,
) {
    AdminHomeScreen(
        navigateToAdminUser = navigateToAdminUser,
        modifier = modifier,
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun AdminHomeScreen(
    navigateToAdminUser: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            AdminHomeTopAppBar()
        },
        modifier = modifier.fillMaxSize()
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
                    val onMenuClick = {
                        when (menu) {
                            USER -> navigateToAdminUser()
                            PRACTICUM -> {}
                            CLASS_AND_MEETING -> {}
                            ATTENDANCE -> {}
                            SCORE -> {}
                            ASSISTANCE -> {}
                            CONTROL_CARD -> {}
                            LAB_RULES -> {}
                        }
                    }

                    AdminMenuCard(
                        icon = menu.icon,
                        title = stringResource(id = menu.textRes),
                        modifier = Modifier
                            .weight(1f)
                            .clickable { onMenuClick() },
                    )
                }
            }
        }
    }
}

@Composable
private fun AdminHeaderCard(
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
                    painter = painterResource(id = uiR.drawable.asco_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .size(32.dp)
                )
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = stringResource(id = R.string.admin),
                        style = MaterialTheme.typography.bodyMedium,
                        color = Purple,
                    )
                    Text(
                        text = stringResource(id = R.string.lab_coordinator),
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
                        painter = painterResource(id = R.drawable.ic_logout),
                        contentDescription = null,
                        tint = PureWhite,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun AdminMenuCard(
    icon: ImageVector,
    title: String,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(128.dp),
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
                .fillMaxWidth(fraction = 0.98f)
                .fillMaxHeight(fraction = 0.98f)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(Purple)
                        .size(36.dp)
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = PureWhite,
                        modifier = Modifier.size(24.dp),
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = title,
                    style = MaterialTheme.typography.labelLarge.copy(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                    ),
                    color = DarkestPurple,
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AdminHomeTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            AscoLogoTitle()
        }
    )
}