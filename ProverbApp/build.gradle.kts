buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://www.jitpack.io" ) }
    }
    dependencies {
        classpath("com.google.gms:google-services:4.4.4") // This line goes here
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
}
