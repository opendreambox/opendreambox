SUMMARY = "decoding library for DTS Coherent Acoustics streams"
SECTION = "libs/multimedia"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
SRCREV = "2ee6732527a7cc7c0b972415eb6c5186e0410ff2"
PV = "0.0.6+git${SRCPV}"

SRC_URI = "git://code.videolan.org/videolan/${BPN}.git;protocol=https"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig

do_compile_prepend() {
        # single precision is enough and speeds up libdca by about 10-15%
        sed -i -e 's/double/sample_t/g' ${S}/libdca/*.c ${S}/libdca/*.h
}
