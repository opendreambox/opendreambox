DEPENDS = "libsigc++-1.2"
INC_PR = "r9"

# Shlibs can't find them. See dreambox-compat.
RDEPENDS_${PN} += "giflib jpeg libdvbsi++ libpython2"

require enigma2-bin-common.inc

INSANE_SKIP_${PN} = "dev-so"
