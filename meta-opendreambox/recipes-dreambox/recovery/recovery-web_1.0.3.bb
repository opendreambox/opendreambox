require recovery-web.inc

SRCREV = "${@opendreambox_srcrev('5d68fcde19886c1fdf4987ec18ceaa346a40c68a', d)}"
SRCREV_dm520 = "${@opendreambox_srcrev('b181468778f1e5ba95fb2185c9338d6b08122625', d)}"
SRCREV_dm820 = "${SRCREV_dm7080}"
SRCREV_dm900 = "${@opendreambox_srcrev('1e17339e15c8e77b03ae981989111c7c62b923d7', d)}"
SRCREV_dm920 = "${SRCREV_dm900}"
SRCREV_dm7080 = "${@opendreambox_srcrev('3f02d9e7eeb29248ea1984730fdcbd3ceb63a726', d)}"
SRCREV_dreamone = "${@opendreambox_srcrev('6329346b3d1d54523421543fa0cd8d772194334f', d)}"

inherit opendreambox-git

BRANCH = "master"
BRANCH_dm520 = "dm520"
BRANCH_dm820 = "${BRANCH_dm7080}"
BRANCH_dm900 = "dm900"
BRANCH_dm920 = "${BRANCH_dm900}"
BRANCH_dm7080 = "dm7080"
BRANCH_dreamone = "dreamone"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm920|dm7080|dreamone)$"
