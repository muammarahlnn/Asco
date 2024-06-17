plugins {
    id("asco.android.library")
    id("asco.android.library.compose")
    id("kotlinx-serialization")
}

android {
    namespace = "com.muammarahlnn.asco.core.navigation"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    api(libs.androidx.navigation.compose)
    api(libs.kotlinx.serialization.json)
}