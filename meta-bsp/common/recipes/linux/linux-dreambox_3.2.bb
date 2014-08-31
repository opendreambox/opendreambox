DEPENDS = "carl9170fw linux-firmware zd1211-firmware"

PATCHREV = "4e0356d04e89df800361b9252f990716f5523c6e"
PATCHLEVEL = "59"

SRC_URI = " \
        ${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-3.2.tar.bz2;name=kernel \
        ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-3.2.${PATCHLEVEL}.xz;apply=yes;name=kernel-patch \
        http://sources.dreamboxupdate.com/download/kernel-patches/${P}-${PATCHREV}.patch.bz2;name=dmm-patch \
        http://download.filesystems.org/unionfs/unionfs-2.x/unionfs-2.5.11_for_3.2.2.diff.gz;name=unionfs \
        file://0001-SCSI-sd-Use-SCSI-read-write-16-with-32-bit-LBA-drive.patch \
        file://0002-add-crypto-api-xz-support.patch \
        file://0003-add-XZ-compression-support-to-UBIFS.patch \
        file://0004-block2mtd-add-possibility-to-change-the-writesize.patch \
        file://0005-block2mtd-add-possibility-to-remove-block2mtd-device.patch \
        file://0006-mtd-block2mtd-fix-recursive-call-of-mtd_writev.patch \
        file://0007-mtd-block2mtd-throttle-writes-by-calling-balance_dir.patch \
        file://0008-The-ubi-maintained-flag-must-be-set-earlier-to-preve.patch \
        file://0009-fixed-partition-is-ubi-maintained-check.patch \
        file://0010-MIPS-Refactor-clear_page-and-copy_page-functions.patch \
        file://0011-add-memory-mapping-support-to-usbfs-used-by-sundtek-.patch \
        file://0012-fadvise-dontneed-change.patch \
        file://0013-fix-proc-cputype.patch \
        file://0014-Staging-rtl8712-Remove-double-USB-device-IDs.patch \
        file://0015-Staging-rtl8712-rtl8192u-move-USB-device-ID-within-s.patch \
        file://0016-staging-r8712u-Fix-Smatch-warning.patch \
        file://0017-CHROMIUM-make-3.82-hack-to-fix-differing-behaviour-b.patch \
        file://0018-net-ipv4-ipconfig-really-display-the-BOOTP-DHCP-serv.patch \
        file://0001-linuxtv-api-DMM-drivers-are-now-ready-for-linux-tv-a.patch \
        file://0001-add-support-for-DM800SEv2-and-DM500HDv2-simplified-1.patch \
        file://defconfig \
"

SRC_URI[kernel.md5sum] = "7ceb61f87c097fc17509844b71268935"
SRC_URI[kernel.sha256sum] = "c881fc2b53cf0da7ca4538aa44623a7de043a41f76fd5d0f51a31f6ed699d463"
SRC_URI[kernel-patch.md5sum] = "68696787e651422f02816d2c825f9a9c"
SRC_URI[kernel-patch.sha256sum] = "9dcb2e477923c8d1f662f2e8431a0ae06d0f13b6383fde30a051a3361ccd26b7"
SRC_URI[dmm-patch.md5sum] = "d17d65e9978343d540e0b60767a82286"
SRC_URI[dmm-patch.sha256sum] = "576356545de7f587d164d1cee2cb17b6c1ce3efbe2e01ff785c13ec2d544d220"
SRC_URI[unionfs.md5sum] = "06e7c9f6cafd49b72184be851116c511"
SRC_URI[unionfs.sha256sum] = "ce6ffa3c17a11dcca24196c11f6efc95c59b65a5b99958e73e8d4cc8e4b1f1ef"

S = "${WORKDIR}/linux-3.2"

RDEPENDS_kernel-module-carl9170 = "carl9170fw"
RDEPENDS_kernel-module-cifs = "kernel-module-arc4 kernel-module-ecb kernel-module-hmac kernel-module-md4"
RDEPENDS_kernel-module-mac80211 = "kernel-module-aes-generic kernel-module-arc4"
RDEPENDS_kernel-module-r8712u = "linux-firmware-rtl8192su"
RDEPENDS_kernel-module-rt2800usb = "linux-firmware-rt2800usb"
RDEPENDS_kernel-module-rt73usb = "linux-firmware-rt73usb"
RDEPENDS_kernel-module-zd1211rw = "zd1211-firmware"

do_configure_prepend() {
        sed -e "/^SUBLEVEL = ${PATCHLEVEL}$/d" -i ${S}/Makefile
}

require linux-dreambox.inc

