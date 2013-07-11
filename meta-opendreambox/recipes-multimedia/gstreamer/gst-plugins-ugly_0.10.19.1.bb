require recipes-multimedia/gstreamer/gst-plugins.inc

LICENSE = "GPLv2+ & LGPLv2.1+ & LGPLv2+"
LICENSE_FLAGS = "commercial"
LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=622921ffad8cb18ab906c56052788a3f"

DEPENDS += "gst-plugins-base"
SRCREV = "9afc696e5fa9fb980e02df5637f022796763216f"

SRC_URI = "git://anongit.freedesktop.org/gstreamer/${PN} \
           file://orc.m4-fix-location-of-orcc-when-cross-compiling.patch"

inherit gettext

PACKAGECONFIG ??= "a52dec lame mad mpeg2dec"
PACKAGECONFIG[a52dec] = "--enable-a52dec,--disable-a52dec,liba52"
PACKAGECONFIG[amrnb] = "--enable-amrnb,--disable-amrnb,opencore-amr"
PACKAGECONFIG[amrwb] = "--enable-amrwb,--disable-amrwb,opencore-amr"
PACKAGECONFIG[cdio] = "--enable-cdio,--disable-cdio,libcdio"
PACKAGECONFIG[lame] = "--enable-lame,--disable-lame,lame"
PACKAGECONFIG[mad] = "--enable-mad,--disable-mad,libmad"
PACKAGECONFIG[mpeg2dec] = "--enable-mpeg2dec,--disable-mpeg2dec,mpeg2dec"
PACKAGECONFIG[orc] = "--enable-orc,--disable-orc,orc orc-native"

do_configure_prepend() {
	# This m4 file contains nastiness which conflicts with libtool 2.2.2
	rm ${S}/m4/lib-link.m4 || true
}

FILESPATH = "${FILE_DIRNAME}/${PN}-0.10.19"

require gst-plugins-git.inc
