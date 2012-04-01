DESCRIPTION = "Dreambox watchdog to automatically restart binaries"
PR = "r1"

inherit opendreambox-precompiled-binary

SRC_URI[mipsel.md5sum] = "d11eac1867b6e7651e3d6545e1a53289"
SRC_URI[mipsel.sha256sum] = "a16906b210329a449aa76f897658a0413fffb79f968b618144bd6972ea6c6723"
SRC_URI[mipsel-nf.md5sum] = "1da03db72f3b846f73e628533e11c4c0"
SRC_URI[mipsel-nf.sha256sum] = "c4548a695a7b3f315c6e0a5d3e3970e1867ce5d86355b2b4225cc4f46f5dabb5"

do_install() {
        install -d ${D}${bindir}
        install -m 0755 wdog ${D}${bindir}
}
