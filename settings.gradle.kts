pluginManagement {
    repositories {
        maven {
            url = uri("http://localhost:8081/repository/maven-public/")
            isAllowInsecureProtocol = true
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("http://localhost:8081/repository/maven-public/")
            isAllowInsecureProtocol = true
        }
    }
}











rootProject.name = "ResponseScreen"
include(":app")
 