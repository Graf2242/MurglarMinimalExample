plugins {
    id("murglar-gradle-plugin-android") version "4.1"       // fix this to actual version
}

murglarAndroidPlugin {
    id = "jellyfin"
    name = "Jellyfin"
    version = 1
    murglarClass = "com.graf2242.murglar_jellyfin_android.JellyfinMurglarAndroid"
}

dependencies {
    implementation(project(":murglar-jellyfin-core"))
//    implementation(libs.jellyfin.core)
//    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.22")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.22")
}