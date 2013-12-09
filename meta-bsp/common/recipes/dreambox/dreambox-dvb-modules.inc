SUMMARY = "Hardware drivers for Dreambox"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS += "virtual/kernel"
PRIORITY = "required"

# Use precompiled binaries from the previous opendreambox release.
DREAMBOX_DVB_MODULES_MIRROR ?= "http://dreamboxupdate.com/download/${DISTRO}/2.0.0/${PN}"

SRC_URI = " \
        ${DREAMBOX_DVB_MODULES_MIRROR}/dreambox-dvb-modules-${MACHINE}-${PV}.tar.bz2;name=modules \
        file://modules \
"

inherit module

do_compile() {
}
do_install() {
        install -d ${D}${sysconfdir}/modules-load.d
        install -m 0644 ${WORKDIR}/modules ${D}${sysconfdir}/modules-load.d/${PN}.conf
        install -d ${D}/lib/modules/${DM_LOCALVERSION}/extra
        install -m 0644 ${WORKDIR}/LICENSE ${D}/lib/modules/${DM_LOCALVERSION}/extra
        install -m 0644 ${WORKDIR}/*.ko ${D}/lib/modules/${DM_LOCALVERSION}/extra
}

PACKAGES = "${PN}"

RDEPENDS_${PN} += "dreambox-secondstage kernel-${DM_LOCALVERSION}"

FILES_${PN} = "${sysconfdir}/modules-load.d/${PN}.conf \
               /lib/modules/${DM_LOCALVERSION}/extra/LICENSE"

# We don't use KERNEL_VERSION in this recipe, because the
# precompiled modules depend on a specific version.
DM_LOCALVERSION = "${@'-'.join('${PV}'.split('-')[:-1])}"
