SUMMARY = "Dreambox EGL and GLES2 libraries"
LICENSE = "CLOSED"
DEPENDS = "${LIBEGL}"
PROVIDES = "virtual/egl virtual/libgles2"

LIBEGL = ""
LIBEGL_bcm7435 = "libv3ddriver"
LIBEGL_bcm7439 = "libvc5driver"

RDEPENDS_${PN} = "${LIBEGL}"

RPROVIDES_${PN} = "libegl libegl1 libgles2 libglesv2-2"
RPROVIDES_${PN}-dev = "libegl-dev libgles2-dev"

RCONFLICTS_${PN} = "libegl libegl1 libgles2 libglesv2-2"
RCONFLICTS_${PN}-dev = "libegl-dev libgles2-dev"

RREPLACES_${PN} = "libegl libegl1 libgles2 libglesv2-2"
RREPLACES_${PN}-dev = "libegl-dev libgles2-dev"

# As a workaround, keep .so symlinks in base package
# until all users were recompiled.
FILES_${PN} += "${libdir}/lib*${SOLIBSDEV}"
FILES_SOLIBSDEV = ""
INSANE_SKIP_${PN} = "dev-so"
