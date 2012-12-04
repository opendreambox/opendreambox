SUMMARY = "The Ubuntu Font Family"
HOMEPAGE = "http://font.ubuntu.com"
LICENSE = "UbuntuFontLicense1.0"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=325a1a9029112a2405e743c7f816427b"
PR = "r1"

SRC_URI = "http://font.ubuntu.com/download/${BPN}-${PV}.zip"
SRC_URI[md5sum] = "a1fc70f5a5b1d096ab8310886cddaa1c"
SRC_URI[sha256sum] = "107170099bbc3beae8602b97a5c423525d363106c3c24f787d43e09811298e4c"

inherit allarch

do_install(){
    install -d ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/Ubuntu-B.ttf ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/Ubuntu-BI.ttf ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/Ubuntu-C.ttf ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/Ubuntu-R.ttf ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/Ubuntu-RI.ttf ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/UbuntuMono-B.ttf ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/UbuntuMono-BI.ttf ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/UbuntuMono-R.ttf ${D}${libdir}/fonts
    install -m 0644 ${WORKDIR}/${BPN}-${PV}/UbuntuMono-RI.ttf ${D}${libdir}/fonts
}

FILES_${PN} = "${libdir}/fonts"

SQUASHFS_IMG_PACKAGES = "${PN}-sqsh-img"
SQUASHFS_IMG_REPLACES = "${PN}"
SQUASHFS_IMG_BLOCKSIZES = "262144"
inherit squashfs-img
