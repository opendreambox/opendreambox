DESCRIPTION = "Configuration files for online package repositories aka feeds (${PKGTYPE} version)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

DISTRO_FEED_PREFIX ?= "remote"
DISTRO_FEED_URI ?= "http://my-distribution.example/remote-feed/"

FEED_ARCHS = "all ${PACKAGE_EXTRA_ARCHS} ${MACHINE_ARCH}"

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
