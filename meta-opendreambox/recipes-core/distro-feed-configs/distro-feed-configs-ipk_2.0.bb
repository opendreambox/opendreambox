PKGTYPE = "ipk"
PKGCONFDIR = "${sysconfdir}/opkg"
PKGCONFSUFFIX = "conf"

do_compile() {
    for feed in ${FEED_ARCHS}; do
        echo "src/gz ${DISTRO_FEED_PREFIX}-$feed ${DISTRO_FEED_URI}/${PKGTYPE}/$feed" > ${S}${sysconfdir}/opkg/$feed-feed.${PKGCONFSUFFIX}
    done
}

require distro-feed-configs.inc

RREPLACES_${PN} = "distro-feed-configs (<= 1.0)"
