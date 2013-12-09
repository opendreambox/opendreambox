SUMMARY = "OpenDreambox: WLAN support"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=23102313c1f42fea498404eb17e55202"
DEPENDS = " \
  ${@base_contains('MACHINE_FEATURES', 'pci', 'madwifi-ng', '',d)} \
  r8192c \
  virtual/kernel \
"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = " \
  wireless-tools \
  wpa-supplicant \
"

RRECOMMENDS_${PN} = " \
  ${@base_contains('MACHINE_FEATURES', 'pci', '${WLAN_PCI_MODULES}', '', d)} \
  kernel-module-carl9170 \
  kernel-module-r8712u \
  kernel-module-rt2800usb \
  kernel-module-rt73usb \
  kernel-module-zd1211rw \
  r8192c \
"

WLAN_PCI_MODULES = " \
  madwifi-ng-modules \
  madwifi-ng \
"
