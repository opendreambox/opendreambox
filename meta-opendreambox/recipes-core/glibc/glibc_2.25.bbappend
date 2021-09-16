FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI_append_arm = " file://glibc-2.25-sht_relr.patch \
                       file://glibc-fix-tls-64_byte-alignment.patch \
"