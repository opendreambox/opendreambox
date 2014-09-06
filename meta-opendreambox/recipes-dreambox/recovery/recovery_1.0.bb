SUMMARY = "Command-line tools to flash and recover your Dreambox"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('f6d9de6dc38272d83f19f63afe874e1cb58a8c61', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('80d6cd45d9bf91497edc801968de21a6995f57bd', d)}"

SRC_URI_append = ";branch=${BRANCH}"

inherit opendreambox-git

do_install() {
    oe_runmake install DESTDIR=${D}
}

PACKAGES =+ "flash-scripts"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = " \
    e2fsprogs-mke2fs \
    flash-scripts \
    gpgv \
    parted \
    util-linux-mount \
"
RDEPENDS_flash-scripts = " \
    fastboot \
    mkbootblob \
    util-linux-sfdisk \
"

FILES_flash-scripts = "${sbindir}/flash-rescue ${sbindir}/flash-kernel ${sbindir}/flash-ssbl ${sbindir}/select-boot-source"

BRANCH = "master"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm7080)$"
