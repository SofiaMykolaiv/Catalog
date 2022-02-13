// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(dependencyNotation = "com.android.tools.build:gradle:7.0.4")
        classpath(dependencyNotation = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
        classpath(dependencyNotation = "com.google.dagger:hilt-android-gradle-plugin:2.40.5")
        classpath(dependencyNotation = "org.jetbrains.kotlin:kotlin-serialization:1.6.0")
        classpath(dependencyNotation = "androidx.navigation:navigation-safe-args-gradle-plugin:2.4.1")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}