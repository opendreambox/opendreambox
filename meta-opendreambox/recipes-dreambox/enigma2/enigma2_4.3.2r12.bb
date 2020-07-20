SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "7362d48af8b40eca8f966b95123f9f53"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "253425790ec0c610380b1c47f17bc5d075446ecef4b816233ac555eb888e74c7"
SRC_URI[mips32el.md5sum] = "aa6f4ebf7663bb3394b962467c84b8f7"
SRC_URI[mips32el.sha256sum] = "cb419c4860ca4891d2961738771c041ccb83c86be286359ef4b880be8f7303e9"

SRC_URI += " file://0001-SystemPlugins-HdmiCec-reset-self._skip_next_poweroff.patch"

require enigma2-bin-4.3.inc
