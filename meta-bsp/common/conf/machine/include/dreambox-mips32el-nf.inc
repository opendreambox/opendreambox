# dreambox-mips32el-nf.inc

# squashfs img support is not yet supported for old 2.6.18 kernel
# we have to add squashfs lzma support to kernel and add squashfs-tools
# for the old squashfs version

SQUASHFS_IMG_SUPPORT_ENABLED = "0"
DREAMBOX_KERNEL_VERSION = "2.6.18"
LINUXLIBCVERSION = "2.6.18"
OLDEST_KERNEL = "2.6.18"

TARGET_ARCH = "mipsel"
DEFAULTTUNE = "mips32el-nf"

require conf/machine/include/dreambox.inc
require conf/machine/include/tune-mips32.inc
