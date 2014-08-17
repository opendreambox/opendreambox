SUMMARY = "Downloads and runs the recovery tool from the rescue partition"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('f6d9de6dc38272d83f19f63afe874e1cb58a8c61', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('e20a4f70057457825bb924d16f58485e28732b98', d)}"

SRC_URI_append = ";branch=${BRANCH}"

inherit opendreambox-git

do_install() {
    oe_runmake install DESTDIR=${D}
}

PACKAGES =+ "boot-scripts"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = " \
    boot-scripts \
    e2fsprogs-mke2fs \
    gpgv \
    parted \
    util-linux-mount \
"
RDEPENDS_boot-scripts = "mkbootblob"

FILES_boot-scripts = "${sbindir}/flash-kernel ${sbindir}/select-boot-source"

BRANCH = "master"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm7080)$"
