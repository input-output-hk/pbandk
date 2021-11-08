plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "io.iohk.atala"
description = "Prism gRPC clients generator. Generate convenient definitions for JS/JVM/iOS/Android targets"

dependencies {
    compileOnly(project(":protoc-gen-pbandk:protoc-gen-pbandk-lib"))
}

publishing {
    val prismClientsGenerator by publications.creating(MavenPublication::class) {
        artifactId = "pbandk-$artifactId"
        from(components["java"])
        configurePbandkPom(project.description!!)
    }
}
