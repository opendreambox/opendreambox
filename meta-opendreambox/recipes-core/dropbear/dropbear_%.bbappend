SRC_URI += "file://dropbear.xinetd.in"

inherit xinetd

do_install_append() {
        install -d ${D}${sysconfdir}/default
        echo 'DROPBEAR_EXTRA_ARGS="-B"' > ${D}${sysconfdir}/default/dropbear
        echo 'DAEMON="${base_bindir}/true"' >> ${D}${sysconfdir}/default/dropbear
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
