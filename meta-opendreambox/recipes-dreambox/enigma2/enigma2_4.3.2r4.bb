SRC_URI[mips32el.md5sum] = "ef8f68b86a661270b03f16521eae848c"
SRC_URI[mips32el.sha256sum] = "683adacaa0ffa321dba18cee775632467c50a577d7f8d3ae1b83008355f1da85"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "61bc6092b6d569fb8b102ed5b092b082"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "430e61eb863959127258047eca149035b8afb122b1ab80303a1731e825099c5a"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://de.mo \
	file://0001-ServiceList-fix-c-p-error.patch \
	file://0002-ChannelSelectionDisplaySettings-fix-handling-of-data.patch \
	file://0003-EventView-fix-item-duplication-in-EventView-Plugin-B.patch \
"

do_install_append() {
    install -d ${D}${libdir}/fonts
    install -m 644 ${WORKDIR}/de.mo ${D}${datadir}/enigma2/po/de/LC_MESSAGES/enigma2.mo
}
