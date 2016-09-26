SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[armv7ahf-neon.md5sum] = "b4ec8731a9a255f13679560a76487909"
SRC_URI[armv7ahf-neon.sha256sum] = "3c29413fec80777e26b07e337129fc558361302a0c08af7ccfa9db6e69a8bda0"
SRC_URI[mips32el.md5sum] = "ff03d0b0156f8a19a998e046b5b7ffec"
SRC_URI[mips32el.sha256sum] = "55016bd21f0d85b03ce39377a354f759b9bcf32a7f9891bb11578d3f2a7c286e"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
