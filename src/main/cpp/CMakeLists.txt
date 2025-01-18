# Sets the minimum CMake version
cmake_minimum_required(VERSION 3.10)

# Project name
project("hdritocubemap")

# Add native library
add_library(
  hdritocubemap
  SHARED
  Main.cpp
)

# Include the header directories
target_include_directories(
  hdritocubemap
  PRIVATE
  ${CMAKE_SOURCE_DIR}
)

# Add support for the C++17 standard
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Find system libraries
find_library(
  log-lib
  log
)

# Link the required libraries
target_link_libraries(
  hdritocubemap
  ${log-lib}
)