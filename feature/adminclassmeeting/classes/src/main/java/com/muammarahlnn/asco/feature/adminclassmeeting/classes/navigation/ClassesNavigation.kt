package com.muammarahlnn.asco.feature.adminclassmeeting.classes.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.muammarahlnn.asco.feature.adminclassmeeting.classes.ClassesRoute
import kotlinx.serialization.Serializable

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ClassesNavigation, 03/07/2024 22.34
 */
@Serializable
object Classes

fun NavController.navigateToClasses() {
    this.navigate(Classes)
}

fun NavGraphBuilder.classesScreen() {
    composable<Classes> {
        ClassesRoute()
    }
}