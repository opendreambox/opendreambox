SRC_URI[mips32el.md5sum] = "3e60fbe09aa895872b7f1e8c80dd22dd"
SRC_URI[mips32el.sha256sum] = "e3e91952419024b66ca7e7d204608302d9f4b384a8c5b8f8d3d70c02c5264fcf"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "d928828babee713f3f942254fb200b5e"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "a2c99e0eb603680bd81a823359ea7d28c0f5008c54d3316c85309231b3f8c357"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-AVSwitch-removed-duplicate-code.patch"
