require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "be2f41a6b338d4695077a14edf96bc6a"
SRC_URI[modules.sha256sum] = "02b335f543fc6d44f9f9e7e305fb2ea197189605fc496f1bc15eb6d92c097c57"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
