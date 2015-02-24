SRC_URI += "file://0001-missing-add-BPF_XOR.patch"

do_install_append() {
    rm ${D}${sysconfdir}/systemd/system/getty.target.wants/getty@tty1.service
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
