pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "FastCampusCompose"
include(":chapter4-3")
include(":chapter4-4")
include(":chapter4-5")
include(":chapter4-6")
include(":chapter4-7")
include(":chapter4-8")
include(":chapter4-9")
include(":chapter4-10")
include(":chapter4-11")
include(":chapter4-12")
include(":chapter4-13")
include(":chapter4-14")
include(":chapter4-15")
include(":chapter4-17")
include(":chaptert4-18")
