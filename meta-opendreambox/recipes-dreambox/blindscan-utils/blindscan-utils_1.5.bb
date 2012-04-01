require blindscan-utils.inc

PR = "${INC_PR}.0"

SRC_URI[mipsel.md5sum] = "0707c05dee226010ab199652b9f69c76"
SRC_URI[mipsel.sha256sum] = "8469f55063f175ea21ac66902d2ad2f40635721ae5a9ac6b48ba9d62cb2ff43f"
SRC_URI[mipsel-nf.md5sum] = "2195625424c013e39343b4b3ca49f406"
SRC_URI[mipsel-nf.sha256sum] = "57233276d53e707689cd45824de3af5a8d92eadf0191b7d2b4ac8158d61dc859"

inherit opendreambox-precompiled-binary

do_install() {
        install -d ${D}${bindir}
        install -m 0755 * ${D}${bindir}
}
