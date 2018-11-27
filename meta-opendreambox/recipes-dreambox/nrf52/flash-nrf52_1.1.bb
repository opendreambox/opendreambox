SUMMARY = "Flasher for NRF52 based BLE Transceiver"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "79e7cd793c33cfc520c843f0c52b761a"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "7d25f339a7469a0ae830c1bd7397c170d06918004aaad8d5e5bafc541bb7b7ee"

COMPATIBLE_MACHINE = "^(dm900|dm920)$"

inherit opendreambox-precompiled-binary
