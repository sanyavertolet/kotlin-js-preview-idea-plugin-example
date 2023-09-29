plugins {
    kotlin("multiplatform") version "1.9.0"
}

group = "com.sanyavertolet.example"
version = "1.0-SNAPSHOT"

kotlin {
    js(IR) {
        binaries.executable()
        browser()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.598"))
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-extensions")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom")
                implementation("com.sanyavertolet.kotlinjspreview:core:0.1.0-SNAPSHOT")
            }
        }
    }
}
