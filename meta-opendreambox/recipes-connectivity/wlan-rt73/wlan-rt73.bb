DESCRIPTION = "Driver for Ralink rt73 USB 802.11b/g WiFi sticks"
HOMEPAGE = "http://www.ralinktech.com.tw"
SECTION = "kernel/modules"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://rtmp_main.c;endline=25;md5=10585d272398025e832fa0793385f9a1"

inherit module

PR = "r5"

SRC_URI = "http://www.ralinktech.com.tw/data/drivers/2008_0506_RT73_Linux_STA_Drv1.1.0.1.tar.bz2 \
           file://make.patch \
           file://changeiface.patch"

SRC_URI[md5sum] = "3e08bf734b740e83391fda571c8e9ecd"
SRC_URI[sha256sum] = "932b9c127992fd7985e4054d91120164e54f7132fa457b06fdcd30307e5b70f9"

RDEPEND = "wireless-tools"

FILES_${PN} += " /lib/firmware/rt73.bin"

S = "${WORKDIR}/2008_0506_RT73_Linux_STA_Drv1.1.0.1/Module/"
EXTRA_OEMAKE = "KERNDIR=${STAGING_KERNEL_DIR}"

do_compile() {
        unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS CC LD CPP
        oe_runmake 'MODPATH={D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net' \
                   'KERNEL_SOURCE=${STAGING_KERNEL_DIR}' \
                   'LINUX_SRC=${STAGING_KERNEL_DIR}' \
                   'KDIR=${STAGING_KERNEL_DIR}' \
                   'KERNDIR=${STAGING_KERNEL_DIR}' \
                   'KERNEL_VERSION=${KERNEL_VERSION}' \
                   'CC=${KERNEL_CC}' \
                   'LD=${KERNEL_LD}'
}

do_install() {
        install -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net
        install -m 0644 rt73${KERNEL_OBJECT_SUFFIX} ${D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/
        install -d ${D}/lib/firmware
        install -m 0644 rt73.bin ${D}/lib/firmware/
}

