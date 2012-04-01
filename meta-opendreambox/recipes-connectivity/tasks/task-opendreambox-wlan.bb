DESCRIPTION = "OpenDreambox: WLAN support"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PR = "r8"

inherit task

DEPENDS = " \
  ${@base_contains('MACHINE_FEATURES', 'pci', 'madwifi-ng', '',d)} \
  linux-firmware \
  zd1211-firmware \
  ${@base_version_less_or_equal('DREAMBOX_KERNEL_VERSION', '2.6.18', '${WLAN_USB_MODULES_LEGACY}', '', d)} \
  virtual/kernel \
"

RDEPENDS_${PN} = " \
  wireless-tools \
  wpa-supplicant \
  ${@base_version_less_or_equal('DREAMBOX_KERNEL_VERSION', '2.6.18', '', '${WLAN_CRYPTO_MODULES}', d)} \
  ${@base_contains('MACHINE_FEATURES', 'pci', '${WLAN_PCI_MODULES}', '${WLAN_USB_FIRMWARE} ${WLAN_USB_MODULES}', d)} \
"

RSUGGESTS_${PN} = " \
  ${@base_contains('MACHINE_FEATURES', 'pci', '${WLAN_USB_FIRMWARE} ${WLAN_USB_MODULES}', '', d)} \
"

WLAN_CRYPTO_MODULES = " \
  kernel-module-aes-generic \
  kernel-module-arc4 \
  kernel-module-ecb \
"

WLAN_USB_FIRMWARE_KERNEL = " \
  linux-firmware-rt73usb \
  linux-firmware-rtl8192su \
  zd1211-firmware \
"

WLAN_USB_FIRMWARE_LEGACY = " \
"

WLAN_USB_MODULES_KERNEL = " \
  kernel-module-r8712u \
  kernel-module-rt73usb \
  kernel-module-zd1211rw \
"

WLAN_USB_MODULES_LEGACY = " \
  r8712u \
  wlan-rt73 \
  zd1211b \
"

WLAN_PCI_MODULES = " \
  madwifi-ng-modules \
"

WLAN_USB_FIRMWARE = " \
  ${@base_version_less_or_equal('DREAMBOX_KERNEL_VERSION', '2.6.18', '${WLAN_USB_FIRMWARE_LEGACY}', '${WLAN_USB_FIRMWARE_KERNEL}', d)} \
"

WLAN_USB_MODULES = " \
  ${@base_version_less_or_equal('DREAMBOX_KERNEL_VERSION', '2.6.18', '${WLAN_USB_MODULES_LEGACY}', '${WLAN_USB_MODULES_KERNEL}', d)} \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
