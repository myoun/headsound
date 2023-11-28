plugins {
    id("java")
    `maven-publish`
}

group = "app.myoun"
version = "1.1.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    create<Jar>("sourcesJar") {
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }
}

publishing {
    publications {
        create<MavenPublication>("headsound") {
            from(components["java"])
            artifact(tasks["sourcesJar"])

            groupId = rootProject.group.toString()
            artifactId = rootProject.name
            version = rootProject.version.toString()

        }
    }
}