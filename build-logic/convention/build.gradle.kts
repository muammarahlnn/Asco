import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.muammarahlnn.asco.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "asco.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "asco.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibraryCompose") {
            id = "asco.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("androidLibrary") {
            id = "asco.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidFeature") {
            id = "asco.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }

        register("androidTest") {
            id = "asco.android.test"
            implementationClass = "AndroidTestConventionPlugin"
        }

        register("androidHilt") {
            id = "asco.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }

        register("androidRoom") {
            id = "asco.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }

        register("jvmLibrary") {
            id = "asco.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
    }
}