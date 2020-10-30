SRC_URI[aarch64.md5sum] = "3184514c230db2d1bb961a7d8a570006"
SRC_URI[aarch64.sha256sum] = "61bdef6dcbfd8adb52b22c128b7b993d41f6ee74abe25d10695a4f248652dcfd"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://md_khmurabi_10.ttf \
"

do_install_append() {
    install -m 644 ${WORKDIR}/md_khmurabi_10.ttf ${D}${datadir}/fonts/md_khmurabi_10.ttf
}

