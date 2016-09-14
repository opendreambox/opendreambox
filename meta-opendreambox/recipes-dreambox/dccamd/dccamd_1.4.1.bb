SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"
DEPENDS = "openssl systemd"

SRC_URI[armv7ahf-neon.md5sum] = "f3417ad050c4ae168cadc6b52f0511b7"
SRC_URI[armv7ahf-neon.sha256sum] = "c0e8646d7a6f3dcbfbd12863f1c583838e2246e5b44f6a93a156056386f7df3a"
SRC_URI[mips32el.md5sum] = "33b33fc54cc33cc6b48748334c46626c"
SRC_URI[mips32el.sha256sum] = "a7b94f165001077c3c7a0241a4778259ca00de3428aecc405e41966c17ede3fc"

SYSTEMD_SERVICE_${PN} = "dccamd.service"

inherit opendreambox-precompiled-binary systemd
