FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-EGL-Port-to-Dreambox.patch \
            file://0002-LinuxInputDevices-Add-KEY_EXIT-and-KEY_OK.patch \
            file://0003-build-fix-presets-for-mips-link-libatomic.patch"
