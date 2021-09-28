import io.github.gradlenexus.publishplugin.NexusPublishExtension
import kotlinx.validation.ApiValidationExtension
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

// Top-level build configuration

plugins {
    kotlin("multiplatform") version Versions.kotlin apply false
    id("com.android.library") version Versions.androidGradlePlugin apply false
    id("org.springframework.boot") version Versions.springBootGradlePlugin apply false

    id("com.google.osdetector") version Versions.osDetectorGradlePlugin
    id("binary-compatibility-validator") version Versions.binaryCompatibilityValidatorGradlePlugin
    id("io.github.gradle-nexus.publish-plugin") version Versions.nexusPublishGradlePlugin
}

configure<ApiValidationExtension> {
    ignoredProjects.addAll(
        project.subprojects.map { it.name }.minus(listOf("runtime"))
    )
    nonPublicMarkers.add("pbandk.PbandkInternal")
}

if (true) {
    configure<NexusPublishExtension> {
        repositories {
            sonatype {
                val sonatypeApiUser: String? by project
                val sonatypeApiPass: String? by project

                nexusUrl.set(uri("https://oss.sonatype.org/service/local/"))
                snapshotRepositoryUrl.set(uri("https://oss.sonatype.org/content/repositories/snapshots/"))
                username.set(sonatypeApiUser)
                password.set(sonatypeApiPass)
            }
        }
    }
} else {
    logger.info("Sonatype API key not defined, skipping configuration of Maven Central publishing repository")
}

if (true) {
    subprojects {
        plugins.withType<SigningPlugin> {
            configure<SigningExtension> {
                @Suppress("UnstableApiUsage")
                val signingKey: String? by project
                val signingPassword: String? by project
                useInMemoryPgpKeys(signingKey, signingPassword)
                sign(extensions.getByType<PublishingExtension>().publications)
            }
        }
    }
} else {
    logger.info("PGP signing key not defined, skipping signing configuration")
}

val downloadProtoc by configurations.creating {
    isTransitive = false
}

val wellKnownTypes by configurations.creating {
    isTransitive = false
}

dependencies {
    downloadProtoc(
        group = "com.google.protobuf",
        name = "protoc",
        version = Versions.protoc,
        classifier = osdetector.classifier,
        ext = "exe"
    )
    wellKnownTypes("com.google.protobuf:protobuf-java:${Versions.protobufJava}")
}

val extractWellKnownTypeProtos by tasks.registering(Sync::class) {
    dependsOn(wellKnownTypes)
    from({
        wellKnownTypes.filter { it.extension == "jar" }.map { zipTree(it) }
    })
    include("**/*.proto")
    includeEmptyDirs = false
    into(layout.buildDirectory.dir("bundled-protos"))
}

allprojects {
    repositories {
        mavenCentral()
    }

    tasks.withType<AbstractTestTask> {
        testLogging {
            outputs.upToDateWhen { false }
            showStandardStreams = true
            exceptionFormat = TestExceptionFormat.FULL
            events = setOf(
                TestLogEvent.PASSED,
                TestLogEvent.SKIPPED,
                TestLogEvent.FAILED
            )
        }
    }
}
