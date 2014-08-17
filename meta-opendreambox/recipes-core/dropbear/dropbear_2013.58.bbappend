SRC_URI += "file://dropbear.xinetd.in \
            file://dropbearkey.service \
            file://dropbear@.service \
            file://dropbear.socket"

SYSTEMD_SERVICE_${PN} = "dropbear.socket"

inherit systemd xinetd

do_install_append() {
        install -d ${D}${sysconfdir}/default
        echo 'DROPBEAR_EXTRA_ARGS="-B"' > ${D}${sysconfdir}/default/dropbear
        echo 'DAEMON="${base_bindir}/true"' >> ${D}${sysconfdir}/default/dropbear

        install -d ${D}${systemd_unitdir}/system
        ln -sf /dev/null ${D}${systemd_unitdir}/system/dropbear.service
        install -m644 ${WORKDIR}/dropbear@.service ${D}${systemd_unitdir}/system
        install -m644 ${WORKDIR}/dropbear.socket ${D}${systemd_unitdir}/system
        install -m644 ${WORKDIR}/dropbearkey.service ${D}${systemd_unitdir}/system
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
