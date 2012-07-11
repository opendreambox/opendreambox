SUMMARY = "Preloadable library to improve large file operations"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS = "libdlsym"
SRCREV = "052cc4497e4b86169b965ee15d2f52863d132a75"
PR = "r2"

inherit autotools opendreambox-git lib_package

#no more use libpagecache as default preload lib
#do_install_append() {
#        install -d ${D}${sysconfdir}
#        echo "${libdir}/libpagecache.so.0.0.0" > ${D}${sysconfdir}/ld.so.preload
#}

pkg_postinst_${PN} () {
[ -z $D ] && sed -i 's|${libdir}/libpagecache.so.0.0.0||g' ${sysconfdir}/ld.so.preload || /bin/true
}

pkg_postrm_${PN} () {
[ -z $D ] && sed -i 's|${libdir}/libpagecache.so.0.0.0||g' ${sysconfdir}/ld.so.preload || /bin/true
}


