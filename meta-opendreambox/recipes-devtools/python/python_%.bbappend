FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
        file://fix_pthread_site.patch \
"

EXTRA_OECONF += " \
	ac_cv_no_strict_aliasing_ok=yes \
	ac_cv_pthread=yes \
	ac_cv_cxx_thread=yes \
"

RDEPENDS_${PN}-ctypes_append = " ldconfig"
