SUMMARY = "DreamBox TeleText Cache Daemon"
DEPENDS = "libssl0.9.8 systemd zvbi"

SRC_URI[mips32el.md5sum] = "e8b9e4e4c5962fe3520b86a944f1753c"
SRC_URI[mips32el.sha256sum] = "66cc4022828e81402f0d5d354921f2ce5050df48d40a0af3c39162176822f72b"

SYSTEMD_SERVICE_${PN} = "dbttcd.service"

inherit opendreambox-precompiled-binary systemd
