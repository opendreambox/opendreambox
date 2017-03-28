SUMMARY = "Simple user interface for Dreambox rescue mode"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
DEPENDS = "libmnl libnexus-ui"
PROVIDES = "recovery-ui"

inherit opendreambox-precompiled-binary update-rc.d

SRC_URI[dm520.md5sum] = "9572ae331926504cdf9dcbd7151b56db"
SRC_URI[dm520.sha256sum] = "fafeabdcb19fc6af1c47075fe74526d15c693b9cf98b5b97d0afd644700c1df9"
SRC_URI[dm900.md5sum] = "e3b08dcb53b8f70c7ac9170e84287c38"
SRC_URI[dm900.sha256sum] = "6465bcbc5aed824fe143807b34590151091dc5bed14b79d97a4064fed08e9520"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RRECOMMENDS_${PN} = "dreambox-dvb-modules-lcd"
RPROVIDES_${PN} = "recovery-ui"

INITSCRIPT_NAME = "recovery-ui"

PRECOMPILED_NAME = "recovery-ui"
