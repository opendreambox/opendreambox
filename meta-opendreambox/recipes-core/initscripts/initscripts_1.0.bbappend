PR .= "-dream3"

SRC_URI += "file://mountrun.sh"

do_install_append() {
	rm ${D}${sysconfdir}/*.d/*save-rtc.sh

        install -m 0755 ${WORKDIR}/mountrun.sh ${D}${sysconfdir}/init.d
        ln -s ../init.d/mountrun.sh ${D}${sysconfdir}/rcS.d/S02mountrun.sh
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
