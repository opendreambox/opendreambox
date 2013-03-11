SUMMARY = "Dreambox TPM Daemon"

SRC_URI[mips32el.md5sum] = "683b4851861455bb9d760d37de7eeaf7"
SRC_URI[mips32el.sha256sum] = "369554f0bda5211c44838a001e6b3f2339190935b6c975757f1dd3ca0bbca35c"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

RDEPENDS_${PN} = "wdog"

INITSCRIPT_PARAMS = "start 60 S ."
