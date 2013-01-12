SRC_URI[dm500hdv2.md5sum] = "c0413bfe6c03efc5fa1825b6ad8ac7bd"
SRC_URI[dm500hdv2.sha256sum] = "005b9e99566fdee4d76ec1532273dc3e29a14b723d0bf6108228988e2a30d013"

PR .= ".1"

FILES_${PN} += "/boot/bootlogo.elf"

do_install_append () {
        ln -sf bootlogo-${MACHINE}.elf.gz ${D}/boot/bootlogo.elf
}
