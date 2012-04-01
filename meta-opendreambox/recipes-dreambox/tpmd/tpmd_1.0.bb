DESCRIPTION = "Dreambox TPM Daemon"
PR = "r3"

SRC_URI[mipsel.md5sum] = "3190a57f86019f1ab6605ab01dacff88"
SRC_URI[mipsel.sha256sum] = "79e080f6f90ec00dd456a76595ed4e6029217f5a9e25723b0d03be3ab9554cd9"
SRC_URI[mipsel-nf.md5sum] = "60ae29109156fe264216cf26989d36fe"
SRC_URI[mipsel-nf.sha256sum] = "e3403e89efe5b03c6b92fb869b68178205c7257467511334d9a069d26b770224"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

do_install() {
        install -d ${D}${bindir}
        install -m 0755 tpmd ${D}${bindir}
}

RDEPENDS_${PN} = "wdog"

INITSCRIPT_PARAMS = "start 60 S ."
