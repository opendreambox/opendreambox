FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://configure.ac-force-enable-sendfile-when-cross-compiling.patch \
            file://stat_cache-fix-reading-block-devices.patch \
            file://include-conf-enabled.sh.in \
            file://lighttpd.conf.in"

PACKAGECONFIG ?= "pcre zlib \
    ${@base_contains('DISTRO_FEATURES', 'ipv6', 'ipv6', '', d)} \
    ${@base_contains('DISTRO_FEATURES', 'largefile', 'lfs', '', d)} \
    ${@base_contains('DISTRO_FEATURES', 'xattr', 'attr', '', d)} \
"

SED = "sed -e 's,@localstatedir@,${localstatedir},g' \
           -e 's,@pkgdatadir@,${datadir}/${PN},g' \
           -e 's,@pkgsysconfdir@,${sysconfdir}/${PN},g'"

do_install_prepend() {
        sed -e 's,/etc/lighttpd\.conf,${sysconfdir}/${PN}/lighttpd.conf,g' -i ${WORKDIR}/lighttpd
        sed -e 's,@SYSCONFDIR@/lighttpd\.conf,${sysconfdir}/${PN}/lighttpd.conf,g' -i ${WORKDIR}/lighttpd.service
}
do_install_append() {
        rm -r ${D}${sysconfdir}/lighttpd.d ${D}/www
        rm ${D}${sysconfdir}/lighttpd.conf

        install -d ${D}${sysconfdir}/${PN}
        ${SED} < ${WORKDIR}/lighttpd.conf.in > ${D}${sysconfdir}/${PN}/lighttpd.conf
        chmod 644 ${D}${sysconfdir}/${PN}/lighttpd.conf

        install -d ${D}${datadir}/${PN}
        ${SED} < ${WORKDIR}/include-conf-enabled.sh.in > ${D}${datadir}/${PN}/include-conf-enabled.sh
        chmod 755 ${D}${datadir}/${PN}/include-conf-enabled.sh

        install -d ${D}${sysconfdir}/${PN}/conf-enabled
}
