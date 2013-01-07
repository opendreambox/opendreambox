SUMMARY = "Preloadable library to improve large file operations"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS = "libdlsym"
SRCREV = "eb8d6d011f63d78b35042987fdf93f88d805b48d"
PR = "r0"

inherit autotools opendreambox-git

FILES_${PN} = "${libdir}/libpagecache.so"
RREPLACES_${PN} += "libpagecache0"
RCONFLICTS_${PN} += "libpagecache0"

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


