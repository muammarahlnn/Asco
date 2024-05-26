package com.muammarahlnn.asco.buildlogic

import com.android.build.api.variant.LibraryAndroidComponentsExtension
import org.gradle.api.Project

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AndroidInstrumentedTest, 26/05/2024 17.43
 */
internal fun LibraryAndroidComponentsExtension.disableUnnecessaryAndroidTests(project: Project) {
    beforeVariants {
        it.enableAndroidTest = it.enableAndroidTest && project.projectDir.resolve("src/androidTests").exists()
    }
}