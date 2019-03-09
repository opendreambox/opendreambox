SUMMARY = "Flasher for NRF52 based BLE Transceiver"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "7065290264be1a543e1e668c3b066e06"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "2b45b782105e856c45f2bf58b723ad3b73cabae1d99e4287967521abab1bba86"

COMPATIBLE_MACHINE = "^(dm900|dm920)$"

inherit opendreambox-precompiled-binary
