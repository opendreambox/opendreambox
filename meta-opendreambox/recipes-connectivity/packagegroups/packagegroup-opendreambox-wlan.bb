SUMMARY = "OpenDreambox: WLAN support"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"
DEPENDS = " \
  virtual/kernel \
  ${@base_version_less_or_equal('OLDEST_KERNEL', '3.4', 'r8192c', '',d) } \
  rtl8812au \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
  wireless-tools \
  wpa-supplicant \
"

MODULES_rtl8192 = "${@base_version_less_or_equal('OLDEST_KERNEL', '3.4', 'r8192c', \
    'kernel-module-rtl8192ce linux-firmware-rtl8192ce kernel-module-rtl8192cu linux-firmware-rtl8192cu', d)}"

RRECOMMENDS_${PN} = " \
  ${MODULES_rtl8192} \
  kernel-module-rtl8812au \
  kernel-module-carl9170 \
  kernel-module-r8712u \
  kernel-module-rt2800usb \
  kernel-module-rt73usb \
  kernel-module-zd1211rw \
"
