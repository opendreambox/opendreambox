require recipes-multimedia/gstreamer/gst-plugins.inc

LICENSE = "GPLv2+ & LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=622921ffad8cb18ab906c56052788a3f \
                    file://gst/replaygain/rganalysis.c;beginline=1;endline=23;md5=b60ebefd5b2f5a8e0cab6bfee391a5fe"

PACKAGECONFIG ??= "cairo flac jpeg libpng ${@base_contains('DISTRO_FEATURES', 'pulseaudio', 'pulseaudio', '', d)} soup speex zlib"
PACKAGECONFIG[cairo] = "--enable-cairo,--disable-cairo,cairo"
PACKAGECONFIG[flac] = "--enable-flac,--disable-flac,flac"
PACKAGECONFIG[jpeg] = "--enable-jpeg,--disable-jpeg,jpeg"
PACKAGECONFIG[libpng] = "--enable-libpng,--disable-libpng,libpng"
PACKAGECONFIG[orc] = "--enable-orc,--disable-orc,orc orc-native"
PACKAGECONFIG[pulseaudio] = "--enable-pulse,--disable-pulse,pulseaudio"
PACKAGECONFIG[soup] = "--enable-soup,--disable-soup,libsoup-2.4"
PACKAGECONFIG[speex] = "--enable-speex,--disable-speex,speex"
PACKAGECONFIG[zlib] = "--enable-zlib,--disable-zlib,zlib"

DEPENDS += "gst-plugins-base"
SRCREV = "5af6f5bfb6c3619a9ccc3b1681579aeb90e8b89a"

inherit gettext

SRC_URI = "git://anongit.freedesktop.org/gstreamer/${PN} \
           file://orc.m4-fix-location-of-orcc-when-cross-compiling.patch \
           file://0001-accept-substream-syncwords-DTS-HD.patch \
           file://0002-v4l2-fix-compilation-against-newer-kernel-headers-as.patch \
           file://mp4-parse-fix-typo.patch \
"

EXTRA_OECONF += "--disable-aalib --disable-esd --disable-shout2 --disable-libcaca --disable-hal --without-check \
                 --disable-examples --disable-taglib"

do_configure_prepend() {
	# This m4 file contains nastiness which conflicts with libtool 2.2.2
	rm ${S}/m4/lib-link.m4 || true
}

FILESPATH = "${FILE_DIRNAME}/${PN}-0.10.31"

require gst-plugins-git.inc
