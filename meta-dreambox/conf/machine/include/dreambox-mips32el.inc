# dreambox-mips32el.inc

OLDEST_KERNEL = "3.4"

TARGET_ARCH = "mipsel"
DEFAULTTUNE = "mips32el"

require conf/machine/include/dreambox.inc
require conf/machine/include/tune-mips32.inc
require conf/machine/include/dreambox-v3d.inc
