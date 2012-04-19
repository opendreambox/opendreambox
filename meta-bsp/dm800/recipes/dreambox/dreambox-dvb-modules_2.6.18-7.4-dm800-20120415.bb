require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "284173b9f8f2e769ba0f7fdf92d18151"
SRC_URI[modules.sha256sum] = "b669ba543fc39b01c3875e4c173c2f09653aaf64b000c5cd96170e5efeaabee7"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
