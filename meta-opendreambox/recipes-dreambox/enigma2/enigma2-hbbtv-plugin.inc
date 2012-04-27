SUMMARY = "NPAPI based HBBTV Browser Plugin for enigma2"
DEPENDS += "boost"
INC_PR = "r1"

FILES_${PN} += "${libdir}/browser-plugins/*.so"
FILES_${PN}-dev += "${libdir}/browser-plugins/*.la"
FILES_${PN}-dbg += "${libdir}/browser-plugins/.debug/*.so"
