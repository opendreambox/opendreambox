SUMMARY = "Flasher for NRF52 based BLE Transceiver"

SRC_URI[aarch64.md5sum] = "b5298e1d2958951a8df726697ad60005"
SRC_URI[aarch64.sha256sum] = "d8dc42b59f8ace6782caec1d3e516819742d898b14050b383cb1b8ebc6bdbad4"

COMPATIBLE_MACHINE = "^(dreamone)$"

inherit opendreambox-precompiled-binary
