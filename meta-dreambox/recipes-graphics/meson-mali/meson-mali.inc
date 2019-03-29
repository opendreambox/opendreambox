SUMMARY = "amlogic mali opengl provider"
LICENSE = "CLOSED"
PROVIDES = "virtual/egl virtual/libgles2"

RRECOMMENDS_${PN} = "${PN}-module-bifrost-r12p0"

RPROVIDES_${PN} = "libegl libegl1 libgles2 libglesv2-2"
RPROVIDES_${PN}-dev = "libegl-dev libgles2-dev"

RCONFLICTS_${PN} = "libegl libegl1 libgles2 libglesv2-2"
RCONFLICTS_${PN}-dev = "libegl-dev libgles2-dev"

RREPLACES_${PN} = "libegl libegl1 libgles2 libglesv2-2"
RREPLACES_${PN}-dev = "libegl-dev libgles2-dev"

FILES_${PN} += "${libdir}/lib*${SOLIBSDEV}"
FILES_SOLIBSDEV = ""
INSANE_SKIP_${PN} = "dev-so"

COMPATIBLE_MACHINE = "^(meson64)$"
