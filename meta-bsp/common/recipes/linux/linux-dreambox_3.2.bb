DEPENDS = "carl9170fw linux-firmware zd1211-firmware"
PR = "${INC_PR}.42"

PATCHREV = "b299a6a132d842b074b289b2568eece452d0663c"
PATCHLEVEL = "31"

SRC_URI = " \
        ${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-3.2.tar.bz2;name=kernel \
        ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-3.2.${PATCHLEVEL}.bz2;apply=yes;name=kernel-patch \
        http://sources.dreamboxupdate.com/download/kernel-patches/${P}-${PATCHREV}.patch.bz2;name=dmm-patch \
        http://download.filesystems.org/unionfs/unionfs-2.x/unionfs-2.5.11_for_3.2.2.diff.gz;name=unionfs \
        file://clear_sublevel.patch \
        file://fadvise_dontneed_change.patch \
        file://fix-proc-cputype.patch \
        file://rtl8712-backport-b.patch \
        file://rtl8712-backport-c.patch \
        file://rtl8712-backport-d.patch \
        file://make-3.82-hack.patch \
        file://jffs2-compression-fixes.patch \
        file://git.linux-mips.org-sync.patch \
        file://brcmstb-smp.c-optimized-code-a-bit-add-a-kern-warnin.patch \
        file://kernel-sched_fair.c-dont-call-smp_send_reschedule-fo.patch \
        file://disable-unused-emac1-support.patch \
        file://brcmnand-fixed-possible-race-condition.patch \
        file://0001-nand_base.c-2ms-for-nand_wait_ready-is-not-enough.patch \
        file://0002-MTD-dreambox_nand-cleanup-speedup-implement-select_c.patch \
        file://revert-mips-module-loader-stuff.patch \
        file://nand-driver-smp-fixes.patch \
        file://0001-merge-some-changes-from-stblinux-2.6.37-broadcom-pat.patch \
        file://0001-brcmnand-add-hack-to-detect-if-a-mtd-device-is-maint.patch \
        file://0002-Dreambox-add-new-flash-map-for-1GB-based-dreamboxes-.patch \
        file://0001-dreambox-rename-mtd-partitions.patch \
        file://0001-NFS-limit-max-rwsize-to-8k-from-client-side.patch \
        file://0001-add-crypto-api-xz-support.patch \
        file://0001-add-XZ-compression-support-to-UBIFS.patch \
        file://0002-block2mtd-add-possibility-to-change-the-writesize.patch \
        file://0003-block2mtd-add-possibility-to-remove-block2mtd-device.patch \
        file://ubi-ro-mount-fix.patch \
        file://defconfig \
"

SRC_URI[kernel.md5sum] = "7ceb61f87c097fc17509844b71268935"
SRC_URI[kernel.sha256sum] = "c881fc2b53cf0da7ca4538aa44623a7de043a41f76fd5d0f51a31f6ed699d463"
SRC_URI[kernel-patch.md5sum] = "d6b622b1c842c53a3ce0c24045a4e816"
SRC_URI[kernel-patch.sha256sum] = "dc564ad8eab78ee7c77df2c543bdc5f86d3cb33f505329295e84a67679a9ad38"
SRC_URI[dmm-patch.md5sum] = "c364975ed4c2d066634729827f8552b9"
SRC_URI[dmm-patch.sha256sum] = "e56c75ad2c8e1d9328d55a7abf7c7ce805acb96354eb26449d5f91c65ad340a4"
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

require linux-dreambox.inc
