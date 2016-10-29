SUMMARY = "DreamBox TeleText Cache Daemon"
DEPENDS = "openssl systemd zvbi"

SRC_URI[armv7ahf-neon.md5sum] = "da65af1ca4bf9822109b2b7a64b45498"
SRC_URI[armv7ahf-neon.sha256sum] = "c0d2fb4d9b40cd1ab2375b3c9f969a90b613acc7d52d1f3673065558a7aa8e42"
SRC_URI[mips32el.md5sum] = "2867e46a1aeb34fe7e3cc298682fa30f"
SRC_URI[mips32el.sha256sum] = "9bf859f101c1be07fd1e60c916c783b3e6e630326da0134b1f93f180e87eafdb"

SYSTEMD_SERVICE_${PN} = "dbttcd.service"

inherit opendreambox-precompiled-binary systemd
