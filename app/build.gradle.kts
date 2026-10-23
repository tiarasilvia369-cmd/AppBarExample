plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "id.ac.polbeng.tiarasilvia.appbarexample"
    compileSdk = 36 // Menggunakan versi SDK standar (misal: 34 atau 35)

    defaultConfig {
        applicationId = "id.ac.polbeng.tiarasilvia.appbarexample"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // Menggunakan pustaka coordinatorlayout langsung jika belum didefinisikan di libs.versions.toml
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}