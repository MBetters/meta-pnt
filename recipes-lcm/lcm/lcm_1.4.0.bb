SUMMARY = "Lightweight Communications and Marshalling"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=aa3b97799d8eef7dcace96363ff41148"

# This env var is used by LCM's FindGLib2.cmake file
# export GLIB_PATH = ""
DEPENDS = "glib-2.0"

# Make sure BitBake can find the source code
FILESEXTRAPATHS_prepend := "/home/aclifton/src/lcm:"
# Source code comes from a local git repo
SRC_URI = "git:///home/aclifton/src/lcm/.git;protocol=file"
# Pull the latest source code revision
# SRCREV = "${AUTOREV}" # not working
SRCREV = "25a94f0c2a9365420d3543bcd9ece2a95f0a02cb"
# Copy the source code into the working directory
S = "${WORKDIR}/git"

# Building with CMake
inherit cmake
