SUMMARY = "GnuPG archive keys of the opendreambox archive"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

SRC_URI = "file://opendreambox-krogoth.gpg"

do_install() {
    install -d ${D}${sysconfdir}/apt/trusted.gpg.d
    install -m 644 ${WORKDIR}/opendreambox-krogoth.gpg ${D}${sysconfdir}/apt/trusted.gpg.d
}

RDEPENDS_${PN} = "gpgv"
RRECOMMENDS_${PN} = "gnupg"
