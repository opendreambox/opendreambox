SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"

SRC_URI[mips32el.md5sum] = "04e963b198c8a1f1d9a8fc2acbf12713"
SRC_URI[mips32el.sha256sum] = "1256ff95b6aedf00165ec0d8c998316c2c489fad239316e79368e4f439da462a"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

RDEPENDS_${PN} = "wdog"
