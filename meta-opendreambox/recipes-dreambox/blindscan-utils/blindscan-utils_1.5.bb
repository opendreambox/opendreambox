require blindscan-utils.inc

PR = "${INC_PR}.0"

SRC_URI[mips32el.md5sum] = "a7ebe5926901dbd9fd547ef0b92f9e5f"
SRC_URI[mips32el.sha256sum] = "7c19d327870d0d37cb682d12fd97293332cae77689918172d53f9525acca1324"
SRC_URI[mips32el-nf.md5sum] = "6e9fb6888ba9ace9d100810cb6919cc3"
SRC_URI[mips32el-nf.sha256sum] = "8ac1df91340176126a3ddbdddf1bb2ede4007c56716256ab088e4bbb5389e35d"

inherit opendreambox-precompiled-binary

do_install() {
        install -d ${D}${bindir}
        install -m 0755 * ${D}${bindir}
}
