SRC_URI = " \
    git://github.com/containers/skopeo;branch=release-1.4;protocol=https \
    file://0001-Makefile-use-pkg-config-instead-of-gpgme-config.patch \
"
SRCREV = "130f32f047b7bf9b1fb4f95c4c5b1da6255e4829"

include skopeo.inc
