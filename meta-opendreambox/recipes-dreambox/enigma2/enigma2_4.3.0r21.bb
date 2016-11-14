SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "6ef70b8a3857e1d3b7899bf58689b4b4"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "9eae85459bc902f421302a839997d81a6cb72d4a982e6b7d23ae74c329556a35"
SRC_URI[mips32el.md5sum] = "88e565cecda65ced104fa7ad5dab0b4c"
SRC_URI[mips32el.sha256sum] = "66a4dfec49bb46c76ea07470c1155eb905287bb0daa80deaab4467e7ea22b6c2"

require enigma2-bin-4.3.inc

SRC_URI += "file://0001-Harddisk.py-fixed-dm520-dm900-friendly-usb-port-name.patch \
            file://0002-About-always-show-image-version-if-it-s-different-fr.patch"
