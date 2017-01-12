SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "127619a5d070eba90afaf3cef3d35d77"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "d4081b1203973d9b87a1fdeeef021eb33e893455158348c976011ff0f4824d8c"
SRC_URI[mips32el.md5sum] = "680caba55f31825921c5ad6611a0d541"
SRC_URI[mips32el.sha256sum] = "7366dcf7ab6ce0c66f0b5d437d760b7b1104f7211a50d1d5c9c2d0a071bc2663"

require enigma2-bin-4.3.inc

SRC_URI += "file://0001-InputDevice-reinstate-import-of-O_RDWR.patch"
