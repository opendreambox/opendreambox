SUMMARY = "Fastboot stuff for a Dreambox"
LICENSE = "CLOSED"

SRC_URI[dm7080.md5sum] = "b179a7540b38fff299214b911241ba73"
SRC_URI[dm7080.sha256sum] = "8d55fdc2034740a093c615f3b46ada05a7d2f4bc729c15cfbab59e0299f47abb"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "^(dm7080)$"
