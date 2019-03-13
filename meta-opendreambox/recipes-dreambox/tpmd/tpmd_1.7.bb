SUMMARY = "Dreambox TPM Daemon"
DEPENDS = "openssl systemd"

SRC_URI[aarch64.md5sum] = "078df44b40e462097e7961be83d16754"
SRC_URI[aarch64.sha256sum] = "d23da5459495952121d44b354094c44e26ae8e222a97d85877a35d7f9e187fcc"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "95a807b5972ba0eecdbec1c24d99a872"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "a7817b4fbce1847e3975d8dd3f725c284d03d97840c5c83c140ef84e78ba1c82"
SRC_URI[mips32el.md5sum] = "93038ebc0d9bd4b0b41c0de8380af099"
SRC_URI[mips32el.sha256sum] = "fa42e5c365b091d75617fa8e0fe47e21c0acc3ca46426f7a1d2bc5e1a58279f2"

SYSTEMD_SERVICE_${PN} = "tpmd.service"

inherit opendreambox-precompiled-binary systemd update-rc.d

INITSCRIPT_NAME = "${PN}"
