pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Asco"
include(":app")

include(":core:ui")
include(":core:designsystem")
include(":core:common")
include(":core:navigation")

include(":feature:login")
include(":feature:adminhome")
include(":feature:adminuser")
include(":feature:adminuserdetails")
include(":feature:adminusercreate")
include(":feature:adminpracticum")
include(":feature:adminpracticumdetails")
include(":feature:adminpracticumcreate")
include(":feature:adminclassmeeting")
include(":feature:adminclassmeeting:practicums")
include(":feature:adminclassmeeting:classes")
include(":feature:adminclassmeeting:classdetails")
include(":feature:adminclassmeeting:selectstudents")
include(":feature:adminclassmeeting:navigation")
include(":feature:adminclassmeeting:meetings")
include(":feature:adminclassmeeting:meetingdetails")
include(":feature:adminclassmeeting:meetingcreate")
include(":feature:adminattendance")
include(":feature:adminattendance:navigation")
