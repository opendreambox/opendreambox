require blindscan-utils.inc

PR = "${INC_PR}.0"

SRC_URI[mips32el-nf.md5sum] = "428d439eab7c300c1842be5564c07e70"
SRC_URI[mips32el-nf.sha256sum] = "190f2264f11cbe70169f3d94688320067a049fd6d670658a5157fc53bd1371a5"
SRC_URI[mips32el.md5sum] = "6a1a681f65e3ba302aaa20e4155140cb"
SRC_URI[mips32el.sha256sum] = "1664be1afa512bed1ff120693a997c564add49a97bac8e013dc8b90ed4eaced1"

inherit opendreambox-precompiled-binary

do_install() {
        cp -r * ${D}
}
