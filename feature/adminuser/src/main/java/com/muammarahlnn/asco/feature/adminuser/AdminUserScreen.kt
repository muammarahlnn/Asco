package com.muammarahlnn.asco.feature.adminuser

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.designsystem.theme.White
import com.muammarahlnn.asco.feature.adminuser.component.AdminUserTopAppBar
import com.muammarahlnn.asco.feature.adminuser.component.FilterDialog
import com.muammarahlnn.asco.feature.adminuser.component.FilterRow
import com.muammarahlnn.asco.feature.adminuser.component.SearchBar
import com.muammarahlnn.asco.feature.adminuser.component.UserItem

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminUserScreen, 13/06/2024 23.31
 */
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
internal fun AdminUserScreen(
    state: AdminUserState = AdminUserState(),
    actions: AdminUserActions = AdminUserActions(),
) {
    if (state.showFilterDialog) {
        FilterDialog(
            sortBy = state.filterSortBy,
            orderBy = state.filterOrderBy,
            onDismiss = { actions.onShowFilterDialog(false) },
            onApply = actions.onApplyFilterDialog,
        )
    }

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        topBar = {
            AdminUserTopAppBar(
                scrollBehavior = scrollBehavior,
                onBackClick = actions.onBackClick,
                onFilterClick = { actions.onShowFilterDialog(true) },
            )
        },
        floatingActionButton = {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(DarkerPurple)
                    .clickable { actions.onFabAddClick() }
                    .padding(12.dp)
            ) {
                Icon(
                    imageVector = Icons.Rounded.Add,
                    contentDescription = null,
                    tint = PureWhite,
                    modifier = Modifier.size(32.dp)
                )
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .nestedScroll(scrollBehavior.nestedScrollConnection)
        ) {
            stickyHeader {
                Column(
                    modifier = Modifier
                        .background(White)
                        .padding(
                            top = 16.dp,
                            start = 16.dp,
                            end = 16.dp,
                            bottom = 8.dp,
                        )
                ) {
                    SearchBar(
                        query = state.searchQuery,
                        onQueryChange = actions.onSearchQueryChange,
                        modifier = Modifier.fillMaxWidth(),
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    
                    FilterRow(
                        selectedFilter = state.filter,
                        onFilterChange = actions.onFilterChange,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(8.dp))
            }

            items(10) {
                UserItem(
                    onUserClick = actions.onUserClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 16.dp,
                            end = 16.dp,
                            bottom = 8.dp,
                        )
                )
            }
        }
    }
}

