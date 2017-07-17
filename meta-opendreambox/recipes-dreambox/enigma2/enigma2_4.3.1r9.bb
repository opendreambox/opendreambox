SRC_URI[mips32el.md5sum] = "79229469dc161a2677989145bf5d1cbe"
SRC_URI[mips32el.sha256sum] = "8d097d06000c06dbcd38a687b2dc94efda75dbf2eda7003f372c62cbd743f23d"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "08b2cff4daafc6e63fad2a6e63cc1e52"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "02db762d82b5a2c0656dbf558a0ee5fbaabdb8cbeb6fd5d822ff05732e23ee73"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-fixed-logic-error.patch"