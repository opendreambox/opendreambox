SUMMARY = "Userspace tools for MMC/SD devices"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://mmc.c;beginline=2;endline=14;md5=b97aaa36428bb4378f991555f2529469"
SRCREV = "2cb6695e8dec00d887bdd5309d1b57d836fcd214"
PV = "0.1+git${SRCPV}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/cjb/mmc-utils.git"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "DESTDIR=${D} bindir=${bindir}"

do_install() {
    oe_runmake install
}
