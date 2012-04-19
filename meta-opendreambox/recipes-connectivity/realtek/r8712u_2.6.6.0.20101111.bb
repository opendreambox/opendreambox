DESCRIPTION = "driver for Realtek USB wireless devices"
HOMEPAGE = "http://www.realtek.com/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://os_intf/linux/os_intfs.c;endline=19;md5=d1bbd9348c57df9fd08439bddfa32ec5"

SRC_URI = " \
        http://dreamboxupdate.com/download/sources/rtl8712_8188_8191_8192SU_usb_linux_v${PV}.tar.gz \
        file://strcasecmp.patch \
        file://config \
"
SRC_URI[md5sum] = "137423701c43ac5f09007a393406e678"
SRC_URI[sha256sum] = "34ef8534361b0ce9ec756de8babe68f40ba9ce7a2be23d84cf9c185cc4a7c9bb"

S = "${WORKDIR}/rtl8712_8188_8191_8192SU_usb_linux_v${PV}"

inherit module siteinfo

do_configure() {
        install -m 644 ${WORKDIR}/config ${S}
        echo "EXTRA_CFLAGS += -DCONFIG_${@base_conditional('SITEINFO_ENDIANNESS', 'le', 'LITTLE', 'BIG', d)}_ENDIAN" >> ${S}/config
}
do_compile() {
        unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
        oe_runmake -C "${STAGING_KERNEL_DIR}" SUBDIRS="${S}" modules
}
do_install() {
        unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
        oe_runmake -C "${STAGING_KERNEL_DIR}" SUBDIRS="${S}" DEPMOD="echo" INSTALL_MOD_PATH="${D}" modules_install
}
