plugins {
    id("asco.android.library")
    id("asco.android.library.compose")
    id("kotlinx-serialization")
}

android {
    namespace = "com.muammarahlnn.asco.feature.adminattendance.navigation"
}

dependencies {
    api(libs.androidx.navigation.compose)
    api(libs.kotlinx.serialization.json)
}