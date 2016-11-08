SUMMARY = "OpenDreambox: WLAN support"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"
DEPENDS = " \
  ${@bb.utils.contains('MACHINE_FEATURES', 'pci', 'madwifi-ng', '',d)} \
  virtual/kernel \
"
DEPENDS_append_mipsel = " r8192c"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
  wireless-tools \
  wpa-supplicant \
"

RRECOMMENDS_${PN} = " \
  ${@bb.utils.contains('MACHINE_FEATURES', 'pci', '${WLAN_PCI_MODULES}', '', d)} \
  kernel-module-carl9170 \
  kernel-module-r8712u \
  kernel-module-rt2800usb \
  kernel-module-rt73usb \
  kernel-module-zd1211rw \
"
RRECOMMENDS_${PN}_append_mipsel = " r8192c"

WLAN_PCI_MODULES = " \
  madwifi-ng-modules \
  madwifi-ng \
"
