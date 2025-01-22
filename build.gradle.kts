plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.kotlin.android)
  `maven-publish`
}

group = "org.robok"
version = libs.versions.lib.version.get()

android {
  namespace = "org.robok.hdritocubemap"
  compileSdk = libs.versions.android.compileSdk.get().toInt()
  buildToolsVersion = libs.versions.android.buildToolsVersion.get()
  
  defaultConfig {
    minSdk = libs.versions.android.minSdk.get().toInt()

    ndk {
      abiFilters += listOf("armeabi-v7a", "arm64-v8a", "x86", "x86_64")
    }

    externalNativeBuild {
      cmake {
        arguments += listOf("-DANDROID_STL=c++_shared")
        cppFlags += "-std=c++17"
      }
    }
  }
  
  buildTypes {
    release {
      isMinifyEnabled = false
    }
  }

  externalNativeBuild {
    cmake {
      path = file("src/main/cpp/CMakeLists.txt")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
  }

  kotlin {
    jvmToolchain(21)
  }
}

afterEvaluate {
  publishing {
    publications {
      register("mavenRelease", MavenPublication::class) {
        groupId = "org.robok"
        artifactId = "hdritocubemap"
        version = libs.versions.lib.version.get()
        from(components["release"])
      }
    }
  }
}
