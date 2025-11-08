plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.foodies.customer.android"
    compileSdk = 34

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
    }

    defaultConfig {
        applicationId = "com.foodies.customer.android"
        minSdk = 26
        multiDexEnabled = true
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.9.1")
    implementation(platform("com.google.firebase:firebase-bom:32.0.0"))
    implementation("androidx.multidex:multidex:2.0.1")
    implementation("io.card:android-sdk:5.+")
    implementation("com.google.android.gms:play-services-mlkit-barcode-scanning:16.1.4")
    implementation("com.tencent.mm.opensdk:wechat-sdk-android-without-mta:6.7.0")
    implementation("com.google.android.gms:play-services-wallet:19.1.0")
}
