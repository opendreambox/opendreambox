require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "4e33a020c3603ab4e98811eacced5ef8"
SRC_URI[modules.sha256sum] = "6b8fdbff8baa83ed8a023b3f3161b4318b9e2e4ff69d3783da83bee082abed6b"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
