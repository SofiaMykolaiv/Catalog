plugins {
    id("com.android.application")
    id("kotlin-android")
    id("androidx.navigation.safeargs.kotlin")
    id("org.jetbrains.kotlin.kapt")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.sofia.catalog"
        minSdk = 28
        targetSdk = 31
        versionCode = 1
        versionName = "1.0.1"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    // AndroidX
    implementation(dependencyNotation = "androidx.core:core-ktx:1.7.0")
    implementation(dependencyNotation = "androidx.appcompat:appcompat:1.4.1")
    implementation(dependencyNotation = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    implementation(dependencyNotation = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
    implementation(dependencyNotation = "androidx.constraintlayout:constraintlayout:2.1.3")
    implementation(dependencyNotation = "androidx.recyclerview:recyclerview:1.2.1")
    implementation(dependencyNotation = "androidx.activity:activity-ktx:1.4.0")
    implementation(dependencyNotation = "androidx.fragment:fragment-ktx:1.4.1")
    implementation(dependencyNotation = "androidx.navigation:navigation-fragment-ktx:2.4.1")
    implementation(dependencyNotation = "androidx.navigation:navigation-ui-ktx:2.4.1")

    // Material
    implementation(dependencyNotation = "com.google.android.material:material:1.5.0")

    // Image Loader Coil
    implementation(dependencyNotation = "io.coil-kt:coil:1.4.0")

    // ViewBindingDelegates
    implementation(dependencyNotation = "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.4.4")

    // AdapterDelegates
    implementation(dependencyNotation = "com.hannesdorfmann:adapterdelegates4-kotlin-dsl:4.3.1")
    implementation(dependencyNotation = "com.hannesdorfmann:adapterdelegates4-kotlin-dsl-viewbinding:4.3.1")

    // Hilt
    implementation(dependencyNotation = "com.google.dagger:hilt-android:2.40.5")
    kapt(dependencyNotation = "com.google.dagger:hilt-android-compiler:2.40.5")

    // Coroutines
    implementation(dependencyNotation = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")

    // Network
    implementation(dependencyNotation = "com.squareup.retrofit2:converter-gson:2.9.0")
    implementation(dependencyNotation = "com.squareup.retrofit2:retrofit:2.9.0")
    implementation(dependencyNotation = "com.squareup.okhttp3:logging-interceptor:3.11.0")
    implementation(dependencyNotation = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")

    // Test
    testImplementation(dependencyNotation = "junit:junit:4.13.2")
    testImplementation(dependencyNotation = "org.mockito.kotlin:mockito-kotlin:3.2.0")
    androidTestImplementation(dependencyNotation = "androidx.test.ext:junit:1.1.3")
    androidTestImplementation(dependencyNotation = "androidx.test.espresso:espresso-core:3.4.0")
}