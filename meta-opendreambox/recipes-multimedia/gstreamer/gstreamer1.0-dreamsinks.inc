SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS += "gstreamer1.0"

FILES_${PN} += "${libdir}/gstreamer-1.0/*.so"
FILES_${PN}-dev += "${libdir}/gstreamer-1.0/*.la ${libdir}/gstreamer-1.0/*.a"
FILES_${PN}-staticdev += "${libdir}/gstreamer-1.0/*.a"
FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug/*.so"
