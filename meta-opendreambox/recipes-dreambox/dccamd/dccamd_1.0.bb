DESCRIPTION = "Dreamcrypt/Firecrypt Conditional Access Daemon"
PR = "r4"

SRC_URI[mips32el.md5sum] = "87e5b67b83d329dc171045b99d44dd67"
SRC_URI[mips32el.sha256sum] = "7da7d8748c40efb479029e40f49c2cc8c507be1caf5bad7e4e267281e38c48e6"
SRC_URI[mips32el-nf.md5sum] = "5f1fd7d3815a0c927f01a2edbfb88001"
SRC_URI[mips32el-nf.sha256sum] = "5924d74d8df12bd3e0c86a78074766e99dac665b68e8ec83eff910b440c86671"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

do_install() {
        install -d ${D}${bindir}
        install -m 0755 dccamd ${D}${bindir}
}

RDEPENDS_${PN} = "wdog"
