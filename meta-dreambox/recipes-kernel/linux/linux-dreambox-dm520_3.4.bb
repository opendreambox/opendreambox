PROVIDES = "linux-dreambox"

PATCHREV = "12f469d9f8fedb33ccc4fd22a7451a800821f496"
PATCHLEVEL = "111"

SRC_URI = " \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-3.4.tar.xz;name=kernel \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-3.4.${PATCHLEVEL}.xz;apply=yes;name=stable-patch \
    http://dreamboxupdate.com/download/kernel-patches/linux-dreambox-${PV}-${PATCHREV}.patch.xz;apply=yes;name=dream-patch \
"
SRC_URI[kernel.md5sum] = "967f72983655e2479f951195953e8480"
SRC_URI[kernel.sha256sum] = "ff3dee6a855873d12487a6f4070ec2f7996d073019171361c955639664baa0c6"
SRC_URI[stable-patch.md5sum] = "a2f8f3301d62347ae87927fa220756e2"
SRC_URI[stable-patch.sha256sum] = "a498e7e1f2f5252c175b3a84191a8ff0d4e66c9d07f5b15a9dd6cb3e66e0336f"
SRC_URI[dream-patch.md5sum] = "ac5a0618f367b8ba587ba2a441e91939"
SRC_URI[dream-patch.sha256sum] = "667fa08e2f6e2f3f45e48e7ac2b0f60fc8391579fa12cb427f2a0c247488fba7"

require linux-dreambox.inc

S = "${WORKDIR}/linux-3.4"

do_configure_prepend() {
        sed -e "/^SUBLEVEL = /d" -i ${S}/Makefile
}

require linux-rdepends.inc

CMDLINE = "bmem=192M@64M console=ttyS0,1000000 ubi.mtd=rootfs root=ubi0:dreambox-rootfs rootfstype=ubifs rw"

COMPATIBLE_MACHINE = "^(bcm73625)$"

DEFCONFIG = "${MACHINE}"

BRCM_PATCHLEVEL = "3.9"

KERNEL_VERSION = "3.4-${BRCM_PATCHLEVEL}-${MACHINE}"
KERNEL_IMAGETYPE = "vmlinux.gz"
KERNEL_ENABLE_CGROUPS = "1"

RDEPENDS_kernel-image = "flash-scripts"

pkg_postinst_kernel-image () {
if [ -z "$D" ]; then
    flash-kernel /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}-${KERNEL_VERSION}
fi
}

INITRAMFS_IMAGE = "dreambox-rescue-image"
INITRAMFS_IMAGE_BUNDLE = "1"
INITRAMFS_BASE_NAME = "rescue-${PV}-${PR}-${MACHINE}-${DATETIME}"
