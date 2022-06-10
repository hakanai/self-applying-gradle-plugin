import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`

    // Matching version in Gradle
    kotlin("jvm") version "1.5.31"
}

apply(from = "common-build.gradle.kts")

apply(plugin = "example.common")

group = "org.example"
version = "1.0-SNAPSHOT"

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
