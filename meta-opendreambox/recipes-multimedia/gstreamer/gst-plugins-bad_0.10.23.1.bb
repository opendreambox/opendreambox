require recipes-multimedia/gstreamer/gst-plugins.inc

LICENSE = "GPLv2+ & LGPLv2+ & LGPLv2.1+ "
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3 \
                    file://gst/tta/filters.h;beginline=12;endline=29;md5=629b0c7a665d155a6677778f4460ec06 \
                    file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605 \
                    file://gst/tta/crc32.h;beginline=12;endline=29;md5=71a904d99ce7ae0c1cf129891b98145c"

DEPENDS += "faad2"
DEPENDS += "gst-plugins-base"
SRCREV = "cef47d85294a0dca38631f938b81a3f0dd6891bd"

CPPFLAGS += "${@base_contains('DISTRO_FEATURES', 'x11', '', '-DMESA_EGL_NO_X11_HEADERS', d)}"

SRC_URI = "git://anongit.freedesktop.org/gstreamer/${PN} \
           file://0003-mpegpsdemux_speedup.diff.patch \
           file://0004-mpegdemux-compile-fixes.patch \
           file://0005-hlsdemux-locking-fixes.patch \
           file://0006-hlsdemux-backport.patch \
           file://0007-revert-rtmp-change.patch \
           file://0008-faad-lower-rank.patch \
           file://orc.m4-fix-location-of-orcc-when-cross-compiling.patch"

inherit gettext

EXTRA_OECONF += "--disable-experimental \
                 --disable-sdl --disable-cdaudio --disable-directfb \
                 --disable-vdpau --disable-apexsink"
EXTRA_OECONF += "--disable-examples --disable-mpeg2enc --disable-mplex \
                 --disable-uvch264 --disable-fatal-warnings"

PACKAGECONFIG ??= "bzip curl \
                   ${@base_contains('DISTRO_FEATURES', 'x11', 'rsvg', '', d)}"

PACKAGECONFIG[bzip] = "--enable-bz2,--disable-bz2,bzip2"
PACKAGECONFIG[curl] = "--enable-curl,--disable-curl,curl"
PACKAGECONFIG[rsvg] = "--enable-rsvg,--disable-rsvg,librsvg,"
PACKAGECONFIG[orc] = "--enable-orc,--disable-orc,orc orc-native"
PACKAGECONFIG[neon] = "--enable-neon,--disable-neon,neon"
PACKAGECONFIG[libmms] = "--enable-libmms,--disable-libmms,libmms"
PACKAGECONFIG[musicbrainz] = "--enable-musicbrainz,--disable-musicbrainz,libmusicbrainz"

ARM_INSTRUCTION_SET = "arm"

do_configure_prepend() {
	# This m4 file contains nastiness which conflicts with libtool 2.2.2
	rm ${S}/m4/lib-link.m4 || true
}

PACKAGES_DYNAMIC += "^libgst(basecamerabinsrc|basevideo|codecparsers|photography|signalprocessor)-${LIBV}.*"

FILESPATH = "${FILE_DIRNAME}/${PN}-0.10.23"

require gst-plugins-git.inc
