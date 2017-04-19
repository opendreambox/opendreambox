inherit pythonnative

PACKAGES += "${PN}-meta"

RDEPENDS_${PN}_append = " enigma2"

FILES_${PN} += "${libdir}/enigma2/python"
FILES_${PN}-meta = "${datadir}/meta"
