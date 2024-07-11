// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.50")
        classpath("com.android.tools.build:gradle:8.1.4")
    }
}
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.google.dagger.hilt.android") version "2.50" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.5.1" apply false
    id("com.android.library") version "8.2.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.10" apply false
}