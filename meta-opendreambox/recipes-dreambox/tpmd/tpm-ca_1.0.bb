SUMMARY = "Shows some properties of the TPM configuration area"
SECTION = "console/utils"
LICENSE = "CLOSED"
DEPENDS = "tpmd"
SRCREV = "${@opendreambox_srcrev('9e02dfc055c24f95a72c9a672592f48d468b1720', d)}"

inherit opendreambox-git

do_install() {
        oe_runmake install DESTDIR=${D}
}

RDEPENDS_${PN} = "tpmd"
