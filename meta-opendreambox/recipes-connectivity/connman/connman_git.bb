require recipes-connectivity/connman/connman.inc

SRCREV = "82e1cc41e0293f5f4c4f299251095ab6f4d486b2"
PV = "1.30+git${SRCPV}"

SRC_URI = "git://git.kernel.org/pub/scm/network/connman/connman.git \
           file://0001-device-inet-Create-read-only-devices-instead-of-igno.patch \
           file://0002-Add-EnvironmentFile-and-Wants.patch \
           file://connman \
           file://connmand-env \
           file://connman-env.service.in"

S = "${WORKDIR}/git"

do_install_append() {
	rm -rf ${D}${sysconfdir}/init.d

        install -m 755 ${WORKDIR}/connmand-env ${D}${sbindir}/connmand-env
        sed -e 's,@sbindir@,${sbindir},g' < ${WORKDIR}/connman-env.service.in > ${D}${systemd_unitdir}/system/connman-env.service
        chmod 644 ${D}${systemd_unitdir}/system/connman-env.service
}

FILES_${PN} += "${sbindir}/connmand-env ${systemd_unitdir}/system/connman-env.service"

INITSCRIPT_PACKAGES = ""
