PR = "${INC_PR}.3"

SRC_URI[mips32el.md5sum] = "5c6988712f1d77b11b44efb15f3ecf2c"
SRC_URI[mips32el.sha256sum] = "1a1421d8cb391aafd2bf1d6c7af107d20201e2b562162e1342e708eecf780ff3"
SRC_URI[mips32el-nf.md5sum] = "5cbdc74191d0e0ea5241c9a74c8a5e95"
SRC_URI[mips32el-nf.sha256sum] = "2aee6d9bc8d9238d66595db04f14a6249e834ee4efb02e2ade2b38be3ab07b88"

SRC_URI += " \
	file://0001-ChannelSelection.py-dont-zap-to-lastservice-after-bo.patch \
	file://0002-when-e2-was-bootet-in-idle-mode-no-service-was-runni.patch \
	file://0003-set-appropriate-notification-ids-for-standby-shutdow.patch \
	file://0004-DVDBurn-fix-Bludisc-and-DVD-audio-track-language-sel.patch \
	file://0005-changed-behaviour-of-AddNotificationWithID-.-it-now-.patch \
	file://0006-HdmiCec-dont-send-poweron-command-when-a-standby-req.patch \
	file://0007-mytest.py-save-scheduled-wakeup-time-in-config.misc..patch \
	file://0008-added-missing-check-to-detect-if-the-last-automatic-.patch \
"

require enigma2-bin-4.0.inc
