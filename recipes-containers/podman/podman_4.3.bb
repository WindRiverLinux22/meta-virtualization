include podman.inc

SRCREV = "cc609e52bdb641a8c1b1d9c183cac12db142da61"
SRC_URI = " \
    git://github.com/containers/podman.git;branch=v4.3;protocol=https \
    file://0001-fix-sigstore-verify-failed.patch \
"

do_install:append:class-target() {
	mkdir -p ${D}${sysconfdir}/containers
	touch ${D}${sysconfdir}/containers/nodocker
}

