PATCHREV = "3c7230bc0819495db75407c365f4d1db70008044"
PATCHLEVEL = "68"

SRC_URI = " \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-${PV}.tar.xz;name=kernel \
    ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-${PV}.${PATCHLEVEL}.xz;apply=yes;name=stable-patch \
    http://dreamboxupdate.com/download/kernel-patches/linux-dreambox-${PV}-${PATCHREV}.patch.bz2;apply=yes;name=dream-patch \
    http://download.filesystems.org/unionfs/unionfs-2.x/unionfs-2.5.11_for_3.2.2.diff.gz;apply=yes;name=unionfs \
    file://0001-correctly-initiate-nand-flash-ecc-config-when-old-2n.patch \
    file://0002-fadvise-dontneed-change.patch \
    file://0003-fix-proc-cputype.patch \
    file://0004-Staging-rtl8712-Remove-double-USB-device-IDs.patch \
    file://0005-Staging-rtl8712-rtl8192u-move-USB-device-ID-within-s.patch \
    file://0006-staging-r8712u-Fix-Smatch-warning.patch \
    file://0007-CHROMIUM-make-3.82-hack-to-fix-differing-behaviour-b.patch \
    file://0008-MIPS-Fix-build-with-binutils-2.24.51.patch \
    file://0009-MIPS-Refactor-clear_page-and-copy_page-functions.patch \
    file://0010-BRCMSTB-Fix-build-with-binutils-2.24.51.patch \
    file://0011-staging-rtl8712-rtl8712-avoid-lots-of-build-warnings.patch \
    file://defconfig \
"
SRC_URI[kernel.md5sum] = "364066fa18767ec0ae5f4e4abcf9dc51"
SRC_URI[kernel.sha256sum] = "dd96ed02b53fb5d57762e4b1f573460909de472ca588f81ec6660e4a172e7ba7"
SRC_URI[stable-patch.md5sum] = "8ba205b73dcd6aa6748d916af294b6f0"
SRC_URI[stable-patch.sha256sum] = "77368e2ab9d8d9282ff6e00973fe0ba7948e6b519f2efcab3b008c59526f1bd3"
SRC_URI[dream-patch.md5sum] = "9bce4d986a4bfcccdc4b2fecd849269d"
SRC_URI[dream-patch.sha256sum] = "8914df36eb1f6a270d2b32c46d93cb81bbaae02604fba6135a9b1509e1ec1d84"
SRC_URI[unionfs.md5sum] = "06e7c9f6cafd49b72184be851116c511"
SRC_URI[unionfs.sha256sum] = "ce6ffa3c17a11dcca24196c11f6efc95c59b65a5b99958e73e8d4cc8e4b1f1ef"

require linux-dreambox-legacy.inc

S = "${WORKDIR}/linux-${PV}"

CMDLINE = "ubi.mtd=root root=ubi0:rootfs rootfstype=ubifs rw ${CMDLINE_CONSOLE}"

COMPATIBLE_MACHINE = "^(bcm7400|bcm7405)$"

LINUX_VERSION = "${PV}-${MACHINE}"
KERNEL_IMAGETYPE = "vmlinux.gz"
