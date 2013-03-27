PR .= "-dream6"

SRC_URI += "file://mountrun.sh"

do_install_append() {
	rm ${D}${sysconfdir}/*.d/*save-rtc.sh

        install -m 0755 ${WORKDIR}/mountrun.sh ${D}${sysconfdir}/init.d
        ln -s ../init.d/mountrun.sh ${D}${sysconfdir}/rcS.d/S02mountrun.sh

        # rename umountnfs script because it should run before network is disabled
        mv ${D}${sysconfdir}/rc0.d/S31umountnfs.sh ${D}${sysconfdir}/rc0.d/K31umountnfs.sh || /bin/true
        mv ${D}${sysconfdir}/rc6.d/S31umountnfs.sh ${D}${sysconfdir}/rc6.d/K31umountnfs.sh || /bin/true
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
