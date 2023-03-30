include runc.inc

SRCREV = "f19387a6bec4944c770f7668ab51c4348d9c2f38"
SRC_URI = " \
    git://github.com/opencontainers/runc;branch=release-1.1;protocol=https \
    file://0001-Makefile-respect-GOBUILDFLAGS-for-runc-and-remove-re.patch \
    "
RUNC_VERSION = "1.1.5"

CVE_PRODUCT = "runc"
