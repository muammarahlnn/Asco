plugins {
    id("asco.android.library")
    id("asco.android.hilt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.muammarahlnn.asco.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.retrofit.core)
    implementation(libs.kotlinx.serialization.json)
}