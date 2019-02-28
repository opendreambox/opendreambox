SUMMARY = "A Dreambox firmware image"

SYSTEMD_DEFAULT_TARGET = "graphical.target"

require dreambox-console-image.inc

IMAGE_INSTALL += "packagegroup-opendreambox-enigma2"
