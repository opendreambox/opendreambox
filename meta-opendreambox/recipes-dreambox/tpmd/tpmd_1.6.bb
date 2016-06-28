SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[mips32el.md5sum] = "63bfe51b3aea13ecf390f7fd4a1d1f02"
SRC_URI[mips32el.sha256sum] = "87762540d324ebf75ffb064b5f938f8c650d97ebab26b0187c0fe1b332783ee0"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
