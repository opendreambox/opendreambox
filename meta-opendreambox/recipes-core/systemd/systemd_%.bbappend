EXTRA_OECONF += "--with-time-epoch=0"

do_install_append() {
    rm ${D}${sysconfdir}/systemd/system/getty.target.wants/getty@tty1.service
}
