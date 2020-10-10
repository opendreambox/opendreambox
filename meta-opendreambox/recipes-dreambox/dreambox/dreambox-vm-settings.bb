SUMMARY = "system settings to e.g. optimize memory for ethernet to USB transfers"
SECTION = "base"
LICENSE = "CLOSED"

SRC_URI = "file://vm-settings.conf"

do_install_append () {
	install -d ${D}${sysconfdir}/sysctl.d
	install -m 0644 ${WORKDIR}/vm-settings.conf ${D}${sysconfdir}/vm-settings.conf
	ln -sf ../vm-settings.conf ${D}${sysconfdir}/sysctl.d/90-vm-settings.conf
}

CONFFILES_${PN} = "${sysconfdir}/vm-settings.conf"
