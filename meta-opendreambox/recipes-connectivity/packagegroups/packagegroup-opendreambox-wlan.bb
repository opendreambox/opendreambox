SUMMARY = "OpenDreambox: WLAN support"
SECTION = "opendreambox/base"
LICENSE = "MIT"
DEPENDS = " \
  virtual/kernel \
  ${@base_version_less_or_equal('OLDEST_KERNEL', '3.4', 'r8192c', '',d) } \
  rtl8812au \
  rtl88x2bu \
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
  kernel-module-rtl88x2bu \
"
