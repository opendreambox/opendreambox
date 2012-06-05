SUMMARY = "TuxCom for dreambox 8000/32bit framebuffer"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://tuxcom.c;endline=23;md5=33c69eb2b4a436ea9e00355b66c21dd9"
DEPENDS = "freetype"
RDEPENDS_${PN} = "enigma2"
SRCDATE = "20060123"
PV = "0.0+cvs${SRCDATE}"
PR = "r2"

SRC_URI = "cvs://anoncvs@cvs.tuxbox.org/cvs/tuxbox;module=apps/tuxbox/plugins/tuxcom;method=ext \
        file://makefiles.diff \
        file://add_font.diff \
        file://32bpp.diff \
        file://add_e2_plugin.diff \
        file://add_advanced_rc.diff \
        file://support_newer_freetype.patch"

S = "${WORKDIR}/tuxcom"

inherit autotools

EXTRA_OECONF = "--with-target=native"

do_configure_prepend() {
        touch ${S}/python/__init__.py
}

FILES_${PN} = "${bindir}/tuxcom ${libdir}/enigma2 /etc/tuxcom ${datadir}/fonts/pakenham.ttf"

CPPFLAGS += "-DHAVE_DREAMBOX_HARDWARE -DDREAMBOX"
