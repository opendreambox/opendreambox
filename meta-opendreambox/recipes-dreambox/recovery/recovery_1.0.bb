SUMMARY = "Downloads and runs the recovery tool from the rescue partition"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('f6d9de6dc38272d83f19f63afe874e1cb58a8c61', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('e98b1615fd68a998961761e5f0cdc8a751228a27', d)}"

SRC_URI_append = ";branch=${BRANCH}"

inherit opendreambox-git

do_install() {
    install -d ${D}${sbindir}
    install -m 755 flash-kernel select-boot-source run-recovery ${D}${sbindir}
}

PACKAGES =+ "boot-scripts"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "boot-scripts gpgv"
RDEPENDS_boot-scripts = "mkbootblob"

FILES_boot-scripts = "${sbindir}/flash-kernel ${sbindir}/select-boot-source"

BRANCH = "master"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm7080)$"
