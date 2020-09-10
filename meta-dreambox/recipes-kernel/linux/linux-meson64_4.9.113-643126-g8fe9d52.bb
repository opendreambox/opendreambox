DEPENDS = "libgcc"
PROVIDES = "linux-dreambox"
PE = "1"

require recipes-kernel/linux/linux-dreambox.inc

SRC_URI = "https://dreamboxupdate.com/download/opendreambox/${BPN}/${BPN}-v${PV}.tar.xz"

SRC_URI[md5sum] = "b5353fdedf30ae7185a4bf29370d4e90"
SRC_URI[sha256sum] = "b4d73384bc175da7ce0fbfb5b66df7ecc07e45cd327cf856da09bff3d8f12289"

KERNEL_CC += "${TOOLCHAIN_OPTIONS}"
KERNEL_LD += "${TOOLCHAIN_OPTIONS}"

S = "${WORKDIR}/${BPN}-v${PV}"

CMDLINE = "${@kernel_console(d)} root=/dev/mmcblk0p7 rootwait rootfstype=ext4 no_console_suspend"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"

DEFCONFIG = "meson64"

LINUX_VERSION = "4.9"
KERNEL_DEVICETREE = ""
KERNEL_DEVICETREE_dreamone = "dreamone.dtb"
KERNEL_DEVICETREE_dreamtwo = "dreamtwo.dtb"
KERNEL_IMAGETYPES = "Image.gz"

export KCFLAGS = "-Wno-error=misleading-indentation \
                  -Wno-error=parentheses \
                  -Wno-error=shift-overflow \
                  -Wno-error=unused-const-variable"

KERNEL_FLASH_ARGS = "-c '${CMDLINE}'"
