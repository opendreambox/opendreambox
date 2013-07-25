require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "ca74f3c30b355ca082ee423d92b3a172"
SRC_URI[modules.sha256sum] = "b0abd9cc2d2f082f5151d8c7f6a7c2fc88d4540600d8183132fab4c51fb841c6"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
