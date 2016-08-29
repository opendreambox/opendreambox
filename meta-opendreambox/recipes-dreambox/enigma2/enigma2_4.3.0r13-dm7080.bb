SRC_URI[dm7080.md5sum] = "547d8c519edb2a1531e10d7c92ad4472"
SRC_URI[dm7080.sha256sum] = "dc396999c2b78e04f3ecb3043b69fd8b30be7e0a1cf4c46cf6836c8f7d6a4ca6"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-Components.Ipkg-fix-installation-of-non-local-packag.patch"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
