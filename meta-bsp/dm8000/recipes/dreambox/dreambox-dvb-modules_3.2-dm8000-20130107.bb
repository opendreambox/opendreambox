require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "ebae6d4fde5883c1d26ef3036e631a76"
SRC_URI[modules.sha256sum] = "dc697d2b5b4f2ffd66cb4cdb109b0aa647e3d0c72b0c7cf167582236afe91380"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
