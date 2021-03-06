import org.gradle.api.JavaVersion

object Config {
    const val APPLICATION_ID = "softing.ubah4ukdev.translator"
    const val COMPILE_SDK = 30
    const val BUILD_TOOLS = "30.0.2"
    const val MIN_SDK_VERSION = 26
    const val TARGET_SDK = 30
    const val VERSION_CODE = 1
    const val VERSION_NAME = " Full version"
    const val JVM_TARGET = "1.8"
    val java_version = JavaVersion.VERSION_11
}

object Modules {
    const val MODULE_MODEL = ":model"
    const val MODULE_DOMAIN = ":domain"
    const val MODULE_UTILS = ":utils"

    const val SCREEN_DETAIL = ":screendetail"
    const val SCREEN_HISTORY = ":screenhistory"
    const val SCREEN_FAVOURITE = ":screenfavourite"
}


object LibVersion {
    const val KOTLIN_STDLIB_VERSION = "kotlin-stdlib-jdk8:1.5.31"
    const val GRADLE_VERSION = "7.0.2"
    const val GRADLE_PLUGIN_VERSION = "kotlin-gradle-plugin:1.5.31"
    const val CORE_KTX_VERSION = "1.6.0"
    const val APPCOMPAT_VERSION = "1.3.1"
    const val ANDROID_MATERIAL_VERSION = "1.4.0"
    const val CONSTRAINT_LAYOUT_VERSION = "2.1.1"
    const val LIFECYCLE_VERSION = "2.3.1"

    // ViewBindingPropertyDelegate
    const val VIEW_BINDING_DELEGATE_VERSION = "1.5.0-beta01"

    // Rx-Java
    const val RXJAVA2_ANDROID_VERSION = "2.1.1"
    const val RXJAVA2_VERSION = "2.2.20"
    const val RXJAVA2_KOTLIN_VERSION = "2.4.0"

    // Retrofit 2
    const val RETROFIT2_VERSION = "2.9.0"
    const val OKHTTP3_LOGGING_VERSION = "4.9.1"
    const val RXJAVA2_ADAPTER_VERSION = "1.0.0"
    const val COROUTINES_ADAPTER = "0.9.2"

    // Koin
    const val KOIN_VERSION = "3.1.2"

    // Coroutines
    const val COROUTINES_VERSION = "1.5.1"

    // Cicerone
    const val CICERONE_VERSION = "7.0"

    // Room
    const val ROOM_VERSION = "2.3.0"

    // Glide
    const val GLIDE_VERSION = "4.12.0"

    // Tests
    const val JUNIT_VERSION = "4.13.2"
    const val TEST_EXT_JUNIT_VERSION = "1.1.3"
    const val TEST_ESPRESSO_VERSION = "3.4.0"
}

object ViewBindingDelegate {
    const val DELEGATE = "com.github.kirich1409:viewbindingpropertydelegate:${LibVersion.VIEW_BINDING_DELEGATE_VERSION}"
}

object RxJava {
    const val ANDROID = "io.reactivex.rxjava2:rxandroid:${LibVersion.RXJAVA2_ANDROID_VERSION}"
    const val RXJAVA = "io.reactivex.rxjava2:rxjava:${LibVersion.RXJAVA2_VERSION}"
    const val RXKOTLIN = "io.reactivex.rxjava2:rxkotlin:${LibVersion.RXJAVA2_KOTLIN_VERSION}"
}

object Retrofit2 {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${LibVersion.RETROFIT2_VERSION}"
    const val CONVERTER_JSON = "com.squareup.retrofit2:converter-gson:${LibVersion.RETROFIT2_VERSION}"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${LibVersion.OKHTTP3_LOGGING_VERSION}"
    const val RXJAVA2_ADAPTER =  "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:${LibVersion.RXJAVA2_ADAPTER_VERSION}"
    const val COROUTINES_ADAPTER = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${LibVersion.COROUTINES_ADAPTER}"
}

object Koin {
    const val CORE = "io.insert-koin:koin-core:${LibVersion.KOIN_VERSION}"
    const val ANDROID = "io.insert-koin:koin-android:${LibVersion.KOIN_VERSION}"
    const val ANDROID_COMPAT = "io.insert-koin:koin-android-compat:${LibVersion.KOIN_VERSION}"
    const val TEST = "io.insert-koin:koin-test:${LibVersion.KOIN_VERSION}"
    const val TEST_JUNIT4 = "io.insert-koin:koin-test-junit4:${LibVersion.KOIN_VERSION}"
}

object Design {
    const val APPCOMPAT = "androidx.appcompat:appcompat:${LibVersion.APPCOMPAT_VERSION}"
    const val MATERIAL = "com.google.android.material:material:${LibVersion.ANDROID_MATERIAL_VERSION}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${LibVersion.CONSTRAINT_LAYOUT_VERSION}"
}

object Kotlin {
    const val STDLIB = "org.jetbrains.kotlin:${LibVersion.KOTLIN_STDLIB_VERSION}"
    const val CORE = "androidx.core:core-ktx:${LibVersion.CORE_KTX_VERSION}"
}

object LifeCycle {
    const val LIVEDATA_KTX ="androidx.lifecycle:lifecycle-livedata-ktx:${LibVersion.LIFECYCLE_VERSION}"
    const val VIEW_MODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibVersion.LIFECYCLE_VERSION}"
}

object Coroutines {
    const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${LibVersion.COROUTINES_VERSION}"
    const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibVersion.COROUTINES_VERSION}"
}

object Cicerone {
    const val CICERONE = "com.github.terrakok:cicerone:${LibVersion.CICERONE_VERSION}"
}

object Room {
    const val RUN_TIME = "androidx.room:room-runtime:${LibVersion.ROOM_VERSION}"
    const val KTX = "androidx.room:room-ktx:${LibVersion.ROOM_VERSION}"
    const val RX_JAVA = "androidx.room:room-rxjava2:${LibVersion.ROOM_VERSION}"
    const val COMPILER = "androidx.room:room-compiler:${LibVersion.ROOM_VERSION}"
}

object Glide {
    const val COMPILER = "com.github.bumptech.glide:compiler:${LibVersion.GLIDE_VERSION}"
    const val GLIDE = "com.github.bumptech.glide:glide:${LibVersion.GLIDE_VERSION}"
    const val GLIDE_OKHTTP3 = "com.github.bumptech.glide:okhttp3-integration:${LibVersion.GLIDE_VERSION}"
}

object Tests {
    const val JUNIT = "junit:junit:${LibVersion.JUNIT_VERSION}"
    const val TEST_EXT_JUNIT = "androidx.test.ext:junit:${LibVersion.TEST_EXT_JUNIT_VERSION}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${LibVersion.TEST_ESPRESSO_VERSION}"
}