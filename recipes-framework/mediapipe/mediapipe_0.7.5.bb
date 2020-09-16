DESCRIPTION = "Cross-platform ML solutions made simple"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = ""

DEPENDS = "bazel-native protobuf-native util-linux-native protobuf tensorflow"

SRC_URI = "git://github.com/mediapipe.git;tag=v0.7.5 \
           file://BUILD \
           file://BUILD.yocto_compiler \
           file://CROSSTOOL.tpl \
           file://yocto_compiler_configure.bzl
          "

S = "${WORKDIR}/git"


DEPENDS += " \
    python3 \
    python3-numpy-native \
    python3-keras-applications-native \
    python3-keras-preprocessing-native \
    python3-pip-native \
    python3-wheel-native \
"

inherit python3native bazel
