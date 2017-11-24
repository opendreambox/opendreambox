EXTRA_OECONF += "--with-time-epoch=0"

do_install_append() {
    rm ${D}${sysconfdir}/systemd/system/getty.target.wants/getty@tty1.service
}
do_install_append_mipsel() {
    sed -e '/^Private[^N]/d' \
        -e '/^Protect/d' \
        -i ${D}${systemd_system_unitdir}/systemd-hostnamed.service
}
