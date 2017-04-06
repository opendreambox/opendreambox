SUMMARY = "Dreambox compatibility links"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

do_install_mipsel() {
        install -d ${D}${base_libdir}
        ln -sf libcrypto.so.0.9.8 ${D}${base_libdir}/libcrypto.so.0.9.7
        ln -sf libgcc_s.so.1 ${D}${base_libdir}/libgcc_s_nof.so.1
        install -d ${D}${libdir}
        ln -sf libgif.so.4 ${D}${libdir}/libungif.so.4
        ln -sf libjpeg.so.62 ${D}${libdir}/libjpeg.so.8
        ln -sf libssl.so.0.9.8 ${D}${libdir}/libssl.so.0.9.7
        ln -sf libpython2.7.so.1.0 ${D}${libdir}/libpython2.6.so.1.0
}

RDEPENDS_${PN}_mipsel = " \
    giflib \
    jpeg \
    libcrypto0.9.8 \
    libgcc \
    libpython2 \
    libssl0.9.8 \
"

ALLOW_EMPTY_${PN} = "1"
