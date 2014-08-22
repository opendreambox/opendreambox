PACKAGES =+ "${PN}-stdbuf"

FILES_${PN}-stdbuf = "${bindir}/stdbuf.${PN} ${libdir}/coreutils/libstdbuf.so"

RRECOMMENDS_${PN} += "${PN}-stdbuf"

ALTERNATIVE_${PN}_remove = "stdbuf"
ALTERNATIVE_${PN}-stdbuf = "stdbuf"
