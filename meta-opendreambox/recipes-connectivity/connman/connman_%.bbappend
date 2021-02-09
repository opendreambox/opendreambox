FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://connmand-nfsroot.in \
            file://0001-device-inet-Create-read-only-devices-instead-of-igno.patch \
            file://0002-gdhcp-Avoid-reading-invalid-data-in-dhcp_get_option.patch \
            file://0003-gdhcp-Avoid-leaking-stack-data-via-unitiialized-vari.patch \
            file://0004-dnsproxy-Add-length-checks-to-prevent-buffer-overflo.patch"

do_install_append() {
        mv ${D}${sbindir}/connmand ${D}${sbindir}/connmand.real
        install -m 755 ${WORKDIR}/connmand-nfsroot.in ${D}${sbindir}/connmand
        sed -e 's,@sbindir@,${sbindir},g' -i ${D}${sbindir}/connmand
}
