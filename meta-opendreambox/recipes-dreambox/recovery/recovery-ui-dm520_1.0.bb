SUMMARY = "Simple user interface for Dreambox DM520 rescue mode"
DEPENDS = "libnexus-ui"

SRC_URI[dm520.md5sum] = "9572ae331926504cdf9dcbd7151b56db"
SRC_URI[dm520.sha256sum] = "fafeabdcb19fc6af1c47075fe74526d15c693b9cf98b5b97d0afd644700c1df9"

PN="recovery-ui"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit opendreambox-precompiled-binary update-rc.d

INITSCRIPT_NAME = "${BPN}"

COMPATIBLE_MACHINE = "^(dm520)$"
