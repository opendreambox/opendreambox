require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "a3320ec683357577b9624e88ee74df94"
SRC_URI[modules.sha256sum] = "e32770316f38db7c701ae67c4147856d6823f66944f83b0e5d4091da48e6fdc1"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
