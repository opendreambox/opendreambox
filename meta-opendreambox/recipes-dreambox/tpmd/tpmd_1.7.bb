SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[armv7ahf-neon.md5sum] = "b4ec8731a9a255f13679560a76487909"
SRC_URI[armv7ahf-neon.sha256sum] = "3c29413fec80777e26b07e337129fc558361302a0c08af7ccfa9db6e69a8bda0"
SRC_URI[mips32el.md5sum] = "1f0452cf75233c42fc6cbbcc42996b6f"
SRC_URI[mips32el.sha256sum] = "7dee9e41c879b2b6a1cdd08c92510cacdccd7f47801cd19d7e19bdf115013ace"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
