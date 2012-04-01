require recipes-connectivity/samba/samba.inc
require recipes-connectivity/samba/samba-basic.inc
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://../COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
PR = "r1"

SRC_URI += "file://configure.patch \
            file://kernel-oplocks.patch \
            "
SRC_URI_append_linux-uclibc        = "file://uclibc-strlcpy-strlcat.patch"
SRC_URI_append_linux-uclibceabi = "file://uclibc-strlcpy-strlcat.patch"

EXTRA_OECONF += "\
	SMB_BUILD_CC_NEGATIVE_ENUM_VALUES=yes \
	"

SRC_URI[md5sum] = "11ed2bfef4090bd5736b194b43f67289"
SRC_URI[sha256sum] = "bb67c0e13d4ccbd84b9200c8739393fdd9b3145b5aad216934dc670f0fcea266"
