SUMMARY = "Driver for Realtek USB wireless devices"
HOMEPAGE = "http://www.realtek.com/"
LICENSE = "GPLv2"
PR = "r5"

SRC_URI += "http://dreamboxupdate.com/download/sources/${RTL_BASENAME}.tar.gz"

S = "${WORKDIR}/${RTL_BASENAME}"

inherit module siteinfo

EXTRA_OEMAKE = "CONFIG_${RTL_KCONFIG}=m"

do_configure() {
        sed -e "s/^CONFIG_PLATFORM_I386_PC.*=.*y/EXTRA_CFLAGS += -DCONFIG_${@base_conditional('SITEINFO_ENDIANNESS', 'le', 'LITTLE', 'BIG', d)}_ENDIAN/" -i Makefile
}
do_compile() {
        unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
        oe_runmake -C "${STAGING_KERNEL_DIR}" M="${S}" modules
}
do_install() {
        unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
        oe_runmake -C "${STAGING_KERNEL_DIR}" M="${S}" DEPMOD="echo" INSTALL_MOD_PATH="${D}" modules_install
}
