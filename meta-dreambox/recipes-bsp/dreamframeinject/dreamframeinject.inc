SUMMARY = "Video frame injection driver"
LICENSE = "CLOSED"
DEPENDS = "virtual/kernel"

inherit module-base

do_install_append() {
    install -d ${D}${sysconfdir}/modules-load.d
    echo ${BPN} > ${D}${sysconfdir}/modules-load.d/00-${BPN}.conf
    chmod 0644 ${D}${sysconfdir}/modules-load.d/00-${BPN}.conf
}

FILES_${PN} = "${sysconfdir}/modules-load.d \
               /lib/modules/${KERNEL_VERSION}/extra"

pkg_postinst_${PN} () {
if [ -z "$D" ]; then
	depmod -a ${KERNEL_VERSION}
fi
}

COMPATIBLE_MACHINE = "^(meson64)$"
