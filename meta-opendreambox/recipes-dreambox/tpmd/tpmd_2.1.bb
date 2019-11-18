SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "d9408c338da944e449be803f412ac29e"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "835e9dafb1cca9f59883979e43b484ad9b1af6511f4d300f407240ad58da5086"
SRC_URI[mips32el.md5sum] = "0198d5f1875a7050e618fdf1f096c5af"
SRC_URI[mips32el.sha256sum] = "f2e068bdc3cbaa00aa54bd2bd04cae7ebf3a8eab1827ab0f656edf8771316a57"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
