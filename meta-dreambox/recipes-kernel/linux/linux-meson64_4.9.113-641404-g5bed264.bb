DEPENDS = "libgcc"
PROVIDES = "linux-dreambox"

require recipes-kernel/linux/linux-dreambox.inc

SRC_URI = "https://dreamboxupdate.com/download/opendreambox/${BPN}/${BPN}-v${PV}.tar.xz"
SRC_URI[md5sum] = "696e2a978751b187806ed92bf3a6df3d"
SRC_URI[sha256sum] = "581fa268ebf562d27e71f16d96ae626c2565594212c43bd022383b226717ce76"

KERNEL_CC += "${TOOLCHAIN_OPTIONS}"
KERNEL_LD += "${TOOLCHAIN_OPTIONS}"

S = "${WORKDIR}/${BPN}-v${PV}"

CMDLINE = "${@kernel_console(d)} root=/dev/mmcblk0p7 rootwait rootfstype=ext4 no_console_suspend"

COMPATIBLE_MACHINE = "^(dreamone)$"

DEFCONFIG = "meson64"

LINUX_VERSION = "4.9"
KERNEL_DEVICETREE = "dreamone.dtb"
KERNEL_IMAGETYPES = "Image.gz"

export KCFLAGS = "-Wno-error=misleading-indentation \
                  -Wno-error=parentheses \
                  -Wno-error=shift-overflow \
                  -Wno-error=unused-const-variable"

KERNEL_FLASH_ARGS = "-c '${CMDLINE}'"
