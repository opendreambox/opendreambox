require recovery-web.inc

SRCREV = "${@opendreambox_srcrev('5d68fcde19886c1fdf4987ec18ceaa346a40c68a', d)}"
SRCREV_dm520 = "${@opendreambox_srcrev('40a427447ca0398a3511db10ea0919938b89a6c8', d)}"
SRCREV_dm820 = "${SRCREV_dm7080}"
SRCREV_dm900 = "${@opendreambox_srcrev('046d365084e29c2dcacc0e9befd04f6947c6f7e3', d)}"
SRCREV_dm920 = "${SRCREV_dm900}"
SRCREV_dm7080 = "${@opendreambox_srcrev('5fa8b020dde379faf3cec6142049f57c03fdb205', d)}"
SRCREV_dreamone = "${@opendreambox_srcrev('0e2fb0527d1cc25f034b9c4adcfd295940d05078', d)}"
SRCREV_dreamtwo = "${SRCREV_dreamone}"

inherit opendreambox-git

BRANCH = "master"
BRANCH_dm520 = "dm520"
BRANCH_dm820 = "${BRANCH_dm7080}"
BRANCH_dm900 = "dm900"
BRANCH_dm920 = "${BRANCH_dm900}"
BRANCH_dm7080 = "dm7080"
BRANCH_dreamone = "dreamone"
BRANCH_dreamtwo = "${BRANCH_dreamone}"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm920|dm7080|dreamone|dreamtwo)$"
