SUMMARY = "Flasher for NRF52 based BLE Transceiver"

SRC_URI[aarch64.md5sum] = "d38bc26839475f8927476d2f6f76113b"
SRC_URI[aarch64.sha256sum] = "17bb1ff389c49912a01b89b1e2446ffe3750cce3c04e8446866cf45cd52d7baf"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"

inherit opendreambox-precompiled-binary
