SUMMARY = "RTL88x2BU kernel driver (wifi)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "virtual/kernel"
SRCREV = "9c6c2539939ff8208df5ba3cf2224fa5173ab49c"
SRCREV_mipsel = "20fba52b0562067bf78fc560a8b74ccaac696120"
PV = "5.6.1.6+git${SRCPV}"
PV_mipsel = "5.6.1+git${SRCPV}"

SRC_URI = "git://github.com/RinCat/RTL88x2BU-Linux-Driver.git;protocol=https"
SRC_URI_append_mipsel = " file://inline-decl.patch file://0001-Create-LICENSE.patch"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE = "ARCH=${ARCH} KSRC=${STAGING_KERNEL_BUILDDIR} USER_EXTRA_CFLAGS=-Wno-error=date-time"

do_install () {
    install -D -m 0644 ${B}/88x2bu.ko ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/88x2bu.ko
}
