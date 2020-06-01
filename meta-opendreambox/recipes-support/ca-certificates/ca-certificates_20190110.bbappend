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
