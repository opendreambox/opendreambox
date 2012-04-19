DESCRIPTION = "OpenDreambox: Enigma2 Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PR = "r18"

inherit task

#
# task-opendreambox-enigma2
#
DESCRIPTION_task-opendreambox-enigma2 = "OpenDreambox: Enigma2 Dependencies"
RDEPENDS_task-opendreambox-enigma2 = "\
  ${@base_contains('DREAMBOX_NIMS', 'cxd1978', 'blindscan-cxd1978', '', d)} \
  ${@base_contains('DREAMBOX_NIMS', 'slot', 'blindscan-utils', '', d)} \
  enigma2 \
  enigma2-defaultservices \
  enigma2-drivers-meta \
  enigma2-meta \
  enigma2-plugin-extensions-genuinedreambox \
  enigma2-plugin-extensions-mediascanner \
  ${@base_contains('DREAMBOX_FEATURES', 'ci', 'enigma2-plugin-systemplugins-commoninterfaceassignment', '', d)} \
  enigma2-plugin-systemplugins-frontprocessorupgrade \
  enigma2-plugin-systemplugins-hotplug \
  enigma2-plugin-systemplugins-networksetup \
  enigma2-plugin-systemplugins-networkwizard \
  enigma2-plugin-systemplugins-softwaremanager \
  ${@base_contains('DREAMBOX_FEATURES', 'fan', 'enigma2-plugin-systemplugins-tempfancontrol', '', d)} \
  enigma2-plugin-systemplugins-videomode \
  enigma2-plugin-systemplugins-videotune \
  ${@base_contains('MACHINE_FEATURES', 'wifi', 'enigma2-plugin-systemplugins-wirelesslan', '', d)} \
  enigma2-plugins-meta \
  enigma2-skins-meta \
  enigma2-streamproxy \
  gst-plugin-dvbmediasink \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gst-plugins-bad-cdxaparse', '', d)} \
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
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'gst-plugins-ugly-cdio', '', d)} \
  gst-plugins-ugly-dvdsub \
  gst-plugins-ugly-mad \
  gst-plugins-ugly-mpegaudioparse \
  gst-plugins-ugly-mpegstream \
  ${@base_contains('DREAMBOX_FEATURES', 'libpassthrough', 'libpassthrough', '', d)} \
  tuxbox-tuxtxt-32bpp \
"

RRECOMMENDS_task-opendreambox-enigma2 = "\
  aio-grab \
  enigma2-plugin-extensions-audiosync \
  ${@base_less_or_equal('DREAMBOX_IMAGE_SIZE', 64, '', 'enigma2-plugin-extensions-browser', d)} \
  enigma2-plugin-extensions-cutlisteditor \
  enigma2-plugin-extensions-graphmultiepg \
  enigma2-plugin-extensions-mediaplayer \
  enigma2-plugin-extensions-pictureplayer \
  enigma2-plugin-extensions-webbouqueteditor \
  enigma2-plugin-extensions-webinterface \
  enigma2-plugin-systemplugins-crashlogautosubmit \
  ${@base_less_or_equal('DREAMBOX_IMAGE_SIZE', 64, '', 'enigma2-plugin-systemplugins-minidlnasetup', d)} \
  enigma2-plugin-systemplugins-positionersetup \
  enigma2-plugin-systemplugins-satfinder \
  enigma2-plugin-systemplugins-skinselector \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'task-opendreambox-cdplayer', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'task-opendreambox-dvdburn', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'task-opendreambox-dvdplayer', '', d)} \
  ${@base_contains('MACHINE_FEATURES', 'modem', 'task-opendreambox-modem', '', d)} \
  ${@base_contains('MACHINE_FEATURES', 'wifi', 'task-opendreambox-wlan', '', d)} \
"

RDEPENDS_task-opendreambox-enigma2_append_dm8000 = " \
  enigma2-plugin-systemplugins-nfiflash \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
