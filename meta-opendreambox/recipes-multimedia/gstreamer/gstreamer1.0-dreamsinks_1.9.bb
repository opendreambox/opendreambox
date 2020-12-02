SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "7dd9f3268852fc8d09f857e82517a5ac"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "51f04c3e76928634c22d8a55d3c44f934c8538a76d1fd5a79504ce5b111517a0"
SRC_URI[mips32el.md5sum] = "7f008aef90b91d9762a818bcb7af2467"
SRC_URI[mips32el.sha256sum] = "041cec5fc17d31d0200cf5758524a7b651a6699cafc70eda1ccedbaf11ab71de"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
