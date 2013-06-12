inherit systemd

do_install_append() {
        if ${@base_contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
                install -d ${D}${systemd_unitdir}/system
                ln -sf /dev/null ${D}${systemd_unitdir}/system/xinetd.service
        fi
}

SYSTEMD_SERVICE_${PN} = "xinetd.service"
