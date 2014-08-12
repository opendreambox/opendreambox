SUMMARY = "DreamBox TeleText Cache Daemon"
DEPENDS = "openssl systemd zvbi"

SRC_URI[mips32el.md5sum] = "0357afa5ed2829c29450d66a554527f4"
SRC_URI[mips32el.sha256sum] = "da02de1f991d8e66ccf62319c79b3cc57d7640bb3c4b1a9b13d785a786443f97"

SYSTEMD_SERVICE_${PN} = "dbttcd.service"

inherit opendreambox-precompiled-binary systemd
