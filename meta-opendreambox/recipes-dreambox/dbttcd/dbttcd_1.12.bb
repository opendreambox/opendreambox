SUMMARY = "DreamBox TeleText Cache Daemon"
DEPENDS = "openssl systemd zvbi"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "af40d729bce5b6bdc66a1548a6afaaba"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "978a174fed98f1a1fe1ecd69fb699c62908b58a86653670b2b20beabf3b557d8"
SRC_URI[mips32el.md5sum] = "d6e2b4c9a3c87213684d63be6ff1ec28"
SRC_URI[mips32el.sha256sum] = "921c58d8a656b6de2df271b156270c7f1eb00858fef367113cc1eb98766602b3"

SYSTEMD_SERVICE_${PN} = "dbttcd.service"

inherit opendreambox-precompiled-binary systemd
