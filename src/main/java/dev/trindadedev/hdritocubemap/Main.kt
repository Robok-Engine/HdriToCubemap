package dev.trindadedev.hdritocubemap

/** Example of use of class HdriToCubemap.kt */
fun main(vararg args: String) {
  val inputFile = "/sdcard/hdri/sky.hdr"
  val outputPath = "/sdcard/hdri/output/"
  HdriToCubemap.convertHdriToCubemap(inputFile, outputPath)
}
