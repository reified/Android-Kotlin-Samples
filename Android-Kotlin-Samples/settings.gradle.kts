pluginManagement {
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

rootProject.name = "Samples - reified.dev"

include(":android-apps:template-app-module")
include(":kotlin-samples:template-module")
include(":kotlin-samples:ds-alg")
include(":design-patterns")
