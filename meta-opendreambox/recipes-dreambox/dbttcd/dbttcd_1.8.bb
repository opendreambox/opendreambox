SRC_URI[mips32el.md5sum] = "2b0b3c7ac65a5b34265c56cceba3e444"
SRC_URI[mips32el.sha256sum] = "7037024148e7c68ab70fdf4f6ee3cb3a28f516ea8b31464ca954588d41e2430d"

SYSTEMD_SERVICE_${PN} = "dbttcd.socket"

inherit opendreambox-precompiled-binary systemd

RDEPENDS_${PN} += "${@base_contains('DISTRO_FEATURES', 'sysvinit', 'wdog', '', d)}"

require dbttcd.inc
