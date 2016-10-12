require libvc5driver.inc

SRC_URI[dm900.md5sum] = "613f361fa429fa50268b2ef3a460440d"
SRC_URI[dm900.sha256sum] = "808749469e674e8b31ef33e05a915e05c2d298a0ec1986cd9b5077b5b0b049b6"

COMPATIBLE_MACHINE = "^(dm900)$"

inherit opendreambox-precompiled-binary
