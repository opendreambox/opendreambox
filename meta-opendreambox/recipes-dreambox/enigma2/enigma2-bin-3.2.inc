DEPENDS = "libsigc++-1.2"
INC_PR = "r10"

# Shlibs can't find them. See dreambox-compat.
RDEPENDS_${PN} += "dreambox-compat giflib jpeg libdvbsi++ libpython2"

require enigma2-bin-common.inc

INSANE_SKIP_${PN} = "dev-so"
