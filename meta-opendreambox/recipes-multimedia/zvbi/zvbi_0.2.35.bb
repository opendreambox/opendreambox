SUMMARY = "Vertical Blanking Interval decoder (VBI)"
SECTION = "libs/multimedia"
LICENSE = "GPLv2+"
LICENSE_libzvbi = "LGPLv2+"
LICENSE_libzvbi-chains = "LGPLv2+"
LIC_FILES_CHKSUM = "file://README;endline=31;md5=8e5fdf6998713f2beb4790827baad7e9"
DEPENDS = "libpng"

SRC_URI = "${SOURCEFORGE_MIRROR}/zapping/zvbi/${BP}.tar.bz2 \
           file://0001-Fix-linker-errors-due-to-implicit-declaration-of-S_I.patch \
           file://0002-fix-missing-lines-on-every-page-on-pro7-sat1.patch \
           file://0003-fix-no-clock-updates.patch \
           file://0004-fix-sky-not-working.patch \
           file://0005-fix-top-navigation.patch \
           file://0006-search-add-vbi_catch_page.patch \
           file://0007-decode_timestamp-Disabled-check-to-work-around-inval.patch \
           file://0008-caption_command-SF-bug-195-Mid-row-codes-are-set-at-.patch \
           file://0009-parse_28_29-SF-bug-198-Faulty-logic-in-TTX-Level-2.5.patch \
           file://0010-skip-data-with-wrong-framing-code.patch"
SRC_URI[md5sum] = "95e53eb208c65ba6667fd4341455fa27"
SRC_URI[sha256sum] = "fc883c34111a487c4a783f91b1b2bb5610d8d8e58dcba80c7ab31e67e4765318"

inherit autotools gettext pkgconfig

PACKAGES =+ "libzvbi libzvbi-chains"

FILES_libzvbi = "${libdir}/libzvbi${SOLIBS}"
FILES_libzvbi-chains = "${libdir}/libzvbi-chains${SOLIBS}"
