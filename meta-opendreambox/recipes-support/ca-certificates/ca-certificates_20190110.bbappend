FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-Revert-Update-openssl-dependency-to-1.1.0.patch"

EXPIRED = " \
    AddTrust_External_Root.crt \
    Certplus_Class_2_Primary_CA.crt \
    Deutsche_Telekom_Root_CA_2.crt \
    Staat_der_Nederlanden_Root_CA_-_G2.crt \
"

do_install_prepend () {
    for crt in ${EXPIRED}; do
        rm ${B}/mozilla/$crt
    done
}
