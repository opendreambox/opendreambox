SUMMARY = "Tuxbox common files"
LICENSE = "CLOSED"
SRCREV = "2c88742ab048d5aa91b454a564c74917d7085c65"
PR = "r2"

inherit opendreambox-git

do_install() {
        install -d ${D}${sysconfdir}
        install -d ${D}${sysconfdir}/tuxbox
        install -m 0644 timezone.xml ${D}${sysconfdir}
        install -m 0644 satellites.xml ${D}${sysconfdir}/tuxbox
        install -m 0644 terrestrial.xml ${D}${sysconfdir}/tuxbox
}

FILES_${PN} = "${sysconfdir}"

OPENDREAMBOX_PROJECT = "obi/enigma2-xml-data"
