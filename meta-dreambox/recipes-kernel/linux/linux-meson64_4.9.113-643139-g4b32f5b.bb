DEPENDS = "libgcc"
PROVIDES = "linux-dreambox"
PE = "1"

require recipes-kernel/linux/linux-dreambox.inc

SRC_URI = "https://dreamboxupdate.com/download/opendreambox/${BPN}/${BPN}-v${PV}.tar.xz"

SRC_URI[md5sum] = "8cb16514b4ce9be35360b07ddad16180"
SRC_URI[sha256sum] = "fd02af6e0b23873b7e13b5c06e3167228f89ef32a4d41e1066db4c1ed125ba55"

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
