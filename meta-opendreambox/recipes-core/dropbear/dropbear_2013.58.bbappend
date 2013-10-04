SRC_URI += "file://dropbear.xinetd.in \
            file://dropbearkey.service \
            file://dropbear@.service \
            file://dropbear.socket"

SYSTEMD_SERVICE_${PN} = "dropbear.socket"

inherit systemd xinetd

do_install_append() {
        install -d ${D}${sysconfdir}/default
        echo 'DAEMON="${base_bindir}/true"' >> ${D}${sysconfdir}/default/dropbear
        if ${@base_contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
                install -d ${D}${systemd_unitdir}/system
                ln -sf /dev/null ${D}${systemd_unitdir}/system/dropbear.service
                install -m644 ${WORKDIR}/dropbear@.service ${D}${systemd_unitdir}/system
                install -m644 ${WORKDIR}/dropbear.socket ${D}${systemd_unitdir}/system
                install -m644 ${WORKDIR}/dropbearkey.service ${D}${systemd_unitdir}/system
        fi
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
