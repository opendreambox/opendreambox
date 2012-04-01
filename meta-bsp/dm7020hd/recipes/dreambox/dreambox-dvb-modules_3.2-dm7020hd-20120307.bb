require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "d41cb9ac4dfccd7dbc9f8cf9b01811b8"
SRC_URI[modules.sha256sum] = "564ec511a979d6a79ac3436acb095ffd743d5242cc748ebce64e97ea558f27be"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
