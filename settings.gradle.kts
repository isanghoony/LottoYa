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

rootProject.name = "LottoYa"
include(":app")
include(":feature")
include(":core")
include(":lint")
include(":sync")
include(":ui-test-hilt-manifest")
include(":benchmarks")
include(":app:app-catalog")
include(":build-logic")
include(":app-catalog")
