DESCRIPTION = "DVMRP multicast routing daemon"
HOMEPAGE = "http://troglobit.com/mrouted.shtml"
SECTION = "network"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5a159dd66aeb92b678404daa0fedfa04"
DEPENDS = "bison-native"
SRCREV = "d1c413ff94fd9a6365d29b0b65a4558c3190e769"

SRC_URI = "git://github.com/troglobit/mrouted.git"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " \
        datadir=${docdir}/${BPN} \
        mandir=${mandir}/man8 \
        prefix=${prefix} \
        sysconfdir=${sysconfdir} \
        DESTDIR=${D} \
"

do_install() {
        oe_runmake install
}
