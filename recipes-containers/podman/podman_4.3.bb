include podman.inc

SRCREV = "cc609e52bdb641a8c1b1d9c183cac12db142da61"
SRC_URI = " \
    git://github.com/containers/podman.git;branch=v4.3;protocol=https \
    file://0001-fix-sigstore-verify-failed.patch \
    file://CVE-2023-0778.patch \
"
