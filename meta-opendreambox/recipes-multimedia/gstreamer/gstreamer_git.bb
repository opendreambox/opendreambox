SUMMARY = "GStreamer multimedia framework"
DESCRIPTION = "GStreamer is a multimedia framework for encoding and decoding video and sound. \
It supports a wide range of formats including mp3, ogg, avi, mpeg and quicktime."
HOMEPAGE = "http://gstreamer.freedesktop.org/"
BUGTRACKER = "https://bugzilla.gnome.org/enter_bug.cgi?product=Gstreamer"
SECTION = "multimedia"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=55ca817ccb7d5b5b66355690e9abc605 \
                    file://gst/gst.h;beginline=1;endline=21;md5=8e5fe5e87d33a04479fde862e238eaa4"
DEPENDS = "glib-2.0 libxml2 bison-native flex-native"

SRCREV = "76fc67b18c38e7f6c9cfacc4e4d0ed11d3b2c548"
PV = "0.10.36.1+git${SRCPV}"

RRECOMMENDS_${PN}_qemux86    += "kernel-module-snd-ens1370 kernel-module-snd-rawmidi"
RRECOMMENDS_${PN}_qemux86-64 += "kernel-module-snd-ens1370 kernel-module-snd-rawmidi"

FILES_${PN} += " ${libdir}/gstreamer-0.10/*.so"
FILES_${PN}-dev += " ${libdir}/gstreamer-0.10/*.la ${libdir}/gstreamer-0.10/*.a"
FILES_${PN}-dbg += " ${libdir}/gstreamer-0.10/.debug/ ${libexecdir}/gstreamer-0.10/.debug/"

GSTREAMER_DEBUG ?= "--disable-debug"
EXTRA_OECONF = "--disable-docs-build --disable-dependency-tracking --with-check=no --disable-examples --disable-tests --disable-valgrind ${GSTREAMER_DEBUG}"

inherit autotools pkgconfig gettext

SRC_URI = "git://anongit.freedesktop.org/gstreamer/${PN} \
           file://check_fix.patch \
           file://gst-inspect-check-error.patch \
           file://multiqueue-sparsestreams.patch"

require gst-git.inc
