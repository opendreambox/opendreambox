PR = "${INC_PR}.0"

SRC_URI = "file://small_hdd_bugfix.patch \
           file://fix_madwifi.patch \
           file://enigma2_de.mo"
SRC_URI[mips32el.md5sum] = "5d9c18719eb6914a8a7e75fef907dfa9"
SRC_URI[mips32el.sha256sum] = "0d42885d613404f591f9f4d0c3331e2c208fa81bb484b02e5a8faeaeeb0c2bbd"
SRC_URI[mips32el-nf.md5sum] = "652658db65788ef12388abe1918c43b3"
SRC_URI[mips32el-nf.sha256sum] = "341c8a8d2468dc3bb034d235c3a2c07017704d69a418ae6567ab879364040dc1"

do_install_append(){
        cp ${WORKDIR}/enigma2_de.mo ${D}/usr/share/enigma2/po/de/LC_MESSAGES/enigma2.mo
}

require enigma2-bin-3.2.inc
