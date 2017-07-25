SUMMARY = "Static device nodes needed before devtmpfs"
LICENSE = "MIT"

inherit allarch

do_install() {
        install -d ${D}/dev
        mknod -m 600 ${D}/dev/console c 5 1
        mknod -m 666 ${D}/dev/null c 1 3
}

FILES_${PN} = "/dev/"
