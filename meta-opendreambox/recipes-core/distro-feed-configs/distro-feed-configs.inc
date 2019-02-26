DESCRIPTION = "Configuration files for online package repositories aka feeds (${PKGTYPE} version)"
LICENSE = "CLOSED"

DISTRO_FEED_PREFIX ?= "remote"
DISTRO_FEED_URI ?= "http://my-distribution.example/remote-feed/"

FEED_ARCHS = "${@oe.utils.str_filter_out('^(any|noarch)$', d.getVar('ALL_MULTILIB_PACKAGE_ARCHS'), d)}"

do_compile_prepend() {
    install -d ${S}${PKGCONFDIR}
}
do_install() {
    install -d ${D}${PKGCONFDIR}
    install -m 0644 ${S}${PKGCONFDIR}/*-feed.${PKGCONFSUFFIX} ${D}${PKGCONFDIR}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

CONFFILES_${PN} += '${@" ".join([("${PKGCONFDIR}/%s-feed.${PKGCONFSUFFIX}" % feed) for feed in "${FEED_ARCHS}".split()])}'

RPROVIDES_${PN} = "distro-feed-configs"
RCONFLICTS_${PN} = "distro-feed-configs"
