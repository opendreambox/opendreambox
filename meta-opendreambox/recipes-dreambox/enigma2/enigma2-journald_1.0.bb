SUMMARY = "journald configuration for enigma2"
LICENSE = "CLOSED"

SRC_URI = "file://journald.conf"

S = "${WORKDIR}"

inherit allarch

do_install() {
    install -d ${D}${sysconfdir}/systemd/journald.conf.d
    install -m644 ${WORKDIR}/journald.conf ${D}${sysconfdir}/systemd/journald.conf.d/enigma2.conf
}
