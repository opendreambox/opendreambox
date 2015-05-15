SRC_URI += "file://0001-missing-define-_NR_kcmp-for-arm-mips-and-powerpc.patch"

do_install_append() {
    rm ${D}${sysconfdir}/systemd/system/getty.target.wants/getty@tty1.service
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
