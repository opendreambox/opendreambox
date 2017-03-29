FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRCREV = "fc1619b118f6d503f920a49cf4ac4afcd0dd6b41"
PV = "17.1+gitr${SRCPV}"

SRC_URI += "file://0001-EGL-Port-to-Dreambox.patch \
            file://0002-LinuxInputDevices-Add-KEY_EXIT-and-KEY_OK.patch \
            file://0003-build-fix-presets-for-mips-link-libatomic.patch"
