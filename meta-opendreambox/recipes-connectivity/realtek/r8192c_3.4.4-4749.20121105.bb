LIC_FILES_CHKSUM = "file://os_dep/linux/os_intfs.c;endline=19;md5=f8d10a6bd2fdfa240c0634a7c660c57f"

SRC_URI = "file://0001-Fix-compile-with-kernel-2.6.18.patch"
SRC_URI[md5sum] = "05755143f52d597733968608d7467796"
SRC_URI[sha256sum] = "08593a1c0fc946249fda0deb8cdb6200af42d02fc6a6ec58d99fe45f32c8faff"

require realtek.inc

RTL_BASENAME = "rtl8188C_8192C_usb_linux_v${@d.getVar('PV', True).replace('-', '_')}"
RTL_KCONFIG = "RTL8192CU"
