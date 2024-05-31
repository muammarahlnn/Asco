package com.muammarahlnn.asco.buildlogic

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AndroidRoomConventionPlugin, 31/05/2024 18.48
 */
class AndroidRoomConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.google.devtools.ksp")

            dependencies {
                add("implementation", libs.findLibrary("room.runtime").get())
                add("implementation", libs.findLibrary("room.ktx").get())
                add("ksp", libs.findLibrary("room.compiler").get())
            }
        }
    }
}