require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "d507b37fec2c8062a34eb74367178dc2"
SRC_URI[modules.sha256sum] = "cb1d0921531b360852098251093670f6583424ef97389534a2094bd044dacc5e"

SQUASHFS_IMG_PACKAGES = "${PN}-sqsh-img"
SQUASHFS_IMG_REPLACES = "${PN}"
SQUASHFS_IMG_FILESREGEX = "\.ko{1}\W*$"
SQUASHFS_IMG_BLOCKSIZES = "262144"

inherit squashfs-img

COMPATIBLE_MACHINE = "^(dm800se)$"
