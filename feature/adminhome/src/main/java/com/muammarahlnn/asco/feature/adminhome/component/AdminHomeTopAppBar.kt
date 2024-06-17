package com.muammarahlnn.asco.feature.adminhome.component

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.muammarahlnn.asco.core.ui.component.AscoLogoTitle

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminHomeTopAppBar, 17/06/2024 23.58
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun AdminHomeTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            AscoLogoTitle()
        }
    )
}