PR .= "-dream1"

SRC_URI += "file://dropbear.xinetd.in"

inherit xinetd

do_install_append() {
        install -d ${D}${sysconfdir}/default
        echo 'DAEMON="${base_bindir}/true"' >> ${D}${sysconfdir}/default/dropbear
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
