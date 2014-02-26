SUMMARY = "GStreamer 1.0 metapackage for opendreambox"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=23102313c1f42fea498404eb17e55202"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} += " \
  gst-plugin-dvbmediasink \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gstreamer1.0-plugins-bad-cdxaparse', '', d)} \
  gstreamer1.0-plugins-bad-faad \
  ${@base_contains('DREAMBOX_FEATURES', 'asf', 'gstreamer1.0-plugins-bad-mms', '', d)} \
  gstreamer1.0-plugins-bad-mpegpsdemux \
  gstreamer1.0-plugins-bad-mpegtsdemux \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gstreamer1.0-plugins-bad-vcdsrc', '', d)} \
  gstreamer1.0-plugins-base-alsa \
  gstreamer1.0-plugins-base-app \
  gstreamer1.0-plugins-base-audioconvert \
  gstreamer1.0-plugins-base-audioresample \
  gstreamer1.0-plugins-base-ogg \
  gstreamer1.0-plugins-base-playback \
  gstreamer1.0-plugins-base-subparse \
  gstreamer1.0-plugins-base-typefindfunctions \
  ${@base_conditional('TARGET_FPU', 'soft', 'gstreamer1.0-plugins-base-ivorbisdec', 'gstreamer1.0-plugins-base-vorbis', d)} \
  gstreamer1.0-plugins-good-apetag \
  gstreamer1.0-plugins-good-audioparsers \
  gstreamer1.0-plugins-good-autodetect \
  ${@base_contains('DREAMBOX_FEATURES', 'xvid', 'gstreamer1.0-plugins-good-avi', '', d)} \
  gstreamer1.0-plugins-good-flac \
  gstreamer1.0-plugins-good-flv \
  gstreamer1.0-plugins-good-icydemux \
  gstreamer1.0-plugins-good-id3demux \
  gstreamer1.0-plugins-good-isomp4 \
  gstreamer1.0-plugins-good-matroska \
  gstreamer1.0-plugins-good-rtp \
  gstreamer1.0-plugins-good-rtpmanager \
  gstreamer1.0-plugins-good-rtsp \
  gstreamer1.0-plugins-good-souphttpsrc \
  gstreamer1.0-plugins-good-udp \
  gstreamer1.0-plugins-good-wavparse \
  ${@base_contains('DREAMBOX_FEATURES', 'asf', 'gstreamer1.0-plugins-ugly-asf', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gstreamer1.0-plugins-ugly-cdio', '', d)} \
  gstreamer1.0-plugins-ugly-dvdsub \
  gstreamer1.0-plugins-ugly-mad \
"
