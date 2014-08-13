SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "glib-2.0 openssl systemd"

SRC_URI[mips32el.md5sum] = "003c44636f3844c431a958cfe111afa5"
SRC_URI[mips32el.sha256sum] = "4a8946c8a681b62408a7ecd0457d65bca0345295388ffd0db51674dfa1590690"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd
