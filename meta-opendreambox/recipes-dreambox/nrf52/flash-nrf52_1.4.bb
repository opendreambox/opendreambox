SUMMARY = "Flasher for NRF52 based BLE Transceiver"

SRC_URI[aarch64.md5sum] = "0517929804b9bc38fc50d775d6ba11bf"
SRC_URI[aarch64.sha256sum] = "a07bee94d23b44495adfda4a930364b51688a4ddc9931db41b760340d2d11f52"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "8c4854f0edbe19634ed3017fb6c54ef7"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "412f87347cc373019986aeddafebeab6aa729fcdcdbe60dc2bf2bd3a79f30dd0"

COMPATIBLE_MACHINE = "^(dm900|dm920|dreamone)$"

inherit opendreambox-precompiled-binary
