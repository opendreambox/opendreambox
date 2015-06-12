require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "dfc64cb1f0ee2e30e7953edd0ec46f91"
SRC_URI[modules.sha256sum] = "9d386f84ae4c698c1d9cbb287468d4e1ec5e2c80e67e396e6131a55eebc967eb"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
