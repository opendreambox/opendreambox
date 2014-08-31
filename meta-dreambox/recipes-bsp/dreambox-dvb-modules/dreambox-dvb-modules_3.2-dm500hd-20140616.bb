require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "8907582110a9b782c9a5e54115a3d34d"
SRC_URI[modules.sha256sum] = "1874b0992eb09836463f96a70fb7f3c75ffab8954a80a050d296aa409ffcf1f6"

SQUASHFS_IMG_PACKAGES = "${PN}-sqsh-img"
SQUASHFS_IMG_REPLACES = "${PN}"
SQUASHFS_IMG_FILESREGEX = "\.ko{1}\W*$"
SQUASHFS_IMG_BLOCKSIZES = "262144"

inherit squashfs-img

COMPATIBLE_MACHINE = "^(dm500hd)$"
