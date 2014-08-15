SRC_URI += "file://dropbear.xinetd.in \
            file://dropbearkey.service \
            file://dropbear@.service \
            file://dropbear.socket"

SYSTEMD_SERVICE_${PN} = "dropbear.socket"

inherit systemd xinetd

do_install_append() {
        rm -rf ${D}${sysconfdir}/init.d

        install -d ${D}${sysconfdir}/default
        echo 'DROPBEAR_EXTRA_ARGS="-B"' > ${D}${sysconfdir}/default/dropbear

        install -d ${D}${systemd_unitdir}/system
        install -m644 ${WORKDIR}/dropbear@.service ${D}${systemd_unitdir}/system
        install -m644 ${WORKDIR}/dropbear.socket ${D}${systemd_unitdir}/system
        install -m644 ${WORKDIR}/dropbearkey.service ${D}${systemd_unitdir}/system
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

INITSCRIPT_PACKAGES = ""
