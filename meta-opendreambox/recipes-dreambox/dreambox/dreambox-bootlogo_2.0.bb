SUMMARY = "Bootlogo support"
LICENSE = "CLOSED"

SRC_URI = "file://showiframe-backdrop.service"
SRC_URI[all.md5sum] = "42367f61500d75277384e3d826985328"
SRC_URI[all.sha256sum] = "1421a3ef8455af04f5b1717502458188d00d99114333476597580d9299aa73a8"

SYSTEMD_SERVICE_${PN} = "showiframe-backdrop.service"

inherit allarch opendreambox-precompiled-binary systemd

do_install_append() {
    install -d ${D}${systemd_unitdir}/system
    install -m644 ${WORKDIR}/showiframe-backdrop.service ${D}${systemd_unitdir}/system
}

RDEPENDS_${PN} = "showiframe"
