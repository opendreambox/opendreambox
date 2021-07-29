SUMMARY = "A Dreambox firmware image"

SYSTEMD_DEFAULT_TARGET = "graphical.target"
TOOLCHAIN_TARGET_TASK = "packagegroup-core-standalone-sdk-target"

require dreambox-console-image.inc

IMAGE_INSTALL += "packagegroup-opendreambox-enigma2"
