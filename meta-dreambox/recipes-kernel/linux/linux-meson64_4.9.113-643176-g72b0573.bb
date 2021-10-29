DEPENDS = "libgcc"
PROVIDES = "linux-dreambox"
PE = "1"

require recipes-kernel/linux/linux-dreambox.inc

SRC_URI = "https://dreamboxupdate.com/download/opendreambox/${BPN}/${BPN}-v${PV}.tar.xz"

SRC_URI[md5sum] = "2b77df9bf64f825925172790c54f8ead"
SRC_URI[sha256sum] = "8d47072d819464d68b1b1072013795f925104dc09ad36e0bf9e0c7004087fed2"

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
