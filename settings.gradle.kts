pluginManagement {
    repositories {
        gradlePluginPortal()                                        // for kotlin gradle plugins
        google()                                                    // for android gradle plugin
        mavenCentral()
        maven { url = java.net.URI.create("https://jitpack.io") }   // for murglar gradle plugins
    }
    resolutionStrategy {
        eachPlugin {
            // workaround for requesting gradle plugins from plain maven repository (jitpack)
            // with `plugins {...}` block syntax
            val prefix = "murglar-gradle-plugin-"
            if (requested.id.id.startsWith(prefix)) {
                val artifactId = "${requested.id.id.substringAfter(prefix)}-plugin-gradle-plugin"
                useModule("com.github.badmannersteam.murglar-plugins:$artifactId:${requested.version}")
            }
        }
    }
}

rootProject.name = "murglar-jellyfin"
include(":murglar-jellyfin-android")
include(":murglar-jellyfin-core")
