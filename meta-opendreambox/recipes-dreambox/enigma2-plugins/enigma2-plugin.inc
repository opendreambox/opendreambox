inherit pythonnative

PACKAGES += "${PN}-meta"

RDEPENDS_${PN}_append = " enigma2 python-core"

FILES_${PN} += "${libdir}/enigma2/python"
FILES_${PN}-meta = "${datadir}/meta"

# Must be kept in sync with enigma2-plugins. Its version must
# increment whenever a plugin gets moved to its own recipe.
RBREAKS_${PN}-meta = "enigma2-plugins-meta (< 4.3.1)"
RREPLACES_${PN}-meta = "enigma2-plugins-meta (< 4.3.1)"
