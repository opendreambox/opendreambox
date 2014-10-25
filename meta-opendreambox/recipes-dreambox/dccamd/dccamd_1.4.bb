SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"
DEPENDS = "libssl0.9.8 systemd"

SRC_URI[mips32el.md5sum] = "e273a450d9fe8025a19b87ff803685af"
SRC_URI[mips32el.sha256sum] = "66d5d9a9bd1b62c92793b0f250862eab0cc5939eb424afeda376b013097a9437"

SYSTEMD_SERVICE_${PN} = "dccamd.service"

inherit opendreambox-precompiled-binary systemd
