# dreambox-mips32el.inc

LINUXLIBCVERSION = "4.4"
OLDEST_KERNEL = "3.14"

TARGET_ARCH = "arm"
DEFAULTTUNE = "armv7ahf-neon"

require conf/machine/include/dreambox.inc
require conf/machine/include/tune-cortexa7.inc
