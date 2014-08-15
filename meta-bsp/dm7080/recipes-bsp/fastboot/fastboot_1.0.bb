SUMMARY = "Fastboot stuff for a Dreambox"
LICENSE = "CLOSED"

SRC_URI[dm7080.md5sum] = "4057a5a1d8f3875e688c8a6df71c454a"
SRC_URI[dm7080.sha256sum] = "e407a99a60d78d5dc3dd4f6989bc2acfad89f53472e53556e841238e235223ee"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "^(dm7080)$"
