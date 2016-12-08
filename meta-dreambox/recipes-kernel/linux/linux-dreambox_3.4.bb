PATCHREV = "e7fe570494f9341822e3f184b1bd3364ee4e0a50"
PATCHLEVEL = "113"

SRC_URI = " \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-${PV}.tar.xz;name=kernel \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-${PV}.${PATCHLEVEL}.xz;apply=yes;name=stable-patch \
    http://dreamboxupdate.com/download/kernel-patches/linux-dreambox-${PV}-${PATCHREV}.patch.xz;apply=yes;name=dream-patch \
    file://0001-BRCMSTB-dont-enable-new-i2c-driver-by-default.-it-co.patch \
"
SRC_URI[kernel.md5sum] = "967f72983655e2479f951195953e8480"
SRC_URI[kernel.sha256sum] = "ff3dee6a855873d12487a6f4070ec2f7996d073019171361c955639664baa0c6"
SRC_URI[stable-patch.md5sum] = "cbd978b714f37b648fbcf92482372223"
SRC_URI[stable-patch.sha256sum] = "d5492eeaadcf12aaad471011066e447907999035c26368da8e4f82b1871ef03a"
SRC_URI[dream-patch.md5sum] = "7c8958c638a9cf150ee6e0693518a902"
SRC_URI[dream-patch.sha256sum] = "7124e4145b5edb8179c679f842cd4349e1d0e7635c369385f246170cad7d6870"

PR = "r1"

require linux-dreambox.inc

S = "${WORKDIR}/linux-${PV}"

CMDLINE = ""
CMDLINE_bcm73625 = "bmem=192M@64M console=ttyS0,1000000 ubi.mtd=rootfs root=ubi0:dreambox-rootfs rootfstype=ubifs rw"
CMDLINE_bcm7435 = "bmem=512M@512M memc1=768M console=ttyS0,1000000 root=/dev/mmcblk0p1 rootwait rootfstype=ext4"

COMPATIBLE_MACHINE = "^(bcm7435|bcm73625)$"

DEFCONFIG = "${MACHINE}"

BRCM_PATCHLEVEL = "4.0"

LINUX_VERSION = "${PV}-${BRCM_PATCHLEVEL}-${MACHINE}"
KERNEL_IMAGETYPE = ""
KERNEL_IMAGETYPE_bcm73625 = "vmlinux.gz"
KERNEL_IMAGETYPE_bcm7435 = "vmlinux.bin"
KERNEL_IMAGETYPES = ""
KERNEL_IMAGETYPES_bcm7435 = "vmlinux.gz"
