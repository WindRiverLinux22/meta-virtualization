include podman.inc

SRCREV = "62534053086fdeba7b93117e7c4dc6e797835a3e"
SRC_URI = " \
    git://github.com/containers/podman.git;branch=v4.0;protocol=https \
    file://CVE-2022-2989-1.patch \
    file://CVE-2022-2989-2.patch \
"
