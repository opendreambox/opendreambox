require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "d2c081183ef061fe04bb840914838a59"
SRC_URI[modules.sha256sum] = "5e73668269da8ee5bbc410f3c5707203ce8a2d680017d590f8393313624ad2db"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
