SUMMARY = "Shows some properties of the TPM configuration area"
SECTION = "console/utils"
LICENSE = "CLOSED"
DEPENDS = "tpmd"
SRCREV = "${@opendreambox_srcrev('4a651b55860ddaaad0e1d9e4ca6357d66c202325', d)}"

inherit opendreambox-git

do_install() {
        oe_runmake install DESTDIR=${D}
}

RDEPENDS_${PN} = "tpmd"
