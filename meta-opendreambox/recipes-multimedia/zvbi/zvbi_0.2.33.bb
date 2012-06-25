SUMMARY = "Vertical Blanking Interval decoder (VBI)"
SECTION = "libs/multimedia"
LICENSE = "GPLv2+"
LICENSE_libzvbi = "LGPLv2+"
LICENSE_libzvbi-chains = "LGPLv2+"
LIC_FILES_CHKSUM = "file://README;endline=31;md5=ed9161eb3cf455906253cc8f4c225088"
DEPENDS = "libpng"
PR = "r2"

SRC_URI = "${SOURCEFORGE_MIRROR}/zapping/${BP}.tar.bz2 \
           file://0001-Fix-linker-errors-due-to-implicit-declaration-of-S_I.patch \
           file://0002-fix-missing-lines-on-every-page-on-pro7-sat1.patch \
           file://0003-fix-no-clock-updates.patch \
           file://0004-fix-sky-not-working.patch \
           file://0005-fix-top-navigation.patch \
           file://0006-search-add-vbi_catch_page.patch"
SRC_URI[md5sum] = "1741a6045c3eedfb611d645f2da69ac8"
SRC_URI[sha256sum] = "09a709f6de5f42e7039cca2732a6ea211a397bb666b9110ee52658603be4fb7e"

inherit autotools gettext pkgconfig

PACKAGES =+ "libzvbi libzvbi-chains"

FILES_libzvbi = "${libdir}/libzvbi${SOLIBS}"
FILES_libzvbi-chains = "${libdir}/libzvbi-chains${SOLIBS}"
