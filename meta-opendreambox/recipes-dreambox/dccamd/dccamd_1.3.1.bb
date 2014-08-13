SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"
DEPENDS = "openssl systemd"

SRC_URI[mips32el.md5sum] = "8b673ed2235b7f68a0ed89ee65b888d2"
SRC_URI[mips32el.sha256sum] = "ce7072c43d8806c6c8f1cac2574f918cbbdceeaee3d4045eb1538b3da8076d4e"

SYSTEMD_SERVICE_${PN} = "dccamd.service"

inherit opendreambox-precompiled-binary systemd
