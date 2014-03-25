SUMMARY = "OpenDreambox: Enigma2 Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=23102313c1f42fea498404eb17e55202"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} += " \
  blindscan-utils \
  enigma2 \
  enigma2-defaultservices \
  enigma2-meta \
  enigma2-plugin-extensions-genuinedreambox \
  enigma2-plugin-extensions-mediascanner \
  ${@base_contains('DREAMBOX_FEATURES', 'ci', 'enigma2-plugin-systemplugins-commoninterfaceassignment', '', d)} \
  enigma2-plugin-systemplugins-frontprocessorupgrade \
  ${@base_contains('DREAMBOX_FEATURES', 'cec', 'enigma2-plugin-systemplugins-hdmicec', '', d)} \
  enigma2-plugin-systemplugins-hotplug \
  enigma2-plugin-systemplugins-mediadatabasemanager \
  enigma2-plugin-systemplugins-networkmanager \
  enigma2-plugin-systemplugins-softwaremanager \
  ${@base_contains('DREAMBOX_FEATURES', 'fan', 'enigma2-plugin-systemplugins-tempfancontrol', '', d)} \
  enigma2-plugin-systemplugins-videomode \
  enigma2-plugin-systemplugins-videotune \
  enigma2-plugins-meta \
  enigma2-skins-meta \
  enigma2-streamproxy \
  ${@base_contains('DREAMBOX_FEATURES', 'libpassthrough', 'libpassthrough', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'opkgfb', 'opkgfb', '', d)} \
  packagegroup-opendreambox-gstreamer-${OPENDREAMBOX_GST_VERSION} \
"

RDEPENDS_${PN}_append_dm8000 = " \
  enigma2-plugin-systemplugins-nfiflash \
"

RRECOMMENDS_${PN} += " \
  aio-grab \
  ${@base_less_or_equal('DREAMBOX_IMAGE_SIZE', 64, '', 'enigma2-hbbtv-plugin', d)} \
  enigma2-plugin-extensions-audiosync \
  enigma2-plugin-extensions-browser \
  enigma2-plugin-extensions-cutlisteditor \
  enigma2-plugin-extensions-graphmultiepg \
  ${@base_less_or_equal('DREAMBOX_IMAGE_SIZE', 64, '', 'enigma2-plugin-extensions-hbbtv', d)} \
  enigma2-plugin-extensions-mediaplayer \
  enigma2-plugin-extensions-pictureplayer \
  enigma2-plugin-extensions-teletext \
  enigma2-plugin-extensions-webbouqueteditor \
  enigma2-plugin-extensions-webinterface \
  enigma2-plugin-systemplugins-crashlogautosubmit \
  ${@base_less_or_equal('DREAMBOX_IMAGE_SIZE', 64, '', 'enigma2-plugin-systemplugins-minidlnasetup', d)} \
  enigma2-plugin-systemplugins-positionersetup \
  enigma2-plugin-systemplugins-satfinder \
  enigma2-plugin-systemplugins-skinselector \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-cdinfo', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-dvdburn', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-dvdplayer', '', d)} \
  ${@base_contains('MACHINE_FEATURES', 'modem', 'packagegroup-opendreambox-modem', '', d)} \
  glib-networking \
"

RRECOMMENDS_${PN}_append_mipsel = " \
  ${@base_contains('MACHINE_FEATURES', 'wifi', 'packagegroup-opendreambox-wlan', '', d)} \
"
