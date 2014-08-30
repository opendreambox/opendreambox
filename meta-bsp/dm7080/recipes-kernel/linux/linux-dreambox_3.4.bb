PATCHREV = "e96a955739a2f6a0da1efc7ffd3fc3dc7165511d"
PATCHLEVEL = "101"

SRC_URI = " \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-3.4.tar.xz;name=kernel \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-3.4.${PATCHLEVEL}.xz;apply=yes;name=stable-patch \
    http://dreamboxupdate.com/download/kernel-patches/${P}-${PATCHREV}.patch.xz;apply=yes;name=dream-patch \
"
SRC_URI[kernel.md5sum] = "967f72983655e2479f951195953e8480"
SRC_URI[kernel.sha256sum] = "ff3dee6a855873d12487a6f4070ec2f7996d073019171361c955639664baa0c6"
SRC_URI[stable-patch.md5sum] = "bc5a50cfaea51528e0f78b5d19684a8d"
SRC_URI[stable-patch.sha256sum] = "4f208c4ac5d76580680d9fa8fd35d5d35c7699565a59280d5173d66538c0a219"
SRC_URI[dream-patch.md5sum] = "fc836e439a77d0ca4399d75eefa45b8c"
SRC_URI[dream-patch.sha256sum] = "c8d8c2c7b63b1b2a50f1e8a2189346917f42382979840ad0255326d58fbc2f3f"

S = "${WORKDIR}/linux-3.4"

do_configure_prepend() {
        sed -e "/^SUBLEVEL = /d" -i ${S}/Makefile
}
do_compile_append() {
        gzip < vmlinux > vmlinuz
}

require linux-dreambox.inc
require linux-extra-image.inc
require linux-rdepends.inc

CMDLINE = "bmem=384M@640M memc1=768M console=ttyS0,1000000 root=/dev/mmcblk0p1 rootwait rootfstype=ext4"
COMPATIBLE_MACHINE = "^(dm7080)$"

DEFCONFIG = "dm7080"
KERNEL_VERSION = "3.4-3.0-dm7080"
KERNEL_IMAGETYPE = "vmlinux.bin"
KERNEL_ALT_IMAGETYPE = "vmlinux"
KERNEL_EXTRA_IMAGETYPE = "vmlinuz"
KERNEL_EXTRA_OUTPUT = "vmlinuz"
KERNEL_ENABLE_CGROUPS = "1"

RDEPENDS_kernel-image = "flash-scripts"

pkg_postinst_kernel-image () {
if [ -z "$D" ]; then
    flash-kernel /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}-${KERNEL_VERSION}
fi
}
