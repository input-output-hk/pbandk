import org.gradle.api.publish.maven.MavenPublication

fun MavenPublication.configurePbandkPom(pomDescription: String) {
    val pomName = artifactId
    pom {
        name.set(pomName)
        description.set(pomDescription)
        url.set("https://github.com/input-output-hk/pbandk")

        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        organization {
            name.set("Input Output HK")
            url.set("https://github.com/input-output-hk")
        }

        developers {
            developer {
                id.set("iohk")
                name.set("IOHK")
                url.set("https://github.com/input-output-hk")
            }
        }

        scm {
            connection.set("scm:git:git@github.com:input-output-hk/pbandk.git")
            developerConnection.set("scm:git:git@github.com:input-output-hk/pbandk.git")
            url.set("git@github.com:input-output-hk/pbandk.git")
        }
    }
}