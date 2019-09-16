SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[aarch64.md5sum] = "d3cd1feb340a020ebbf4bc5234e2916a"
SRC_URI[aarch64.sha256sum] = "7ee74f90ce36d91ae429fef8c89abaf9f9397c2fc4a31e30ca2845297a3cab2b"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
