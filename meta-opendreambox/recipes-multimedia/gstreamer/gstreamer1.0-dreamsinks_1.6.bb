SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "6e3ad41bc58e69d2d179a629c9a0575a"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "3868db439ae6856a0f2f49923d5177055d54955db4fd762ed619fe7890159e5e"
SRC_URI[mips32el.md5sum] = "e9bb68e899bb50aa52e15e356edf4e1d"
SRC_URI[mips32el.sha256sum] = "6386405ff78efa89245d31abc0920076e72f350a5fc342956b95ec2dcd52bc5e"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
