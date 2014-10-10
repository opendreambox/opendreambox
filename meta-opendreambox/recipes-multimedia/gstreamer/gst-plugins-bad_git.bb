require recipes-multimedia/gstreamer/gst-plugins.inc

LICENSE = "GPLv2+ & LGPLv2+ & LGPLv2.1+ "
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3 \
                    file://gst/tta/filters.h;beginline=12;endline=29;md5=629b0c7a665d155a6677778f4460ec06 \
                    file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605 \
                    file://gst/tta/crc32.h;beginline=12;endline=29;md5=71a904d99ce7ae0c1cf129891b98145c"

DEPENDS += "gst-plugins-base"
SRCREV = "05183675077d502aaf0e7483656f5610bb4d0f43"
PV = "0.10.23.1+git${SRCPV}"

CPPFLAGS += "${@base_contains('DISTRO_FEATURES', 'x11', '', '-DMESA_EGL_NO_X11_HEADERS', d)}"

SRC_URI = "git://anongit.freedesktop.org/gstreamer/${PN} \
           file://0001-mpegdemux-speedup.patch \
           file://0002-mpegdemux-compile-fixes.patch \
           file://0003-hls-locking-fixes.patch \
           file://0004-hls-demux-backport.patch \
           file://0005-rtmp-revert-change.patch \
           file://0006-faad-lower-rank.patch \
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
PACKAGECONFIG[cog] = "--enable-cog,--disable-cog,libpng"
PACKAGECONFIG[faad] = "--enable-faad,--disable-faad,faad2"
PACKAGECONFIG[jp2k] = "--enable-jp2k,--disable-jp2k,jasper"
PACKAGECONFIG[modplug] = "--enable-modplug,--disable-modplug,libmodplug"
PACKAGECONFIG[opus] = "--enable-opus,--disable-opus,libopus"
PACKAGECONFIG[rtmp] = "--enable-rtmp,--disable-rtmp,rtmpdump"
PACKAGECONFIG[sndfile] = "--enable-sndfile,--disable-sndfile,libsndfile1"
PACKAGECONFIG[vp8] = "--enable-vp8,--disable-vp8,libvpx"
PACKAGECONFIG[ass] = "--enable-assrender,--disable-assrender,libass"
PACKAGECONFIG[openal] = "--enable-openal,--disable-openal,openal-soft"
PACKAGECONFIG[musicbrainz] = "--enable-musicbrainz,--disable-musicbrainz,libmusicbrainz"

ARM_INSTRUCTION_SET = "arm"

PACKAGES_DYNAMIC += "^libgst(basecamerabinsrc|basevideo|codecparsers|photography|signalprocessor)-${LIBV}.*"

require gst-git.inc
