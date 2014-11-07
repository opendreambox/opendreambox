SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[mips32el.md5sum] = "acec609605d3b9c1f331fb108587bfb1"
SRC_URI[mips32el.sha256sum] = "edb063b208fe5fb1e2981cf701dafffa5f708e9e176d03e7157e491eb2ff6abb"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
