SUMMARY = "infra-red remote control support"
HOMEPAGE = "http://lirc.org/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "alsa-lib libftdi libusb python-pyyaml-native systemd virtual/kernel"
SRCREV = "80a029e8d68be6aff6c1ac74247a2910c432818b"
PV = "0.9.1+git${SRCPV}"

SRC_URI = "git://git.code.sf.net/p/lirc/git \
           file://0001-build-make-man2html-optional.patch \
           file://0002-build-use-systemd.m4-https-bitbucket.org-mgorny-syst.patch \
           file://0003-tools-use-python-instead-of-python3.patch \
           file://0004-build-only-link-to-systemd-library-where-required.patch"

S = "${WORKDIR}/git"

inherit autotools pythonnative systemd

PACKAGECONFIG ??= "${@base_contains('DISTRO_FEATURES', 'x11', 'x11', '', d)}"
PACKAGECONFIG[x11] = "--with-x,--without-x,virtual/libx11"

PARALLEL_MAKE = ""

do_install_append() {
    rm ${D}${bindir}/configs
    rm -rf ${D}${localstatedir}/run
    rmdir --ignore-fail-on-non-empty ${D}${localstatedir}
    if ! ${@base_contains('DISTRO_FEATURES', 'x11', 'true', 'false', d)}; then
        rm ${D}${bindir}/lirc-setup.ui
        rm ${D}${datadir}/lirc/lirc-setup.ui
    fi
}

PACKAGES =+ "liblirc liblircclient liblircdriver lirc-remotes lircmd"
PACKAGES_DYNAMIC = "^lirc-plugin-.*"

RRECOMMENDS_${PN} = "kernel-module-lirc-dev lirc-plugin-default"

FILES_${PN}-dbg += "${libdir}/lirc/plugins/.debug"
FILES_${PN}-dev += "${libdir}/lirc/plugins/*.la ${datadir}/lirc/include"
FILES_${PN}-doc += "${datadir}/lirc/contrib ${datadir}/lirc/lirc.org"

FILES_liblirc = "${libdir}/liblirc${SOLIBS}"
FILES_liblircclient = "${libdir}/liblirc_client${SOLIBS}"
FILES_liblircdriver = "${libdir}/liblirc_driver${SOLIBS}"
FILES_lirc-remotes = "${datadir}/lirc/remotes"
FILES_lircmd = "${sysconfdir}/lirc/lircmd.conf ${sbindir}/lircmd ${datadir}/lirc/contrib/lircmd.conf"

python lirc_split_packages() {
    pluginsdir = d.expand('${libdir}/lirc/plugins')
    do_split_packages(d, pluginsdir, '(.*).so', 'lirc-plugin-%s', '${SUMMARY} - %s plugin', prepend=True)
}

PACKAGESPLITFUNCS =+ "lirc_split_packages"

SYSTEMD_PACKAGES = "${PN} lircmd"
SYSTEMD_SERVICE_${PN} = "lircd.socket"
SYSTEMD_SERVICE_lircmd = "lircmd.service"
