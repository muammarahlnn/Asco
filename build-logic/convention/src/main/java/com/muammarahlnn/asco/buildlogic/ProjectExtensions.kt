package com.muammarahlnn.asco.buildlogic

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

/**
 * @Author Muammar Ahlan Abimanyu
 * @File ProjectExtensions, 26/05/2024 17.10
 */

val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")