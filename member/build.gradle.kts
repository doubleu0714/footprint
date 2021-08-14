plugins {
    kotlin("jvm") version "1.5.21"
    id("io.kotest") version "0.3.8"
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    testImplementation("io.kotest:kotest-assertions-core-jvm:4.6.1")
    testImplementation("io.kotest:kotest-framework-engine-jvm:4.6.1")
}