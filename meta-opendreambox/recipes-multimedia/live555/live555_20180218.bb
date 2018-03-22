require live555.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI += " \
	file://0001-ip_mreq_source-is-defined-in-all-glibc-not-just-on-k.patch \
	file://0002-Add-a-pkg-config-file-for-the-shared-libraries.patch \
	file://0003-Link-shared-libraries-with-g-instead-of-gcc-to-fix-b.patch \
	file://0004-Reduce-number-of-unresolved-symbols-by-linking-libra.patch \
	file://0005-non-local-prefix.patch \
	file://0006-ignore-unsupported-so-reuseport.patch \
	file://0007-changed-udp-throttling-a-bit.patch \
"

SRC_URI[md5sum] = "5e070a0bf4b60af65717d09283ba0bbc"
SRC_URI[sha256sum] = "354f3ba51c5fb9a77df1baa86f49aa85a7b07be181aeb0c526f33bddcdf43575"

