FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
        file://nmbd_systemd_network_online.patch \
        file://smb.conf \
"

EXTRA_OECONF += "--without-ads --without-cluster-support --with-static-modules=!DEFAULT,!FORCED"

SAMBA4_LIBS = "NONE,cmocka"
SAMBA4_MODULES = "!DEFAULT,!FORCED,auth_unix,pdb_tdbsam"

do_install_append() {
    install -d ${D}${sysconfdir}/samba
    install -m 0644 ${WORKDIR}/smb.conf ${D}${sysconfdir}/samba
}
