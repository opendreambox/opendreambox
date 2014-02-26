SUMMARY = "GStreamer 0.10 metapackage for opendreambox"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=23102313c1f42fea498404eb17e55202"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} += " \
  gst-plugin-dvbmediasink \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gst-plugins-bad-cdxaparse', '', d)} \
  gst-plugins-bad-faad \
  ${@base_contains('DREAMBOX_FEATURES', 'asf', 'gst-plugins-bad-mms', '', d)} \
  gst-plugins-bad-mpegdemux \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gst-plugins-bad-vcdsrc', '', d)} \
  gst-plugins-base-alsa \
  gst-plugins-base-app \
  gst-plugins-base-audioconvert \
  gst-plugins-base-audioresample \
  gst-plugins-base-decodebin \
  gst-plugins-base-decodebin2 \
  gst-plugins-base-ogg \
  gst-plugins-base-playbin \
  gst-plugins-base-subparse \
  gst-plugins-base-typefindfunctions \
  ${@base_conditional('TARGET_FPU', 'soft', 'gst-plugins-base-ivorbisdec', 'gst-plugins-base-vorbis', d)} \
  gst-plugins-good-apetag \
  gst-plugins-good-audioparsers \
  gst-plugins-good-autodetect \
  ${@base_contains('DREAMBOX_FEATURES', 'xvid', 'gst-plugins-good-avi', '', d)} \
  gst-plugins-good-flac \
  gst-plugins-good-flv \
  gst-plugins-good-icydemux \
  gst-plugins-good-id3demux \
  gst-plugins-good-isomp4 \
  gst-plugins-good-matroska \
  gst-plugins-good-rtp \
  gst-plugins-good-rtpmanager \
  gst-plugins-good-rtsp \
  gst-plugins-good-souphttpsrc \
  gst-plugins-good-udp \
  gst-plugins-good-wavparse \
  ${@base_contains('DREAMBOX_FEATURES', 'asf', 'gst-plugins-ugly-asf', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gst-plugins-ugly-cdio', '', d)} \
  gst-plugins-ugly-dvdsub \
  gst-plugins-ugly-mad \
  gst-plugins-ugly-mpegaudioparse \
  gst-plugins-ugly-mpegstream \
  ${@base_contains('DREAMBOX_FEATURES', 'libpassthrough', 'libpassthrough', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'opkgfb', 'opkgfb', '', d)} \
"
