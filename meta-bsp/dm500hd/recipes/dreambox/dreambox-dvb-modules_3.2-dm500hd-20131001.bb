require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "43bf8ea63d3724354ae5d7de7586e37e"
SRC_URI[modules.sha256sum] = "4bdb0dc0ef8c1da559636af6fdf3c7d3a495049449706647ebabdcc358eb6f44"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SQUASHFS_IMG_PACKAGES = "${PN}-sqsh-img"
SQUASHFS_IMG_REPLACES = "${PN}"
SQUASHFS_IMG_FILESREGEX = "\.ko{1}\W*$"
SQUASHFS_IMG_BLOCKSIZES = "262144"

inherit squashfs-img
