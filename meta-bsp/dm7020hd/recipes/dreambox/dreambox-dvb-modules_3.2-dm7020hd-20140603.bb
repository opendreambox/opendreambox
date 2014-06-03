require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "b6e7ca9fc41850efce6cb5a6a6abe8be"
SRC_URI[modules.sha256sum] = "c0a3dfa80bd6fb4e55efa681c07c4b5eddde4d38d319b870deb6e8a22c4c81ab"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
