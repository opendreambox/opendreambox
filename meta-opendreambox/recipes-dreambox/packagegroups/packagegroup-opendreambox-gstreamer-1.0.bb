SUMMARY = "GStreamer 1.0 metapackage for opendreambox"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} += " \
  gstreamer1.0-dreamsinks \
  gstreamer1.0-plugins-bad-assrender \
  gstreamer1.0-plugins-bad-dashdemux \
  gstreamer1.0-plugins-bad-dvdspu \
  gstreamer1.0-plugins-bad-faad \
  gstreamer1.0-plugins-bad-fragmented \
  gstreamer1.0-plugins-bad-mms \
  gstreamer1.0-plugins-bad-mpegpsdemux \
  gstreamer1.0-plugins-bad-mpegtsdemux \
  gstreamer1.0-plugins-bad-rawparse \
  gstreamer1.0-plugins-bad-adpcmdec \
  gstreamer1.0-plugins-bad-smoothstreaming \
  gstreamer1.0-plugins-bad-videoparsersbad \
  gstreamer1.0-plugins-base-alsa \
  gstreamer1.0-plugins-base-app \
  gstreamer1.0-plugins-base-audioconvert \
  gstreamer1.0-plugins-base-audioresample \
  gstreamer1.0-plugins-base-ogg \
  gstreamer1.0-plugins-base-pango \
  gstreamer1.0-plugins-base-playback \
  gstreamer1.0-plugins-base-subparse \
  gstreamer1.0-plugins-base-typefindfunctions \
  ${@base_conditional('TARGET_FPU', 'soft', 'gstreamer1.0-plugins-base-ivorbisdec', 'gstreamer1.0-plugins-base-vorbis', d)} \
  gstreamer1.0-plugins-good-apetag \
  gstreamer1.0-plugins-good-audioparsers \
  gstreamer1.0-plugins-good-autodetect \
  gstreamer1.0-plugins-good-avi \
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
  gstreamer1.0-plugins-ugly-asf \
  gstreamer1.0-plugins-ugly-cdio \
  gstreamer1.0-plugins-ugly-dvdsub \
  gstreamer1.0-plugins-ugly-mad \
"

RRECOMMENDS_${PN} = "gstreamer1.0-bash-completion"
