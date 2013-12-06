SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"

SRC_URI[mips32el.md5sum] = "87130a8c70d2ec1037f5b7ba8df728bc"
SRC_URI[mips32el.sha256sum] = "071035121675440eaf64e003dbb4884c2aad19982ec39932be21f8bb661ce05e"

SYSTEMD_SERVICE_${PN} = "dccamd.socket"

inherit opendreambox-precompiled-binary opendreambox-sysvinit systemd

RDEPENDS_${PN} = "${@base_contains('DISTRO_FEATURES', 'sysvinit', 'wdog', '', d)}"
