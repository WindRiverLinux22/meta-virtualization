SRC_URI = " \
    git://github.com/containers/skopeo;branch=main;protocol=https \
    file://0001-fix-sigstore-verify-failed.patch \
    file://container-sign-policy.json \
"
SRCREV = "ee60474d5a4d99745aac9855797ad4b26510d786"

include skopeo.inc

# 1 - enable; 0 - disable
COSIGN_SIGNED_CONTAINER ??= "0"

do_install:append:class-target() {
    install -d ${D}/${sysconfdir}/containers/registries.d

    if [ "${COSIGN_SIGNED_CONTAINER}" = "1" ]; then
        install ${WORKDIR}/container-sign-policy.json ${D}/${sysconfdir}/containers/policy.json
    fi
}
