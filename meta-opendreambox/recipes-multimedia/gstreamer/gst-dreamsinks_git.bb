SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
SECTION = "multimedia"
LICENSE = "CC-BY-NC-SA-3.0 | DreamProperty"
LIC_FILES_CHKSUM = "file://COPYING;md5=1f6263f0928e695084f3f0055be80eb3"
DEPENDS = "gstreamer1.0"
SRCREV = "${@opendreambox_srcrev('911b50215716fc6a963ca9d22b258fca13066c03', d)}"

OPENDREAMBOX_PROJECT = "gst-plugin-dvbmediasink"

inherit autotools opendreambox-git pkgconfig

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug"
#FILES_${PN}-dev += "${libdir}/gstreamer-0.10/*.la"
#FILES_${PN}-staticdev += "${libdir}/gstreamer-0.10/*.a"

do_install_append() {
        rm -f ${D}${libdir}/gstreamer-1.0/*.a
        rm -f ${D}${libdir}/gstreamer-1.0/*.la
}
