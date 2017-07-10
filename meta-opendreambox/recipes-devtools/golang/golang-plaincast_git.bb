SUMMARY = "Server that acts like a lightweight Chromecast that only includes YouTube"
HOMEPAGE = "https://${GO_SRCROOT}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${GO_SRCROOT}/LICENSE;md5=8c72efa592970068179de01858522f24"
DEPENDS = "golang-gouuid golang-x-crypto golang-dbus"
RDEPENDS_${PN} = "enigma2-plugin-systemplugins-dbusinterfaceproxy enigma2-plugin-systemplugins-tubelib"
SRCREV = "5c2670ca5b9285f7f91db376b3e60026d4384b26"
RECIPE_PV := "${PV}"
PV = "${RECIPE_PV}+git${SRCPV}"

SRC_URI = " \
    git://${GO_SRCROOT} \
    file://0001-implement-dbus-based-dreambox-player.patch \
    file://plugin_plaincast.xml \
"

SYSTEMD_SERVICE_${PN} = "plaincast.service"

inherit golang systemd

do_compile_prepend() {
        rm -f ${S}/${GO_SRCROOT}/apps/youtube/mp/mpv.go
}

do_install_append() {
        install -d ${D}${systemd_system_unitdir}
        install -m644 ${S}/${GO_SRCROOT}/plaincast.service ${D}${systemd_system_unitdir}
        install -d ${D}${datadir}/meta
        install -m644 ${S}/plugin_plaincast.xml ${D}${datadir}/meta/plugin_plaincast.xml
}

FILES_${PN} += "${datadir}/meta/plugin_plaincast.xml"
GO_SRCROOT = "github.com/aykevl/plaincast"
