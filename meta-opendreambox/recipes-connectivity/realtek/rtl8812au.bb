SUMMARY = "RTL8812AU kernel driver (wifi)"
DESCRIPTION = "RTL8812AU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Kconfig;md5=4b85004ff83dd932ff28f7f348fb2a28"

SRC_URI = "git://github.com/EmbeddedAndroid/rtl8812AU_8821AU_linux.git;protocol=https \
	file://compile-fixes.patch"

SRCREV = "d1f7e7a3675c5895d9eb00f5b303e350fdccc0b2"

S = "${WORKDIR}/git"

PV = "1.0-git"

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"

do_compile () {
    unset LDFLAGS
    oe_runmake
}

do_install () {
    install -d ${D}/lib/modules/${KERNEL_VERSION}
    install -m 0755 ${B}/rtl8812au.ko ${D}/lib/modules/${KERNEL_VERSION}/rtl8812au.ko
}

