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
