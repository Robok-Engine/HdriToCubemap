# HdriToCubemap

A Library to convert HDRI files to .Png Cubemap
it just a easily way to use this: https://github.com/ivarout/HdriToCubemap/tree/master/HdriToCubemap

## Add to project

[![JitPack Release](https://jitpack.io/v/Robok-Engine/HdriToCubemap.svg)](https://jitpack.io/#Robok-Engine/hdritocubemap)

```kotlin
allprojects {
    repositories {
        maven("https://jitpack.io")
    }
}

implementation("com.github.Robok-Engine:HdriToCubemap:<version>")
```

# How to use

## Kotlin
```kotlin
import org.robok.hdritocubemap.HdriToCubemap

fun main(vararg args: String) {
  val inputFile = "/sdcard/hdri/sky.hdr"
  val outputPath = "/sdcard/hdri/output/"
  HdriToCubemap.convertHdriToCubemap(inputFile, outputPath)
}

```
## Java 
```java
import org.robok.hdritocubemap.HdriToCubemap;

public class Main {
  public static void main(final String[] args) {
    final String inputFile = "/sdcard/hdri/sky.hdr";
    final String outputPath = "/sdcard/hdri/output/";
    HdriToCubemap.convertHdriToCubemap(inputFile, outputPath);
  }
}
```
