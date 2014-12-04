SUMMARY = "Provides web pages for the rescue partition"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
DEPENDS = "fcgi"
SRCREV = "${@opendreambox_srcrev('5d68fcde19886c1fdf4987ec18ceaa346a40c68a', d)}"
SRCREV_dm820 = "${SRCREV_dm7080}"
SRCREV_dm7080 = "${@opendreambox_srcrev('9746fff85c7ad625784ec04517d9cbe3437a11f5', d)}"

SRC_URI_append = ";branch=${BRANCH}"

inherit opendreambox-git

do_install() {
    oe_runmake install DESTDIR=${D}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = " \
    coreutils-stdbuf \
    haserl \
    lighttpd \
    lighttpd-module-cgi \
    lighttpd-module-fastcgi \
    recovery \
    tpm-ca \
"

BRANCH = "master"
BRANCH_dm820 = "${BRANCH_dm7080}"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"
