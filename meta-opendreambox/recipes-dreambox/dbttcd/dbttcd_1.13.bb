SUMMARY = "DreamBox TeleText Cache Daemon"
DEPENDS = "openssl systemd zvbi"

SRC_URI[aarch64.md5sum] = "d6217968896814d8a32532ac1c74b7b7"
SRC_URI[aarch64.sha256sum] = "59d4e3251eb37963df10061f4fba76e69576fc8d106e21ab1dfa31b3781d1854"

SYSTEMD_SERVICE_${PN} = "dbttcd.service"

inherit opendreambox-precompiled-binary systemd
