SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "c6f17d6a38ac68edb5f04e690f258846"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "cafd9648178e23b186efa6038c94390af94e7091631a0edeb688fdea67390596"
SRC_URI[mips32el.md5sum] = "58ddbb60112165669d4c48473fac29ca"
SRC_URI[mips32el.sha256sum] = "f63faf0e910f4bfd146dc545b40c7eedd1b29b6b28ad6db7b51b082e8054cbbc"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
