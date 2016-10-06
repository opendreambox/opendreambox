require libv3ddriver.inc

SRC_URI[dm900.md5sum] = "9d8ea64e363d70155e0afff8473da9d9"
SRC_URI[dm900.sha256sum] = "99fa8e6f2ed004a96672bd4583286f20e886a91e1a06b47fd50085547ee2884b"

COMPATIBLE_MACHINE = "^(dm900)$"

inherit opendreambox-precompiled-binary
