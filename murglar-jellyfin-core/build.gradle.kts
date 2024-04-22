plugins {
    id("murglar-gradle-plugin-core") version "4.1"       // fix this to actual version
}

murglarPlugin {
    id = "jellyfin"                                                     // your plugin id
    name = "Jellyfin"                                                   // your plugin human-readable name (in English)
    version = "0.0.1"                                                     // plugin version (minor)
    murglarClass = "com.graf2242.murglar_jellyfin_core.MurglarJellyfin"  // entry point - Murglar implementation class
}

dependencies {
//    implementation(libs.jellyfin.core)
}