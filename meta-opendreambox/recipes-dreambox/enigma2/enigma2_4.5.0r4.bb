SRC_URI[aarch64.md5sum] = "96eb617e486036d4fede75f01308b8e1"
SRC_URI[aarch64.sha256sum] = "2cda8d77e00793738d5f1879d3112725c921629c28269c8a5de0c57564f2b0d5"

SRC_URI += " \
	file://0001-NimManager-handle-unicables.xml-entries-with-UniSEqC.patch \
	file://0008-HdmiCec-don-t-react-to-received-power-messages-by-de.patch \
	file://0017-skin_default-fix-dreamtwo-display-skin.patch \
	file://0018-VideoSteps-refresh-video-mode-list-after-un-plugging.patch \
	file://0020-data-skin_default.xml-adjust-default-display-skins-f.patch \
"

require enigma2-bin-4.3.inc
