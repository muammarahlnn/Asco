plugins {
    id("asco.android.feature")
    id("asco.android.library.compose")
}

android {
    namespace = "com.muammarahlnn.asco.feature.adminclassmeeting.meetings"
}

dependencies {
    implementation(project(":feature:adminclassmeeting:navigation"))
    implementation(libs.androidx.activity.compose)
}