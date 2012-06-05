SUMMARY = "TuxCom for 800/7025/8000/32bit framebuffer HD Autosize"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://tuxcom.c;endline=23;md5=33c69eb2b4a436ea9e00355b66c21dd9"
DEPENDS = "freetype"
RDEPENDS_${PN} = "enigma2"
SRCDATE = "20070410"
PV = "1.16+cvs${SRCDATE}"
PR = "r0"

SRC_URI = "cvs://anoncvs@cvs.tuxbox.org/cvs/tuxbox;module=apps/tuxbox/plugins/tuxcom;method=ext \
        file://makefiles.diff \
        file://add_font.diff \
        file://32bpp.diff \
        file://add_e2_plugin.diff \
        file://largefile.diff \
        file://support_newer_freetype.diff \
        file://fix_smstext.diff \
"

S = "${WORKDIR}/tuxcom"

inherit autotools

EXTRA_OECONF = "--with-target=native"

do_configure_prepend() {
        touch ${S}/python/__init__.py
}

FILES_${PN} = "${bindir}/tuxcom ${libdir}/enigma2 /etc/tuxcom ${datadir}/fonts/pakenham.ttf"

CPPFLAGS += "-DHAVE_DREAMBOX_HARDWARE -DDREAMBOX"
