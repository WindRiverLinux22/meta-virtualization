include cni.inc

SRCREV_cni = "1694fd7b57e0176a98a12823a5ffc03337fdc152"
# Version 1.0.1
SRCREV_plugins = "189d0c06aa6da0c4f052d3831b091e6ea79e6675"
SRC_URI = "\
	git://github.com/containernetworking/cni.git;nobranch=1;name=cni;protocol=https \
        git://github.com/containernetworking/plugins.git;nobranch=1;destsuffix=${S}/src/github.com/containernetworking/plugins;name=plugins;protocol=https \
	"

DEFAULT_PREFERENCE = "1"
