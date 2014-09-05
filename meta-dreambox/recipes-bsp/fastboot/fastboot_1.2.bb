SUMMARY = "Fastboot stuff for a Dreambox"
LICENSE = "CLOSED"

SRC_URI[dm7080.md5sum] = "7c4a85efd1a96757e109014f29b2214b"
SRC_URI[dm7080.sha256sum] = "507f880ea4fcb052b71d7739e9ec2629eecff6b0b41fa6a3c1f7722e82e2c430"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "^(dm7080)$"
