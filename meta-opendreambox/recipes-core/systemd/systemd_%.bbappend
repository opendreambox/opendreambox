SRC_URI += "file://0001-missing-define-_NR_kcmp-for-arm-mips-and-powerpc.patch \
            file://0002-systemd-add-getrandom-syscall-numbers-for-MIPS.patch \
            file://0003-missing.h-add-NDA_.patch \
            file://0004-missing.h-add-more-btrfs-types-and-defines.patch"

do_install_append() {
    rm ${D}${sysconfdir}/systemd/system/getty.target.wants/getty@tty1.service
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
