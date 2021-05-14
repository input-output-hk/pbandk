import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions

plugins {
    kotlin("jvm")
    `maven-publish`
    signing
}

/**
 * The main purpose of this sub-project is to allow using pbandk from the Protobuf Gradle Plugin. The Protobuf Gradle
 * Plugin expects to find .proto files for the Well-Known Types somewhere in the pbandk dependency chain.
 */

description = "Kotlin library for Protocol Buffers. This artifact contains the .proto files for the Protocol Buffer Well-Known Types."

val extractWellKnownTypeProtos = rootProject.tasks.named<Sync>("extractWellKnownTypeProtos")

sourceSets {
    main {
        resources.srcDir(extractWellKnownTypeProtos)
    }
}

@Suppress("UnstableApiUsage")
java {
    withSourcesJar()
    withJavadocJar()
}

kotlin {
    target {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }

        // https://youtrack.jetbrains.com/issue/KT-45335
        attributes {
            attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 8)
        }
    }
}

publishing {
    val protos by publications.creating(MavenPublication::class) {
        artifactId = "pbandk-$artifactId"
        from(components["java"])
        configurePbandkPom(project.description!!)
    }
}