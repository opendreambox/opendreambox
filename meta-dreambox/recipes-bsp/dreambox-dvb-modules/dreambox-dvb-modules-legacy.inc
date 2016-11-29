DREAMBOX_DVB_MODULES_MIRROR ?= "http://dreamboxupdate.com/download/${DISTRO}/2.0.0/${PN}"
PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[-2]}"

SRC_URI = "${DREAMBOX_DVB_MODULES_MIRROR}/dreambox-dvb-modules-${PRECOMPILED_ARCH}-${PV}.tar.bz2;name=modules"

do_install() {
    install -d ${D}/lib/modules/${DM_LOCALVERSION}/extra
    install -m 0644 ${WORKDIR}/*.ko ${D}/lib/modules/${DM_LOCALVERSION}/extra
    install -m 0644 ${WORKDIR}/LICENSE ${D}/lib/modules/${DM_LOCALVERSION}/extra
}

require dreambox-dvb-modules-base.inc
