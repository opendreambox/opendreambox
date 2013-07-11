require recipes-multimedia/gstreamer/gst-plugins.inc

LICENSE = "GPLv2+ & LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3 \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=622921ffad8cb18ab906c56052788a3f \
                    file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605 \
                    file://gst/ffmpegcolorspace/utils.c;beginline=1;endline=20;md5=9c83a200b8e597b26ca29df20fc6ecd0"

DEPENDS += "alsa-lib liboil libogg libvorbis libtheora util-linux tremor"
SRCREV = "bdb33163478fdf95938fbdca7eabad3ea920a277"

SRC_URI = "git://anongit.freedesktop.org/gstreamer/${PN} \
           file://orc.m4-fix-location-of-orcc-when-cross-compiling.patch \
           file://disable-vorbis-encoder.patch"
SRC_URI += "file://gst-plugins-base-tremor.patch \
            file://configure.ac-fix-subparse-plugin.patch"

inherit gettext

EXTRA_OECONF += "--disable-freetypetest"

PACKAGECONFIG ??= "${@base_contains('DISTRO_FEATURES', 'x11', 'x11', '', d)}"

PACKAGECONFIG[gnomevfs] = "--enable-gnome_vfs,--disable-gnome_vfs,gnome-vfs"
PACKAGECONFIG[orc] = "--enable-orc,--disable-orc,orc orc-native"
PACKAGECONFIG[pango] = "--enable-pango,--disable-pango,pango"
PACKAGECONFIG[x11] = "--enable-x --enable-xvideo,--disable-x --disable-xvideo,virtual/libx11 libxv libsm libice"

do_configure_prepend() {
	# This m4 file contains nastiness which conflicts with libtool 2.2.2
	rm -f ${S}/m4/lib-link.m4
}

FILES_${PN} += "${datadir}/${BPN}"

PACKAGES_DYNAMIC += "^libgst(app|audio|cdda|fft|interfaces|netbuffer|pbutils|riff|rtp|rtsp|sdp|tag|video)-${LIBV}.*"

FILESPATH = "${FILE_DIRNAME}/${PN}-0.10.36.1"

require gst-plugins-git.inc
