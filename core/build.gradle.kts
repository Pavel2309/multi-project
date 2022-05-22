plugins {
    id("java")
    id("multi.project.java-common-conventions")
}

group = "com.stakhiyevich"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation("com.stakhiyevich:util:1.3.5")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}