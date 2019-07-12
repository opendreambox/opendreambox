SUMMARY = "Flasher for NRF52 based BLE Transceiver"

SRC_URI[aarch64.md5sum] = "a342ef1e035a67c8562c210b3a9e3cdf"
SRC_URI[aarch64.sha256sum] = "0c6956010c10870a3a8756be81124d0ec8960be1dc8544fd88fa8b16d5f44b6d"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "3649233eb10eaef04838f5021e0e4ca7"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "e9f119af9bcadf4a74d91ed8ebccbf86bc423a2f38a32a46d7310cbea8fd8720"

COMPATIBLE_MACHINE = "^(dm900|dm920|dreamone)$"

inherit opendreambox-precompiled-binary
