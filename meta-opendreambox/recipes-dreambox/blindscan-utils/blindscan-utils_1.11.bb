require blindscan-utils.inc

SRC_URI[armv7ahf-neon.md5sum] = "6a087cbb4e613847fbc87bdcb6d5570b"
SRC_URI[armv7ahf-neon.sha256sum] = "fa249183d72a08118c246db8f5a5f424274c73966ac705a579d423f90ba05cba"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "893ae9303ba95ce54da3c2736f32a090"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "7271fb06f56d2398f8cdf4e328649ab27722d690f87c24e1734956dced21b947"
SRC_URI[mips32el.md5sum] = "c4176cf87b943e166b49e15624869243"
SRC_URI[mips32el.sha256sum] = "1f27288a90011444c4e241e0e9a2a79f1a7baed596d0003e2e3b666819afe8b9"

inherit opendreambox-precompiled-binary
