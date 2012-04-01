require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "c1d86b0f5ac904dbbc74082c2a93ece5"
SRC_URI[modules.sha256sum] = "cefa08700f31680fd85602afe835cf9b14cd47619b8964bd19098ae1d9f342ba"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
