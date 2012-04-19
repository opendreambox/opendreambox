DEPENDS = "ethtool freetype gstreamer libdreamdvd libdvbsi++ libfribidi libpng libsigc++-1.2 libxml2 libxmlccwrap openssl python-wifi"
INC_PR = "r6"

# Shlibs can't find them. See dreambox-compat.
RDEPENDS_${PN} += "giflib jpeg libdvbsi++ libpython2"

require enigma2-bin-common.inc

INSANE_SKIP_${PN} = "dev-so"
