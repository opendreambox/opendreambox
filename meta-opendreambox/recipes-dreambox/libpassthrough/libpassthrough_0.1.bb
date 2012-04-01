DESCRIPTION = "Dreambox TS/M2TS audio passthrough helper lib"
LICENSE = "Proprietary"
PR = "r1"

SRC_URI[mipsel.md5sum] = "fad2e38bf8b7766b7bd707274d8bc2e1"
SRC_URI[mipsel.sha256sum] = "d438fc113f383fa5911145dfe42386216e493b81252e5f8f3629efd2b1adf503"

inherit opendreambox-precompiled-binary

do_install() {
        install -d ${D}${libdir}
        install -m 0755 libpassthrough.so ${D}${libdir}
}

FILES_${PN} = "${libdir}"

DEBIAN_NOAUTONAME_${PN} = "1"
