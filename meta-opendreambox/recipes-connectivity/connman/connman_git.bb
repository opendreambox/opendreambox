require recipes-connectivity/connman/connman.inc

SRCREV = "f97980f9f5fbe8760d14b28375074062c1f8e446"
PV = "1.24+git${SRCPV}"

SRC_URI = "git://git.kernel.org/pub/scm/network/connman/connman.git \
           file://connman \
           file://connmand-env \
           file://replace-hardcode-and-add-EnvironmentFile-and-Wants.patch \
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
