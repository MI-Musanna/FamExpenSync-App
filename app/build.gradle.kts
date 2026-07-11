plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.famexpensync"
    compileSdk = 37 // 👈 প্রিভিউ ব্লকটি ফেলে সরাসরি স্ট্যান্ডার্ড API 37 এ লক করা হলো

    defaultConfig {
        applicationId = "com.example.famexpensync"
        minSdk = 24
        targetSdk = 37 // 👈 টার্গেট SDK-ও ৩৭ এ আপগ্রেড করা হলো
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}