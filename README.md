# HdriToCubemap

A Library to convert HDRI files to .Png Cubemap
it just a easily way to use this: https://github.com/ivarout/HdriToCubemap/tree/master/HdriToCubemap

## Add to project

[![JitPack Release](https://jitpack.io/v/trindadedev13/hdritocubemap.svg)](https://jitpack.io/#trindadedev13/hdritocubemap)

```kotlin
allprojects {
    repositories {
        maven("https://jitpack.io")
    }
}

implementation("com.github.trindadedev13:HdriToCubemap:<version>")
```

# How to use

## Kotlin
```kotlin
import dev.trindadedev.hdritocubemap.HdriToCubemap

fun main(vararg args: String) {
  val inputFile = "/sdcard/hdri/sky.hdr"
  val outputPath = "/sdcard/hdri/output/"
  HdriToCubemap.convertHdriToCubemap(inputFile, outputPath)
}

```
## Java 
```java
import dev.trindadedev.hdritocubemap.HdriToCubemap;

public class Main {
  public static void main(final String[] args) {
    final String inputFile = "/sdcard/hdri/sky.hdr";
    final String outputPath = "/sdcard/hdri/output/";
    HdriToCubemap.convertHdriToCubemap(inputFile, outputPath);
  }
}
```
