SUMMARY = "Static device nodes needed before devtmpfs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

inherit allarch

do_install() {
        install -d ${D}/dev
        mknod -m 600 ${D}/dev/console c 5 1
        mknod -m 666 ${D}/dev/null c 1 3
}

FILES_${PN} = "/dev/"
