require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "7d3701da8b9e3ce94bea4e10ddda669f"
SRC_URI[modules.sha256sum] = "5e16874c0de1d6f09bbc24259f218ee6054f8cace4c422f62c3aa1ff6826a360"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
