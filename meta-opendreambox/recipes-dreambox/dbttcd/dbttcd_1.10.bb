SUMMARY = "DreamBox TeleText Cache Daemon"
DEPENDS = "openssl systemd zvbi"

SRC_URI[armv7ahf-neon.md5sum] = "da65af1ca4bf9822109b2b7a64b45498"
SRC_URI[armv7ahf-neon.sha256sum] = "c0d2fb4d9b40cd1ab2375b3c9f969a90b613acc7d52d1f3673065558a7aa8e42"
SRC_URI[mips32el.md5sum] = "e7fa76d7e032ecc6096e69344848e1a4"
SRC_URI[mips32el.sha256sum] = "ef0577fd62e1daac60dd6ecd9e337e5ff7be4db7e53a11ddd1c7d6b440e8d980"

SYSTEMD_SERVICE_${PN} = "dbttcd.service"

inherit opendreambox-precompiled-binary systemd
