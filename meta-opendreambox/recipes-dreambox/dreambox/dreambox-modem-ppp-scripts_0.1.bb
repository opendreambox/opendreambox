DESCRIPTION = "ppp scripts for dreambox builtin modem"
SECTION = "base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PR = "r1"

S = "${WORKDIR}"

SRC_URI = "file://options file://pap-secrets file://dial.modem \
	file://disconnect.modem file://01peerdns file://01peerdns-remove"

do_install() {
	install -d ${D}/etc/ppp
	for i in dial.modem disconnect.modem; do
		install -m 0755 ${S}/$i ${D}/etc/ppp/
	done
	for i in options pap-secrets; do
		install -m 0644 ${S}/$i ${D}/etc/ppp/
	done
	install -d ${D}/etc/ppp/ip-up.d
	install -m 0755 ${S}/01peerdns ${D}/etc/ppp/ip-up.d
	install -d ${D}/etc/ppp/ip-down.d
	install -m 0755 ${S}/01peerdns-remove ${D}/etc/ppp/ip-down.d
}

