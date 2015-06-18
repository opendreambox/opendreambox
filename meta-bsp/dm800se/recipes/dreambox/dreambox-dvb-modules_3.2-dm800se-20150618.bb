require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "6c535d5517fcc63fc5e379f9df9f3f1b"
SRC_URI[modules.sha256sum] = "14d2025d2f60d69242f26f192057aa38208bea5a83e14e948b5ddf1a0b40f9f0"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SQUASHFS_IMG_PACKAGES = "${PN}-sqsh-img"
SQUASHFS_IMG_REPLACES = "${PN}"
SQUASHFS_IMG_FILESREGEX = "\.ko{1}\W*$"
SQUASHFS_IMG_BLOCKSIZES = "262144"

inherit squashfs-img
