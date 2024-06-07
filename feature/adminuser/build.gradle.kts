plugins {
    id("asco.android.feature")
    id("asco.android.library.compose")
}

android {
    namespace = "com.muammarahlnn.asco.feature.adminuser"
}

dependencies {
    implementation(libs.androidx.activity.compose)
}