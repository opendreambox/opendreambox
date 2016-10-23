SUMMARY = "CDfs filesystem"
HOMEPAGE = "http://users.elis.ugent.be/~mronsse/cdfs/"
SECTION = "kernel/modules"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = " \
        http://users.elis.ugent.be/~mronsse/cdfs/download/${P}.tar.bz2;name=archive \
        http://users.elis.ugent.be/~mronsse/cdfs/download/cdfs-3.3.diff;name=patch \
        file://port-to-kernel-3.11.patch \
        file://port-to-kernel-3.14.patch \
"
SRC_URI[archive.md5sum] = "ac64c014a90e3c488394832ea29605b3"
SRC_URI[archive.sha256sum] = "d034f6c6d9578fe2addfaeceaa101584a4a1fc9f27d825c340baebd345d8d724"
SRC_URI[patch.md5sum] = "b51f54e7fac0f91ea91ff6c86a463608"
SRC_URI[patch.sha256sum] = "dcf9ab712fb1e7c96d88d6d4dae6e7a99f76c2ffee8b5f289c6f02b7b779a0a4"

inherit module

EXTRA_OEMAKE = "-C '${STAGING_KERNEL_DIR}' SUBDIRS='${S}'"
MAKE_TARGETS = "modules"
