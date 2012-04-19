DEPENDS = "carl9170fw linux-firmware zd1211-firmware"
PR = "${INC_PR}.10"

PATCHREV = "a3eaf43fbd1c2994fb61fd7065724ff4f2e4f1e0"
PATCHLEVEL = "15"

SRC_URI = " \
        ${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-3.2.tar.bz2;name=kernel \
        ${KERNELORG_MIRROR}/linux/kernel/v3.x/patch-3.2.${PATCHLEVEL}.bz2;apply=yes;name=kernel-patch \
        http://sources.dreamboxupdate.com/download/kernel-patches/${P}-${PATCHREV}.patch.bz2;name=dmm-patch \
        file://clear_sublevel.patch \
        file://fadvise_dontneed_change.patch \
        file://fix-proc-cputype.patch \
        file://threaded-interrupt-support.patch \
        file://brcmnand-buildfix.patch \
        file://brcmnand-fixed-corr-uncorr-error-detection.patch \
        file://brcmnand-fixed-non-hwecc-first-workaround.patch \
        file://rtl8712-backport-a.patch \
        file://rtl8712-backport-b.patch \
        file://rtl8712-backport-c.patch \
        file://rtl8712-backport-d.patch \
        file://make-3.82-hack.patch \
        file://defconfig \
"

SRC_URI[kernel.md5sum] = "7ceb61f87c097fc17509844b71268935"
SRC_URI[kernel.sha256sum] = "c881fc2b53cf0da7ca4538aa44623a7de043a41f76fd5d0f51a31f6ed699d463"
SRC_URI[kernel-patch.md5sum] = "2232a36274115f053ce4adfb7cc00588"
SRC_URI[kernel-patch.sha256sum] = "08a42c51f7dc33641f7110cf6fb82e1b7c86c7d68ae7ea26eb3075b877239d29"
SRC_URI[dmm-patch.md5sum] = "29e0428508845663144ea8ed26575054"
SRC_URI[dmm-patch.sha256sum] = "a725831642a8d19a9664592adf36ab7a1341cca0a3570f1c02e5e449cbf2738f"

S = "${WORKDIR}/linux-3.2"

RDEPENDS_kernel-module-carl9170 = "carl9170fw"
RDEPENDS_kernel-module-cifs = "kernel-module-arc4 kernel-module-ecb kernel-module-hmac kernel-module-md4"
RDEPENDS_kernel-module-mac80211 = "kernel-module-aes-generic kernel-module-arc4"
RDEPENDS_kernel-module-r8712u = "linux-firmware-rtl8192su"
RDEPENDS_kernel-module-rt2800usb = "linux-firmware-rt2800usb"
RDEPENDS_kernel-module-rt73usb = "linux-firmware-rt73usb"
RDEPENDS_kernel-module-zd1211rw = "zd1211-firmware"

require linux-dreambox.inc
