plugins {
    id("asco.android.feature")
    id("asco.android.library.compose")
}

android {
    namespace = "com.muammarahlnn.asco.feature.adminattendance.meetings"
}

dependencies {
    implementation(project(":feature:adminattendance:navigation"))
    implementation(libs.androidx.activity.compose)
}