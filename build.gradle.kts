plugins {
    id("java")
    id("maven-publish")
}

group = "cn.numeron"
version = "1.0-SNAPSHOT"

repositories {

    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:13.0")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "cn.numeron"
            artifactId = "diff-util"
            version = "1.2.1"
            from(components["java"])
        }
    }
}