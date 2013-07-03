PROVIDES = "virtual/libgl"
PACKAGECONFIG = " \
  ${@base_contains('DISTRO_FEATURES', 'x11', 'x11', '', d)} \
  ${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)} \
"
