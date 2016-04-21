SUMMARY = "Simple user interface for Dreambox rescue mode"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('1cd69394b3702a06cadfce078289dd351a07b152', d)}"
SRCREV_dm520 = "${SRCREV_dm7080}"
SRCREV_dm820 = "${SRCREV_dm7080}"
SRCREV_dm7080 = "${@opendreambox_srcrev('f8f428ba77ea76df72766827c4b00d4be93535cf', d)}"

SRC_URI_append = ";branch=${BRANCH}"

inherit opendreambox-git update-rc.d

do_install() {
    oe_runmake install DESTDIR=${D}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "dreambox-dvb-modules-lcd"
RDEPENDS_${PN}_dm520 = ""

BRANCH = "master"
BRANCH_dm520 = "${BRANCH_dm7080}"
BRANCH_dm820 = "${BRANCH_dm7080}"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"

INITSCRIPT_NAME = "${BPN}"
