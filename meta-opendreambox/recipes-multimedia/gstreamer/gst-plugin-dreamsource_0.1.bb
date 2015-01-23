SUMMARY = "dreambox video and audio encoder source elements for Gstreamer 1.0"
SECTION = "multimedia"
LICENSE = "CC-BY-NC-SA-3.0 | DreamProperty"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc2953f0a89e22cf0b1f6f4628b06b17"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base"
SRCREV = "036b1ff2f0f3ad1e7c4e99fdd56b648926f1fe44"

inherit autotools opendreambox-git

do_install_append() {
        rm -f ${D}${libdir}/gstreamer-1.0/*.a
        rm -f ${D}${libdir}/gstreamer-1.0/*.la
}

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug"
