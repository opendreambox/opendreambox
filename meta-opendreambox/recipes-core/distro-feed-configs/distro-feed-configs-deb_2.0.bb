PKGTYPE = "deb"
PKGCONFDIR = "${sysconfdir}/apt/sources.list.d"
PKGCONFSUFFIX = "list"

do_compile() {
    for feed in ${FEED_ARCHS}; do
        echo "deb ${DISTRO_FEED_URI}/${PKGTYPE}/$feed ./" > ${S}${PKGCONFDIR}/$feed-feed.${PKGCONFSUFFIX}
    done
}

require distro-feed-configs.inc
