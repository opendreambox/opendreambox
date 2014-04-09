PACKAGECONFIG = "dri \
  ${@base_contains('DISTRO_FEATURES', 'x11', 'x11', '', d)} \
  ${@base_contains('DISTRO_FEATURES', 'wayland', 'egl wayland', '', d)} \
"

EGL_PLATFORMS = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"
