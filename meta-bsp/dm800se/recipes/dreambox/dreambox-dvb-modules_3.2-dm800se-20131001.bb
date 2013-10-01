require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "9edc9c62e38496297b640514f8941db9"
SRC_URI[modules.sha256sum] = "0d265b728799bab4e5f859538ad85c6bab407312829285a80234f7f30228f8d2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SQUASHFS_IMG_PACKAGES = "${PN}-sqsh-img"
SQUASHFS_IMG_REPLACES = "${PN}"
SQUASHFS_IMG_FILESREGEX = "\.ko{1}\W*$"
SQUASHFS_IMG_BLOCKSIZES = "262144"

inherit squashfs-img
