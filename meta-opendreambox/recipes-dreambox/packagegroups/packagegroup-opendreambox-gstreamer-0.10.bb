SUMMARY = "GStreamer 0.10 metapackage for opendreambox"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} += " \
  gst-plugin-dvbmediasink \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gst-plugins-bad-cdxaparse', '', d)} \
  gst-plugins-bad-faad \
  gst-plugins-bad-mms \
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
  gst-plugins-good-avi \
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
  gst-plugins-ugly-asf \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gst-plugins-ugly-cdio', '', d)} \
  gst-plugins-ugly-dvdsub \
  gst-plugins-ugly-mad \
  gst-plugins-ugly-mpegaudioparse \
  gst-plugins-ugly-mpegstream \
"
