PR = "${INC_PR}.5"

SRC_URI[mips32el.md5sum] = "91e7a213a1eae246bea95dca9243f9e3"
SRC_URI[mips32el.sha256sum] = "472cd542105d85bb784429bf9ddb2581dd4a43fb790d64967f061fa0943c85f4"
SRC_URI[mips32el-nf.md5sum] = "d74aa3dbedef41805b466979aa2e1e35"
SRC_URI[mips32el-nf.sha256sum] = "e1687d5d0df11c49a5263f5cb99a26001b754bf575e9fcdc05d005cbaf95cb0c"

require enigma2-bin-4.0.inc

SRC_URI += " \
	file://0001-dont-show-duplicate-actions-in-hotplug-popup.patch \
	file://0002-StorageManager-fix-sometimes-failing-manual-mount.patch \
	file://0003-force-ConfigInteger-value-to-integer.-this-should-fi.patch \
	file://0004-change-ConfigPIN-default-to-0000-aaaa-is-not-a-valid.patch \
	file://0005-when-the-time-is-not-valid-after-bootup-and-idle-mod.patch \
	file://0006-added-manual-day-month-translation-to-clocktotext-co.patch \
	file://0007-needed-changes-since-0000-is-the-ConfigPIN-default.patch \
	file://0008-format-translation-was-not-working-when-the-first-ch.patch \
	file://de.mo \
	file://en.mo \
"

do_install_append() {
	for lang in en de; do cp "${WORKDIR}/$lang.mo" "${D}/usr/share/enigma2/po/$lang/LC_MESSAGES/enigma2.mo"; done
}
