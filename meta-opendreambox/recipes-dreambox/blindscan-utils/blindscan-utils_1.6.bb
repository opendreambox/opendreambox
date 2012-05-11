require blindscan-utils.inc

PR = "${INC_PR}.0"

SRC_URI[mips32el.md5sum] = "7ce684291d9b9bb4c924c3305600440c"
SRC_URI[mips32el.sha256sum] = "06a926fffb5f48aa3e2957fe0862214880475153dc6ef3f55737eab2900c60f6"
SRC_URI[mips32el-nf.md5sum] = "1bb12cad0d9c63aa868790e8148cebc3"
SRC_URI[mips32el-nf.sha256sum] = "04cadb174f4cdbd8c2dee07b854adaf88f6b876999dcfe7dd914f3445eb8a829"

inherit opendreambox-precompiled-binary

do_install() {
        install -d ${D}${bindir}
        install -m 0755 * ${D}${bindir}
}
