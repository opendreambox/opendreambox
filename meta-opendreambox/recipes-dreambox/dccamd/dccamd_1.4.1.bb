SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"
DEPENDS = "openssl systemd"

SRC_URI[aarch64.md5sum] = "5b29d583f3b5a77ff4a5e575611219ff"
SRC_URI[aarch64.sha256sum] = "69543743c7d03b97fc4abe30b509fed8855d5b8f04f7231de7b7658c61efc756"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "f0eb29ddf8527c3347917ecb9a75745d"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "213b6b748aea8094ca4d87f505582d50d956c367cc4c279478dc739d0b008aa0"
SRC_URI[mips32el.md5sum] = "2c59dede28f7b669a48a5cb772e412d8"
SRC_URI[mips32el.sha256sum] = "042e7caf0baf75fc9555da6d0a1e7d79193bc35e4c0839eba4623bb825905551"

SYSTEMD_SERVICE_${PN} = "dccamd.service"

inherit opendreambox-precompiled-binary systemd
