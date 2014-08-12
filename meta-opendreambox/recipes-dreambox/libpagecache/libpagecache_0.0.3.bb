SUMMARY = "Preloadable library to improve large file operations"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS = "libdlsym"
SRCREV = "${@opendreambox_srcrev('a9b393e1ee16bf1bc128beb58438fe68049440bc', d)}"

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


