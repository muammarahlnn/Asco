package com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.selectstudents.SelectStudentsRoute
import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SelectStudentsNavigation, 04/07/2024 03.23
 */
@Serializable
object SelectStudents

fun NavController.navigateToSelectStudents() {
    this.navigate(SelectStudents)
}

fun NavGraphBuilder.selectStudentsScreen() {
    composable<SelectStudents> {
        SelectStudentsRoute()
    }
}