include cni.inc

SRCREV_cni = "b5ab16f010e822936eb974690ecec38ba69afc01"
# Version 0.9.1
SRCREV_plugins = "78702e9d8a2cdb6931fab433f1d1e6789162954f"
SRC_URI = "\
	git://github.com/containernetworking/cni.git;nobranch=1;name=cni;protocol=https \
        git://github.com/containernetworking/plugins.git;nobranch=1;destsuffix=${S}/src/github.com/containernetworking/plugins;name=plugins;protocol=https \
	"
