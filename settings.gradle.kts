@file:Suppress("UnstableApiUsage")

rootProject.name = "plugin-example"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven {
            name = "sanyavertolet/kotlin-js-preview-idea-plugin"
            url = uri("https://maven.pkg.github.com/sanyavertolet/kotlin-js-preview-idea-plugin")
            credentials {
                username = providers.gradleProperty("gpr.user").orNull
                    ?: System.getenv("GITHUB_ACTOR")
                password = providers.gradleProperty("gpr.key").orNull
                    ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
