SUMMARY = "Simple user interface for Dreambox rescue mode"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('1cd69394b3702a06cadfce078289dd351a07b152', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('162a22c8075eaaf1640e2fe32de3b31d6b864c67', d)}"

SRC_URI_append = ";branch=${BRANCH}"

inherit opendreambox-git update-rc.d

do_install() {
    oe_runmake install DESTDIR=${D}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "dreambox-dvb-modules-lcd"

BRANCH = "master"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm7080)$"

INITSCRIPT_NAME = "${BPN}"
