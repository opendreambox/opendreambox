SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[aarch64.md5sum] = "07b99bfa6634e9e7e2e9f9922634c25d"
SRC_URI[aarch64.sha256sum] = "50c33c00ba47c508a24e872287bc344be6ceb44bb4103c08af65b127293757e6"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
