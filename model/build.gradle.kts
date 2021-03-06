plugins {
    id("com.android.library")
    id("kotlin-parcelize")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = Config.COMPILE_SDK

    defaultConfig {
        minSdk = Config.MIN_SDK_VERSION
        targetSdk = Config.TARGET_SDK
    }
}

dependencies {

    // Kotlin
    implementation(Kotlin.CORE)

    // Retrofit 2
    implementation(Retrofit2.CONVERTER_JSON)

    // Tests
    testImplementation(Tests.JUNIT)
    androidTestImplementation(Tests.TEST_EXT_JUNIT)
    androidTestImplementation(Tests.ESPRESSO)
}