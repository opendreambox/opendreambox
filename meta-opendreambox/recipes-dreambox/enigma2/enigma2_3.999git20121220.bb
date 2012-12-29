PR = "${INC_PR}.0"

SRC_URI = " \
	file://0001-enigma2.sh.in-add-enigma2-exit-codes-to-run-external.patch \
	file://0002-Components-Ipkg.py-run-opkg-commands-from-tmp.-fixes.patch \
	file://0003-SoftwareManager-add-support-for-opkgfb.patch \
	file://0004-fixed-possible-bsod-on-timeshift-start-when-timeshif.patch \
	file://0005-fixed-crash-when-try-to-set-a-timer-without-running-.patch \
	file://0006-tools-enigma2.sh.in-drop-caches-once-after-e2-start-.patch \
"

SRC_URI[mips32el.md5sum] = "5cb82c4f93b5036d010e0643f57aeec1"
SRC_URI[mips32el.sha256sum] = "48c27b7324eb35c14be7b50232e135e5f3e040119a1819ef8fa75edf1d5681cc"
SRC_URI[mips32el-nf.md5sum] = "2b4c99d0f36c3c0c55339c4661bdb5db"
SRC_URI[mips32el-nf.sha256sum] = "0f901407f4cc0c01498650548df46fa20e371814bcee6f483c823b36f0736974"

require enigma2-bin-4.0.inc
