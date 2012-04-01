DESCRIPTION = "Dreamcrypt/Firecrypt Conditional Access Daemon"
PR = "r4"

SRC_URI[mipsel.md5sum] = "162282fa2c8de55693d6a2497d4632bf"
SRC_URI[mipsel.sha256sum] = "123d8a284fa6b2caff8369f80040ef04f9852bbfe5837aca7b625c564ea5a867"
SRC_URI[mipsel-nf.md5sum] = "6454f6b19d270342299e28e86914fe04"
SRC_URI[mipsel-nf.sha256sum] = "bfd9c2b767343c88600c99c18dd4461079a5ecae020a696bdbc151fd72f9f323"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

do_install() {
        install -d ${D}${bindir}
        install -m 0755 dccamd ${D}${bindir}
}

RDEPENDS_${PN} = "wdog"
