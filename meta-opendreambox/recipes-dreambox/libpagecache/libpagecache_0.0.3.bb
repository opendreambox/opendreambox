SUMMARY = "Preloadable library to improve large file operations"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS = "libdlsym"
SRCREV = "b4ce1a7b1f32df49dc4a63d8bc51b6af7d13e4c4"
PR = "r0"

inherit autotools opendreambox-git

FILES_${PN} = "${libdir}/libpagecache.so"
RREPLACES_${PN} += "libpagecache0"
RCONFLICTS_${PN} += "libpagecache0"

pkg_postinst_${PN} () {
[ -z $D ] && sed -i 's|${libdir}/libpagecache.so.0.0.0||g' ${sysconfdir}/ld.so.preload || /bin/true
}

pkg_postrm_${PN} () {
[ -z $D ] && sed -i 's|${libdir}/libpagecache.so.0.0.0||g' ${sysconfdir}/ld.so.preload || /bin/true
}


