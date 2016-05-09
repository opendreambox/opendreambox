RTL_BASENAME = "rtl8188C_8192C_usb_linux_v${@d.getVar('PV', True).replace('-', '_')}"
RTL_KCONFIG = "RTL8192CU"

require realtek.inc

LIC_FILES_CHKSUM = "file://os_dep/linux/os_intfs.c;endline=19;md5=72c75de415f1e8a42587d170459677e2"

SRC_URI += "file://r8192c-inline-decl.patch"
SRC_URI[md5sum] = "efb71a576f781c3d15531511aac2c5c9"
SRC_URI[sha256sum] = "219b214a6a86408f898a94321988363718be0e26f30512c38bdd5ba3cb371856"
