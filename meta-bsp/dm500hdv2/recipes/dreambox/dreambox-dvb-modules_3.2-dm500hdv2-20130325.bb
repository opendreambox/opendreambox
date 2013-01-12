require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "b18c6e8425c541b352559abe68d25299"
SRC_URI[modules.sha256sum] = "dd592204a77b2705bacb699d5b2bb274a180b1ec5995c06d628877eceab5300e"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
