require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "c4421f27f70a67b2929cc29e790604aa"
SRC_URI[modules.sha256sum] = "224ceee0df07abb10522a2bc6479f11c953c7db12bbf8a0529c49971637256c7"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
