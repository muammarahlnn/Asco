package com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.classdetails.ClassDetailsRoute
import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassDetailsNavigation, 04/07/2024 00.08
 */
@Serializable
object ClassDetails

fun NavController.navigateToClassDetails() {
    this.navigate(ClassDetails)
}

fun NavGraphBuilder.classDetailsScreen(
    onBackClick: () -> Unit,
    onAddStudentsClick: () -> Unit,
    onDeleteStudentClick: () -> Unit,
) {
    composable<ClassDetails> {
        ClassDetailsRoute(
            onBackClick = onBackClick,
            onAddStudentsClick = onAddStudentsClick,
            onDeleteStudentClick = onDeleteStudentClick,
        )
    }
}