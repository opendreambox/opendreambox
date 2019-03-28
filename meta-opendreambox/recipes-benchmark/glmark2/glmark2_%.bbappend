FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

DEPENDS += "virtual/egl virtual/libgles2"
SRCREV = "eaa70888862f63da853f8ed9c94442b7a32d3335"

SRC_URI = "git://github.com/glmark2/glmark2.git;protocol=https \
           file://0001-Port-to-Dreambox.patch \
           file://0002-Add-fbdev-glesv2-flavor-with-Mali-GPU-support.patch"

EXTRA_OECONF = "--with-flavors=dreambox-glesv2,fbdev-glesv2"
