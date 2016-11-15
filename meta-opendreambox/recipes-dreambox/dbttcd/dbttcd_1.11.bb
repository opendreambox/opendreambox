SUMMARY = "DreamBox TeleText Cache Daemon"
DEPENDS = "openssl systemd zvbi"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "819ff645ebec7baaee186a544afc461f"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "4b24fda02efbafcda76b34a94f35843b1bf44b666eee3dc4920289a2c715307c"
SRC_URI[mips32el.md5sum] = "5d69c1e1f95b0b226df4ac786959f1fd"
SRC_URI[mips32el.sha256sum] = "1caf353bde760d7f031f288dab5df7ee5c1fdc3225ddbdd350c255dd9ece4d39"

SYSTEMD_SERVICE_${PN} = "dbttcd.service"

inherit opendreambox-precompiled-binary systemd
