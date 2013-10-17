SUMMARY = "enigma2 default services/transponder"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=23102313c1f42fea498404eb17e55202"

SRC_URI = "file://*"

S = "${WORKDIR}"

inherit allarch

do_install() {
        install -d ${D}/usr/share/enigma2/dealer
        install ${WORKDIR}/*.info ${D}/usr/share/enigma2/dealer
        install ${WORKDIR}/lamedb.* ${D}/usr/share/enigma2/dealer
}

FILES_${PN} = "/"
