SUMMARY = "Flasher for NRF52 based BLE Transceiver"

SRC_URI[aarch64.md5sum] = "8396655a5f0822c1a43fb85a86a1fbc2"
SRC_URI[aarch64.sha256sum] = "68670dcce16ee152a3cd9ba1698c287ae12a15367628905d00b3b2275ab6c03d"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "7065290264be1a543e1e668c3b066e06"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "2b45b782105e856c45f2bf58b723ad3b73cabae1d99e4287967521abab1bba86"

COMPATIBLE_MACHINE = "^(dm900|dm920|dreamone)$"

inherit opendreambox-precompiled-binary
