SUMMARY = "Dreambox support for squashfs compressed files"
SECTION = "base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PRIORITY = "required"
PR = "r1"

SRC_URI = "file://enigma2_pre_start99.sh"

inherit allarch

INITSCRIPT_PARAMS = "start 03 S ."

inherit opendreambox-sysvinit

do_install_append() {
	install -d ${D}${sysconfdir}/rcS.d
	ln -sf ../init.d/dreambox-squashfs-support ${D}${sysconfdir}/rcS.d/S03dreambox-squashfs-support
	install -d ${D}${bindir}
	install -m 0755 ${WORKDIR}/enigma2_pre_start99.sh ${D}${bindir}
}
