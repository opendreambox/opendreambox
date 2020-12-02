SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "66f4dfb351e2fe5181df0e0d6e745ea7"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "57d73a138d92e3c6ca3ac2d674135d3347487016f00c7655cb0e062ca0b674bb"
SRC_URI[mips32el.md5sum] = "9117910200dc146f866602b84b711acb"
SRC_URI[mips32el.sha256sum] = "a671ce294f02241f078064d5bddc20e9855b6f9714af9c2f87c51872827d6f5d"

SRC_URI += " file://0001-Listbox.py-fixed-error-on-conflict-resolution.patch"

require enigma2-bin-4.3.inc
