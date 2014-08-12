SUMMARY = "Userspace tools for MMC/SD devices"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://mmc.c;beginline=2;endline=14;md5=b97aaa36428bb4378f991555f2529469"
SRCREV = "11f2ceabc4ad3f0dd568e0ce68166e4803e0615b"
PV = "0.1+git${SRCPV}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/cjb/mmc-utils.git"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}
    install -m 755 mmc ${D}${bindir}
}
