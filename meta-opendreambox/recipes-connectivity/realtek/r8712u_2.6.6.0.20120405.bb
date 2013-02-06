LIC_FILES_CHKSUM = "file://os_intf/linux/os_intfs.c;endline=19;md5=d1bbd9348c57df9fd08439bddfa32ec5"

SRC_URI = "file://0001-Fix-compile-with-kernel-3.2.patch \
           file://0002-Fix-compile-with-kernel-2.6.18.patch"
SRC_URI[md5sum] = "30aa91e9db2a54d44602e1a97ebee3b3"
SRC_URI[sha256sum] = "c2a6a54783cf0c482863aa0b99ec695f3fc89c82a3ed70bd4a2a47b53b02535e"

require realtek.inc

RTL_BASENAME = "rtl8712_8188_8191_8192SU_usb_linux_v${PV}"
RTL_KCONFIG = "RTL8712U"
