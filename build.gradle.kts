// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }
    dependencies{
        val nav_version = "2.7.6"
        classpath("androidx.navigation.safeargs:androidx.navigation.safeargs.gradle.plugin:$nav_version")
    }
}
plugins {
    id("com.android.application") version "8.2.1" apply false
    id("com.android.library") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
}