SUMMARY = "Hardware drivers for Dreambox"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS += "virtual/kernel"
PRIORITY = "required"

# Use precompiled binaries from the previous opendreambox release.
DREAMBOX_DVB_MODULES_MIRROR ?= "http://dreamboxupdate.com/download/${DISTRO}/2.2.0/${PN}"
PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[-2]}"

SRC_URI = "${DREAMBOX_DVB_MODULES_MIRROR}/dreambox-dvb-modules-${PRECOMPILED_ARCH}-${PV}.tar.bz2;name=modules"

inherit module-base

addtask make_scripts after do_patch before do_compile
do_make_scripts[lockfiles] = "${TMPDIR}/kernel-scripts.lock"
do_make_scripts[deptask] = "do_populate_sysroot"

do_compile() {
}
do_install() {
    install -d ${D}/lib/modules/${DM_LOCALVERSION}/extra
    install -m 0644 ${WORKDIR}/*.ko ${D}/lib/modules/${DM_LOCALVERSION}/extra
    install -m 0644 ${WORKDIR}/LICENSE ${D}/lib/modules/${DM_LOCALVERSION}/extra
}
do_install_append() {
    install -d ${D}${sysconfdir}/modules-load.d
    if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/lcd.ko ]; then
        echo lcd > ${D}${sysconfdir}/modules-load.d/01-${BPN}-lcd.conf
        chmod 0644 ${D}${sysconfdir}/modules-load.d/01-${BPN}-lcd.conf
    fi
    for module in ${SOC_FAMILY} dreambox_keyboard; do
        if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/$module.ko ]; then
            echo $module >> ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
        fi
    done
    chmod 0644 ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
}

PACKAGES =+ "${PN}-lcd ${PN}-stb-core"

RDEPENDS_${PN} = "${PN}-stb-core"
RDEPENDS_${PN}-lcd = "${PN}-stb-core"
RRECOMMENDS_${PN} = "${PN}-lcd ${PN}-systemd"

FILES_${PN} = "${sysconfdir}/modules-load.d/10-${BPN}.conf \
               /lib/modules/${DM_LOCALVERSION}/extra/"

FILES_${PN}-lcd = "${sysconfdir}/modules-load.d/01-${BPN}-lcd.conf \
                   /lib/modules/${DM_LOCALVERSION}/extra/lcd.ko"

FILES_${PN}-stb-core = "/lib/modules/${DM_LOCALVERSION}/extra/stb-core.ko"

# We don't use KERNEL_VERSION in this recipe, because the
# precompiled modules depend on a specific version.
DM_LOCALVERSION = "${@d.getVar('PV', True).rsplit('-', 1)[0]}"
