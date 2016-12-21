SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "3f214235c59094238fb7975197de52f6"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "54f435e9a8725b657833758001ff3ac18e64b52b96f6251fea56c84bd7999e42"
SRC_URI[mips32el.md5sum] = "1b158741d1aee134b6639777d2e707d1"
SRC_URI[mips32el.sha256sum] = "37c92cd3b6fe6abea3c1c308994257f5442bd6deedcd6c987d0856ed354974df"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-add-support-for-dm520-dm900-reboot-workaround.patch"
