require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "e2530ef71c26cc2c9da2bfd307d3933c"
SRC_URI[modules.sha256sum] = "63c743444bd03f46f2a2f96b7182cf12933cea7ff05ff6a8c31866df495b1be1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
