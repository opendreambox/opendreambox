SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "8e5e142e3a31d60b7be1d9c90874e790"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "4575c883777d098b0772812fc7079e14b7a2a9119a5fec685cd336733c1ed55e"
SRC_URI[mips32el.md5sum] = "2efd770e3c4ad106423b132b6239bd81"
SRC_URI[mips32el.sha256sum] = "8a8bac475a5836686e844cba612b9d76e6ea61dd50ea2d05013f5a9fd6ffb2b7"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
