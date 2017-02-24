FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

DEPENDS += "virtual/egl virtual/libgles2"
SRCREV = "7215c0f337dae0b232535549c37fca441747a891"

SRC_URI_remove = "file://build-Check-packages-to-be-used-by-the-enabled-flavo.patch"
SRC_URI += "file://0001-Port-to-Dreambox.patch"

EXTRA_OECONF = "--with-flavors=dreambox-glesv2"
