SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"
DEPENDS = "openssl systemd"

SRC_URI[mips32el.md5sum] = "c067750c8178ae870f12dedb9915cfd3"
SRC_URI[mips32el.sha256sum] = "b2be93c0f13a93d3340c6866593ed2e2b5051e4706cc20f13ed7aac3848a389a"

SYSTEMD_SERVICE_${PN} = "dccamd.service"

inherit opendreambox-precompiled-binary systemd
