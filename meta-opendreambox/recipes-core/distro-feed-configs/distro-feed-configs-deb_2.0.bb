PKGTYPE = "deb"
PKGCONFDIR = "${sysconfdir}/apt/sources.list.d"
PKGCONFSUFFIX = "list"

SRC_URI = "file://apt.conf \
           file://tmpfiles.conf"

do_compile() {
    for feed in ${FEED_ARCHS}; do
        echo "deb ${DISTRO_FEED_URI}/${PKGTYPE}/$feed ./" > ${S}${PKGCONFDIR}/$feed-feed.${PKGCONFSUFFIX}
    done
}

do_install_append() {
    install -d ${D}${sysconfdir}/apt/apt.conf.d
    install -m 644 ${WORKDIR}/apt.conf ${D}${sysconfdir}/apt/apt.conf.d/${BPN}.conf
    install -d ${D}${sysconfdir}/tmpfiles.d
    install -m 644 ${WORKDIR}/tmpfiles.conf ${D}${sysconfdir}/tmpfiles.d/${BPN}.conf
}

pkg_postinst_${PN} () {
    if [ -z "$D" ]; then
        if command -v systemd-tmpfiles >/dev/null; then
            systemd-tmpfiles --create ${sysconfdir}/tmpfiles.d/${BPN}.conf
        elif [ -e ${sysconfdir}/init.d/populate-volatile.sh ]; then
            ${sysconfdir}/init.d/populate-volatile.sh update
        fi
    fi
}

require distro-feed-configs.inc
