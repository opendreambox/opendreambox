SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"
DEPENDS = "openssl systemd"

SRC_URI[aarch64.md5sum] = "62634a3979aa0163f0e626edb982475b"
SRC_URI[aarch64.sha256sum] = "9edde1f24a75ab6c9971ae293c897366848633574dfa25f59444a477cae717fe"

SYSTEMD_SERVICE_${PN} = "dccamd.service"

inherit opendreambox-precompiled-binary systemd
