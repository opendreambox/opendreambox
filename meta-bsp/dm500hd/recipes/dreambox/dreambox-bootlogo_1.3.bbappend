SRC_URI[dm500hd.md5sum] = "b9ada70304ca1f9a8e36a55bd38834c6"
SRC_URI[dm500hd.sha256sum] = "d4b0f650711d5d6fdecb42efe9e13987ef803cba829d0950e899608a784ae3b2"

PR .= ".1"

FILES_${PN} += "/boot/bootlogo.elf"

do_install_append () {
        ln -sf bootlogo-${MACHINE}.elf.gz ${D}/boot/bootlogo.elf
}
