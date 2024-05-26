plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin") version "2.5.0" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}

android {
    namespace = "com.sewonlab.tokoonline"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sewonlab.tokoonline"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    apply(plugin = "kotlin-kapt")

    // loading button
    implementation("br.com.simplepass:loading-button-android:2.2.0")

    // glide
    implementation("com.github.bumptech.glide:glide:4.13.0")

    // circular image
    implementation("de.hdodenhof:circleimageview:3.1.0")

    // viewpager2 indicator
    implementation("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")

    // stepView
    implementation("com.shuhart.stepview:stepview:1.5.1")

    // Android Ktx
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.2")

    // Dagger Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-compiler:2.44")

}