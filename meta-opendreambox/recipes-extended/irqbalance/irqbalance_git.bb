SUMMARY = "Daemon to balance interrupts for SMP systems"
HOMEPAGE = "https://github.com/Irqbalance/irqbalance"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
SRCREV = "06089621e813f06d9ef33d680324654141f43088"
PV = "1.0.7+git${SRCPV}"

SRC_URI = "git://github.com/Irqbalance/irqbalance"

S = "${WORKDIR}/git"

inherit autotools

PACKAGECONFIG ??= "glib"
PACKAGECONFIG[glib] = "--with-glib2,--without-glib2,glib-2.0"
PACKAGECONFIG[cap] = "--with-libcap-ng,--without-libcap-ng,libcap-ng"
