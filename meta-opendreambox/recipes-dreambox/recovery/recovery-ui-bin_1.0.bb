SUMMARY = "Simple user interface for Dreambox rescue mode"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
DEPENDS = "libnexus-ui"
PROVIDES = "recovery-ui"

inherit opendreambox-precompiled-binary update-rc.d

SRC_URI[dm520.md5sum] = "9572ae331926504cdf9dcbd7151b56db"
SRC_URI[dm520.sha256sum] = "fafeabdcb19fc6af1c47075fe74526d15c693b9cf98b5b97d0afd644700c1df9"
SRC_URI[dm900.md5sum] = "875cd7814f89a66e77c9e229400fbbb7"
SRC_URI[dm900.sha256sum] = "fa7fdbca8397b04e3a7aa898e575691e697068f9c768cc5f2fb0cdef71b890bc"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RRECOMMENDS_${PN} = "dreambox-dvb-modules-lcd"
RPROVIDES_${PN} = "recovery-ui"

COMPATIBLE_MACHINE = "^(dm520|dm900)$"

INITSCRIPT_NAME = "${BPN}"

PRECOMPILED_NAME = "recovery-ui"
