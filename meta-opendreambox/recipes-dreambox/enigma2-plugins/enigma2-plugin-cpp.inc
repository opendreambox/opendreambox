inherit pkgconfig

DEPENDS += "enigma2"

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

require enigma2-plugin.inc
