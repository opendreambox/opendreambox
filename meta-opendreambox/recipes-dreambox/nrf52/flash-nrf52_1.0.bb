SUMMARY = "Flasher for NRF52 based BLE Transceiver"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "1f81e3278079d63d527607fccc264c2c"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "7c05a92f4f4751895baf4bfcb08764523918306a144f46c2f8d04beed66562b7"

COMPATIBLE_MACHINE = "^(dm900|dm920)$"

inherit opendreambox-precompiled-binary
