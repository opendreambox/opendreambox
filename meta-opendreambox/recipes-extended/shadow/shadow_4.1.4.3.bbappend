PRINC := "${@int(PRINC) + 1}"

do_install_append() {
	sed -e 's/^#ENCRYPT_METHOD DES/ENCRYPT_METHOD SHA512/' -i ${D}${sysconfdir}/login.defs
}
