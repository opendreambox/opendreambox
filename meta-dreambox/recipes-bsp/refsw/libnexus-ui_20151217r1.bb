require libnexus-ui.inc

RDEPENDS_${PN} = "bcmdriver"

SRC_URI[dm900.md5sum] = "078ce3435b94753d94434bec184f04fb"
SRC_URI[dm900.sha256sum] = "3ff379777a417191e795759d7f0423445ae75988fe88414646d518727ac9fc81"

inherit opendreambox-precompiled-binary

COMPATIBLE_MACHINE = "^(dm900)$"
