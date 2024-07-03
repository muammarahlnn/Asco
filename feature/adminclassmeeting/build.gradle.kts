plugins {
    id("asco.android.feature")
    id("asco.android.library.compose")
}

android {
    namespace = "com.muammarahlnn.asco.feature.adminclassmeeting"
}

dependencies {
    implementation(project(":feature:adminclassmeeting:practicums"))
    implementation(project(":feature:adminclassmeeting:classes"))
    implementation(project(":feature:adminclassmeeting:classdetails"))
    implementation(libs.androidx.activity.compose)
}