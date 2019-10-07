SUMMARY = "Shows some properties of the TPM configuration area"
SECTION = "console/utils"
LICENSE = "CLOSED"
DEPENDS = "tpmd"
SRCREV = "${@opendreambox_srcrev('b36ed8d95ce5a55b8a6a59194214b32b2c72088e', d)}"

inherit opendreambox-git

do_install() {
        oe_runmake install DESTDIR=${D}
}

RDEPENDS_${PN} = "tpmd"
