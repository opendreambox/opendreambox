PATCHREV = "a9636c0968de426eb8e418b1ecd9fd731eb6397f"
PATCHLEVEL = "28"

SRC_URI = " \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-${PV}.tar.xz;name=kernel \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-${PV}.${PATCHLEVEL}.xz;apply=yes;name=stable-patch \
    http://dreamboxupdate.com/download/kernel-patches/linux-dreambox-${PV}-${PATCHREV}.patch.xz;apply=yes;name=dream-patch \
"

SRC_URI[kernel.md5sum] = "b621207b3f6ecbb67db18b13258f8ea8"
SRC_URI[kernel.sha256sum] = "61558aa490855f42b6340d1a1596be47454909629327c49a5e4e10268065dffa"
SRC_URI[stable-patch.md5sum] = "502a4ee34af04e9b9e375e254f7b9a8f"
SRC_URI[stable-patch.sha256sum] = "e3c79a30ac959c84c329be5461da88a5c79c6463da30d376c27bb103aee79b51"
SRC_URI[dream-patch.md5sum] = "a8106704c80622ec2ce6b00871872fde"
SRC_URI[dream-patch.sha256sum] = "19e1fd79bedbbea73faae8d8fb4ae48efe984e5404e6e53c350a7f6e3bfbe772"

require linux-dreambox.inc
require recipes-kernel/linux/linux-dtb.inc

S = "${WORKDIR}/linux-${PV}"

CMDLINE = "bmem=640M@384M bmem=384M@2048M console=ttyS0,1000000 root=/dev/mmcblk0p2 rootwait rootfstype=ext4"

COMPATIBLE_MACHINE = "^(bcm7439)$"

DEFCONFIG = "${MACHINE}"

BRCM_PATCHLEVEL = "1.10"

LINUX_VERSION = "${PV}-${BRCM_PATCHLEVEL}-${MACHINE}"
KERNEL_IMAGETYPE = "zImage"
KERNEL_DEVICETREE = "dreambox-${MACHINE}.dtb"
