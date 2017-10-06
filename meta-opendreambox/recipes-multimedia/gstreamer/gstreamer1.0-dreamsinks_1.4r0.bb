SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "b4059960263204b67f97ebfdf4001489"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "714c472703eaebbb36129b315d0948426e9d73c5b295ce10b89249e03607408f"
SRC_URI[mips32el.md5sum] = "a5799c8a13a8d748509580a5fdbe1690"
SRC_URI[mips32el.sha256sum] = "1093b96d7923985ef5e15fda7eef4041bc119562e69af49c0cca73efc966877b"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
