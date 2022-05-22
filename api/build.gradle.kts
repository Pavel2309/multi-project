plugins {
    id("java")
    id("multi.project.java-common-conventions")
}

group = "com.stakhiyevich"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {

    implementation(project(":core"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}