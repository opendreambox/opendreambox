SUMMARY = "Dreambox TPM Daemon"

SRC_URI[mips32el.md5sum] = "66afb979be57ba4671d74891594e65e0"
SRC_URI[mips32el.sha256sum] = "1133c327dcdb889ea80a5cd94bf98d8e9bba1d511f1110f595a919e5e222139c"

SYSTEMD_SERVICE_${PN} = "tpmd.socket"

inherit opendreambox-precompiled-binary opendreambox-sysvinit systemd

RDEPENDS_${PN} = "${@base_contains('DISTRO_FEATURES', 'sysvinit', 'wdog', '', d)}"

INITSCRIPT_PARAMS = "start 60 S ."
