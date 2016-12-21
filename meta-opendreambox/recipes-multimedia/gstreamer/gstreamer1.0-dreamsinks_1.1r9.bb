SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "10cdb8a166ff87f322cfb7175c2369dd"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "01224d5eb6a9d09d6b0611a6dd978e245a044a66b29d4b6483ba4b2d8fe06190"
SRC_URI[mips32el.md5sum] = "13b073e11937d4e58f3fe60ca2d2e07f"
SRC_URI[mips32el.sha256sum] = "6638290d1b8d245a922c0306e110a0b184e17d0b7c6bf33c2da3279ee1dc0bd6"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
