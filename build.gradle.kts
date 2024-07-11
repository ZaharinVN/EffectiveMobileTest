// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath(libs.hilt.android.gradle.plugin)
        classpath(libs.gradle)
    }
}
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false
    id("com.google.dagger.hilt.android") version "2.50" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.7.7" apply false
    id("com.android.library") version "8.2.2" apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.10" apply false
}