SRC_URI = " \
    git://github.com/containers/skopeo;branch=main;protocol=https \
    file://0001-fix-sigstore-verify-failed.patch \
"
SRCREV = "ee60474d5a4d99745aac9855797ad4b26510d786"

include skopeo.inc
