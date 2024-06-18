plugins {
    id("asco.android.feature")
    id("asco.android.library.compose")
}

android {
    namespace = "com.muammarahlnn.asco.feature.adminusercreate"
}

dependencies {
    implementation(libs.androidx.activity.compose)
}