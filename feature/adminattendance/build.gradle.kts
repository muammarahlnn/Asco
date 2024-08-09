plugins {
    id("asco.android.feature")
    id("asco.android.library.compose")
}

android {
    namespace = "com.muammarahlnn.asco.feature.adminattendance"
}

dependencies {
    implementation(project(":feature:adminattendance:navigation"))
    implementation(project(":feature:adminattendance:practicums"))
    implementation(project(":feature:adminattendance:meetings"))
    implementation(libs.androidx.activity.compose)
}