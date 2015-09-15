SUMMARY = "OpenDreambox: Enigma2 Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

PR = "r1"

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
  ${@base_contains('DREAMBOX_FEATURES', 'cec', 'enigma2-plugin-systemplugins-hdmicec', '', d)} \
  enigma2-plugin-systemplugins-hotplug \
  enigma2-plugin-systemplugins-softwaremanager \
  ${@base_contains('DREAMBOX_FEATURES', 'fan', 'enigma2-plugin-systemplugins-tempfancontrol', '', d)} \
  enigma2-plugin-systemplugins-videomode \
  enigma2-plugin-systemplugins-videotune \
  enigma2-plugins-meta \
  enigma2-plugins-po \
  enigma2-skins-meta \
  enigma2-streamproxy \
  libpassthrough \
  ${@base_contains('DREAMBOX_FEATURES', 'opkgfb', 'opkgfb', '', d)} \
  packagegroup-opendreambox-gstreamer-${OPENDREAMBOX_GST_VERSION} \
  packagegroup-opendreambox-systemlocales \
"

RRECOMMENDS_${PN} += " \
  aio-grab \
  enigma2-hbbtv-plugin \
  enigma2-plugin-extensions-audiosync \
  enigma2-plugin-extensions-autotimer \
  enigma2-plugin-extensions-browser \
  enigma2-plugin-extensions-cutlisteditor \
  enigma2-plugin-extensions-epgrefresh \
  enigma2-plugin-extensions-graphmultiepg \
  enigma2-plugin-extensions-hbbtv \
  enigma2-plugin-extensions-mediacenter \
  enigma2-plugin-extensions-mediarenderer \
  enigma2-plugin-extensions-pictureplayer \
  enigma2-plugin-extensions-teletext \
  enigma2-plugin-extensions-webbouqueteditor \
  enigma2-plugin-extensions-webinterface \
  enigma2-plugin-systemplugins-crashlogautosubmit \
  enigma2-plugin-systemplugins-minidlnasetup \
  enigma2-plugin-systemplugins-mediadatabasemanager \
  enigma2-plugin-systemplugins-networkmanager \
  enigma2-plugin-systemplugins-networksetup \
  enigma2-plugin-systemplugins-networkwizard \
  enigma2-plugin-systemplugins-positionersetup \
  enigma2-plugin-systemplugins-satfinder \
  enigma2-plugin-systemplugins-skinselector \
  enigma2-plugin-systemplugins-streamserver \
  enigma2-plugin-systemplugins-upnp \
  enigma2-plugin-systemplugins-wirelesslan \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-cdinfo', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-dvdburn', '', d)} \
  ${@base_contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-dvdplayer', '', d)} \
  glib-networking \
"

RRECOMMENDS_${PN}_append_mipsel = " \
  ${@base_contains('MACHINE_FEATURES', 'wifi', 'packagegroup-opendreambox-wlan', '', d)} \
"
