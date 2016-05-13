SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"
DEPENDS = "openssl systemd"

SRC_URI[mips32el.md5sum] = "33b33fc54cc33cc6b48748334c46626c"
SRC_URI[mips32el.sha256sum] = "a7b94f165001077c3c7a0241a4778259ca00de3428aecc405e41966c17ede3fc"

SYSTEMD_SERVICE_${PN} = "dccamd.service"

inherit opendreambox-precompiled-binary systemd
