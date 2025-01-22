package org.robok.hdritocubemap

import java.io.File

object HdriToCubemap {
  init {
    System.loadLibrary("hdritocubemap")
  }

  /**
   * Native function that generates the .png of cubemaps based on .hdr .
   *
   * @param inputFile the .hdr file.
   * @param outputFile the dir where .png will be saved.
   * @see README.md to how to use.
   * @see cpp folder to see implementation.
   */
  @JvmStatic external fun convertHdriToCubemap(inputFile: String, outputPath: String)

  @JvmStatic
  fun convertHdriToCubemap(inputFile: File, outputPath: File) {
    convertHdriToCubemap(inputFile = inputFile.absolutePath, outputPath = outputPath.absolutePath)
  }
}
