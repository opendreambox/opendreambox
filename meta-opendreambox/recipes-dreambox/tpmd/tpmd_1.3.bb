SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "glib-2.0 openssl systemd"

SRC_URI[mips32el.md5sum] = "51ac25f9016820b1bebf1a37ec5a5b92"
SRC_URI[mips32el.sha256sum] = "28a90a323ef236513c28e800a1c71bc473451b6b73ca78082800ea7782a8bb74"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd
