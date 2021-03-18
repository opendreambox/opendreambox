SRC_URI[aarch64.md5sum] = "e27974953b2fa61f0f68b1f50e744f6c"
SRC_URI[aarch64.sha256sum] = "44d90675326e5ee8a1f530b8b577c1bd8056a8cbdbbd09c3a31ce1a4f58f9a51"

SRC_URI += " \
    file://0001-InputDeviceManager-fix-JVC-protocol-parsing-old-dict.patch \
    file://0002-RemoteControlSelection-add-BLE-RCU.patch \
    file://0003-skin_default-add-missing-StreamServicesConfigScreen.patch \
    file://0001-update-default-favourites-bouquet.patch \
"

require enigma2-bin-4.3.inc
