// settings.gradle.kts

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
        // GARANTA QUE OS REPOSITÓRIOS 'jitpack' E 'speedchecker' FORAM REMOVIDOS DAQUI
    }
}
rootProject.name = "GabizitaPlayer"
include(":app")