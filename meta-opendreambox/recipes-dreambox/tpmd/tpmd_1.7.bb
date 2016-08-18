SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[mips32el.md5sum] = "1f0452cf75233c42fc6cbbcc42996b6f"
SRC_URI[mips32el.sha256sum] = "7dee9e41c879b2b6a1cdd08c92510cacdccd7f47801cd19d7e19bdf115013ace"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
