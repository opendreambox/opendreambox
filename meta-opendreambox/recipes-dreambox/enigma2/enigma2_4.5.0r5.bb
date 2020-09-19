SRC_URI[aarch64.md5sum] = "52550e2965aaaa7f7903f65fab2c00d3"
SRC_URI[aarch64.sha256sum] = "b12151200935ec182a99c87b3e57e741e1e49735db1d7b8df635d9c7baafe97c"

SRC_URI += " file://0001-temporary-disable-automatic-FP-NRF-updater.patch"

require enigma2-bin-4.3.inc
