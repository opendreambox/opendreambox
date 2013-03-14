SUMMARY = "autofs configuration for enigma2"
LICENSE = "CLOSED"

SRC_URI = "file://enigma2.autofs \
           file://auto.hotplug \
           file://auto.network"

inherit allarch

do_install() {
    install -d ${D}${sysconfdir}
    install -m644 ${WORKDIR}/auto.* ${D}${sysconfdir}
    install -d ${D}${sysconfdir}/auto.master.d
    install -m644 ${WORKDIR}/enigma2.autofs ${D}${sysconfdir}/auto.master.d
}

CONFFILES_${PN} = "${sysconfdir}/auto.network"

pkg-postinst_${PN}() {
if [ -z "$D" ]; then
    pid=`pidof automount`
    if [ -n "$pid" ]; then
        kill -HUP $pid
    fi
fi
}
pkg-postrm_${PN}() {
if [ -z "$D" ]; then
    pid=`pidof automount`
    if [ -n "$pid" ]; then
        kill -HUP $pid
    fi
fi
}
