PR = "${INC_PR}.2"

SRC_URI[mips32el.md5sum] = "8704cabefe3b97e3468ccdd305310b90"
SRC_URI[mips32el.sha256sum] = "e1aa19cb6116947e96c142fa01d99960bab53015ea301966f7fa6da2ee46b696"
SRC_URI[mips32el-nf.md5sum] = "ea3061e07c8777180f25395f1129e801"
SRC_URI[mips32el-nf.sha256sum] = "cba7d013e32cf45fef28bc905753cb1d80358bbf65cb7890859680c44d4a4974"

require enigma2-bin-4.0.inc

SRC_URI += " \
	file://0001-cleanup-servicelist-on-shutdown.patch \
	file://0002-ServiceScan.py-fixed-crash-on-finished-service-scan.patch \
"