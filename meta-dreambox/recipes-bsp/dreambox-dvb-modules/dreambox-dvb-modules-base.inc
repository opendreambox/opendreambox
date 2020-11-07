SUMMARY = "Hardware drivers for Dreambox"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS += "virtual/kernel dreambox-dvb-modules-systemd"
PRIORITY = "required"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES =+ "${PN}-firmware ${PN}-fp ${PN}-lcd ${PN}-stb-core"

RDEPENDS_${PN} = "${PN}-fp ${PN}-stb-core"
RDEPENDS_${PN}-firmware = "${PN}-firmware"
RDEPENDS_${PN}-fp = "${PN}-stb-core"
RDEPENDS_${PN}-lcd = "${PN}-fp ${PN}-stb-core"
RRECOMMENDS_${PN} = "${PN}-firmware ${PN}-lcd dreambox-dvb-modules-systemd"

FILES_${PN} = "${sysconfdir}/modules-load.d/10-${BPN}.conf \
               /lib/modules/${DM_LOCALVERSION}/extra/"

FILES_${PN}-firmware = "/lib/firmware"

# XXX: Remove this line once a binary package is available
ALLOW_EMPTY_${PN}-fp = "1"
FILES_${PN}-fp = "${sysconfdir}/modules-load.d/*-${BPN}-fp.conf \
                   /lib/modules/${DM_LOCALVERSION}/extra/fp/fp-dev.ko"

FILES_${PN}-lcd = "${sysconfdir}/modules-load.d/*-${BPN}-lcd.conf \
                   /lib/modules/${DM_LOCALVERSION}/extra/lcd/lcd.ko \
                   /lib/modules/${DM_LOCALVERSION}/extra/lcd.ko"

FILES_${PN}-stb-core = "${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf \
                        /lib/modules/${DM_LOCALVERSION}/extra/stb-core.ko \
                        /lib/modules/${DM_LOCALVERSION}/extra/core/boxsec.ko \
                        /lib/modules/${DM_LOCALVERSION}/extra/stb/stb-core.ko"

# We don't use KERNEL_VERSION in this recipe, because the
# precompiled modules depend on a specific version.
DM_LOCALVERSION = "${@d.getVar('PV', True).rsplit('-', 1)[0]}"

pkg_postinst_${PN} () {
if [ -z "$D" ]; then
	depmod -a ${DM_LOCALVERSION}
fi
}
pkg_postinst_${PN}-lcd () {
if [ -z "$D" ]; then
	depmod -a ${DM_LOCALVERSION}
fi
}
pkg_postinst_${PN}-stb-core () {
if [ -z "$D" ]; then
	depmod -a ${DM_LOCALVERSION}
fi
}
