DEPENDS = "libgcc"
PROVIDES = "linux-dreambox"
PE = "1"

require recipes-kernel/linux/linux-dreambox.inc

SRC_URI = "https://dreamboxupdate.com/download/opendreambox/${BPN}/${BPN}-v${PV}.tar.xz"

SRC_URI[md5sum] = "0d90b1207d1029c14799e3659d870aed"
SRC_URI[sha256sum] = "5f50bceba8a06ddc9d59380ca8bef0b3d01a72cc5e941b3544efe8de72d8ad01"

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
