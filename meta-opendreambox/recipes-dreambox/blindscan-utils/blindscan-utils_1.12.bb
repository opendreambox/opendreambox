require blindscan-utils.inc

SRC_URI[aarch64.md5sum] = "aa6dad1ece041c236338d3a41fd5da1e"
SRC_URI[aarch64.sha256sum] = "aeaf9088b3cb2bf91dcab7e7ae8d417ab7eaca304f2f9dc35e5e14838ce5f0cc"
SRC_URI[mips32el.md5sum] = "185cd9490723728f39953348e322f5c7"
SRC_URI[mips32el.sha256sum] = "0458975ad8325355a5e9514fa4e3505f896298bdad7610718e090b640e3588c5"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "9e93783a6ac4611bb683d0b36fc44a87"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "ff4de20d84cf6aef48270684cb78764f7ee9d13d92fab42217f378be06047d1f"

inherit opendreambox-precompiled-binary
