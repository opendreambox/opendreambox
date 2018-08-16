SUMMARY = "OpenDreambox: Enigma2 Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} += " \
  blindscan-utils \
  enigma2 \
  enigma2-defaultservices \
  enigma2-meta \
  enigma2-plugin-extensions-genuinedreambox \
  enigma2-plugin-extensions-mediascanner \
  ${@bb.utils.contains('DREAMBOX_FEATURES', 'ci', 'enigma2-plugin-systemplugins-commoninterfaceassignment', '', d)} \
  ${@bb.utils.contains('DREAMBOX_FEATURES', 'cec', 'enigma2-plugin-systemplugins-hdmicec', '', d)} \
  enigma2-plugin-systemplugins-hotplug \
  enigma2-plugin-systemplugins-softwaremanager \
  ${@bb.utils.contains('DREAMBOX_FEATURES', 'fan', 'enigma2-plugin-systemplugins-tempfancontrol', '', d)} \
  enigma2-plugin-systemplugins-videomode \
  enigma2-plugin-systemplugins-videotune \
  enigma2-plugins-meta \
  enigma2-plugins-po \
  enigma2-plugin-extensions-babelzapper-meta \
  enigma2-plugin-extensions-bitrateviewer-meta \
  enigma2-plugin-extensions-curlytx-meta \
  enigma2-plugin-extensions-infobartunerstate-meta \
  enigma2-plugin-extensions-merlinmusicplayer-meta \
  enigma2-plugin-extensions-moviecut-meta \
  enigma2-plugin-extensions-partnerbox-meta \
  enigma2-plugin-extensions-permanenttimeshift-meta \
  enigma2-plugin-extensions-pzyp4t-meta \
  enigma2-plugin-extensions-reconstructapsc-meta \
  enigma2-plugin-extensions-retrogamestation-meta \
  enigma2-plugin-extensions-seriesplugin-meta \
  enigma2-plugin-extensions-stalkerclient-meta \
  enigma2-plugin-extensions-vlcplayer-meta \
  enigma2-plugin-systemplugins-networkbrowser-meta \
  enigma2-plugin-systemplugins-vps-meta \
  enigma2-skins-meta \
  enigma2-streamproxy \
  golang-plaincast-meta \
  libpassthrough \
  packagegroup-opendreambox-gstreamer-1.0 \
  packagegroup-opendreambox-systemlocales \
"

RRECOMMENDS_${PN} += " \
  aio-grab \
  dreambox-bootlogo \
  enigma2-plugin-extensions-audiosync \
  enigma2-plugin-extensions-autotimer \
  enigma2-plugin-extensions-browser \
  enigma2-plugin-extensions-cutlisteditor \
  enigma2-plugin-extensions-epgrefresh \
  enigma2-plugin-extensions-epgsearch \
  enigma2-plugin-extensions-graphmultiepg \
  enigma2-plugin-extensions-hbbtv \
  enigma2-plugin-extensions-mediacenter \
  enigma2-plugin-extensions-mediarenderer \
  enigma2-plugin-extensions-pictureplayer \
  enigma2-plugin-extensions-teletext \
  enigma2-plugin-extensions-webbouqueteditor \
  enigma2-plugin-extensions-webinterface \
  enigma2-plugin-systemplugins-crashlogautosubmit \
  enigma2-plugin-systemplugins-fsblupdater \
  enigma2-plugin-systemplugins-minidlnasetup \
  enigma2-plugin-systemplugins-mediadatabasemanager \
  enigma2-plugin-systemplugins-networkmanager \
  enigma2-plugin-systemplugins-networksetup \
  enigma2-plugin-systemplugins-networkwizard \
  enigma2-plugin-systemplugins-positionersetup \
  enigma2-plugin-systemplugins-satfinder \
  enigma2-plugin-systemplugins-setpasswd \
  enigma2-plugin-systemplugins-skinselector \
  enigma2-plugin-systemplugins-inputdevicemanager \
  ${@bb.utils.contains('DREAMBOX_FEATURES', 'encoder', 'enigma2-plugin-systemplugins-streamserver', '', d)} \
  enigma2-plugin-systemplugins-upnp \
  enigma2-plugin-systemplugins-wirelesslan \
  ${@bb.utils.contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-cdinfo', '', d)} \
  ${@bb.utils.contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-dvdburn', '', d)} \
  ${@bb.utils.contains('DREAMBOX_FEATURES', 'dvd', 'enigma2-plugin-extensions-dvdplayer', '', d)} \
  ${@bb.utils.contains('MACHINE_FEATURES', 'wifi', 'packagegroup-opendreambox-wlan', '', d)} \
  glib-networking \
"
