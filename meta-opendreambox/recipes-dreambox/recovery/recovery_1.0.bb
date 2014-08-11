SUMMARY = "Downloads and runs the recovery tool from the rescue partition"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
SRCREV = "f6d9de6dc38272d83f19f63afe874e1cb58a8c61"
SRCREV_dm7080 = "3f99886e4f6a1a73fc6ceb8d9bcefea0f3ef152e"

SRC_URI_append = ";branch=${BRANCH}"

inherit opendreambox-git

do_install() {
    install -d ${D}${sbindir}
    install -m 755 run-recovery ${D}${sbindir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "gpgv"

BRANCH = "master"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm7080)$"
