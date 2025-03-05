// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.2")
        classpath("com.android.tools.build:gradle:8.4.0-beta02")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.51.1")
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
    id("com.android.library") version "8.4.0-beta02" apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}
tasks.register("clean", Delete::class) {
    delete(layout.buildDirectory)
}