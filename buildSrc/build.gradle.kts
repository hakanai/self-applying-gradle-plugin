import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`

    // Matching version in Gradle
    kotlin("jvm") version "1.5.31"
}

apply(from = "../common-build.gradle.kts")

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

kotlin {
    sourceSets["main"].kotlin.srcDir("../src/main/kotlin")
}
