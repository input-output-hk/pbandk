import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    js {
        useCommonJs()
        browser {}
        nodejs {}
    }

    macosX64("macos")
    linuxX64("linux")
    // Uncomment to enable Windows
    // mingwX64("windows")

    sourceSets {
        all {
            languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
        }

        val commonMain by getting {
            dependencies {
                implementation(project(":runtime"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val nativeMain by creating {
            dependsOn(commonMain)
        }
    }

    targets.withType<KotlinNativeTarget> {
        val main by compilations.getting {
            defaultSourceSet {
                val nativeMain by sourceSets.getting
                dependsOn(nativeMain)
            }
        }
    }
}

tasks {
    val generateProto by registering(KotlinProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.conformance.pb")
        logLevel.set("debug")
    }

    // DCE is now enabled by default in Kotlin 1.3.7x
    // and it doesn't work well with commonJS modules
    // Use of commonJs could be removed since default module is now UMD
    // but would require some code change
    val processDceJsKotlinJs by getting {
        enabled = false
    }
}
