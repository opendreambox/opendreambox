require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "96f424b8a91104c1aa4f09f3a9a49f25"
SRC_URI[modules.sha256sum] = "38e5f391533b9d4d38093fea3eec8ad4536b98fa9f30d2d5c7ec644074c68771"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
