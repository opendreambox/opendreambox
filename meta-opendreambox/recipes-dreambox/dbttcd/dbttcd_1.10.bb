SUMMARY = "DreamBox TeleText Cache Daemon"
DEPENDS = "openssl systemd zvbi"

SRC_URI[mips32el.md5sum] = "e7fa76d7e032ecc6096e69344848e1a4"
SRC_URI[mips32el.sha256sum] = "ef0577fd62e1daac60dd6ecd9e337e5ff7be4db7e53a11ddd1c7d6b440e8d980"

SYSTEMD_SERVICE_${PN} = "dbttcd.service"

inherit opendreambox-precompiled-binary systemd
