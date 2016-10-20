PACKAGECONFIG = "dri \
  ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', '', d)} \
  ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'egl wayland', '', d)} \
"

EGL_PLATFORMS = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"
