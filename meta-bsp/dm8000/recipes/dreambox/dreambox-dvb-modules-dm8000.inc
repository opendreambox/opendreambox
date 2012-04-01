require recipes/dreambox/dreambox-dvb-modules.inc

INC_PR := "${INC_PR}.0"

SRC_URI += "http://sources.dreamboxupdate.com/download/7020/fpupgrade-${MACHINE}-v7;name=fpupgrade"
SRC_URI[fpupgrade.md5sum] = "2e13b98624aa56e14d458573e46709ba"
SRC_URI[fpupgrade.sha256sum] = "ec9665db527466dbca8d8800965e66bfbd1271a09674fbf2bf70a4bc3570a769"

do_install_append() {
	install -d ${D}${sbindir}
	install -m 0755 ${WORKDIR}/fpupgrade-${MACHINE}-v7 ${D}${sbindir}/fpupgrade
}

FILES_${PN} += "${sbindir}"
