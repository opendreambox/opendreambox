DESCRIPTION = "Tuxbox common files"
LICENSE = "CLOSED"
SRCREV = "77ff3efbac5eb01c2fc914ba8fb99374d0970ff5"

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
